package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // call onSendMessage function when button is clicked
/*    public void onSendMessage(View view){

        // get text from the EditText
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();

        // Create an Intent
        Intent intent = new Intent(this, ReceiveMessageActivity.class);

        // add the text to the intent
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    } */

    public void onSendMessage(View view) {
        // get text from the EditText
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();

        // Create an Intent with the action ACTION_SEND
        Intent intent = new Intent(Intent.ACTION_SEND);

        // Set the type of data to be sent
        intent.setType("text/plain");

        // Attach the message text to the intent using EXTRA_TEXT
        intent.putExtra(Intent.EXTRA_TEXT, messageText);

        // get the chooser title
        String chooserTitle = getString(R.string.chooser);

        // Display the chooser dialog
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);

        // Start the activity (displays the chooser dialog)
        startActivity(chosenIntent);
    }

}