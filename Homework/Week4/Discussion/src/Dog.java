public class Dog {
    int
    public Dog(){ System.out.println("D1");/* D1 */ }
    public void bark(Dog d) { System.out.println("A");/* Method A */ }

    public static class Corgi extends Dog { //ignore the static here
        public Corgi(){ System.out.println("C1");/* C1 */ }
        public void bark(Corgi c) { System.out.println("B");/* Method B */ }
        @Override
        public void bark(Dog d) { System.out.println("C");/* Method C */ }
        public void play(Dog d) { System.out.println("D");/* Method D */ }
        public void play(Corgi c) { System.out.println("E");/* Method E */ }
    }

    public static void main(String[] args) {
        Corgi c = new Corgi();
        Dog d = new Corgi();
        Dog d2 = new Dog();

       // Corgi c2 = new Dog();
        //Corgi c3 = (Corgi) new Dog();// Compile-Error   <@\textcolor{red}{Runtime-Error}@>  C1  <@\textcolor{red}{D1}@>

        //d.play(d); //       <@\textcolor{red}{Compile-Error}@>   Runtime-Error   A   B   C   D   E
        //d.play(c);  //      <@\textcolor{red}{Compile-Error}@>   Runtime-Error   A   B   C   D   E

        c.play(d);  //      Compile-Error   Runtime-Error   A   B   C   <@\textcolor{red}{D}@>   E
        c.play(c);     //   Compile-Error   Runtime-Error   A   B   C   D   <@\textcolor{red}{E}@>

        c.bark(d);    //    Compile-Error   Runtime-Error   A   B   <@\textcolor{red}{C}@>   D   E
        c.bark(c);  // Compile-Error   Runtime-Error   A   <@\textcolor{red}{B}@>   C   D   E
        d.bark(d);    //    Compile-Error   Runtime-Error   A   B   <@\textcolor{red}{C}@>   D   E

        //d.bark((int) c);   // <@\textcolor{red}{Compile-Error}@>   Runtime-Error  A   B   C   D   E

        c.bark((Corgi) d2);
    }
}
