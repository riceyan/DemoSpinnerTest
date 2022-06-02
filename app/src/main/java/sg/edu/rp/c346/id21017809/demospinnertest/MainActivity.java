package sg.edu.rp.c346.id21017809.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Spinner spnYesNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        spnYesNo = findViewById(R.id.spinner);

        spnYesNo.setOnItemSelectedListener(new AdapterView<?> parent, View view, int position, long id) {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                switch (position) {
                    case 0:
                        // Your code for item 1 selected
                        break;
                    case 1:
                        // Your code for item 1 selected
                        break;
                }
        }
        }
    }
}