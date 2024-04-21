package pl.pp;

public class Task2 {
    public static void main(String[] args) {
        Person_Task2 person1 = new Person_Task2();
        person1.hiToAll();
        person1.setForename("Muhammet");
        person1.setSurname("Montalbano");
        person1.setAge(20);
        person1.hiToAll();

        Person_Task2 person2 = new Person_Task2("Luca", "Zingaretti", 63);
        person2.hiToAll();

        person1.growOld(1); // Yaşı 1 artır
        for(int i=0; i<3; i++) {
            person2.growOld(5); // Yaşı her seferinde 5 artır
        }
        person1.hiToAll();
        person2.hiToAll();

        System.out.println(person1.getForename());
        person1.setForename("Salvo");
        System.out.println(person1.getForename());
        person1.hiToAll();

        person1.beYounger();
        person1.hiToAll();
    }
}
