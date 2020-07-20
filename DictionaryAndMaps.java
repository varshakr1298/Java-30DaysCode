package codingworld;

import java.util.*;
import java.io.*;

class DictionaryAndMaps{
  public static void main(String []argh){
      Map<String,Integer> phoneBook = new HashMap<String,Integer>();
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          // Write code here
          phoneBook.put(name, phone);
      }
      while(in.hasNext()){
          String s = in.next();
          // Write code here
          Integer phoneNumber = phoneBook.get(s);
          if(phoneNumber!=null){
              System.out.println(s+"="+phoneNumber);
          }else{
              System.out.println("Not found");
          }
      }
      in.close();
  }
}

