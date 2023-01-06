public class Artifact {

    int number;
    String culture;
    int century;

    public Artifact(int number) {
        this.number = number;
    }

    public Artifact(int number, String culture) {
        this.number = number;
        this.culture = culture;
    }

    public Artifact(int number, String culture, int century) {
        this.number = number;
        this.culture = culture;
        this.century = century;
    }

    public static void main(String[] args) {
        Artifact ring = new Artifact(7126128);
        System.out.println(ring.number);

        Artifact frog = new Artifact(9794892, "Ацтеки");
        System.out.println(frog.number + " " + frog.culture);

        Artifact boots = new Artifact(1251770, "Зимогоры", 16);
        System.out.println(boots.number + " " + boots.culture + " " + boots.century);
    }
}
