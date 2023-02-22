public int countTriple(String str) {
    int cnt = 0;
    for(int i=2; i<str.length(); i++)
      if(str.charAt(i-2)==str.charAt(i-1) && str.charAt(i-1)==str.charAt(i))
        cnt++;
    return cnt;
  }
  