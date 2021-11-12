package blehblu.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText name,email,phone;
     Button check,fragment,f2a,f2f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        check=findViewById(R.id.check);
        fragment=findViewById(R.id.fragment);
        f2a=findViewById(R.id.fragment2);
        f2f=findViewById(R.id.f2f);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName=name.getText().toString();
                String userE=email.getText().toString();
                int userP=Integer.valueOf(phone.getText().toString());
                Intent intent=new Intent(MainActivity.this,second.class);
                intent.putExtra("name",userName);
                intent.putExtra("email",userE);
                intent.putExtra("phone",userP);
                startActivity(intent);
                finish();

            }
        });

        fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,fragment1.class);
                startActivity(intent);
                finish();
            }
        });

        f2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,fragmentToA.class);
                startActivity(intent);
                finish();
            }
        });

        f2f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,fragmentToF.class);
                startActivity(intent);

            }
        });

    }
}