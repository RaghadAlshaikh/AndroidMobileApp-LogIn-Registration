package raghad.alshaikh.android.simpleloginregistration;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button btnLogin;
    private TextView validation;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_log_in);


        username = (EditText) findViewById(R.id.editTextUsername);
        password = (EditText) findViewById(R.id.editTextPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        validation = (TextView)findViewById(R.id.validation);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validate(username.getText().toString(), password.getText().toString());
            }
        });
    }

    public void Validate(String name, String pass){
        if (name.equalsIgnoreCase("Admin")&&(pass.equals("1234"))){
            validation.setTextColor(Color.parseColor("#228B22"));
            validation.setText("Valid LogIn! =)");
        } else{
            counter--;
            validation.setTextColor(Color.parseColor("#FD3744"));
            validation.setText("Incorrect! You have "+counter+" attemps");
        }

        if(counter==0){
            btnLogin.setEnabled(false);
            btnLogin.setBackgroundColor(Color.parseColor("#C0C0C0"));
            validation.setText("Incorrect! The Login button has been disable");
        }
    }
}
