 public class Animal {
 protected String name, noise;
 protected int age;

         public Animal(String name, int age) {
         this.name = name;
         this.age = age;
         this.noise = "Huh?";
 }

        public String makeNoise() {
        if (age < 5) {
             return noise.toUpperCase();
            } else {
            return noise;
             }
         }

        public void greet() {
       System.out.println("Animal " + name + " says: " + makeNoise());
        }

        static class Cat extends Animal {

    public Cat(String name,int age){
        super(name,age);
        this.noise="Meow";
    }

            @Override
            public void greet() {
                System.out.println("Cat " + name + " says: " + makeNoise());
            }
        }

     public static void main(String[] args) {
         Animal animal=new Animal("leu",5);

         Animal pisicaMica=new Cat("pisicuta",3);

         Cat pisicaMare=new Cat("pisica",10);


     }


}