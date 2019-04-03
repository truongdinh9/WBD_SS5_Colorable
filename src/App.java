public class App {
    public static void main(String[] args) {
        Colorable[] colorables=new Colorable[3];
        colorables[0]=new Circle();
        colorables[1]=new Rectangle(2,3,"Blue",true);
        colorables[2]=new Square(23,"Pink",true);
        System.out.println("Before: ");
        for (Colorable colorable:colorables
             ) {
            System.out.println(colorable);
        }
        colorables[0].howToColor("Black");
        colorables[1].howToColor("White");
        colorables[2].howToColor("Orange");
        System.out.println("After: ");
        for (Colorable colorable:colorables
        ) {
            System.out.println(colorable);
        }
    }
}
