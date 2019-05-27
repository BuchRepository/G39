import currency.BitCoin;
import currency.Dollar;
import currency.Euro;
import currency.UZDollar;
import libs.WorkWithArray;
import libs.Calc;
import libs.WorkWithList;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("");
        int var1 = 2;
        int var2 = 3;
        Calc calc = new Calc();
        Calc.addition(var1, var2);
        calc.substraction(10, 2);
        calc.multiplication(10, 2);
        calc.division(10, 0);
        calc.division(0.1, 0.5);

        calc.additionStringString("Hello", "World");
        calc.additionStringToInteger("Dalmatians", 101);
        calc.additionIntegerToString(3, "33");

        System.out.println("Exemple array");
        int[] array = {2, 7, 40, 11, 2, 9, 39, 22, 25, 10, 19};
        System.out.println("Second element of array: " + array[2]);
        System.out.println("Length array: " + array.length);
        WorkWithArray.create(array);

        System.out.println("Exemple array [][]");
        int [][] test={{0,1,1}, {0,1,1}, {1,2,3}};
        WorkWithArray array2 = new WorkWithArray();

        int [][]array3 = array2.createMatrix(3,10);
        array2.fillingLeftOfDiagonal(array3, 5);
        System.out.println(array3.length);
        array2.fillingRightOfDiagonal(array3, 1);

        System.out.println("Exemple array [][]");
        int [][] array5 = new int [7][6];
        System.out.println();

        List <String> ourList = new ArrayList();
        ourList.add("test");
        ourList.add("test1");
        ourList.add("test2");
        ourList.remove(0);
        System.out.println(ourList);
        System.out.println(ourList.get(1));
        System.out.println("Size = "+ourList.size());

        List <String> ourList_2 = new ArrayList();
        ourList_2.add("value1");
        System.out.println(ourList_2);
        ourList_2.addAll(ourList);
        System.out.println(ourList_2);
        ourList_2.addAll(0,ourList);
        System.out.println(ourList_2);

        List <List<Integer>> ourListList = new ArrayList<>();
        System.out.println(ourListList);
        ourListList.add(new ArrayList<Integer>());
        System.out.println(ourListList);
        ourListList.get(0).add(11);
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        ourListList.get(1).add(5);
        ourListList.get(1).add(7);
        System.out.println(ourListList);
        System.out.println(ourListList.get(1).get(0));
        ourListList.get(1).add(0,8);


        ArrayList <Integer> listInteger = new ArrayList<>();
        listInteger.add(333);
        listInteger.add(444);
        ourListList.add(new ArrayList<>());
        ourListList.get(2).addAll(listInteger);
        ourListList.get(2).add(2, 9999);
        ourListList.get(2).add(666);

        ourListList.add(0, listInteger);
        listInteger.add(555);
        ourListList.add(listInteger);
        System.out.println(ourListList);

        HashMap <String, String> ourMap  = new HashMap<>();
        ourMap.put ("Key1", "test");
        ourMap.put ("Key2", "test2");
        System.out.println(ourMap.size());
        ourMap.put ("Key1", "test10");



        System.out.println(ourMap);
        System.out.println(ourMap.get("Key1"));


        ArrayList <HashMap <String, String>> ourListMap = new ArrayList<>();
        ourListMap.add (new HashMap<>());
        ourListMap.get(0).put("Login", "value11");
        ourListMap.get(0).put("Password", "value22");
        ourListMap.add (new HashMap<>());
        ourListMap.get(1).put("Login", "value33");
        ourListMap.get(1).put("Password", "value44");
        ourListMap.add(ourMap);

        System.out.println(ourListMap);
        for (HashMap elementOfMap: ourListMap) {
            System.out.println(elementOfMap);
        }
        System.out.println("  ");
        System.out.println("---- Start Homework #6 ----");
        System.out.println("  ");

        WorkWithList workWithList = new WorkWithList();
        ArrayList <ArrayList<String>> listList = new ArrayList <ArrayList<String>>();
        workWithList.addNewList(listList);
        workWithList.addValueToListList(4,"test1", listList);

        System.out.println("  ");
        System.out.println("---- End Homework #6 ----");
        System.out.println("  ");

        System.out.println("  ");
        System.out.println("---- Start Homework #7 ----");
        System.out.println("  ");
        System.out.println("  ");
        Dollar dollar = new Dollar (26.2 );
        System.out.println(dollar.getKursNBU());

        Euro euro = new Euro (29.2);
        System.out.println(euro.getKursNBU());

        UZDollar uzDollar = new UZDollar(10000);
        System.out.println(uzDollar.getKursNBU());

        System.out.println(dollar.getMarga());
        System.out.println(euro.getMarga());
        dollar.exchangeCurrencyToGrn(100);
        euro.exchangeCurrencyToGrn(100);
        uzDollar.exchangeCurrencyToGrn(100);
        dollar.exchangeGrnToCurrency(2620);
        euro.exchangeGrnToCurrency(2920);
        uzDollar.exchangeGrnToCurrency(10000);

        dollar.getCurrencyName();
        euro.getCurrencyName();

        System.out.println("  ");
        System.out.println("---- End Homework #7 ----");
        System.out.println("  ");


        System.out.println("  ");

        BitCoin bitCoin = new BitCoin(3000);
        System.out.println(bitCoin.getMarga());
        bitCoin.exchangeCurrencyToGrn(1000);
        bitCoin.setMarga(0.2);
        System.out.println(bitCoin.getMarga());


        Logger logger = Logger.getLogger (MainClass.class );
        logger.info ("test text");
        //logger.debug ("test.debug");
        //logger.error ("test error");




        System.out.println("------End------");

    }
}
