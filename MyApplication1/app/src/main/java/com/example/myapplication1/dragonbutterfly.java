package com.example.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication1.databinding.FragmentDragonbutterflyBinding;


public class dragonbutterfly extends Fragment {

    private FragmentDragonbutterflyBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentDragonbutterflyBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageViewDragonbutterfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(dragonbutterfly.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
        binding.lovedragonbutterflyFull.setVisibility(View.INVISIBLE);
        binding.lovedragonbutterfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.lovedragonbutterfly){
                    binding.lovedragonbutterflyFull.setVisibility(View.VISIBLE);
                }
            }
        });
        binding.lovedragonbutterflyFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.lovedragonbutterfly_full){
                    binding.lovedragonbutterflyFull.setVisibility(View.INVISIBLE);
                    binding.lovedragonbutterfly.setVisibility(View.VISIBLE);
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