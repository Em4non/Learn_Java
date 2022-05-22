package HomeWork_2.BatteryCharge;

import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        int st;
        int ct;
        Scanner Reader=new Scanner(System.in);
        BatteryCharge batteryCharge=new BatteryCharge();
        for (int i = 0; i < 24; i++) {
            BatteryCharge.cost[i]=Reader.nextInt();
        }
        st=Reader.nextInt();
        ct=Reader.nextInt();
        System.out.println(batteryCharge.getChargeCost(st,ct));
        ct=Reader.nextInt();
        System.out.println(batteryCharge.getChargeStartTime(ct));

    }
}