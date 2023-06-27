package pervasivecomputing.example.a2markouzisalexandros;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class RegionsFragment extends Fragment {

    private String selection;
    private Button button1, button2, button3, button4, button5, button6, button7,
            button8, button9, button10, button11, button12, button13, button14,
            button15, button16, button17, button18, button19, button20, button21, button22,
            button23, button24, button25, button26, button27;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_regions, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Intent intent = getActivity().getIntent();
        String string = intent.getStringExtra("return");
        if (string == null)
        {
            string = "Central Greece";
        }
        setVisible(string);

        button1 = getActivity().findViewById(R.id.buttonVio);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button2 = getActivity().findViewById(R.id.buttonFth);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button3 = getActivity().findViewById(R.id.buttonFok);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button4 = getActivity().findViewById(R.id.buttonEv);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button5 = getActivity().findViewById(R.id.buttonCha);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button6 = getActivity().findViewById(R.id.buttonRe);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button7 = getActivity().findViewById(R.id.buttonHer);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button8 = getActivity().findViewById(R.id.buttonLas);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button9 = getActivity().findViewById(R.id.buttonArg);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button10 = getActivity().findViewById(R.id.buttonArk);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button11 = getActivity().findViewById(R.id.buttonKor);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button12 = getActivity().findViewById(R.id.buttonLak);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button13 = getActivity().findViewById(R.id.buttonMes);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button14 = getActivity().findViewById(R.id.buttonDra);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button15 = getActivity().findViewById(R.id.buttonEvr);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button16 = getActivity().findViewById(R.id.buttonKav);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button17 = getActivity().findViewById(R.id.buttonRod);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button18 = getActivity().findViewById(R.id.buttonKar);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button19 = getActivity().findViewById(R.id.buttonLar);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button20 = getActivity().findViewById(R.id.buttonMag);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button21 = getActivity().findViewById(R.id.buttonTri);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button22 = getActivity().findViewById(R.id.buttonArt);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button23 = getActivity().findViewById(R.id.buttonThp);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button24 = getActivity().findViewById(R.id.buttonIo);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button25 = getActivity().findViewById(R.id.buttonXan);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button26 = getActivity().findViewById(R.id.buttonPre);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });
        button27 = getActivity().findViewById(R.id.buttonEyr);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegionSelection(v);
            }
        });


    }

    public void setVisible(String str)
    {
        if(str.equals("Central Greece")){
            LinearLayout group = (LinearLayout) getActivity().findViewById(R.id.groupCentral);
            group.setVisibility(View.VISIBLE);
            group.bringToFront();
        }
        if(str.equals("Crete")){
            LinearLayout group = (LinearLayout) getActivity().findViewById(R.id.groupCrete);
            group.setVisibility(View.VISIBLE);
            group.bringToFront();
        }
        if(str.equals("Peloponnisos")){
            LinearLayout group = (LinearLayout) getActivity().findViewById(R.id.groupPeloponnisos);
            group.setVisibility(View.VISIBLE);
            group.bringToFront();
        }
        if(str.equals("Thrace")){
            LinearLayout group = (LinearLayout) getActivity().findViewById(R.id.groupThrace);
            group.setVisibility(View.VISIBLE);
            group.bringToFront();
        }
        if(str.equals("Thessaly")){
            LinearLayout group = (LinearLayout) getActivity().findViewById(R.id.groupThessaly);
            group.setVisibility(View.VISIBLE);
            group.bringToFront();
        }
        if(str.equals("Epirus")){
            LinearLayout group = (LinearLayout) getActivity().findViewById(R.id.groupEpirus);
            group.setVisibility(View.VISIBLE);
            group.bringToFront();
        }
    }

    public void onRegionSelection(View view) {
        switch(view.getId()) {
            case R.id.buttonVio:
                selection = "Viotia";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else{
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonFth:
                selection = "Fthiotida";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonFok:
                selection = "Fokida";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonEv:
                selection = "Evia";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonEyr:
                selection = "Eyritania";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonCha:
                selection = "Chania";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonRe:
                selection = "Rethymno";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonHer:
                selection = "Heraklion";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonLas:
                selection = "Lasithi";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonArg:
                selection = "Argolida";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonArk:
                selection = "Arkadia";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else{
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonKor:
                selection = "Korinthos";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonLak:
                selection = "Lakonia";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonMes:
                selection = "Messinia";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonDra:
                selection = "Drama";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonEvr:
                selection = "Evros";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonKav:
                selection = "Kavala";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonXan:
                selection = "Xanthi";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonRod:
                selection = "Rodopi";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonKar:
                selection = "Karditsa";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonLar:
                selection = "Larisa";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonMag:
                selection = "Magnesia";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonTri:
                selection = "Trikala";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonArt:
                selection = "Arta";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonThp:
                selection = "Thesprotia";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonIo:
                selection = "Ioannina";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonPre:
                selection = "Preveza";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    CitiesFragment frag3 = (CitiesFragment) getFragmentManager().findFragmentById(R.id.fragment3);
                    frag3.onConnection(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), CitiesActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
        }
    }

}