/* Сайт знакомств
Вы создаете базу данных пользователей для сайта знакомств.

Да вот беда — вы подзабыли в каком порядке их нужно указывать, а технического задания под рукой нет.

Спроектируйте класс User,  у которого будут поля — имя (String) возраст (short) и рост (int).

Создайте для него необходимое количество конструкторов, чтобы имя, возраст и рост можно было указывать в любом порядке.

*/


public class User {

    String name;
    short age;
    int height;

    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(String name, int height, short age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, String name, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, int height, String name) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(int height, short age, String name) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(int height, String name, short age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        User man = new User("Олег", (short) 21, 189);
        User woman = new User(178, "Даша", (short) 19);
        System.out.println(man.name + ", ваши данные в анкете: рост - " + man.height + ", " + man.age + " год");
        System.out.println(woman.name + ", ваши данные в анкете: рост - " + woman.height + ", " + woman.age + " лет");
    }
}
