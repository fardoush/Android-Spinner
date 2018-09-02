package sample.android.com.spinnertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView result;

    String[] country = { "Bangladesh", "Pakistan" , "England" , "South Africa" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinnerId);
        result = findViewById(R.id.resultId);


        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, country);

        spinner.setAdapter(adapter);


        // dfgjlkfdh
        /*
        weru
        rytu
         */
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

               String selectedCountry = adapterView.getItemAtPosition(i).toString();

               result.setText(selectedCountry);

           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       });


    }
}
