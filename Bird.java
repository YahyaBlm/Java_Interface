public abstract class Bird {
  
    private String name;  
    private int age;
  
    // construct  
    public Bird(String name) {  
        this.name = name;  
        this.age = 0;  
    }  
  
    // get set
    public String getName() {  
        return this.name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public int getAge() {  
        return this.age;  
    }  
  
    public void setAge(int age) {
        this.age = age;
    }

    //met
    public abstract String sing();
}
