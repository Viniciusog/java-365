package Ex2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Post p = new Post(new Date(),  "Viajando no Brasil.", "A maior praia do Brasil", 14);

        Comment c0 = new Comment("Legal");
        Comment c1 = new Comment("Interessante");
        Comment c2 = new Comment("Parabéns");
        Comment c3 = new Comment("Sensacional");

        p.addComment(c0);
        p.addComment(c1);
        p.addComment(c2);
        p.addComment(c3);

        System.out.println(p);
    }
}
