package es.upm.btb.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: La aplicación ha sido creada.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_acciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opcionCalendar:
                DatePickerDialogFragment dpdf = new DatePickerDialogFragment();
                dpdf.show(getSupportFragmentManager(), "DatePickerDialog");
                return true;
            case R.id.opcionSalir:
                AlertDialogFragment dialogFragment = new AlertDialogFragment();
                dialogFragment.show(getSupportFragmentManager(), "ExitDialog");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}