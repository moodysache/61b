public class Foo {
 public int x, y;
 public String lee;

        public Foo (int x, int y,String lul) {
        this.x = x;
      this.y = y;
      this.lee=lul;
      }

      public static void switcheroo (Foo a, Foo b) {
     Foo temp = a;
        a = b;
        b = temp;
       }

       public static void fliperoo (Foo a, Foo b) {
        Foo temp = new Foo(a.x, a.y,"rahat");
         a.x = b.x;
        a.y = b.y;
        a.lee=b.lee;
         b.x = temp.x;
         b.y = temp.y;
         b.lee=temp.lee;
         }

       public static void swaperoo (Foo a, Foo b) {
        Foo temp = a;
        a.x = b.x;
        a.y = b.y;
        a.lee=b.lee;
        b.x = temp.x;
         b.y = temp.y;
         b.lee=temp.lee;
       }

      public static void main (String[] args) {
      Foo foobar = new Foo(10, 20,"cacat");
       Foo baz = new Foo(30, 40,"cu mac");
        switcheroo(foobar, baz);
          System.out.println(foobar.x+" "+foobar.y+" "+foobar.lee+" "+baz.x+" "+baz.y+" "+baz.lee);
      fliperoo(foobar, baz);
          System.out.println(foobar.x+" "+foobar.y+" "+foobar.lee+" "+baz.x+" "+baz.y+" "+baz.lee);
        swaperoo(foobar, baz);
          System.out.println(foobar.x+" "+foobar.y+" "+foobar.lee+" "+baz.x+" "+baz.y+" "+baz.lee);
       }
 }