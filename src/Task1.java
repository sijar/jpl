
/*
 * Developed by Sijar Ahmed on 24/2/19 1:58 PM
 * Last modified 24/2/19 1:58 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface Task1 is responsible for...
 * @author sijarahmed
 * 24/2/19 1:58 PM
 *
 */
public class Task1 {


    public String solution(String s) {
        char c = s.charAt(0);
        if(c>=65 && c<=90) {  // please fix condition
            return "upper";
        } else if(c>=97 && c<=122){  // please fix condition
            return "lower";
        } else if(c >=48 && c<=57){  // please fix condition
            return "digit";
        } else {
            return "other";
        }
    }

    public static void main(String[] args) {

    }

}
