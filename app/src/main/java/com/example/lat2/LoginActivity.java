package com.example.lat2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    /*
        10116060 - MUHAMMAD HAFIZH BUDIMAN
    
        Aplikasi v0.0.1
        Sabtu, 13 April 2019. 15.31
        1. Membuat Tampilan Login

        Aplikasi v0.0.2
        Minggu, 14 April 2019, 11.06
        2. Membuat Tampilan Register dan Intent dari tampilan login

        Aplikasi v0.0.3
        Minggu, 14 April 2019, 11.41
        3. Membuat Tampilan Almost dan Intent dari tampilan Register

        Aplikasi v0.0.3
        Minggu, 14 April 2019, 12.14
        4. Membuat Tampilan Verify dan Intent dari tampilan Almost

        Aplikasi v0.0.4
        Minggu, 14 April 2019, 13.38
        4. Membuat Tampilan User dan Intent dari tampilan Verify

        Aplikasi v0.0.5
        Minggu, 14 April 2019, 15.50
        5. Merubah Constraint Layout Menjadi RelativeLayout
        */

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        textView = (TextView) findViewById(R.id.textView13);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                halamanregister();
            }
        });
        }
    public void halamanregister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

}

