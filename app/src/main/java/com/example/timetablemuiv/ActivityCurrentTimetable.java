package com.example.timetablemuiv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ActivityCurrentTimetable extends AppCompatActivity {
    Toolbar toolbar;
    TextView textView;
    TextView[] Para;
    TextView Para2;
    TextView Para3;
    TextView Para4;
    TextView Para5;
    TextView Para6;
    TextView Para7;
   static Post post2 ;
    Post post3=post2;
    int x=0;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
       SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
       Date d = new Date();
       String dayOfTheWeek = sdf.format(d);
int date = 8;
       int textViewCount = 10;

       TextView[] Para = new TextView[textViewCount];

       for (int i = 0; i < textViewCount; i++) {
           //  textViewArray[i] = new TextView(this);
       }


       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_current_timetable);
       toolbar = findViewById(R.id.toolbarMain);
        textView = findViewById(R.id.textView4);

       Para[1] = (TextView) findViewById(R.id.Para1);
       Para[2] = findViewById(R.id.Para2);
       Para[3] = findViewById(R.id.Para4);
       Para[4] = findViewById(R.id.Para3);
       Para[5] = findViewById(R.id.Para5);
       Para[6] = findViewById(R.id.Para6);

      textView.append( dayOfTheWeek);
       for (int i = 1; i < 8; i++) {
           if (i<=post3.getGroup ().get(0).getWeek().size())
           {


           if( dayOfTheWeek==post3.getGroup ().get(0).getWeek().get(4).getDate()){

            date= i;

          }
           }



       }
       if (date <=6){
       for (int i = 1; i < 8; i++) {

               if (i<=post3.getGroup ().get(0).getWeek().get(date).getCouples().size())
           {
           Para[i].append(post3.getGroup().get(0).getWeek().get(date).getCouples().get(i - 1).getTime()+ "\n");
         Para[i].append(post3.getGroup().get(0).getWeek().get(date).getCouples().get(i - 1).getDiscipline() + "\n");
           Para[i].append(post3.getGroup().get(0).getWeek().get(date).getCouples().get(i - 1).getOtherInfo());

           }
       }
           setSupportActionBar(toolbar);
           getSupportActionBar().setDisplayHomeAsUpEnabled(true);



       }
   }


   }