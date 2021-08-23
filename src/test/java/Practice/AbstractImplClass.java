package Practice;

public class AbstractImplClass extends  AbstractClassExample{
    public AbstractImplClass(){
        super();
    }
    public AbstractImplClass(int age,String name){
        super(age,name);
    }
    public static void main(String [] args){
            AbstractClassExample a=new AbstractImplClass();

            AbstractClassExample a1=new AbstractImplClass(30,"Mohammad");
            a1.Display();

    }
}
