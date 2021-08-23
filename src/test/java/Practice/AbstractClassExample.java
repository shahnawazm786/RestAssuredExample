package Practice;

 abstract  class AbstractClassExample {
    int age;
    String name;
    public AbstractClassExample(){
        System.out.println("Abstract class constructor");
    }
    public AbstractClassExample(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void Display(){
        System.out.println("Name ->" + this.name);
        System.out.println("Age ->" + this.age);

    }
}


