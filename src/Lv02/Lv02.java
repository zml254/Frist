package Lv02;

import java.util.*;
public class Lv02 {
    static int i2;
    public static void main(String[] args){

        List<String> l1 = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        put(input,l1);
        while(true){
            System.out.println("你已存储以下数据：");
            Collections.sort(l1);
            Iterator it1 = l1.iterator();
            while(it1.hasNext()){
                System.out.println(it1.next());
            }
            System.out.println("是否继续储存数据:(输入1)，删除数据(输入2),查找数据(输入3)");
            int i3 = input.nextInt();
            if(i3 == 1){
                put(input,l1);
            }else if(i3 == 2){
                remove(l1);
            }else if(i3 == 3){
                find(l1);
            }else{
                System.out.println("程序安全退出！");
                return ;
            }
        }
    }
    public static void put(Scanner input,List l1){

        System.out.println("请输入你想要存储的个数：");
        i2 = input.nextInt();
        System.out.println("请输入数据，空格隔开，回车结束");
        for(int b1 = 0;b1<i2;b1++) {
            l1.add(input.next());
        }
    }
    public static void remove(List<String> l1){
        System.out.println("请选择你想要删除的数据：");
        Scanner input2 = new Scanner(System.in);
        String str1 = input2.next();
        Iterator it1 = l1.iterator();
        while(it1.hasNext()){
            Object obj1 = it1.next();
            if(str1.equals(obj1)){
                it1.remove();
            }
        }
    }
    public static void find(List l1){
        System.out.println("请输入你想要查找的数据：");
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        Iterator it1 = l1.iterator();
        while(it1.hasNext()){
            Object obj1 = it1.next();
            if(str1.equals(obj1)){
                System.out.println(obj1+"存在");
                return;
            }
        }
        System.out.println("数据不存在！");
    }
}
