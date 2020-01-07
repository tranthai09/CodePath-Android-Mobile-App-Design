package com.tranthai.hellolily;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView10)).setTextColor(
                        getResources().getColor(R.color.colorAccent));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorCyan));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //grab text the user inputted
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                //grab text info into our text view once the "change text" button is clicked
                if (TextUtils.isEmpty(newText)){
                    ((TextView)findViewById(R.id.textView10)).setText("Hello from Lily!");
                }
                else {
                    ((TextView)findViewById(R.id.textView10)).setText(newText);
                }
                //((TextView) findViewById(R.id.textView10)).setText("Goodbye!    ");

            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset text color to white
                ((TextView)findViewById(R.id.textView10)).setTextColor(
                        getResources().getColor(R.color.colorWhite));
                //reset background color back to PrimaryDark
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimaryDark));
                //reset text back to "Hello from Lily!"
                ((TextView) findViewById(R.id.textView10)).setText("Hello from Lily!");
            }
        });


    }
}
