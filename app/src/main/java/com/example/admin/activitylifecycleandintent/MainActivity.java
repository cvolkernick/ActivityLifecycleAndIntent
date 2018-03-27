package com.example.admin.activitylifecycleandintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private final String TAG = Tagger.get(this);
    private EditText etmain;
    private EditText etName;
    private EditText etAge;
    private EditText etGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        bindViews();
    }

    private void bindViews() {
        //ind the main one
        etmain = findViewById(R.id.etMain);

        // bind views for person
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etGender = findViewById(R.id.etGender);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onResume();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    public void onFinish(View view) {
        //init person object
        String name = etName.getText().toString();
        String age = etAge.getText().toString();
        String gender = etGender.getText().toString();

        Person person = new Person(name, age, gender);

        //go to second activity
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("data", etmain.getText().toString());

        // add person to intent
        intent.putExtra("person", person);
        startActivity(intent);
    }
}
