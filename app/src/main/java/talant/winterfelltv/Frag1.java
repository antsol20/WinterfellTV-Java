package talant.winterfelltv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class Frag1 extends Fragment implements View.OnClickListener {

    Button homeB;
    Button searchB;
    Button backB;
    Button infoB;


    Button rewindB;
    Button playB;
    Button pauseB;
    Button stopB;
    Button recB;
    Button ffwdB;
    Button upB;
    Button downB;
    Button leftB;
    Button rightB;
    Button selectB;
    Button chup;
    Button chdown;
    Button oneB;
    Button twoB;
    Button threeB;
    Button fourB;
    Button fiveB;
    Button sixB;
    Button sevenB;
    Button eightB;
    Button nineB;
    Button zeroB;
    Button redB;
    Button greenB;
    Button yellowB;
    Button blueB;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_1, container, false);


        searchB = root.findViewById(R.id.searchB);
        searchB.setOnClickListener(this);

        homeB = root.findViewById(R.id.homeB);
        homeB.setOnClickListener(this);

        backB = root.findViewById(R.id.powerB);
        backB.setOnClickListener(this);

        infoB = root.findViewById(R.id.infoB);
        infoB.setOnClickListener(this);

        rewindB = root.findViewById(R.id.rewindB);
        rewindB.setOnClickListener(this);

        playB = root.findViewById(R.id.playB);
        playB.setOnClickListener(this);

        pauseB = root.findViewById(R.id.pauseB);
        pauseB.setOnClickListener(this);

        stopB = root.findViewById(R.id.stopB);
        stopB.setOnClickListener(this);

        recB = root.findViewById(R.id.recordB);
        recB.setOnClickListener(this);

        ffwdB = root.findViewById(R.id.fastforwardB);
        ffwdB.setOnClickListener(this);

        upB = root.findViewById(R.id.upB);
        upB.setOnClickListener(this);

        downB = root.findViewById(R.id.downB);
        downB.setOnClickListener(this);

        leftB = root.findViewById(R.id.leftB);
        leftB.setOnClickListener(this);

        rightB = root.findViewById(R.id.rightB);
        rightB.setOnClickListener(this);

        selectB = root.findViewById(R.id.selectB);
        selectB.setOnClickListener(this);

        chup = root.findViewById(R.id.chupB);
        chup.setOnClickListener(this);

        chdown = root.findViewById(R.id.chdownB);
        chdown.setOnClickListener(this);

        oneB = root.findViewById(R.id.oneB);
        oneB.setOnClickListener(this);

        twoB = root.findViewById(R.id.twoB);
        twoB.setOnClickListener(this);

        threeB = root.findViewById(R.id.threeB);
        threeB.setOnClickListener(this);

        fourB = root.findViewById(R.id.fourB);
        fourB.setOnClickListener(this);

        fiveB = root.findViewById(R.id.fiveB);
        fiveB.setOnClickListener(this);

        sixB = root.findViewById(R.id.sixB);
        sixB.setOnClickListener(this);

        sevenB = root.findViewById(R.id.sevenB);
        sevenB.setOnClickListener(this);

        eightB = root.findViewById(R.id.eightB);
        eightB.setOnClickListener(this);

        nineB = root.findViewById(R.id.nineB);
        nineB.setOnClickListener(this);

        zeroB = root.findViewById(R.id.zeroB);
        zeroB.setOnClickListener(this);

        redB = root.findViewById(R.id.redB);
        redB.setOnClickListener(this);

        greenB = root.findViewById(R.id.greenB);
        greenB.setOnClickListener(this);

        yellowB = root.findViewById(R.id.yellowB);
        yellowB.setOnClickListener(this);

        blueB = root.findViewById(R.id.blueB);
        blueB.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        Button b = v.findViewById(v.getId());
        String btn_tag = b.getTag().toString();

        RemoteFunc.doCode(1, btn_tag);

    }
}