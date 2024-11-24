const apiKey = '8d9e12f471ad03ab1ff01126f17ebf9b';
const url = 'https://api.openweathermap.org/data/2.5/weather';

document.getElementById('get-weather').addEventListener('click', async () => {
    const city = document.getElementById('city').value;
    const response = await fetch(`${url}?q=${city}&appid=${apiKey}`);
    const data = await response.json();
    const weatherInfo = document.getElementById('weather-info');
    weatherInfo.innerHTML = `
        <h2>Weather in ${data.name}</h2>
        <p>Temperature: ${data.main.temp - 273.15}°C</p>
        <p>Humidity: ${data.main.humidity}%</p>
        <p>Wind: ${data.wind.speed} km/h</p>
        <p>Condition: ${data.weather[0].description}</p>
    `;
});