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
                    continue;// reads first the clock before it adds a max value because a clock dosen't have this value
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

//https://www.youtube.com/watch?v=cFCgFlqF5kw

