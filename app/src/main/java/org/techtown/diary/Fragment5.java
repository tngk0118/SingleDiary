package org.techtown.diary;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.text.SimpleDateFormat;

import lib.kingja.switchbutton.SwitchMultiButton;

public class Fragment5 extends Fragment {
    private static final String TAG = "Fragment5";

    Button vd1Btn1;
    Button vd1Btn2;
    Button vd1Btn3;

    Button vd2Btn1;
    Button vd2Btn2;
    Button vd2Btn3;

    VideoView video1;
    VideoView video2;

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
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment5, container, false);

        initUI(rootView);

        return rootView;
    }

    private void initUI(ViewGroup rootView) {
        // 구현 내용 여기에 넣기

        video1 = rootView.findViewById(R.id.video1);
        video2 = rootView.findViewById(R.id.video2);

        // 비디오 1
        Uri videoUri = Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4");
        vd1Btn1 = rootView.findViewById(R.id.vd1Btn1);

        vd1Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video1.setVideoURI(videoUri);
                video1.start();
                Toast.makeText(context.getApplicationContext(), "비디오 재생이 시작됨", Toast.LENGTH_LONG).show();
            }
        });

        vd1Btn2 = rootView.findViewById(R.id.vd1Btn2);
        vd1Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (video1 != null) {
                    position = video1.getCurrentPosition();
                    video1.pause();
                    Toast.makeText(context.getApplicationContext(), "비디오 재생이 일시정지됨", Toast.LENGTH_LONG).show();
                }
            }
        });

        vd1Btn3 = rootView.findViewById(R.id.vd1Btn3);
        vd1Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (video1 != null && !video1.isPlaying()) {
                    video1.start();
                    video1.seekTo(position);
                    Toast.makeText(context.getApplicationContext(), "비디오 재생이 재시작됨", Toast.LENGTH_LONG).show();
                }
            }
        });

        // 비디오 2
        Uri videoUri2 = Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");
        vd2Btn1 = rootView.findViewById(R.id.vd2Btn1);
        vd2Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video2.setVideoURI(videoUri2);
                video2.start();
                Toast.makeText(context.getApplicationContext(), "비디오 재생이 시작됨", Toast.LENGTH_LONG).show();
            }
        });

        vd2Btn2 = rootView.findViewById(R.id.vd2Btn2);
        vd2Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (video2 != null) {
                    position = video2.getCurrentPosition();
                    video2.pause();
                    Toast.makeText(context.getApplicationContext(), "비디오 재생이 일시정지됨", Toast.LENGTH_LONG).show();
                }
            }
        });

        vd2Btn3 = rootView.findViewById(R.id.vd2Btn3);
        vd2Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (video2 != null && !video2.isPlaying()) {
                    video2.start();
                    video2.seekTo(position);
                    Toast.makeText(context.getApplicationContext(), "비디오 재생이 재시작됨", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
