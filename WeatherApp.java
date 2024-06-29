import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApp {
    private static final String  API_KEY = "eddab81d8fmshb9ff1729bf28af3p12c26ejsn883ccb947b68";
    private static final String API_URL = "https://open-weather13.p.rapidapi.com";

    
    
    public String getWeatherData(String city) throws Exception {
        /* this method open connection with api and proved data  */
        String apiUrl = String.format(API_KEY,API_URL, city, null); 
        URL url = new URL(apiUrl);
        
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line); 
        }
        reader.close();
        return response.toString(); 

    }
    
}
