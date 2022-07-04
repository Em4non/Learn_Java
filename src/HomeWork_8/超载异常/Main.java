package HomeWork_8.超载异常;

import java.util.Scanner;

class OverLoadException extends Exception{
    String message;
    public OverLoadException(double n){
        message="无法再装载重量是"+n+"吨的集装箱";
    }
    public void showMessage(){
        System.out.println(this.message);
    }

}
class CargoShip{
    double actualWeight=0;
    double maxWeight;

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    public void loading(double weight) throws OverLoadException {
        if(weight+actualWeight<=maxWeight){
            actualWeight+=weight;
            System.out.println("目前共装载了"+actualWeight+"吨货物");
        }
        else throw new OverLoadException(weight);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CargoShip myship =new CargoShip();
        myship.setMaxWeight(sc.nextDouble());
        try {
            myship.loading(sc.nextDouble());
        }
        catch (OverLoadException e){
            e.showMessage();
        }
        try {
            myship.loading(sc.nextDouble());
        }
        catch (OverLoadException e){
            e.showMessage();
        }
        finally {
            System.out.println("货船将正点起航");
        }
    }
}
