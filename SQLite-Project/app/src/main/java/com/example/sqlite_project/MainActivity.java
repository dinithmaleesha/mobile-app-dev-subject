package com.example.sqlite_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // creating variables for our edittext, button and dbhandler
    private EditText nameEdt, ageEdt, addressEdt, emailEdt;
    private Button addBtn;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing all our variables.
        nameEdt = findViewById(R.id.idName);
        ageEdt = findViewById(R.id.idAge);
        addressEdt = findViewById(R.id.idAddress);
        emailEdt = findViewById(R.id.idEmail);
        addBtn = findViewById(R.id.idBtnAdd);

        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(MainActivity.this);

        // below line is to add on click listener for our add course button.
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // below line is to get data from all edit text fields.
                String name = nameEdt.getText().toString();
                String age = ageEdt.getText().toString();
                String address = addressEdt.getText().toString();
                String email = emailEdt.getText().toString();

                // validating if the text fields are empty or not.
                if (name.isEmpty() && age.isEmpty() && address.isEmpty() && email.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }

                // on below line we are calling a method to add new
                // course to sqlite data and pass all our values to it.
                dbHandler.addNewCourse(name, age, address, email);

                // after adding the data we are displaying a toast message.
                Toast.makeText(MainActivity.this, "Course has been added.", Toast.LENGTH_SHORT).show();
                nameEdt.setText("");
                ageEdt.setText("");
                addressEdt.setText("");
                emailEdt.setText("");
            }
        });
    }
}