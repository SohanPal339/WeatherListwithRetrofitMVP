package weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherResDto {

    @SerializedName("weather")
    private List<WeatherDto> weatherDtoSummary;

    @SerializedName("dt_txt")
    private String dateTime;

    public List<WeatherDto> getWeatherDtoSummary() {
        return weatherDtoSummary;
    }

    public void setWeatherDtoSummary(List<WeatherDto> weatherDtoSummary) {
        this.weatherDtoSummary = weatherDtoSummary;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

}

