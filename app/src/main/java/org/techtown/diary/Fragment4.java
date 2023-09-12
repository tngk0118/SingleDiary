package org.techtown.diary;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.text.SimpleDateFormat;

import lib.kingja.switchbutton.SwitchMultiButton;

public class Fragment4 extends Fragment {
    private static final String TAG = "Fragment4";

    ImageView img1;
    ImageView img2;
    ImageView img3;

    Button img1Btn1;
    Button img1Btn2;
    Button img1Btn3;

    Button img2Btn1;
    Button img2Btn2;
    Button img2Btn3;

    Button img3Btn1;
    Button img3Btn2;
    Button img3Btn3;

    MediaPlayer mediaPlayer;
    int position;


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
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment4, container, false);

        initUI(rootView);

        return rootView;
    }

    private void initUI(ViewGroup rootView) {
        // 구현 내용 여기에 넣기

        img1 = rootView.findViewById(R.id.img1);
        img2 = rootView.findViewById(R.id.img2);
        img3 = rootView.findViewById(R.id.img3);

        // 노래 1
        img1Btn1 = rootView.findViewById(R.id.img1Btn1);
        img1Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.spring);
                mediaPlayer.start();
                Toast.makeText(context.getApplicationContext(), "음악 재생이 시작됨", Toast.LENGTH_LONG).show();
            }
        });

        img1Btn2 = rootView.findViewById(R.id.img1Btn2);
        img1Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null) {
                    position = mediaPlayer.getCurrentPosition();
                    mediaPlayer.pause();
                    Toast.makeText(context.getApplicationContext(), "음악 재생이 일시정지됨", Toast.LENGTH_LONG).show();
                }
            }
        });

        img1Btn3 = rootView.findViewById(R.id.img1Btn3);
        img1Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                    mediaPlayer.seekTo(position);
                    Toast.makeText(context.getApplicationContext(), "음악 재생이 재시작됨", Toast.LENGTH_LONG).show();
                }
            }
        });

        // 노래 2
        img2Btn1 = rootView.findViewById(R.id.img2Btn1);
        img2Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.fall);
                mediaPlayer.start();
                Toast.makeText(context.getApplicationContext(), "음악 재생이 시작됨", Toast.LENGTH_LONG).show();
            }
        });

        img2Btn2 = rootView.findViewById(R.id.img2Btn2);
        img2Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null) {
                    position = mediaPlayer.getCurrentPosition();
                    mediaPlayer.pause();
                    Toast.makeText(context.getApplicationContext(), "음악 재생이 일시정지됨", Toast.LENGTH_LONG).show();
                }
            }
        });

        img2Btn3 = rootView.findViewById(R.id.img2Btn3);
        img2Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                    mediaPlayer.seekTo(position);
                    Toast.makeText(context.getApplicationContext(), "음악 재생이 재시작됨", Toast.LENGTH_LONG).show();
                }
            }
        });

        // 노래 3
        img3Btn1 = rootView.findViewById(R.id.img3Btn1);
        img3Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.winter);
                mediaPlayer.start();
                Toast.makeText(context.getApplicationContext(), "음악 재생이 시작됨", Toast.LENGTH_LONG).show();
            }
        });

        img3Btn2 = rootView.findViewById(R.id.img3Btn2);
        img3Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null) {
                    position = mediaPlayer.getCurrentPosition();
                    mediaPlayer.pause();
                    Toast.makeText(context.getApplicationContext(), "음악 재생이 일시정지됨", Toast.LENGTH_LONG).show();
                }
            }
        });

        img3Btn3 = rootView.findViewById(R.id.img3Btn3);
        img3Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                    mediaPlayer.seekTo(position);
                    Toast.makeText(context.getApplicationContext(), "음악 재생이 재시작됨", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
