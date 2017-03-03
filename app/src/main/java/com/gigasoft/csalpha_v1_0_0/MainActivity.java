package com.gigasoft.csalpha_v1_0_0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView shopng, histo, frnds, quick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shopng = (TextView) findViewById(R.id.tvDescripcionTarjeta);
        histo = (TextView) findViewById(R.id.tvDescripcionTarjeta1);
        frnds = (TextView) findViewById(R.id.tvDescripcionTarjeta2);
        quick = (TextView) findViewById(R.id.tvDescripcionTarjeta3);


    }

    private void testingAction() {
        final TextView chose = new TextView(this);
        chose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),chose.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
