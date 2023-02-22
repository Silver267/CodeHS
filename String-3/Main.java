public class Main {
    public String withoutString(String base, String remove) {
        int idx = 0;
        while(idx<=base.length()-remove.length()){
          if(base.substring(idx, idx+remove.length()).toLowerCase().equals(remove.toLowerCase())){
            base = base.substring(0, idx)+base.substring(idx+remove.length(), base.length());
            idx--;
          }
          idx++;
        }
        return base;
    }
    
    public int countTriple(String str) {
        int cnt = 0;
        for(int i=2; i<str.length(); i++)
          if(str.charAt(i-2)==str.charAt(i-1) && str.charAt(i-1)==str.charAt(i))
            cnt++;
        return cnt;
    }

    public static void main(String[] args){
        
    }
}
