import java.sql.SQLOutput;

public class Player {

    int num;

    void guess(){
        num = (int)(Math.random() * 10);
        System.out.println("Я думаю это число: " + num);
    }
}
