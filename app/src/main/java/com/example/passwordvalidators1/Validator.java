package com.example.passwordvalidators1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Validator extends AppCompatActivity {
    public static final String EXTRA_PASS= "com.example.passwordvalidator1.PASS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);
    }

    /** Called when the user wants to check their password strength*/
    public void strengthCheck(View view){
        //Intent intent= new Intent(this, CheckPasswordActivity.class);
        EditText editText= (EditText) findViewById(R.id.editText2);
        String message= editText.getText().toString();

        PasswordValidator pv=new PasswordValidator();

        pv.setPass(message);

        TextView textView=findViewById(R.id.textView);

        if(pv.isSecure()){
            textView.setText("Password is Strong");
        }

        else{
            textView.setText("Password is Weak. Please try again");
        }
        //intent.putExtra(EXTRA_PASS,message);
        //startActivity(intent);

    }
}
