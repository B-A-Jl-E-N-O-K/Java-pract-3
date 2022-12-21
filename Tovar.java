package pract3;

public class Tovar {

    private double price;
    private String name;



    private int serial_number;

    public Tovar(double inp_price, String inp_name, int inp_number)
    {
        this.price = inp_price;
        this.name = inp_name;
        this.serial_number = inp_number;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void printName() {
        System.out.print(this.serial_number);
        System.out.print(". ");
        System.out.print(this.name);
        System.out.print('\n');
    }

    public void printPrice() {

        System.out.print("Цена в рублях:");
        System.out.print(this.name);
        System.out.print('\n');
    }

    public double makePriceLocal(int valute)
    {
        if(valute == 2)
        {
            return this.price / 60.28;
        }
        else if(valute == 3)
        {
            return this.price / 72.86;
        }
        else if(valute == 4)
        {
            return this.price / 8.44;
        }
        else
            return this.price;

    }
}
