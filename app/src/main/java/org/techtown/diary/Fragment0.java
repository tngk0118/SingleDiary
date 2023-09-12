package org.techtown.diary;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.diary.OnTabItemSelectedListener;
import org.techtown.diary.R;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import lib.kingja.switchbutton.SwitchMultiButton;

public class Fragment0 extends Fragment {
    private static final String TAG = "Fragment0";

    CalendarView calendarView;
    TextView textView;

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
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment0, container, false);

        initUI(rootView);

        return rootView;
    }



    private void initUI(ViewGroup rootView) {
        // 구현 내용 여기에 넣기

        calendarView = rootView.findViewById(R.id.calendarView);
        textView = rootView.findViewById(R.id.textView);

        DateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
        Date date = new Date(calendarView.getDate());
        textView.setText(formatter.format(date));

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String day;
                day = year + "년" + (month+1) + "월" + dayOfMonth + "일";
                textView.setText(day);
            }
        });
    }
}

