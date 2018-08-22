package com.ywj.shapetextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void press(View view) {
        String text = ((ShapeTextView) view).getText().toString();
        Log.e("tag0", "pressed:"+text);
        showToast(text);
    }


    private void showToast(String msg) {
        if (toast == null)
            toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT);
        toast.setText(msg);
        toast.show();
    }
}
