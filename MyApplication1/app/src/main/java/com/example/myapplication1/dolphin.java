package com.example.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.myapplication1.databinding.FragmentDolphinBinding;


public class dolphin extends Fragment {

    private FragmentDolphinBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentDolphinBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageViewDolphin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(dolphin.this)
                        .navigate(R.id.action_dolphin_to_FirstFragment);
            }
        });
        binding.lovedolphinFull.setVisibility(View.INVISIBLE);
        binding.lovedolphin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.lovedolphin){
                    binding.lovedolphinFull.setVisibility(View.VISIBLE);
                }
            }
        });
        binding.lovedolphinFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.lovedolphin_full){
                    binding.lovedolphinFull.setVisibility(View.INVISIBLE);
                    binding.lovedolphin.setVisibility(View.VISIBLE);
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