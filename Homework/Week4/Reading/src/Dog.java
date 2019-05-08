public class Dog {
    public static class Poodle extends Dog{
}
    public static void main(String[] args) {
        Poodle poodle1=new Poodle();
        Poodle poodle2=new Poodle();
        Dog poodle3=new Poodle();
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();
       poodle3 = maxDog(poodle1, poodle2);
    }



    public static Dog maxDog(Dog d1, Dog d2) {
        return d1;
    }
}
