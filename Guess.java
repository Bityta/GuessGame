public class Guess {

    Player p1;
    Player p2;
    Player p3;

    void start(){

        int number = (int)(Math.random() * 10);
        System.out.println("Я загадываю число: " + number);


        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        p1.guess();
        p2.guess();
        p3.guess();

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;



        while(true){

            if(p1.num == number || p2.num == number ||p3.num == number ){
                if (p1.num == number){
                    System.out.println("Поздравляю 1 игрок угадал число!!");
                }
                if (p2.num == number){
                    System.out.println("Поздравляю 2 игрок угадал число!!");
                }
                if (p3.num == number){
                    System.out.println("Поздравляю 3 игрок угадал число!!");
                }

                System.out.println("Game over");
                break;
            }
            else{
                System.out.println("Увы мимо... Попробуйте еще раз!");
                p1.guess();
                p2.guess();
                p3.guess();
            }


        }



    }
}
