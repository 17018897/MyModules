package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView android;
    TextView iPad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.textView1);
        iPad = findViewById(R.id.textView2);

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ActivityAndroid.class);
                intent.putExtra("mod", 346);
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2018);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });
        iPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ActivityAndroid.class);
                intent.putExtra("mod", 349);
                intent.putExtra("name", "iPad Programming");
                intent.putExtra("year", 1969);
                intent.putExtra("sem", 300);
                intent.putExtra("credit", 400000000);
                intent.putExtra("venue", "W91Z");
                startActivity(intent);
            }
        });
    }
}
