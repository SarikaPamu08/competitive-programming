// Problem : Design Bus Seat Booking System
// Link : https://leetcode.com/contest/weekly-contest-523/problems/design-bus-seat-booking-system/
// Contest : LeetCode Weekly Contest 523


class BusBooking {
    boolean booked[][];
    int cost[][];
    int r;
    int k;
    int totalTime;
    int minTime;
    public BusBooking(int n) {
        booked = new boolean[n][4];
        cost = new int[n][4];
    }
    
    public void toggle(String seat) {
        r = Integer.parseInt(seat.substring(1)) - 1;
        k = seat.charAt(0) - 'A';
        if(booked[r][k]){
            booked[r][k] = false;
            totalTime -= cost[r][k];
            cost[r][k] = 0;
            minTime--;
        }else{
            booked[r][k] = true;
            if((k == 0 && cost[r][k+1] > 0) || (k == 3 && cost[r][k-1] > 0)){
                cost[r][k] = 3;
                totalTime += 3;
            }else{
                cost[r][k] = 1;
                totalTime += 1;
            }
            minTime++;
        }
    }
    
    public int getTotalTime() {
        return totalTime;
    }
    
    public int getMinTime() {
        return minTime;
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */