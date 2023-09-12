package org.techtown.diary;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Random;

public class Fragment6 extends Fragment {
    private static final String TAG = "Fragment6";

    Button btn;
    ImageView imgView1;
    ImageView imgView2;
    ImageView imgView3;
    ImageView imgView4;
    ImageView imgView5;
    ImageView imgView6;
    ImageView imgView7;

    int index = 0;
    Random random = new Random();

    Context context;
    OnTabItemSelectedListener listener;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        this.context = context;

        if (context instanceof OnTabItemSelectedListener) {
            listener = (OnTabItemSelectedListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();

        if (context != null) {
            context = null;
            listener = null;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment6, container, false);

        initUI(rootView);

        return rootView;
    }



    private void initUI(ViewGroup rootView) {

        imgView1 = rootView.findViewById(R.id.imgView1);
        imgView2 = rootView.findViewById(R.id.imgView2);
        imgView3 = rootView.findViewById(R.id.imgView3);
        imgView4 = rootView.findViewById(R.id.imgView4);
        imgView5 = rootView.findViewById(R.id.imgView5);
        imgView6 = rootView.findViewById(R.id.imgView6);
        imgView7 = rootView.findViewById(R.id.imgView7);

        btn = rootView.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index = random.nextInt(7);

                switch (index) {
                    case 0:
                        imgView1.setVisibility(View.VISIBLE);
                        imgView2.setVisibility(View.INVISIBLE);
                        imgView3.setVisibility(View.INVISIBLE);
                        imgView4.setVisibility(View.INVISIBLE);
                        imgView5.setVisibility(View.INVISIBLE);
                        imgView6.setVisibility(View.INVISIBLE);
                        imgView7.setVisibility(View.INVISIBLE);

                        Toast.makeText(context.getApplicationContext(), "오늘의 컬러는 빨강입니다!", Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        imgView1.setVisibility(View.INVISIBLE);
                        imgView2.setVisibility(View.VISIBLE);
                        imgView3.setVisibility(View.INVISIBLE);
                        imgView4.setVisibility(View.INVISIBLE);
                        imgView5.setVisibility(View.INVISIBLE);
                        imgView6.setVisibility(View.INVISIBLE);
                        imgView7.setVisibility(View.INVISIBLE);

                        Toast.makeText(context.getApplicationContext(), "오늘의 컬러는 노랑입니다!", Toast.LENGTH_LONG).show();
                        break;

                    case 2:
                        imgView1.setVisibility(View.INVISIBLE);
                        imgView2.setVisibility(View.INVISIBLE);
                        imgView3.setVisibility(View.VISIBLE);
                        imgView4.setVisibility(View.INVISIBLE);
                        imgView5.setVisibility(View.INVISIBLE);
                        imgView6.setVisibility(View.INVISIBLE);
                        imgView7.setVisibility(View.INVISIBLE);

                        Toast.makeText(context.getApplicationContext(), "오늘의 컬러는 초록입니다!", Toast.LENGTH_LONG).show();
                        break;

                    case 3:
                        imgView1.setVisibility(View.INVISIBLE);
                        imgView2.setVisibility(View.INVISIBLE);
                        imgView3.setVisibility(View.INVISIBLE);
                        imgView4.setVisibility(View.VISIBLE);
                        imgView5.setVisibility(View.INVISIBLE);
                        imgView6.setVisibility(View.INVISIBLE);
                        imgView7.setVisibility(View.INVISIBLE);

                        Toast.makeText(context.getApplicationContext(), "오늘의 컬러는 파랑입니다!", Toast.LENGTH_LONG).show();
                        break;

                    case 4:
                        imgView1.setVisibility(View.INVISIBLE);
                        imgView2.setVisibility(View.INVISIBLE);
                        imgView3.setVisibility(View.INVISIBLE);
                        imgView4.setVisibility(View.INVISIBLE);
                        imgView5.setVisibility(View.VISIBLE);
                        imgView6.setVisibility(View.INVISIBLE);
                        imgView7.setVisibility(View.INVISIBLE);

                        Toast.makeText(context.getApplicationContext(), "오늘의 컬러는 보라입니다!", Toast.LENGTH_LONG).show();
                        break;

                    case 5:
                        imgView1.setVisibility(View.INVISIBLE);
                        imgView2.setVisibility(View.INVISIBLE);
                        imgView3.setVisibility(View.INVISIBLE);
                        imgView4.setVisibility(View.INVISIBLE);
                        imgView5.setVisibility(View.INVISIBLE);
                        imgView6.setVisibility(View.VISIBLE);
                        imgView7.setVisibility(View.INVISIBLE);

                        Toast.makeText(context.getApplicationContext(), "오늘의 컬러는 핑크입니다!", Toast.LENGTH_LONG).show();
                        break;

                    case 6:
                        imgView1.setVisibility(View.INVISIBLE);
                        imgView2.setVisibility(View.INVISIBLE);
                        imgView3.setVisibility(View.INVISIBLE);
                        imgView4.setVisibility(View.INVISIBLE);
                        imgView5.setVisibility(View.INVISIBLE);
                        imgView6.setVisibility(View.INVISIBLE);
                        imgView7.setVisibility(View.VISIBLE);

                        Toast.makeText(context.getApplicationContext(), "오늘의 컬러는 갈색입니다!", Toast.LENGTH_LONG).show();
                        break;

                }
            }
        });


    }
}











