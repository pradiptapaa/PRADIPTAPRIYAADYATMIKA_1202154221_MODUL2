package pradiptapa.si3905.com.pradiptapriyaadyatmika_1202154221_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup a;
    RadioButton b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (RadioGroup) findViewById(R.id.optionGroup);

        Intent a = getIntent();
    }

    public void click(View view) {
        int selectedItem = a.getCheckedRadioButtonId();
        b = (RadioButton) findViewById(R.id.takeout);
        c = (RadioButton) findViewById(R.id.dinein);

        if (selectedItem == b.getId()){
            String option = b.getText().toString();
            Intent takeout = new Intent( MainActivity.this, Out.class);
            startActivity(takeout);

            Toast.makeText(MainActivity.this,"Take Out Desu ne~", Toast.LENGTH_LONG).show();
            this.finish();
        } else if (selectedItem == c.getId()){
            String option = c.getText().toString();
            Intent takeout = new Intent( MainActivity.this, In.class);
            startActivity(takeout);

            Toast.makeText(MainActivity.this,"Dine In Desu ne~", Toast.LENGTH_LONG).show();
            this.finish();
        }
    }
}
