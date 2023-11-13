package com.example.moviesapp;

public class APIUtility {
    /**
     * This method will call the OMDB APi and sae the rseult in a file called
     * movies.json
     */
    public static void searchMovies(String movieName) {
        String url="https://www.omdbapi.com/?apikey=4bdeca62&s="+movieName;
        // configure the environment to make a http request (this includes an update to
        //the module-info file
    }
}
