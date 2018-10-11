package weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Presenter;

import android.content.Context;
import java.util.List;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model.WeatherResDto;


/**
 * Created by Sohan Pal 11-10-2018.
 */

public class Presenter implements GetDataCallBack.Presenter, GetDataCallBack.onGetDataListener {
    private GetDataCallBack.View mGetDataView;
    private Intractor mIntractor;
    public Presenter(GetDataCallBack.View mGetDataView){
        this.mGetDataView = mGetDataView;
        mIntractor = new Intractor(this);
    }
    @Override
    public void getDataFromURL(Context context, String url) {
        mIntractor.initRetrofitCall(context,url);
    }

    @Override
    public void onSuccess(String message, List<WeatherResDto> allCountriesData) {
        mGetDataView.onGetDataSuccess(message, allCountriesData);
    }

    @Override
    public void onFailure(String message) {
        mGetDataView.onGetDataFailure(message);
    }
}
