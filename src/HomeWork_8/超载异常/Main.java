package HomeWork_8.超载异常;

class OverLoadException extends Exception{
    String message;
    public OverLoadException(double n){
        message="无法再装载重量是"+n+"吨的集装箱";
    }
    public void showMessage(){
        System.out.println(this.message);
    }

}
class CargoShip
public class Main {
}
