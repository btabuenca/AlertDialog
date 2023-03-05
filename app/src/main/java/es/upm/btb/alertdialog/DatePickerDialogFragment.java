package es.upm.btb.alertdialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class DatePickerDialogFragment extends DialogFragment {

    private static final String TAG = "DatePickerDialogFragment";

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        //Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (monthOfYear + 1) + "/" + year, Toast.LENGTH_LONG).show();
                        Log.d(TAG, "onDateSet: "+dayOfMonth + "/" + (monthOfYear + 1) + "/" + year + ".");
                    }
                }, mYear, mMonth, mDay);


        return datePickerDialog;
    }
}
