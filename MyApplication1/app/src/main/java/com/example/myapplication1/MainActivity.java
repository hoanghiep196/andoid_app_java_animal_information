package com.example.myapplication1;

import static com.example.myapplication1.R.drawable.*;
import static com.example.myapplication1.R.drawable.dolphin_view3;
import static com.example.myapplication1.R.drawable.pig_view1;
import static com.example.myapplication1.R.drawable.turtle_view1;

import android.app.Fragment;
import android.media.Image;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication1.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
        private NavController navController;
        Intent intent = new Intent(this, turtle.class);
        private boolean statusHeart = false;
        private int[] animalImages = {turtle_view1, ladybug_view1, pig_view1, elephant_view_, dolphin_view3, dog_view1, bird_view1, duck_view2, chuonchuon_view_1 /* Add more animal drawables */};
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main); // This sets the layout for the activity
            // Initialize NavController

        }
        public void onClickTurtle(View view) {
            ImageView turtleView = (ImageView) findViewById(R.id.imageViewAnimal1);
            turtleView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.fragment_turtle);
                }
            });
        }
        public void onClickLadyBug(View view) {
            ImageView ladyBugView = (ImageView) findViewById(R.id.imageViewAnimal2);
            ladyBugView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.fragment_ladybug);
                }
            });
        }
        public void onClickPig(View view) {
            ImageView pigView = (ImageView) findViewById(R.id.imageViewAnimal3);
            pigView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.fragment_pig);
                }
            });
        }

        public void onClickElephant(View view) {
            ImageView elephantView = (ImageView) findViewById(R.id.imageViewAnimal4);
            elephantView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.fragment_elephant1);
                }
            });
        }

        public void onClickDolphin(View view) {
            ImageView dolphinView = (ImageView) findViewById(R.id.imageViewAnimal5);
            dolphinView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.fragment_dolphin);
                }
            });
        }
        public void onClickDog(View view) {
            ImageView dogView = (ImageView) findViewById(R.id.imageViewAnimal6);
            dogView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.fragment_dog);
                }
            });
        }
        public void onClickBird(View view) {
            ImageView birdView = (ImageView) findViewById(R.id.imageViewAnimal7);
            birdView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.fragment_bird);
                }
            });
        }
        public void onClickDuck(View view) {
            ImageView duckView = (ImageView) findViewById(R.id.imageViewAnimal8);
            duckView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.fragment_duck);
                }
            });
        }
        public void onClickButterFly(View view) {
            ImageView butView = (ImageView) findViewById(R.id.imageViewAnimal9);
            butView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.fragment_dragonbutterfly);
                }
            });
        }
        public void onClickHeart(View view) {
            ImageView heartView1 = (ImageView) findViewById(R.id.imageHeart1);
            ImageView heartView1_1 = (ImageView) findViewById(R.id.imageHeart1_1);
            heartView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    heartView1.setVisibility(v.INVISIBLE);
                    heartView1_1.setVisibility(v.VISIBLE);
                    statusHeart = true;
                    intent.putExtra("statusHeart", true);
                }
            });
            heartView1_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    heartView1.setVisibility(v.VISIBLE);
                    heartView1_1.setVisibility(v.INVISIBLE);
                    statusHeart = false;
                    intent.putExtra("statusHeart", false);
                }
            });

        }



    }


