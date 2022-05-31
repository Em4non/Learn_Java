package HomeWork_4.手机类;

public class CellPhone {
    String model;
    int ram;
    int rom;
    int price;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CellPhone) {
            CellPhone cellPhone = (CellPhone) obj;
            if (cellPhone.price == price && cellPhone.ram == ram && cellPhone.rom == rom && cellPhone.model.equals(model))
                return true;
            else return false;
        }
        return true;
    }

    public CellPhone(String next, int nextInt, int nextInt1, int nextInt2) {
        model = next;
        ram = nextInt;
        rom = nextInt1;
        price = nextInt2;
    }

    @Override
    public String toString() {
        return "CellPhone [model:" + model + ", memory:" + ram + ", storage:" + rom + ", price:" + price + "]";
    }
}
