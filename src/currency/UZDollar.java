package currency;

public class UZDollar extends Currency implements ConvertedCurrency{

    public UZDollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String getCurrencyName() {
        return ("UZDollar");
    }

    @Override
    public boolean isFreeConverted() {
        return false;
    }
}
