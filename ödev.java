
public class ödev {
    static boolean palin(int number ){
        
        int temp = number , reversnumber = 0 , lastnumber;

        while(temp!=0){
            lastnumber = temp %10;
            reversnumber = (reversnumber * 10)+ lastnumber;
            temp/=10;
        }
        
        if(number ==reversnumber)
            return true;
         
        else
            return false;    
        
    }    
    public static void main(String[] args) {
        System.out.println(palin(2003));
    }
    
}   