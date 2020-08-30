package com.rehoboth.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view){
        EditText editText = (EditText) findViewById(R.id.message);
        TextView tview = (TextView) findViewById(R.id.textView);
        String message = editText.getText().toString();

        tview.setText(message);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,message);
        startActivity(intent);

    }
}
