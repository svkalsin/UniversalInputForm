package com.example.universalinputform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOk(View view){
        EditText eName = findViewById(R.id.editPersonName);
        EditText eEmail = findViewById(R.id.editEmailAddress);

        String name = eName.getText().toString();
        String email = eEmail.getText().toString();

        TextView textResult = findViewById(R.id.textResult);
        textResult.setText(getString(R.string.result_string,name,email));
    }

    public void btnDelete(View view){
        EditText eName = findViewById(R.id.editPersonName);
        EditText eEmail = findViewById(R.id.editEmailAddress);

        eName.setText("");
        eEmail.setText("");
    }
}