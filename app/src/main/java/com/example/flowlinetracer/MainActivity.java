package com.example.flowlinetracer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TraceのON/OFF
        final TextView testMsg = (TextView) findViewById(R.id.txt_Test);
        ToggleButton btnExec = (ToggleButton) findViewById(R.id.btn_Execution);
        btnExec.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    testMsg.setText(">>>Start tracing<<<");
                } else {
                    testMsg.setText(">>>Stop tracing<<<");
                }
            }
        });

        // Settings画面への遷移
        ImageButton btnSet = (ImageButton) findViewById(R.id.btn_Settings);
        btnSet.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SettingsActivity.class));
        });
    }
}