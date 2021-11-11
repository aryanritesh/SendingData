package blehblu.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView namee,emaill,phonee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        namee=findViewById(R.id.name1);
        emaill=findViewById(R.id.email1);
        phonee=findViewById(R.id.phone1);

        Intent intent=getIntent();
        String userName=intent.getStringExtra("name");
        String userEmail=intent.getStringExtra("email");
        int userPhone=intent.getIntExtra("phone",0123456);

        namee.setText("Hey! "+userName);
        emaill.setText("Your email is "+userEmail);
        phonee.setText("Your phone number is "+userPhone);


    }
}