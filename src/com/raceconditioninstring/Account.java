package com.raceconditioninstring;

public class Account {
//    private  String s="pqrs";//immutable
    //StirngBuffer and String Builder muttable String
//    StringBuffer synchronised
    private  StringBuffer s=new StringBuffer("xyz");
    //removed synchronized keyword as we are using stringBuffer
    int change=0;
    int k=0;
    public   void deduct(String a,String cardName){
//           this.s+=a;
      synchronized (this){
          change++;
      }
      k++;
        this.s.append(a);
//        System.out.println("Debit card Successfully  "+cardName);
    }
    public void get(){
        int count=0;
        char[] charArray = s.toString().toCharArray();
        for(char c : charArray){
            if(c=='a'){
                count++;

            }

        }
            System.out.println(count+" count");
        System.out.println(change+" change");
        System.out.println(k+" k");
        System.out.println("total thread overlaping "+(count-k));
    }

}
