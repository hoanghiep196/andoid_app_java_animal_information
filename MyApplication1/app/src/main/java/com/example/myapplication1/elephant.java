package com.example.myapplication1;

import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication1.databinding.FragmentDragonbutterflyBinding;
import com.example.myapplication1.databinding.FragmentElephantBinding;


public class elephant extends Fragment {

    private FragmentElephantBinding binding;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentElephantBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }



    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.iconelephant.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    binding.iconelephant.startAnimation(AnimationUtils.loadAnimation(binding.iconelephant.getContext(),R.anim.scaleup));

                else if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    binding.iconelephant.startAnimation(AnimationUtils.loadAnimation(binding.iconelephant.getContext(),R.anim.alpha2));
                }
                NavHostFragment.findNavController(elephant.this).navigate(R.id.action_FirstFragment_to_elephant1);
                return false;
            }
        });

        binding.iconbird.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    binding.iconbird.startAnimation(AnimationUtils.loadAnimation(binding.iconelephant.getContext(),R.anim.scaleup));

                else if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    binding.iconbird.startAnimation(AnimationUtils.loadAnimation(binding.iconelephant.getContext(),R.anim.scaledown));
                }
                NavHostFragment.findNavController(elephant.this).navigate(R.id.action_FirstFragment_to_bird2);
                return false;
            }
        });
        binding.icondog.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    binding.icondog.startAnimation(AnimationUtils.loadAnimation(binding.icondog.getContext(),R.anim.scaleup));

                else if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    binding.icondog.startAnimation(AnimationUtils.loadAnimation(binding.icondog.getContext(),R.anim.alpha2));
                }
                NavHostFragment.findNavController(elephant.this).navigate(R.id.action_FirstFragment_to_dog);
                return false;
            }
        });
        binding.icondragonbutterfly.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    binding.icondragonbutterfly.startAnimation(AnimationUtils.loadAnimation(binding.icondragonbutterfly.getContext(),R.anim.scaleup));

                else if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    binding.icondragonbutterfly.startAnimation(AnimationUtils.loadAnimation(binding.icondragonbutterfly.getContext(),R.anim.alpha2));
                }
                NavHostFragment.findNavController(elephant.this).navigate(R.id.action_FirstFragment_to_SecondFragment);
                return false;
            }
        });
        binding.iconturtle.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    binding.iconturtle.startAnimation(AnimationUtils.loadAnimation(binding.iconturtle.getContext(),R.anim.scaleup));

                else if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    binding.iconturtle.startAnimation(AnimationUtils.loadAnimation(binding.iconturtle.getContext(),R.anim.alpha2));
                }
                NavHostFragment.findNavController(elephant.this).navigate(R.id.action_FirstFragment_to_turtle);
                return false;
            }
        });
        binding.iconladybug.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    binding.iconladybug.startAnimation(AnimationUtils.loadAnimation(binding.iconladybug.getContext(),R.anim.scaleup));

                else if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    binding.iconladybug.startAnimation(AnimationUtils.loadAnimation(binding.iconladybug.getContext(),R.anim.alpha2));
                }
                NavHostFragment.findNavController(elephant.this).navigate(R.id.action_FirstFragment_to_ladybug);
                return false;
            }
        });
        binding.icondolphin.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    binding.icondolphin.startAnimation(AnimationUtils.loadAnimation(binding.icondolphin.getContext(),R.anim.scaleup));

                else if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    binding.icondolphin.startAnimation(AnimationUtils.loadAnimation(binding.icondolphin.getContext(),R.anim.alpha2));
                }
                NavHostFragment.findNavController(elephant.this).navigate(R.id.action_FirstFragment_to_dolphin);
                return false;
            }
        });
        binding.iconpig.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    binding.iconpig.startAnimation(AnimationUtils.loadAnimation(binding.iconpig.getContext(),R.anim.scaleup));

                else if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    binding.iconpig.startAnimation(AnimationUtils.loadAnimation(binding.iconpig.getContext(),R.anim.alpha2));
                }
                NavHostFragment.findNavController(elephant.this).navigate(R.id.action_FirstFragment_to_pig);
                return false;
            }
        });
        binding.iconduck.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    binding.iconduck.startAnimation(AnimationUtils.loadAnimation(binding.iconduck.getContext(),R.anim.scaleup));

                else if (motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                    binding.iconduck.startAnimation(AnimationUtils.loadAnimation(binding.iconduck.getContext(),R.anim.alpha2));
                }
                NavHostFragment.findNavController(elephant.this).navigate(R.id.action_FirstFragment_to_duck);
                return false;
            }
        });


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}