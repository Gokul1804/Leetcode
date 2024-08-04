class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=0;
        int m=0;
        for(int i=0;i<seats.length;i++){
            n=seats[i]-students[i];
            m=m+Math.abs(n);
        }
        return m;
    }
}