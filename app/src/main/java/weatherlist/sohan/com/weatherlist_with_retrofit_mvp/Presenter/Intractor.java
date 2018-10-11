package weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Presenter;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model.AllWeatherResponseDto;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model.WeatherListDto;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model.WeatherResDto;

/**
 * Created by Sohan Pal 11-10-2018.
 */

public class Intractor implements GetDataCallBack.Interactor{
    private GetDataCallBack.onGetDataListener mOnGetDatalistener;
    List<WeatherResDto> allWeatherList = new ArrayList<>();

    public Intractor(GetDataCallBack.onGetDataListener mOnGetDatalistener){
        this.mOnGetDatalistener = mOnGetDatalistener;
    }
    @Override
    public void initRetrofitCall(Context context, String url) {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://samples.openweathermap.org")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        AllWeatherResponseDto request = retrofit.create(AllWeatherResponseDto.class);
        retrofit2.Call<WeatherListDto> call = request.getWeather();
        call.enqueue(new retrofit2.Callback<WeatherListDto>() {
            @Override
            public void onResponse(retrofit2.Call<WeatherListDto> call, retrofit2.Response<WeatherListDto> response) {
                WeatherListDto jsonResponse = response.body();
                allWeatherList = jsonResponse.getListRes();
                Log.d("Data", "Refreshed");
                mOnGetDatalistener.onSuccess("Success", allWeatherList);



            }
            @Override
            public void onFailure(retrofit2.Call<WeatherListDto> call, Throwable t) {
                Log.v("Error",t.getMessage());
                mOnGetDatalistener.onFailure(t.getMessage());
            }
        });
    }
}
