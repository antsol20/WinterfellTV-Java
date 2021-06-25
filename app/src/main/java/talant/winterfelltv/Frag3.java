package talant.winterfelltv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class Frag3 extends Fragment implements View.OnClickListener {

    RadioGroup radioGroup;
    RadioButton selectedRadioButton;

    Button input1;
    Button input2;
    Button input3;
    Button input4;
    Button input5;
    Button input6;
    Button input7;
    Button input8;

    View root;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_3, container, false);


        input1 = root.findViewById(R.id.input1B);
        input1.setOnClickListener(this);

        input2 = root.findViewById(R.id.input2B);
        input2.setOnClickListener(this);

        input3 = root.findViewById(R.id.input3B);
        input3.setOnClickListener(this);

        input4 = root.findViewById(R.id.input4B);
        input4.setOnClickListener(this);

        input5 = root.findViewById(R.id.input5B);
        input5.setOnClickListener(this);

        input6 = root.findViewById(R.id.input6B);
        input6.setOnClickListener(this);

        input7 = root.findViewById(R.id.input7B);
        input7.setOnClickListener(this);

        input8 = root.findViewById(R.id.input8B);
        input8.setOnClickListener(this);

        radioGroup = root.findViewById(R.id.RG);

        return root;
    }

    @Override
    public void onClick(View v) {
        String s = null;

        Button b = v.findViewById(v.getId());
        String btn_tag = b.getTag().toString();

        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();

        if (selectedRadioButtonId != -1) {

            selectedRadioButton = root.findViewById(selectedRadioButtonId);
            s = selectedRadioButton.getTag().toString();
        }

        String r = btn_tag + "_room" + s ;
        RemoteFunc.doCode(3, r);
    }
}