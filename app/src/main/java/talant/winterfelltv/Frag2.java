package talant.winterfelltv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;



public class Frag2 extends Fragment implements View.OnClickListener {

    Button onB;
    Button offB;
    Button volupB;
    Button voldownB;
    Button muteB;
    Button unmuteB;

    Button matrixB;
    Button ps4B;
    Button tvaudioB;
    Button fronthdmiB;
    Button sonosB;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_2, container, false);

        onB = root.findViewById(R.id.onB);
        onB.setOnClickListener(this);

        offB = root.findViewById(R.id.offB);
        offB.setOnClickListener(this);

        volupB = root.findViewById(R.id.volupB);
        volupB.setOnClickListener(this);

        voldownB = root.findViewById(R.id.voldownB);
        voldownB.setOnClickListener(this);

        muteB = root.findViewById(R.id.muteB);
        muteB.setOnClickListener(this);

        unmuteB = root.findViewById(R.id.unmuteB);
        unmuteB.setOnClickListener(this);

        matrixB = root.findViewById(R.id.matrixB);
        matrixB.setOnClickListener(this);

        ps4B = root.findViewById(R.id.ps4B);
        ps4B.setOnClickListener(this);

        tvaudioB = root.findViewById(R.id.tvaudioB);
        tvaudioB.setOnClickListener(this);

        fronthdmiB = root.findViewById(R.id.fronthdmiB);
        fronthdmiB.setOnClickListener(this);

        sonosB = root.findViewById(R.id.sonosB);
        sonosB.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        Button b = v.findViewById(v.getId());
        String btn_tag = b.getTag().toString();

        RemoteFunc.doCode(2, btn_tag);

    }
}