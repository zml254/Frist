package Lv02;
import java.util.Scanner;

public class Lv03 {
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer();
        Scanner input1 = new Scanner(System.in);
        String [] strings = new String[50];
        A:for(int b1=0;true;b1++){
            strings[b1] = input1.nextLine();
            String str2 = strings[b1];
            B:for(int b2 = 0;b2+2<=str2.length();b2++){
                String str1 = str2.substring(b2,b2+2);
                if(str1.equals("#o")){
                    str2 = str2.substring(0,b2);
                    sb.append(str2);
                    sb.append("\n");
                    break A;
                }else if(str1.equals("#c")){
                    str2 = str2.substring(b2+2);
                    b2 = 0;
                }else if(str1.equals("#b")){
                    String str3 = str2.substring(0,b2-1)+str2.substring(b2+2);
                    str2 = str3;
                    b2-=2;
                }
            }
            sb.append(str2);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
