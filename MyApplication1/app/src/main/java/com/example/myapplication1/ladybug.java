package com.example.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.myapplication1.databinding.FragmentLadybugBinding;


public class ladybug extends Fragment {

    private FragmentLadybugBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentLadybugBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageViewLadybug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ladybug.this)
                        .navigate(R.id.action_ladybug_to_FirstFragment);
            }
        });
        binding.loveladybugFull.setVisibility(View.INVISIBLE);
        binding.loveladybug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.loveladybug){
                    binding.loveladybugFull.setVisibility(View.VISIBLE);
                }
            }
        });
        binding.loveladybugFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.loveladybug_full){
                    binding.loveladybugFull.setVisibility(View.INVISIBLE);
                    binding.loveladybug.setVisibility(View.VISIBLE);

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