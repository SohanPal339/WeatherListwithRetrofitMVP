package weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Sohan Pal 11-10-2018.
 */

public class WeatherListDto {

    @SerializedName("list")
    private List<WeatherResDto> listRes = null;

    public List<WeatherResDto> getListRes() {
        return listRes;
    }

    public void setListRes(List<WeatherResDto> listRes) {
        this.listRes = listRes;
    }
}

