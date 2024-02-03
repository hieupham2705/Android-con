package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        binding.button.setOnClickListener(view -> {
//            Intent intent = new Intent(this, Screen2.class);
//            intent.putExtra("key","Cao ăn cứt");
//            intent.putExtra("key2",2);
//            startActivity(intent);

//        } );

        replaceFragments(new Fragment1());
        binding.nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.tap1: {
                        replaceFragments(new Fragment1());
                        item.setChecked(true);
                        return true;
                    }
                    case R.id.tap2: {
                        replaceFragments(new Fragment2());
                        item.setChecked(true);
                        return true;
                    }
                }
                return false;
            }

        });

    }
    private void replaceFragments(Fragment fragment) {

//         fragmentManager = supportFragmentManager
//        val fragmentTransition = fragmentManager.beginTransaction()
//        fragmentTransition.replace(R.id.frame_layout,fragment)
//        fragmentTransition.commit()
      getSupportFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();
    }
}