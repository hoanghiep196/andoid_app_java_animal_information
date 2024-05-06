package com.example.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.myapplication1.databinding.FragmentTurtleBinding;
import android.widget.ImageView;


public class turtle extends Fragment {

    private FragmentTurtleBinding binding;
    private boolean statusHeart = false;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentTurtleBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.imageViewTurtle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(turtle.this)
                        .navigate(R.id.action_turtle_to_FirstFragment);
            }
        });
        binding.loveturtleFull.setVisibility(View.INVISIBLE);
        binding.loveturtle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.loveturtle){
                    binding.loveturtle.setVisibility(View.INVISIBLE);
                    binding.loveturtleFull.setVisibility(View.VISIBLE);
                }
            }
        });

        binding.loveturtleFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.loveturtle_full){
                    binding.loveturtle.setVisibility(View.VISIBLE);
                    binding.loveturtleFull.setVisibility(View.INVISIBLE);

                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void setStatusHeart(View view) {
        ImageView imageViewHeart = (ImageView) view.findViewById(R.id.loveturtle);
        ImageView imageViewHeart1 = (ImageView) view.findViewById(R.id.loveturtle_full);
        if(statusHeart == true) {
            imageViewHeart1.setVisibility(view.VISIBLE);
            imageViewHeart.setVisibility(view.INVISIBLE);
        } else {
            imageViewHeart1.setVisibility(view.INVISIBLE);
            imageViewHeart.setVisibility(view.VISIBLE);
        }
    }
}