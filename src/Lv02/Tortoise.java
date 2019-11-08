package Lv02;

public class Tortoise implements Animals {
    private String name;
    private int age;
    public void speak(String words){
        System.out.println(name+"说："+words);
    }
    public String walk(){
        return "正在慢慢的爬着";
    }
    public String sleep(){
        return "";
    }
    public void think(String words){
        System.out.println(name+"想："+words);
    }
    public Tortoise (String name ,int age){
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
