package com.nrtec.mouni.menu;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    int date,month,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()){
           case R.id.settings :
               Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
           case  R.id.call :
               Toast.makeText(getApplicationContext(),item.getTitle(), Toast.LENGTH_SHORT).show();
           case R.id.contact :
               Toast.makeText(getApplicationContext(), item.getTitle(),Toast.LENGTH_SHORT).show();
           case R.id.logout :
               Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();


       }

        return super.onOptionsItemSelected(item);

    }

    public void alert(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert Dialog");
        builder.setMessage("Do you want to close the app..?");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
        builder.setCancelable(false);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void dpd(View view) {
        Calendar c = Calendar.getInstance();
        date = c.get(Calendar.DATE);
        month = c.get(Calendar.MONTH);
        year = c.get(Calendar.YEAR);
        DatePickerDialog dpd = new DatePickerDialog(this);
        dpd.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Toast.makeText(MainActivity.this, year+"-"+(month+1)+"-"+dayOfMonth, Toast.LENGTH_SHORT).show();
            }
        });
        dpd.show();
    }





}
