import java.util.Random;
public class PasswordGenerator{
    public static void main(String[] args){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String nums="0123456789";
        String all=upper+lower;
        String s1="";
        Random randl=new Random();
        int r1=randl.nextInt(25);
        int r2=randl.nextInt(9);
        s1=s1+upper.substring(r1,r1+1)+lower.substring(r1,r1+4)+nums.substring(r2,r2+3);
        System.out.println(s1);
        
        
    }
}

