package weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sohan Pal 11-10-2018.
 */

public class WeatherDto {

    @SerializedName("main")
    private String main;

    @SerializedName("description")
    private String description;

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

