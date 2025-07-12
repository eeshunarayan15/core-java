package com.raceconditioninstring;

public class Account {
//    private  String s="pqrs";//immutable
    //StirngBuffer and String Builder muttable String
//    StringBuffer synchronised
    private  StringBuffer s=new StringBuffer("xyz");
    //removed synchronized keyword as we are using stringBuffer
    public   void deduct(String a,String cardName){
//           this.s+=a;
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
            System.out.println(count);
    }

}
