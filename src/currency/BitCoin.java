package currency;


public class BitCoin extends Currency{

    public BitCoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String getCurrencyName() {
        return "BitCoin";
    }

    @Override
    public double exchangeCurrencyToGrn(double numberOfCurrency){
        System.out.println("Операция запрещена НБУ");
        return numberOfCurrency;
    }



}