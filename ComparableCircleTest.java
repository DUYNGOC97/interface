package interface2;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0]= new ComparableCircle(2.5);
        circles[1] = new ComparableCircle(5);
        circles[2] = new ComparableCircle("red",true,8.2);

        System.out.println("pre-sorted ");
        for(ComparableCircle circle:circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("after sorted ");
        for (ComparableCircle circle:circles){
            System.out.println(circle);
        }
        ComparableCircle circle1 =new ComparableCircle(2.5);
        ComparableCircle circle2 =new ComparableCircle(2.8);
        ComparableCircle circle3 =new ComparableCircle(23.5);
        ComparableCircle circle4 =new ComparableCircle(12.2);
        System.out.println(circle1.compareTo(circle2));
        System.out.println(circle3.compareTo(circle4));
    }
}
