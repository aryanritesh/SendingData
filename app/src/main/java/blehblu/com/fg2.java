package blehblu.com;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class fg2 extends Fragment {
      TextView reci;


    public fg2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fg2, container, false);
        reci=view.findViewById(R.id.reci);
        Bundle bundle=getArguments();
        String name121=bundle.getString("personsname");
        reci.setText(name121);

        return view;
    }
}