class Winner {
    public boolean winnerOfGame(String colors) {
        char[] c = colors.toCharArray();
        int n = c.length;
        return count(c,'A',n)>count(c,'B',n);
    }

    private int count(char[] c, char player, int n) {
        int count = 0;
        for(int i = 0; i<n-2;i++) {
            if(c[i]==player && c[i+1]==player && c[i+2]==player) {
                count++;
            }
        }
        return count;
    }
}
