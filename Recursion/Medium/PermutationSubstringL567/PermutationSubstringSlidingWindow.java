class PermutationSubstringSlidingWindow {
    public boolean checkInclusion(String a, String b) {
        int[] aFreq = new int[26];
        int[] bFreq = new int[26];

        int an = a.length();
        int bn = b.length();
        if(bn<an) return false;

        for(int i = 0; i<an;i++){
            bFreq[b.charAt(i)-'a']++;
            aFreq[a.charAt(i)-'a']++;    
        }

        for(int i = an;i<bn;i++  ){
            if(matches(aFreq, bFreq)) return true;
            bFreq[b.charAt(i)-'a']++;
            bFreq[b.charAt(i-an)-'a']--;
        }
        if(matches(aFreq, bFreq)) return true;
        return false;

    }

    private boolean matches(int[] a, int[] b){
        for(int i= 0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }

        return true;
    }

}
