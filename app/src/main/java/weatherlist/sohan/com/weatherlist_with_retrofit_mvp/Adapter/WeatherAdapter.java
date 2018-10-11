package weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.Model.WeatherResDto;
import weatherlist.sohan.com.weatherlist_with_retrofit_mvp.R;


/**
 * Created by Sohan Pal 11-10-2018.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.MyViewHolder> {
    private Context context;
    private List<WeatherResDto> list = new ArrayList<>();
    public WeatherAdapter(Context context, List<WeatherResDto> list){
        this.context = context;
        this.list = list;
    }
    @Override
    public WeatherAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(WeatherAdapter.MyViewHolder holder, int position) {

        holder.mTextMain.setText(list.get(position).getWeatherDtoSummary().get(0).getMain().trim());
        holder.mTextDescription.setText(list.get(position).getWeatherDtoSummary().get(0).getDescription().trim());
        holder.mTextDateTime.setText(list.get(position).getDateTime().trim());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTextMain, mTextDescription, mTextDateTime;
        public MyViewHolder(View view) {
            super(view);
            mTextMain = (TextView) view.findViewById(R.id.textMain);
            mTextDescription = (TextView) view.findViewById(R.id.textDescription);
            mTextDateTime = (TextView) view.findViewById(R.id.textDateTime);
        }
    }
}
