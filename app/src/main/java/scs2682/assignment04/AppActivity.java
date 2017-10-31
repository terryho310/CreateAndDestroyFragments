package scs2682.assignment04;


import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appactivity);

        findViewById(R.id.addA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragmentA = getFragmentManager().findFragmentByTag(FragmentA.NAME);

                if (fragmentA == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.appActivity, new FragmentA(), FragmentA.NAME)
                            //.addToBackStack(null)
                            .commit();
                }
            }
        });

        findViewById(R.id.removeA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragmentA = getFragmentManager().findFragmentByTag(FragmentA.NAME);

                if (fragmentA != null){
                    getFragmentManager().beginTransaction()
                            .remove(fragmentA)
                            .commit();
                }
            }
        });

        findViewById(R.id.addB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragmentB = getFragmentManager().findFragmentByTag(FragmentB.NAME);

                if (fragmentB == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.appActivity, new FragmentB(), FragmentB.NAME)
                            //.addToBackStack(null)
                            .commit();
                }
            }
        });

        findViewById(R.id.removeB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragmentB = getFragmentManager().findFragmentByTag(FragmentB.NAME);

                if (fragmentB != null){
                    getFragmentManager().beginTransaction()
                            .remove(fragmentB)
                            .commit();
                }
            }
        });


    }
}
