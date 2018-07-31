import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class NumberAdapterp extends BaseAdapter {

    private String numbers[];
    private Activity activity;

    public
    @Override
    public int getCount() {
        return 0;
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
        View view = LayoutInflater.from(activity).inflate(R.layout.List_item_country,parent

                TextView name =view.findViewById(R.id.country_name);
                name.setText(numbers[position]);
        return view;
    }
}
