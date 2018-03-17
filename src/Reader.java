import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {

    JSONParser parser = new JSONParser();
    Meter m;

    public Reader() {
    }


    /**
     * Reads a json file and gets some spesific data. puts the data into different meters.
     * @param FilePath
     * @return
     */
    public ArrayList<Meter> readMeter(String FilePath){
        ArrayList<Meter> meters;
        meters = new ArrayList<>();
        try {

            Object obj = parser.parse(new FileReader(FilePath));
            JSONArray jsonArray = (JSONArray) obj;
            for(Object o : jsonArray) {
                JSONObject jsonObject = (JSONObject) o;
                String Name = (String) jsonObject.get("Name");
                double MinVerdi = (double) jsonObject.get("MinVerdi");
                String Regnummer = (String) jsonObject.get("Regnummer");
                String Posisjon = (String) jsonObject.get("Posisjon");
                Boolean Status = (Boolean) jsonObject.get("Status");
                if(Name.equals("klokke")){
                    meters.add(new Clock(Regnummer, Posisjon, Status, MinVerdi));
                    continue;//Check if the meter is a clock first as clocks do not have a max value
                }

                double MaxVerdi = (double) jsonObject.get("MaxVerdi");

                if(Name.equals("vekt")){
                    meters.add(new Weight(Regnummer, Posisjon, Status, MinVerdi, MaxVerdi));
                }

                else if(Name.equals("termometer")){
                    meters.add(new Thermometer(Regnummer, Posisjon, Status, MinVerdi, MaxVerdi));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return meters;
    }

}



