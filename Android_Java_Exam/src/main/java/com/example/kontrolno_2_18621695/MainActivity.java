package com.example.kontrolno_2_18621695;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

import java.util.ArrayList;

import adapters.MovieAdapter;
import generators.MovieGenerator;
import models.Movie;

public class MainActivity extends AppCompatActivity {
ArrayList<Movie> movies;
MovieAdapter adapter;
boolean stop_working=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        movies= MovieGenerator.generateItems();
   adapter= new MovieAdapter(movies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        HandlerThread handlerThread=new HandlerThread("thread");
        handlerThread.start();
        Handler handler=new Handler(handlerThread.getLooper()){
            @Override
            public void handleMessage(@NonNull Message msg) {
               Bundle bundle = msg.getData();
               Movie movie1=bundle.getParcelable("movie");
               stop_working =false;
               if(movie1!=null){
                   movies.add(movie1);
                   runOnUiThread(new Runnable() {
                       @Override
                       public void run() {
                           adapter.notifyDataSetChanged();
                       }
                   });
               }
            }
        };
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
if(!stop_working){
    int i=2;
    int j=0;
    Movie movie=new Movie("tittle","genre", (float) j,i,"summary");
    Message message=handler.obtainMessage();
    Bundle bundle = new Bundle();
    bundle.putParcelable("movie",movie);
    message.setData(bundle);
    Log.i("EditBook18621695","MovieTittle"+movie.getTittle());
    stop_working=true;
    handler.postDelayed(this,3500);
}
            }
        },3500);
    }
}