package raghad.alshaikh.android.simpleloginregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private EditText confirmPass;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.editTextUsername);
        password = (EditText) findViewById(R.id.editTextPassword);
        confirmPass = (EditText) findViewById(R.id.editTextConfirmPass);
        btnRegister = (Button) findViewById(R.id.btnRegister);    }
}
