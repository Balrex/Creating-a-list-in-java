package List;

public class person implements Comparable <person>{
    int age;
    String name;
    public person(int a, String n){
        age = a;
        name = n;
    }
    public String toString() {
        return name + " " + age;
    }
    public int compareTo (person p) {
        if (this.age < p.age) {return -1;}
        if (this.age > p.age) {return 1;}
        else {return 0;}
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof person) {
            person tmp = (person) obj;
            return  (this.age == tmp.age) && (this.name.equals(tmp.name));
        }
        return false;
    }
}
