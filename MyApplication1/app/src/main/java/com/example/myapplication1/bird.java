package com.example.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication1.databinding.FragmentBirdBinding;


public class bird extends Fragment {

    private FragmentBirdBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentBirdBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageViewBird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(bird.this)
                        .navigate(R.id.action_bird2_to_FirstFragment);
            }
        });
        binding.lovebirdFull.setVisibility(View.INVISIBLE);
        binding.lovebird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.lovebird){
                    binding.lovebirdFull.setVisibility(View.VISIBLE);
                }
            }
        });
        binding.lovebirdFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.lovebird_full){
                    binding.lovebirdFull.setVisibility(View.INVISIBLE);
                    binding.lovebird.setVisibility(View.VISIBLE);
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