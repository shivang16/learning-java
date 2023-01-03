package lesson3;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Exercise-1");
        String teaTxt = "Tea";
        System.out.println(teaTxt);
        String b = "Tea";
        System.out.println(b);
        System.out.println(teaTxt==b);
        String c = new String("Tea");
        System.out.println(c);
        System.out.println(teaTxt==c);
        c.intern();
        System.out.println(teaTxt==c);
        String d = c.intern();
        System.out.println(d);
        System.out.println(d==teaTxt);

        System.out.println("\n\nExercise-2");
        c = teaTxt+' '+b;
        System.out.println(c);
        System.out.println(c.indexOf('T',c.indexOf('T')+1));
        System.out.println(c.charAt(c.lastIndexOf(c)));
        c = c.toUpperCase();
        System.out.println(c);
        int x = c.indexOf('T',c.indexOf('T')+1);
        System.out.println(c.substring(x,x+2));

        System.out.println("\n\nExercise-3");
        StringBuilder txt = new StringBuilder(c);
        System.out.println(txt);
        System.out.println(txt.length());
        System.out.println(txt.capacity());
        txt.replace(0,3,"What is the price of");
        System.out.println(txt);
        System.out.println(txt.length());
        System.out.println(txt.capacity());

        System.out.println("\n\nExercise-4");
        String tabStrips = """
        Used 8 times space bar before typing
    Used tab key before typing
    """;

        String tabStrips1 = """
        Used 8 times space bar before typing
    Used tab key before typing
        """;

        String tabStrips2 = """
        Used 8 times space bar before typing
    Used tab key before typing
""";
        System.out.println(tabStrips);
        System.out.println(tabStrips1);
        System.out.println(tabStrips2);


    }
}
