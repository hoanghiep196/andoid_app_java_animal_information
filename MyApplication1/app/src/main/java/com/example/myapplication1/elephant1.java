package com.example.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.myapplication1.databinding.FragmentElephant1Binding;


public class elephant1 extends Fragment {

    private FragmentElephant1Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentElephant1Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageViewElephant1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(elephant1.this)
                        .navigate(R.id.action_elephant1_to_FirstFragment);
            }
        });
        binding.loveelephant1Full.setVisibility(View.INVISIBLE);
        binding.loveelephant1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.loveelephant1){
                    binding.loveelephant1Full.setVisibility(View.VISIBLE);
                }
            }
        });
        binding.loveelephant1Full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.loveelephant1_full){
                    binding.loveelephant1Full.setVisibility(View.INVISIBLE);
                    binding.loveelephant1.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}