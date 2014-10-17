package com.example.trial.app;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;

/**
 * Created by artie-sh on 10/7/14.
 */
public class DisplayTextActivity extends ActionBarActivity {


    public static final String VISIBILITY_STATE = "com.example.trial.app.VISIBILITY_STATE";

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

            case R.id.switch_button:
                this.switch_visibility(view);
                break;

            case R.id.go_back:
                this.go_back();
                break;
            case R.id.aatemmaa:
                this.move_around();
                break;
        }
    }

    public boolean change_color(View view) {

       ColorDrawable bg_color =  (ColorDrawable) view.getBackground();

       if (bg_color.getColor() == R.color.white) {

           bg_color.setColor(R.color.black);

           view.setBackground(bg_color);

           return true;
       } else {

           bg_color.setColor(R.color.white);

           view.setBackground(bg_color);
           return false;
       }
    }

    public void move_around() {

        ImageView imageView = (ImageView) this.findViewById(R.id.aatemmaa);

        Display display = this.getWindowManager().getDefaultDisplay();
        //Point size = new Point();
        //display.getSize(size);

        int width = display.getWidth();
        int height = display.getHeight();

        int width_new = (int) Math.round(Math.random() * width);
        int height_new = (int) Math.round(Math.random() * height);

       // imageView.setX(width_new);
        //imageView.setY(height_new);

    }

    public void switch_visibility(View view) {

        View picture = this.findViewById(R.id.aatemmaa);
        Button button = (Button) view;

        if (picture.getVisibility() == View.VISIBLE) {
            picture.setVisibility(View.INVISIBLE);
            button.setText(R.string.invisible);
        }
        else {
            picture.setVisibility(View.VISIBLE);
            button.setText(R.string.visible);
        }
    }

    public void go_back() {

        ImageView pic = (ImageView) this.findViewById(R.id.aatemmaa);
        Intent intent = new Intent(this, MainActivity.class);

        if (pic.getVisibility() == View.VISIBLE) {
            intent.putExtra(VISIBILITY_STATE, "visible");
        } else {
            intent.putExtra(VISIBILITY_STATE, "invisible");
        }
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
