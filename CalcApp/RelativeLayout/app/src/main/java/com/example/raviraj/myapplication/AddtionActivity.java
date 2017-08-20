package com.example.raviraj.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

public class AddtionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtion);
        Bundle bundle = getIntent().getExtras();
        String fristNumber = bundle.getString(MainActivity.KEY_FRIST_NUMBER);
        String seconfNumber = bundle.getString(MainActivity.KEY_SECOND_NUMBER);
        int ans=Integer.parseInt(fristNumber)+Integer.parseInt(seconfNumber);

        String answer=String.valueOf(ans);
        if (TextUtils.isEmpty(fristNumber)) {
            setResult(RESULT_CANCELED, null);
            finish();
        } else {
            Intent intent = new Intent();
            intent.putExtra("ans", answer);
            setResult(RESULT_OK, intent);
            finish();

        }
    }
}
