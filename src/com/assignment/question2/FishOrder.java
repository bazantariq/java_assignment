package com.assignment.question2;

public class FishOrder {
    public static void main(String[] args) {
        Fish  fh1 = new Fish( "Mullee" , "Parsley",  15 , 3 , 6)  ;
        Fish fh2 = new Fish("Rohu", "Mint" , 25 , 5 , 4);
        Fish fh3 = new Fish("Theila" ,"Salmoriglio" , 35 , 7 , 6);


        System.out.println(fh1.description()+". The total bill is $"+ fh1.getCalbill());
        System.out.println(fh2.description()+". The total bill is $" +fh2.getCalbill());
        System.out.println(fh3.description()+ ". The total bill is $" + fh3.getCalbill());

    }

}
