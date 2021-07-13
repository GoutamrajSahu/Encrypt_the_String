package com.company;
import java.util.*;
public class Main
{
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Str = ");
        String str = Sc.nextLine();
        System.out.print("Key = ");
        int K = Sc.nextInt();
        int Key = K%26;
        String keyStr="";

                for(int i = 0; i < str.length(); i++)
                {
                    char ch = str.charAt(i);
                    if(ch == ' '){
                        keyStr = keyStr + ' ';
                        continue;
                    }
                    int asciiOfCh = ch;
                    asciiOfCh = Key + asciiOfCh;

                    char chForReplace = (char)asciiOfCh;

                    keyStr = keyStr + chForReplace;
                }

        System.out.println(keyStr);
    }
}
