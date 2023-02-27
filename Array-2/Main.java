public class Main {

    public static void main(String[] args){
        
    }

    public boolean has12(int[] nums){
        boolean asdf = false;
        for(int i:nums){
          if(asdf && i==2)
            return true;
          if(!asdf && i==1)
            asdf = true;
        }
        return false;
    }
}
