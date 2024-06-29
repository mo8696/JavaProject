import java.util.Scanner;

class Main {
   /**
 * This is the main class of the Weather Application.
 * It initializes the application and starts the weather service.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a city .........................");
        String city = sc.nextLine().trim();
        WeatherApp weatherAPP = new WeatherApp();
        try {
            String weatherData = weatherAPP.getWeatherData(city);
            System.out.println("the weather of the city " + city + "is");
            System.out.println(weatherData);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("sorry we have difficalty connectig into the server "+ e.getMessage());
        }finally{
            sc.close();
        }

    }
}