package pervasivecomputing.example.a2markouzisalexandros;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment {

    private String selection;
    private Button button1, button2, button3, button4, button5, button6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        button1 = getActivity().findViewById(R.id.buttonCen);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFirstSelection(v);
            }
        });
        button2 = getActivity().findViewById(R.id.buttonCre);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFirstSelection(v);
            }
        });
        button3 = getActivity().findViewById(R.id.buttonPel);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFirstSelection(v);
            }
        });
        button4 = getActivity().findViewById(R.id.buttonThr);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFirstSelection(v);
            }
        });
        button5 = getActivity().findViewById(R.id.buttonThe);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFirstSelection(v);
            }
        });
        button6 = getActivity().findViewById(R.id.buttonEpi);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFirstSelection(v);
            }
        });

    }

    public void onFirstSelection(View view) {

        switch(view.getId()) {
            case R.id.buttonCen:
                selection = "Central Greece";
                if (getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    RegionsFragment frag = (RegionsFragment) getFragmentManager().findFragmentById(R.id.fragment2);
                    frag.setVisible(selection);
                    break;
                }
                else {
                    Intent intent = new Intent(getActivity(), RegionsActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonCre:
                selection = "Crete";
                if(getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    RegionsFragment frag = (RegionsFragment) getFragmentManager().findFragmentById(R.id.fragment2);
                    frag.setVisible(selection);
                    break;
                }
                else  {
                    Intent intent = new Intent(getActivity(), RegionsActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonPel:
                selection = "Peloponnisos";
                if(getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    RegionsFragment frag = (RegionsFragment) getFragmentManager().findFragmentById(R.id.fragment2);
                    frag.setVisible(selection);
                    break;
                }
                else  {
                    Intent intent = new Intent(getActivity(), RegionsActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonThr:
                selection = "Thrace";
                if(getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    RegionsFragment frag = (RegionsFragment) getFragmentManager().findFragmentById(R.id.fragment2);
                    frag.setVisible(selection);
                    break;
                }
                else  {
                    Intent intent = new Intent(getActivity(), RegionsActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonThe:
                selection = "Thessaly";
                if(getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    RegionsFragment frag = (RegionsFragment) getFragmentManager().findFragmentById(R.id.fragment2);
                    frag.setVisible(selection);
                    break;
                }
                else  {
                    Intent intent = new Intent(getActivity(), RegionsActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
            case R.id.buttonEpi:
                selection = "Epirus";
                if(getResources().getConfiguration().orientation ==
                        Configuration.ORIENTATION_LANDSCAPE) {
                    RegionsFragment frag = (RegionsFragment) getFragmentManager().findFragmentById(R.id.fragment2);
                    frag.setVisible(selection);
                    break;
                }
                else  {
                    Intent intent = new Intent(getActivity(), RegionsActivity.class);
                    intent.putExtra("return",selection);
                    startActivity(intent);
                    break;
                }
        }
    }


}

