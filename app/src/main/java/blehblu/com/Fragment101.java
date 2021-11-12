package blehblu.com;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;


public class Fragment101 extends Fragment {
        TextView result;
    public Fragment101() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_101,container,false); //three parameters 1. name of the xml of fragment,2. container, 3. false
        result=view.findViewById(R.id.result);
        Bundle bundle=getArguments();
        float userH=bundle.getInt("height");
        float userW=bundle.getInt("weight");
        float bmi  =((userW/userH)/userH)*10000;

        result.setText("your bmi is "+bmi);
         return view;

    }
}