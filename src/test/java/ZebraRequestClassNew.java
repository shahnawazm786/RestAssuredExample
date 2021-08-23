
/*
Json payload
{
    "fristname":"Mohammad",
    "lastname":"Shahnawaz",
    "Age":"35"
}
 */
public class ZebraRequestClassNew {
    int age;
    int weight;
    String home;

    protected ZebraRequestClassNew(){
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getWeight(){
        return this.weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public String getHome(){
        return  this.home;
    }
    public void setHome(String home){
        this.home=home;
    }

}
