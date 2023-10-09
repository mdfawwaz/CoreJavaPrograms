package projectOne;

public class toRoman {
    public static void main (String [] args) {
        System.out.println(ToRoman(2));
        System.out.println(ToRoman(27));	
        System.out.println(ToRoman(64));	
        System.out.println(ToRoman(544));	
        System.out.println(ToRoman(697));	
        System.out.println(ToRoman(177));	
        System.out.println(ToRoman(499));	
        System.out.println(ToRoman(8726));	
        System.out.println(ToRoman(6399));
    }
    public static String ToRoman(int num) {
        String[] s={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String t="";
       int i=0;
       while(num>0){
           if(num>=values[i]){
               t+=s[i];
               num-=values[i];
           }
            else
           i++;
       }
        return t;
    }
}
