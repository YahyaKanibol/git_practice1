public class Practice {

    public String name;
    public int age;
    public char gender;

    public Practice(String name, int age,char gender) {
        this.name = name;
        this.age = age;
        this.gender=gender;
    }


    public String toString() {
        return "Practice{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
