package blehblu.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class fragment1 extends AppCompatActivity {
    EditText weight,height;
    Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1);
        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        confirm=findViewById(R.id.confirm);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Fragment101 fg1=new Fragment101();

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle= new Bundle();
                int userWeight=Integer.valueOf(weight.getText().toString());
                int userHeight=Integer.valueOf(height.getText().toString());
                bundle.putInt("weight",userWeight);
                bundle.putInt("height",userHeight);
                fg1.setArguments(bundle);
                fragmentTransaction.add(R.id.frame,fg1);
                fragmentTransaction.commit();
            }
        });
    }
}