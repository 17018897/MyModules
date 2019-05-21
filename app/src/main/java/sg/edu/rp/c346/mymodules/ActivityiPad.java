package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityiPad extends AppCompatActivity {


    TextView tvMod;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityi_pad);

        tvMod = findViewById(R.id.textViewModule);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);


        Intent intentReceived = getIntent();
        int mod = intentReceived.getIntExtra("mod", 0);
        tvMod.setText("Module Code: C" + mod);

        String name = intentReceived.getStringExtra("name");
        tvName.setText("Module Name: " + name);

        int year = intentReceived.getIntExtra("year", 0);
        tvYear.setText("Academic Year: " + year);

        int sem = intentReceived.getIntExtra("sem", 0);
        tvSem.setText("Semester: " + sem);

        int credit = intentReceived.getIntExtra("credit", 0);
        tvCredit.setText("Module Credit: " + credit);

        String venue = intentReceived.getStringExtra("venue");
        tvVenue.setText("Venue: " + venue);


    }
}