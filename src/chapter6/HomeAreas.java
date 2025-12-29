package chapter6;

public class HomeAreas {
    public static void main(String[] args){
        //Todo : Rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(50);
        double areaOfRoom1 = room1.calculateArea();

        //Todo : Rectangle 2
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1+areaOfRoom2;
        System.out.println("The area of the room 1 is the: "+areaOfRoom1);
        System.out.println("The area of the room 2 is the: "+areaOfRoom2);
        System.out.println("The area of the both rooms is the: "+totalArea);
    }
}
