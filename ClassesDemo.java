/**
 * IAnimal
 */
interface IAnimal {

    public void name();
}
class Animal{
    protected String cate;
    public String getCate(){
        return cate;
    }
    public void setCate(String value){
        cate=value;
    }
}
class Puppy extends Animal implements IAnimal{
    public Puppy() {
        super();
        super.cate="puppy";

    }
    public String toString(){
        System.out.println(getCate());
        return getCate();
    }
    public void name() {
        System.out.println(this.getCate());
    }
}

/**
 * ClassesDemo
 */
public class ClassesDemo {

    public static void main(String[] args) {
        Puppy apuppy=new Puppy();
        String cate=apuppy.getCate();
        System.out.println(cate);
        apuppy.name();
    }
}