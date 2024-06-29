


#Java Weather Application
This Java application fetches weather data from the OpenWeatherMap API based on user input (city name) and displays the weather information in the console.

#Features
Retrieves current weather data (temperature, humidity, etc.) for a specified city.
Simple console-based interface for user interaction.
Error handling for API communication and user input.
Prerequisites
Java Development Kit (JDK) installed
OpenWeatherMap API key (free account available at OpenWeatherMap)
Setup
Clone the repository:

bash

git clone https://github.com/your_username/java-weather-app.git
cd java-weather-app
Set your OpenWeatherMap API key:

Open WeatherService.java file.
Replace "your_openweathermap_api_key_here" with your actual API key from OpenWeatherMap.
Compile the Java files:


javac WeatherApp.java WeatherService.java
Run the application:


java WeatherApp
Usage
When prompted, enter the name of a city (e.g., "London", "New York") and press Enter.
The application will fetch and display the current weather information for the specified city.
Example
css

Enter city name: London
Weather information for London:
{"coord":{"lon":-0.13,"lat":51.51},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"base":"stations","main":{"temp":18.45,"feels_like":18.78,"temp_min":17.23,"temp_max":20.34,"pressure":1021,"humidity":89},"visibility":10000,"wind":{"speed":2.68,"deg":110},"clouds":{"all":90},"dt":1620298098,"sys":{"type":1,"id":1414,"country":"GB","sunrise":1620277991,"sunset":1620334113},"timezone":3600,"id":2643743,"name":"London","cod":200}
Notes
The application uses basic error handling. Ensure your internet connection is active and the city name entered is valid.
For more details on OpenWeatherMap API, refer to their documentation.
