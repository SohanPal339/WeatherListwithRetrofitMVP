package weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Presenter;

import android.content.Context;

import java.util.List;

import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model.WeatherResDto;


/**
 * Created by Sohan Pal 11-10-2018.
 */

public interface GetDataCallBack {
    interface View{
        void onGetDataSuccess(String message, List<WeatherResDto> list);
        void onGetDataFailure(String message);
    }
    interface Presenter{
        void getDataFromURL(Context context, String url);
    }
    interface Interactor{
        void initRetrofitCall(Context context, String url);

    }
    interface onGetDataListener{
        void onSuccess(String message, List<WeatherResDto> list);
        void onFailure(String message);
    }
}
