package currency;

abstract public class Currency {
    private double kursNBU;

    private double marga = 0.1;

    public Currency(double kursNBU){
        this.kursNBU = kursNBU;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }


    public double exchangeCurrencyToGrn(double amountOfCurrency){
        double tempResult = amountOfCurrency * kursNBU * (1-marga);
        System.out.println("For " + amountOfCurrency + " " + getCurrencyName() + " you get " + tempResult + " Grn");
        return tempResult;
    }

    public double exchangeGrnToCurrency(double amountOfGRN){
        double tempResult = (amountOfGRN /kursNBU) * (1-marga);
        System.out.println("For " + amountOfGRN + " " + getCurrencyName() + " you get " + tempResult + " Gurrency");
        return tempResult;
    }

    abstract public String getCurrencyName();

}
