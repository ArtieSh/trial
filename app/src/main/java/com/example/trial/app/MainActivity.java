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


public class MainActivity extends ActionBarActivity {

    //private Button push_me = (Button) findViewById(R.id.push_me);
    //private EditText paste_me = (EditText) findViewById(R.id.paste_me);
    //public View show_me = (TextView) findViewById(R.id.show_me);
    //private Button clear_me = (Button) findViewById(R.id.clear_me);

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        //show_time();
    }


public void do_job(View view) {

    EditText paste_me = (EditText) findViewById(R.id.paste_me);

    TextView show_me = (TextView) findViewById(R.id.show_me);

    Intent intent = new Intent(this, DisplayTextActivity.class);

    intent.putExtra(EXTRA_MESSAGE, paste_me.getText());

    this.startActivity(intent);



    show_me.setText(paste_me.getText());
}

public void clear_it(View view) {

    EditText paste_me = (EditText) findViewById(R.id.paste_me);
    TextView show_me = (TextView) findViewById(R.id.show_me);

    show_me.setText("");
}

public void show_time(View view) {

    Date time = new Date();

    String hours = ((Integer) time.getHours()).toString();
    String minutes = ((Integer) time.getMinutes()).toString();
    String seconds = ((Integer) time.getSeconds()).toString();

    String result = hours + ':' + minutes + ':' + seconds;

    //EditText place_text = (EditText) v;

    TextView show_me = (TextView) findViewById(R.id.show_me);

    show_me.setText(result);

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
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
