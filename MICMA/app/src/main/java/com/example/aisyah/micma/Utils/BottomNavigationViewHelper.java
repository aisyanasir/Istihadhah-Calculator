package com.example.aisyah.micma.Utils;

/**
 * Created by user on 11/13/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import com.example.aisyah.micma.CalendarActivity;
import com.example.aisyah.micma.NotesActivity;
import com.example.aisyah.micma.ProfileActivity;
import com.example.aisyah.micma.R;


/**
 * Created by user on 10/24/2017.
 */

public class BottomNavigationViewHelper{
    private static final String TAG = "BottomNavigationViewHelp";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG, "setupBottomNavigationView:Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation (final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_profile:
                        Intent intent1= new Intent(context, ProfileActivity.class);//ACTIVITY_NUM = 0
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_calendar:
                        Intent intent2= new Intent(context, CalendarActivity.class);//ACTIVITY_NUM = 1
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_notes:
                        Intent intent3= new Intent(context, NotesActivity.class);//ACTIVITY_NUM = 2
                        context.startActivity(intent3);
                        break;


                }
                return false;
            }
        });
    }


}

