package blehblu.com;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentA extends Fragment {
    EditText name1,age1;
    Button done;
    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_a,container,false);
        name1 =view.findViewById(R.id.TextPersonName);
        age1=view.findViewById(R.id.age);
        done=view.findViewById(R.id.done);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName=name1.getText().toString();
                int userAge=Integer.valueOf(age1.getText().toString());
                fragmentToA FA= (fragmentToA) getActivity();
                assert FA != null;
                FA.getData(userName,userAge);

            }
        });
        return view;
    }
}