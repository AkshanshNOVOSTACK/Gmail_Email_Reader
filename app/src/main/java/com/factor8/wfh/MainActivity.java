package com.factor8.wfh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.factor8.wfh.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
   private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Adapter_Recc adapter = new Adapter_Recc();
        binding.recyclerViewRecc.setLayoutManager(new GridLayoutManager(this,2));
        binding.recyclerViewRecc.setAdapter(adapter);
    }
}
