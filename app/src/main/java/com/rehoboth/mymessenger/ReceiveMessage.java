package com.rehoboth.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessage extends Activity {
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receive_message);

        TextView textView = (TextView) findViewById(R.id.receiveMessage);

        Intent intent= getIntent();
        String mess = intent.getStringExtra(EXTRA_MESSAGE);

        textView.setText(mess);

    }
}
