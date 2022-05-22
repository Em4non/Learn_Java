package HomeWork_2;

class BatteryCharge {
    static int[] cost = new int[25];
    public int getChargeCost(int st, int ct) {
        int sum = 0;
        for (int i = st; i < st+ct; i++) {
            sum += cost[i%24];
        }
        return sum;
    }

    public int getChargeStartTime(int ct) {
        int sum = 0;
        int aaa = 0;
        int ans = 9999999;
        for (int i = 0; i < 24; i++) {
            sum = 0;
            for (int j = i; j < i + ct; j++) {
                sum += cost[j%24];
            }
            if (sum < ans) {
                aaa = i;
                ans = sum;
            }
        }
        return aaa;
    }
}
