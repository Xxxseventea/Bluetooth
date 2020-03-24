package com.example.bluetooth.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bluetooth.R;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {
    Button back;
    TextView head;
    TextView name;
    TextView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        back = findViewById(R.id.setting_back);
        head = findViewById(R.id.change_head);
        name = findViewById(R.id.change_name);
        number = findViewById(R.id.change_stunumber);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setting_back:{
                finish();
                break;
            }

            case R.id.change_head:{
                getPhoto();
                break;
            }

            case R.id.change_name:{

                break;
            }

            case R.id.change_stunumber:{

                break;
            }
        }
    }

    private void getPhoto() {

    }
}
