package com.example.sanakazi.addingdialogfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_popup = (Button)findViewById(R.id.btn_popup);
        btn_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup();

            }
        });

    }

    public void showPopup()
    {

        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        // Create and show the dialog.
        ReferralDialogFragment newFragment = ReferralDialogFragment.
                newInstance("1",
                       "My Message",
                        "My Details");
        newFragment.show(ft, "dialog");
      //  newFragment.setCancelable(false);
    }
}
