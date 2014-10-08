package com.example.trial.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

/**
 * Created by artie-sh on 10/7/14.
 */
public class DisplayTextActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_display);
        
        Intent intent = this.getIntent();
        TextView display_screen = (TextView) findViewById(R.id.display_screen);
        display_screen.setText(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
        //display_screen.setText(findViewById(R.id.aatemmaa).getVisibility());

    }

    public void onClick(View view) {

        //TextView display_screen = (TextView) findViewById(R.id.display_screen);
        //display_screen.setText(findViewById(R.id.aatemmaa).getVisibility());

        switch (view.getId()) {

            case R.id.aatemmaa:
                if (view.getVisibility() == View.VISIBLE) {
                    view.setVisibility(View.INVISIBLE);
                }
                else {
                    view.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.go_back:
                Intent intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
                break;
        }
    }

    public void go_back(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }

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
