package com.gaming.know_your_ability.Likes;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.gaming.know_your_ability.R;
import com.gaming.know_your_ability.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LikesActivity extends AppCompatActivity {
    private static final String TAG = "LikesActivity";
    public static final int ACTIVITY_NUM = 3;

    private Context mContext = LikesActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: started");

        setupBottomNavigationView();
    }

    //* Bottom Nav View setup *
    private void setupBottomNavigationView() {
        Log.d(TAG, "setupBottomNavigationView: setup up BottomNavView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, this, bottomNavigationViewEx);

        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);


    }
}
