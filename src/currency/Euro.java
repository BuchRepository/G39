package currency;

public class Euro extends Currency implements ConvertedCurrency{


    public Euro(double kursBUY) {
        super(kursBUY);
    }

    @Override
    public String getCurrencyName() {
        return "Euro";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
