package com.example.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.myapplication1.databinding.FragmentDogBinding;


public class dog extends Fragment {

    private FragmentDogBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentDogBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageViewDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(dog.this)
                        .navigate(R.id.action_dog_to_FirstFragment);
            }
        });
        binding.lovedogFull.setVisibility(View.INVISIBLE);
        binding.lovedog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.lovedog){
                    binding.lovedogFull.setVisibility(View.VISIBLE);
                }
            }
        });
        binding.lovedogFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.lovedog_full){
                    binding.lovedogFull.setVisibility(View.INVISIBLE);
                    binding.lovedog.setVisibility(View.VISIBLE);
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