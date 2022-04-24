package ext;

public class MyFarm {
    public static void main(String[] args) {
        Cat oli=new Cat ("oli");
        Cat oli2=new Cat ("Marfa");
        Dog dog1=new Dog("Alex");
        Dog dog2=new Dog("Dus9i");

        oli.say();
        oli2.eat();
        dog1.say();
        dog2.eat();
        System.out.println(oli.getName());
        oli.setName("Kuz'ma");
        System.out.println(oli.getName());
        dog1.getColor();


    }
}
