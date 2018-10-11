package weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Sohan Pal 11-10-2018.
 */

public interface AllWeatherResponseDto {
    @GET("/data/2.5/forecast?q=M%C3%BCnchen,DE&appid=b6907d289e10d714a6e88b30761fae22")
    Call<WeatherListDto> getWeather();
}
