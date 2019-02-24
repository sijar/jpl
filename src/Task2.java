/*
 * Developed by Sijar Ahmed on 24/2/19 1:59 PM
 * Last modified 24/2/19 1:59 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface Task2 is responsible for...
 * @author sijarahmed
 * 24/2/19 1:59 PM
 *
 */
public class Task2 {


    public int solution(int A) {

        String number = String.valueOf(A);
        String shuffledNumber = "";

        for(int i=0,j=number.length()-1; i<j; ++i,--j){
              shuffledNumber += number.charAt(i);
              shuffledNumber += number.charAt(j);
        }
        if(number.length() % 2 != 0){
            shuffledNumber += number.charAt(number.length()/2);
        }
        return Integer.valueOf(shuffledNumber);
    }



    public static void main(String[] args) {
        Task2 task = new Task2();
        System.out.println(task.solution(12343));
    }
}
