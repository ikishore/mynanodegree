package android.kishore.nanodegree;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    public static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Registering onClick listeners:");

        findViewById(R.id.spotify).setOnClickListener(this);
        findViewById(R.id.superduo).setOnClickListener(this);
        findViewById(R.id.build).setOnClickListener(this);
        findViewById(R.id.xyz).setOnClickListener(this);
        findViewById(R.id.capstone).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick listener is called for View: "+view.getId());

        switch (view.getId()) {
            case R.id.spotify :
                Toast.makeText(getApplicationContext(), "This button will launch my spotify app!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.superduo :
                Toast.makeText(getApplicationContext(), "This button will launch my Super Duo app!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.build :
                Toast.makeText(this, "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.xyz :
                Toast.makeText(this, "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstone :
                Toast.makeText(this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
                break;

            default:
                Log.e(TAG, "Clicked on unknown View with ID:"+view.getId());
                break;

        }
    }
}
