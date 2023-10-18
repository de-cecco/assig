/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kim1;

/**
 *
 * @author nyaga
 */
public class Kim1 {

    public static void main(String[] args) {
        Book mybook=new Book();
        mybook.title="King James";
        mybook.author="Brette";
        mybook.numberOfPages=200;
        System.out.println("Book is called :"+mybook.title+"\nBook is written by:"+mybook.author+"\nnjmber of pages"+ mybook.numberOfPages);
    }
}
