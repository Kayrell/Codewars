package kataExercises;

import java.lang.String;

public class Example {
    public static void main(String[] args) {
//        User user = new User();
//        System.out.println(user.progress);
//        user.incProgress(-7);
//        System.out.println(user.progress);
        User user1 = new User(-8, 0);
        System.out.println(user1.incProgress(1));
//        System.out.println(user1.rank + " " + user1.progress);
//        User user1 = new User(-3, 10);
//        System.out.println(user1.progress);
    }
}

class User {
    int rank ;
    int progress ;
    User() {
        rank = -8;
        progress = 0;
    }
    User(int rank, int progress){
        this.rank = rank;
        this.progress = progress;
    }
    public String incProgress(int rank) throws IllegalArgumentException{

            if( rank < -8 || rank > 8){
                throw new IllegalArgumentException();
            }else {
                int delta = rank - this.rank;

                if (delta == 0) {

                    progress += 3;
                } else if (delta == -1) {
                    progress += 1;
                } else if (delta > 0) {
                    progress += 10 * delta * delta;
                }
                while(progress >= 100) {
                    if (this.rank == -1 && progress >= 100) {
                        this.rank += 2;
                        progress = progress - 100;
                    } else if (progress >= 100) {
                        this.rank += 1;
                        progress = progress - 100;
                    }
                }
            }
            return String.valueOf(this.rank) + " " + String.valueOf(progress);
    }
}
