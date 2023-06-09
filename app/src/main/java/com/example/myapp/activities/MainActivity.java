package com.example.myapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;
import com.example.myapp.databinding.ActivityMainBinding;
import com.example.myapp.fragments.AccueilFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private final String TAG = "MainActivity";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NavHostFragment navHostFragment = (NavHostFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragment_container_main);
        if (navHostFragment!=null){
            /*NavController navController = navHostFragment.getNavController();
            navController.navigate(R.id.action_accueilFragment2_to_createAccountFragment2);
        */}
        init();
    }

    void init(){
        AccueilFragment accueilFragment = AccueilFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_main,accueilFragment)
                .commit();
    }

}