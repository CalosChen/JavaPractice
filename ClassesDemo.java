public class Animal{
    public String cate;
    public String getCate(){
        return cate;
    }
    public void setCate(String value){
        cate=value;
    }
}
public class Puppy extends Animal{
    public Puppy() {
        super();
        super.cate="dog";
    }
    public  String toString(){
        System.out.println(getCate());
    }
}

/**
 * ClassesDemo
 */
public class ClassesDemo {

    public static void main(String args) {
        Puppy apuppy=new Puppy();
        String cate=apuppy.getCate();
        System.out.println(cate);
    }
}