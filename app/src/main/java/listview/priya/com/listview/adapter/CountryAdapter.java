package listview.priya.com.listview.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import listview.priya.com.listview.R;

public class CountryAdapter extends BaseAdapter {

    private String countryData[];
    private Activity activity;

    public CountryAdapter(String countryData[], Activity activity){
        this.countryData = countryData;
        this.activity = activity;
    }



    @Override
    public int getCount() {

        return countryData.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(activity).inflate(R.layout.List_item_country,parent, false);

        TextView countryName = convertView.findViewById(R.id.country_name);
        countryName.setText(countryData[position]);
        return view;
    }
}
