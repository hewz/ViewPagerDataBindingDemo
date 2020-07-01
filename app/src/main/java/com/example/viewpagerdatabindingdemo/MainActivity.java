package com.example.viewpagerdatabindingdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.viewpagerdatabindingdemo.databinding.ActivityMainBinding;
import com.example.viewpagerdatabindingdemo.ui.dashboard.DashboardFragment;
import com.example.viewpagerdatabindingdemo.ui.home.HomeFragment;
import com.example.viewpagerdatabindingdemo.ui.notifications.NotificationsFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ViewModel model = new ViewModel();
        binding.setViewModel(model);

        ViewAdapter adapter = new ViewAdapter(getSupportFragmentManager());
        adapter.addFragment(new DashboardFragment());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new NotificationsFragment());
        adapter.addFragment(new HomeFragment());
        binding.setAdapter(adapter);

    }

}