public class HelloWorld
{
    public static void main(String[] args) {
        int a = 0;
        double b = 6.90;
        String x = "I've got a whole lot of money! I've got $";
        String y = "I've got some money. I've got $";
        String z = "I'm broke. I've got $";
        b = b * a;
    if (a >= 2) {
        System.out.println(x + b);
    }
    else if (a == 1) {
        System.out.println(y + b);
    }
    else {
        System.out.println(z + b);
    } }    }