package blehblu.com;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class fg1 extends Fragment {
     EditText name;
     Button check;

    public fg1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_fg1, container, false);
        name=view.findViewById(R.id.userName);
        check=view.findViewById(R.id.check);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usersName=name.getText().toString();
                Bundle bundle= new Bundle();
                bundle.putString("personsname",usersName);
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                 fg2 fg2=new fg2();
                 fg2.setArguments(bundle);
                 fragmentTransaction.replace(R.id.screen,fg2);
                 fragmentTransaction.commit();
            }
        });
        return  view;
    }
}