package blehblu.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class fragmentToA extends AppCompatActivity {
    TextView name,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_to);
        name=findViewById(R.id.personName);
        age=findViewById(R.id.personAge);

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        FragmentA fragmentToActivity = new FragmentA();
        fragmentTransaction.add(R.id.display,fragmentToActivity); // two parameters, 1. layout's name 2. object of the fragment
        fragmentTransaction.commit();
    }
}