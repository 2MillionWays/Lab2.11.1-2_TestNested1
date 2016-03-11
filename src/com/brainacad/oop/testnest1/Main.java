package com.brainacad.oop.testnest1;


public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();

        myPhoneBook.addPhoneNumber("Jack", "1241412");
        myPhoneBook.addPhoneNumber("John", "41231");
        myPhoneBook.addPhoneNumber("Albert", "45232");
        myPhoneBook.addPhoneNumber("Steave", "1231512");
        myPhoneBook.addPhoneNumber("Daniel", "674342");
        myPhoneBook.addPhoneNumber("Bruce", "31351512");
        myPhoneBook.addPhoneNumber("Gabriel", "08672351");
        myPhoneBook.addPhoneNumber("Wendy", "768812412");
        myPhoneBook.addPhoneNumber("Lee", "12315352");
        myPhoneBook.addPhoneNumber("Clinton", "08762131");
        myPhoneBook.printPhoneBook();
        System.out.println("----------------------------------");


        /*Lab 2.11.2 - can't resolve "NullPointerException" if myPhoneBook isn't full so that
        * remaining fields of phoneNumber are filled by default null...
        * Need assistance!*/

        System.out.println("Sort By Name:");
        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();
        System.out.println("----------------------------------");
        System.out.println("Sort By Phone Number:");
        myPhoneBook.sortByPhoneNumber();
        myPhoneBook.printPhoneBook();

    }
}
