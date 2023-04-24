//To find the volume of a box
//Taking l, b , h in double data type as they are big and having decimal places.
class Box{
    double height;
    double lenght;
    double breadth;
}

public class BoxDemo {
    public static void main(String []args){
        Box MyBox= new Box();
        MyBox.lenght=10;
        MyBox.height =20;
        MyBox.breadth=30;
        double Vol=MyBox.height*MyBox.lenght*MyBox.breadth;
        System.out.println(Vol+" m^3");  //volume unit is meter cube
    }
}
