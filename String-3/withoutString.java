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
  