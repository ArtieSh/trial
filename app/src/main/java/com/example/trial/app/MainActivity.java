package com.example.trial.app;

import android.app.FragmentManager;
//import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Date;


public class MainActivity extends FragmentActivity {

    //public EditText edit_text = (EditText) findViewById(R.id.edit_text);
    //TextView text_view = (TextView) findViewById(R.id.text_view);
    //public Intent intent = new Intent(this, DisplayTextActivity.class);

    //public static final String EXTRA_MESSAGE = "com.example.trial.app.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);


    }


public void onClick(View view) {

//    TextView text_view = (TextView) findViewById(R.id.text_view);
  //  EditText edit_text = (EditText) findViewById(R.id.edit_text);

    switch (view.getId()) {

        case R.id.start_first:



            this.startFirstFragment();
            break;
        case R.id.start_second:

            break;
        case R.id.start_third:

            break;
    }
}

    public void startFirstFragment() {

        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();

        First_Fragment fragment = new First_Fragment();

        fragmentTransaction.add(R.id.fragment_container, fragment);

        fragmentTransaction.commit();

        //firstFragment.startActivity(intent);

        //this.getSupportFragmentManager().beginTransaction().add
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        this.getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
