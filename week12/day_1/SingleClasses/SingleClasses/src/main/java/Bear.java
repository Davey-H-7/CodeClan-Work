public class Bear {
    private String name;
    private int age;
    private double weight;


    public Bear(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean readyToHibernate(){
        return this.weight >= 80.00;

    }
//      above same as below

//    public boolean readyToHibernate(){
//        if(this.weight >= 80.00){
//            return true;
//        }else{
//            return false;}
//
//    }
}
