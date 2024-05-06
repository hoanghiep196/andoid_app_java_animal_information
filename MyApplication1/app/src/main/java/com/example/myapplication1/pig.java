package com.example.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.myapplication1.databinding.FragmentPigBinding;


public class pig extends Fragment {

    private FragmentPigBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentPigBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageViewPig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(pig.this)
                        .navigate(R.id.action_pig_to_FirstFragment);
            }
        });
        binding.lovepigFull.setVisibility(View.INVISIBLE);
        binding.lovepig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.lovepig){
                    binding.lovepigFull.setVisibility(View.VISIBLE);
                }
            }
        });
        binding.lovepigFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.lovepig_full){
                    binding.lovepigFull.setVisibility(View.INVISIBLE);
                    binding.lovepig.setVisibility(View.VISIBLE);

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