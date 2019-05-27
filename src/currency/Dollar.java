package currency;

public  class Dollar extends Currency implements ConvertedCurrency{
    public Dollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String getCurrencyName(){
        return ("Dollar");
    };

    @Override
    public boolean isFreeConverted() {
        return true;
    }

}
