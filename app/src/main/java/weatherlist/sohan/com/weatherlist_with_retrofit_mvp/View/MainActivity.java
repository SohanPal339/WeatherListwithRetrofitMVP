package weatherlist.sohan.com.weatherlist_with_retrofit_mvp.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;
import java.util.List;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Adapter.WeatherAdapter;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model.WeatherResDto;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Presenter.GetDataCallBack;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Presenter.Presenter;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.R;

public class MainActivity extends AppCompatActivity implements GetDataCallBack.View {
    private Presenter mPresenter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    WeatherAdapter weatherAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new Presenter(this);
        mPresenter.getDataFromURL(getApplicationContext(), "");
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void onGetDataSuccess(String message, List<WeatherResDto> allCountriesData) {
        weatherAdapter = new WeatherAdapter(getApplicationContext(), allCountriesData);
        recyclerView.setAdapter(weatherAdapter);

    }

    @Override
    public void onGetDataFailure(String message) {
        Log.d("Status",message);
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
