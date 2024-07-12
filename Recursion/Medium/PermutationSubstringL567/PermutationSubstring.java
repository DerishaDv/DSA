class PermutationSubstring {
    public boolean checkInclusion(String a, String b) {
        int an  =a.length(); 
        if(an>b.length()) return false;
        if(b.contains(a)) return true;
        boolean[] used = new boolean[an];
        char[] c = a.toCharArray();
        Arrays.sort (c);
      return permutations(c, b,  an, new StringBuilder(), used);

    }

    private boolean permutations(char[] c, String b, int length, StringBuilder temp, boolean[] used){
        if(temp.length()==length) {
            if(b.contains(temp.toString())) return true;
        }
       
        for(int i = 0;i<length;i++){
            if(used[i]||(i>0 && c[i]==c[i-1]&&!used[i-1])) continue;
            temp.append(c[i]);
            used[i]=true;
            // System.out.println(temp);
            if(permutations(c, b, length, temp, used))return true;
            temp.deleteCharAt(temp.length()-1);
            used[i]=false;

        }
        return false;

    }
}
