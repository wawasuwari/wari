/*
 * Copyright 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.textswitcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import android.widget.ImageView;

/**
 * This sample shows the use of the {@link android.widget.TextSwitcher} View with animations. A
 * {@link android.widget.TextSwitcher} is a special type of {@link android.widget.ViewSwitcher} that animates
 * the current text out and new text in when
 * {@link android.widget.TextSwitcher#setText(CharSequence)} is called.
 */
public class MainActivity extends Activity {
    private TextSwitcher mSwitcher;
    private int mCounter,nCounter;
    private Button nextButton;
    private Button backButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_main);

        // Get the TextSwitcher view from the layout
        mSwitcher = findViewById(R.id.switcher);

        // BEGIN_INCLUDE(setup)
        // Set the factory used to create TextViews to switch between.
        mSwitcher.setFactory(mFactory);

        /*
         * Set the in and out animations. Using the fade_in/out animations
         * provided by the framework.
         */
        Animation in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        Animation out = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out);
        mSwitcher.setInAnimation(in);
        mSwitcher.setOutAnimation(out);
        // END_INCLUDE(setup)

        /*
         * Setup the 'next' button. The counter is incremented when clicked and
         * the new value is displayed in the TextSwitcher. The change of text is
         * automatically animated using the in/out animations set above.
         */
        backButton = findViewById(R.id.button2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter--;

                if (mCounter==1){
                    mSwitcher.setText("1.ท่าต้นไม้ (Tree Pose)\n ยืนให้แขนชิดกันทิ้งน้ำหนักไปที่ขาซ้ายวางเท้าขวาไว้ที่ต้นขาด้านในหันสะโพกออกไปด้านหน้าเแล้วให้ประกบฝ่ามือเข้าด้วยกันสูดอากาศเข้าแล้วยืดแขนขึ้นเหนือไหล่ต่อมาแยกฝ่ามือออกและหันหน้าเข้าทีละข้างค้างไว้ 30 นาทีลดมือลงทำอีกข้าง ");
                    imageView = (ImageView)findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.a);
                }
                else if (mCounter==2) {
                    mSwitcher.setText("2.ท่าภูเขา (Mountain Pose)\n ยืนตรงให้เท้าชิดกันปล่อยไหล่ออกตามสบายพยายามยืนให้น้ำหนักลงไปที่เท้าเสมอกันทั้งสองข้างข้าชิดสูดลมหายใจเข้าให้ลึกชูแขนขึ้นเหนือศีรษะแขนยืดตรงฝ่ามือประกบกันยืดนิ้วขึ้นไปให้สุด");
                    imageView = (ImageView)findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.b);

                }
                else if (mCounter==3) {
                    mSwitcher.setText("3.ท่าตรีโกณ (Triangle Pose)\nยืดแขนสองข้างขนานกับพื้นยืนแยกขาและให้เท้าขวาหันไปด้านข้าง 90 องศา เท้าซ้ายหันออก 45 องศาและยืดแขนขวาลงไปแตะที่พื้นปลายนิ้วอีกข้างให้ยืดขึ้นไปและหันหน้ามองที่เพดานค้างไว้ห้าลมหายใจเข้าออกแล้วซ้ำอีกข้าง");
                    imageView = (ImageView)findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.c);
                }
                else if (mCounter==4) {
                    mSwitcher.setText("4.ท่านั่งบิดตัว (Seated Pose) \nยืดไหล่และแผ่นหลังขึ้นตรงไขว้เท้าขวาออกไปด้านนอกต้นขาซ้ายงอเข่าชีข้อศอกซ้ายไว้ด้านนอกของเข่าขวาและแขนขวาบนพื้นด้านหลังบิดไปทางขวาให้มากที่สุดค้างไว้หนึ่งนาทีเแล้วให้เปลี่ยนไปทำอีกข้าง");
                    imageView = (ImageView)findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.d);
                }
                else if (mCounter==5) {
                    mSwitcher.setText("5.ท่างู (Cobra)\n เริ่มต้นด้วยการนอนให้ใบหน้าราบลงไปกับพื้นบางฝ่ามือลงไปให้มีระยะห่างเท่ากับไหล่ทั้งสองข้างจากนั้นเชิดหน้าและยกอกขึ้นดันขาทั้งสองข้างขึ้นด้วยหน้าเท้ากดสะโพกลงและดันหัวไหล่ลงจากนั้นปล่อยและทำซ้ำอีกครั้ง");
                    imageView = (ImageView)findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.e);
                }

               // mSwitcher.setText("asdasdasdasdasdasd");
                //mSwitcher.setText("4552");
                // END_INCLUDE(settext)
            }
        });

        nextButton = findViewById(R.id.button1);

        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mCounter++;
                // BEGIN_INCLUDE(settext)

                if (mCounter==1){
                    mSwitcher.setText("1.ท่าต้นไม้ (Tree Pose)\n ยืนให้แขนชิดกันทิ้งน้ำหนักไปที่ขาซ้ายวางเท้าขวาไว้ที่ต้นขาด้านในหันสะโพกออกไปด้านหน้าเแล้วให้ประกบฝ่ามือเข้าด้วยกันสูดอากาศเข้าแล้วยืดแขนขึ้นเหนือไหล่ต่อมาแยกฝ่ามือออกและหันหน้าเข้าทีละข้างค้างไว้ 30 นาทีลดมือลงทำอีกข้าง ");
                    imageView = (ImageView)findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.a);
                }
                else if (mCounter==2) {
                    mSwitcher.setText("3.ท่าตรีโกณ (Triangle Pose)\nยืดแขนทั้งสองข้างขนานกับพื้นยืนแยกขาให้มีระยะห่างพอดีไหล เท้าขวาหันออกไปด้านข้าง 90 องศาเท้าซ้ายหันออก 45 องศาต่อมาให้ยืดแขนขวาลงไปแตะที่พื้นปลายนิ้วอีกข้างให้ยืดขึ้นไปและหันหน้ามองที่เพดานค้างไว้ห้าลมหายใจเข้าออกแล้วจึงยืดตรงทำอีกข้าง");
                    imageView = (ImageView)findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.b);
                }
                else if (mCounter==3) {
                    mSwitcher.setText("3.ท่าตรีโกณ (Triangle Pose)\nยืดแขนสองข้างขนานกับพื้นยืนแยกขาและให้เท้าขวาหันไปด้านข้าง 90 องศา เท้าซ้ายหันออก 45 องศาและยืดแขนขวาลงไปแตะที่พื้นปลายนิ้วอีกข้างให้ยืดขึ้นไปและหันหน้ามองที่เพดานค้างไว้ห้าลมหายใจเข้าออกแล้วซ้ำอีกข้าง");
                    imageView = (ImageView)findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.c);
                }
                else if (mCounter==4) {
                    mSwitcher.setText("4.ท่านั่งบิดตัว (Seated Pose) \nยืดไหล่และแผ่นหลังขึ้นตรงไขว้เท้าขวาออกไปด้านนอกต้นขาซ้ายงอเข่าชีข้อศอกซ้ายไว้ด้านนอกของเข่าขวาและแขนขวาบนพื้นด้านหลังบิดไปทางขวาให้มากที่สุดค้างไว้หนึ่งนาทีเแล้วให้เปลี่ยนไปทำอีกข้าง");
                    imageView = (ImageView)findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.d);
                }
                else if (mCounter==5) {
                    mSwitcher.setText("5.ท่างู (Cobra)\n เริ่มต้นด้วยการนอนให้ใบหน้าราบลงไปกับพื้นบางฝ่ามือลงไปให้มีระยะห่างเท่ากับไหล่ทั้งสองข้างจากนั้นเชิดหน้าและยกอกขึ้นดันขาทั้งสองข้างขึ้นด้วยหน้าเท้ากดสะโพกลงและดันหัวไหล่ลงจากนั้นปล่อยและทำซ้ำอีกครั้ง");
                    imageView = (ImageView)findViewById(R.id.img);
                    imageView.setImageResource(R.drawable.e);
                }

                // mSwitcher.setText("asdasdasdasdasdasd");
                //mSwitcher.setText("4552");
                // END_INCLUDE(settext)
            }
        });

        // Set the initial text without an animation
       // mSwitcher.setCurrentText(String.valueOf(mCounter));

    }

    // BEGIN_INCLUDE(factory)
    /**
     * The {@link android.widget.ViewSwitcher.ViewFactory} used to create {@link android.widget.TextView}s that the
     * {@link android.widget.TextSwitcher} will switch between.
     */
    private ViewFactory mFactory = new ViewFactory() {

        @Override
        public View makeView() {

            // Create a new TextView
            TextView t = new TextView(MainActivity.this);
            t.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
            t.setTextAppearance(MainActivity.this, android.R.style.TextAppearance_Large);
            return t;
        }
    };
    // END_INCLUDE(factory)
}
