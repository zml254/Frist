package Lv02;

public class Rabbit implements Animals {
    private String name;
    private int age;
    public Rabbit(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void speak(String words){
        System.out.println(name+"说："+words);
    }
    public String sleep(){
        return "兔子正在睡觉。";
    }
    public String walk(){
        return "正在快速的跳着。";
    }
    public void think(String words){
        System.out.println(name+"想："+words);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}