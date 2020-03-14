package com.example.bluetooth.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.example.bluetooth.R;
import com.example.bluetooth.adapter.ViewpagerAdapter;
import com.example.bluetooth.view.fragment.MyFragment;
import com.example.bluetooth.view.fragment.PeriodFragment;
import com.example.bluetooth.view.fragment.RankingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    BottomNavigationView navigationView;
    ArrayList<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.main_viewpager);
        navigationView = findViewById(R.id.navgationview);
        fragments.add(new PeriodFragment());
        fragments.add(new RankingFragment());
        fragments.add(new MyFragment());

        ViewpagerAdapter viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager() ,fragments);
        viewPager.setAdapter(viewpagerAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if (position <= 1) {
                    navigationView.getMenu().getItem(position).setChecked(false);
                } else if (position >= 2 && position <= 3) {
                    navigationView.getMenu().getItem(position + 1).setChecked(false);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        try {
            disableShiftMode(navigationView);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //添加item监听

    }



    /**
     * Description: 反射解决使用的时候 item 数大于 3 个时会有位移
     */
    @SuppressLint("RestrictedApi")
    public void disableShiftMode(BottomNavigationView view) throws Exception {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                //noinspection RestrictedApi
                item.setShifting(false);
                // set once again checked value, so view will be updated
                // noinspection RestrictedApi
                item.setChecked(item.getItemData().isChecked());
            }
        } catch (NoSuchFieldException e) {
            Log.e("BNVHelper", "Unable to get shift mode field", e);
        } catch (IllegalAccessException e) {
            Log.e("BNVHelper", "Unable to change value of shift mode", e);
        }
    }
}
