import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();
    
    p1.setX(0);
    p1.setY(4);

    p2.setX(3);
    p2.setY(2);

    Dog d = new Dog();
    System.out.println("What's your dog's breed?");
    d.setBreed(sc.nextLine());
    System.out.println("Your dog's breed is now set to " + d.breed());
    System.out.println("How many pounds is it?");
    d.setSize(sc.nextDouble());
    System.out.println("What color?");
    d.setColor(sc.nextLine());

    d.Wag();
    d.Bark();
    d.ChaseMailman();

    sc.close();
  }
}
