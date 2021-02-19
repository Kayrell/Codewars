package kataExercises;

public class Covfefe {

    public static void main(String[] args) {
        System.out.println(covfefe("replace couverage to covfefe"));
    }

    public static String covfefe(String tweet) {
        if(tweet.contains("coverage") == false){
            tweet = tweet.concat(" covfefe");
        } else {
            tweet = tweet.replace("coverage", "covfefe");
        }
        return tweet;

    }
}
