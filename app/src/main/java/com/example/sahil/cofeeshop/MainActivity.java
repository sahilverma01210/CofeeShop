package com.example.sahil.cofeeshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String ya = "com.example.application.example.ya";
    Button inc1, inc2, inc3, inc4, dec1, dec2, dec3, dec4, odder;
    TextView n1, n2, n3, n4, total;
    int noc1, noc2, noc3, noc4, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc1 = findViewById(R.id.inc1);
        inc2 = findViewById(R.id.inc2);
        inc3 = findViewById(R.id.inc3);
        inc4 = findViewById(R.id.inc4);
        dec1 = findViewById(R.id.dec1);
        dec1 = findViewById(R.id.dec1);
        dec2 = findViewById(R.id.dec2);
        dec3 = findViewById(R.id.dec3);
        dec4 = findViewById(R.id.dec4);
        odder = findViewById(R.id.odder);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        total = findViewById(R.id.total);


        n1.setText(Integer.toString(noc1));
        n2.setText(Integer.toString(noc2));
        n3.setText(Integer.toString(noc3));
        n4.setText(Integer.toString(noc4));
        total.setText(Integer.toString(sum));
        inc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noc1++;
                n1.setText(Integer.toString(noc1));
            }
        });

        dec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (noc1 > 0) {
                    noc1--;
                    n1.setText(Integer.toString(noc1));
                }
            }
        });
        inc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noc2++;
                n2.setText(Integer.toString(noc2));
            }
        });

        dec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (noc2 > 0) {
                    noc2--;
                    n2.setText(Integer.toString(noc2));
                }
            }
        });
        inc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noc3++;
                n3.setText(Integer.toString(noc3));
            }
        });

        dec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (noc3 > 0) {
                    noc3--;
                    n3.setText(Integer.toString(noc3));
                }
            }
        });
        inc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noc4++;
                n4.setText(Integer.toString(noc4));
            }
        });

        dec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (noc4 > 0) {
                    noc4--;
                    n4.setText(Integer.toString(noc4));
                }
            }
        });
        odder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total.setText(Integer.toString(55 * noc1 + 60 * noc2 + 50 * noc3 + 65 * noc4));
            }
        });
    }

}
