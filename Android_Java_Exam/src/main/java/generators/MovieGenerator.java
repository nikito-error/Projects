package generators;

import java.util.ArrayList;
import java.util.Random;

import models.Movie;

public class MovieGenerator {
    public static ArrayList<Movie> generateItems(){
        ArrayList<Movie> movies=new ArrayList<>();
        Random rdm=new Random();
        for(int i=0;i<10;i++){
            int j=rdm.nextInt();
            if(j>0) {
                movies.add(new Movie("tittle" + i, "genre" + i, Float.parseFloat(String.valueOf(i)), j, "summary" + i));
            }else{
                j=0;
                j++;
                movies.add(new Movie("tittle" + i, "genre" + i, Float.parseFloat(String.valueOf(i)), j, "summary" + i));
            }

        }
        return movies;
    }
}
