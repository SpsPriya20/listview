package listview.priya.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import listview.priya.com.listview.adapter.CountryAdapter;

public class Listviewactivity extends AppCompatActivity {

    private String[] countryList = {"India", "Australia", "Canada", "Japan", "China","combodia", "Russia"};

    private CountryAdapter countryAdapter;

    private ListView listView;

    private NumberAdapter numberAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = findViewById(R.id.List);
        setContentView(R.layout.activity_listviewactivity);
        }

        for (int i = 0 ; i < 100);

    {

        countryData[i] = ++i + "";
    }


        numberAdapter = new NumberAdapter(countryData, activity this);
        listView.setAdapter(numberAdapter);

        listview.setOnItemClickListener(new AdapterView<?> parent,View View, int parent)

    }
}
