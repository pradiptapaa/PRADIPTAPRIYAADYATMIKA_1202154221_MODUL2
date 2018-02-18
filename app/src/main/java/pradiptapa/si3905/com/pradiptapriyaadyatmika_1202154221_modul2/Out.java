package pradiptapa.si3905.com.pradiptapriyaadyatmika_1202154221_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Out extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out);
    }

    public void out(View view) {
        Intent intent = new Intent( this, MainMenu.class);
        startActivity(intent);
    }
}
