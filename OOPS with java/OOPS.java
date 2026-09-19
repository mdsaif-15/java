class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writhig some thing.");
    }

    public void penColor() {
        System.out.println(this.color);
    }

    public void penType() {
        System.out.println(this.type);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ball point";
        pen1.penColor();
        pen1.penType();
    }
}