package com.brainacad.oop.testnest1;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    private int arrayIndex = 0;

    public void addPhoneNumber(String name, String phone) {
        PhoneNumber phoneNumber = new PhoneNumber(name, phone);
        phoneNumbers[arrayIndex] = phoneNumber;
        arrayIndex++;
    }

    public void printPhoneBook() {
        for (PhoneNumber phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
        }
    }

    //Lab 2.11.2

    public void sortByName(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

    }
    public void sortByPhoneNumber(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getPhone().compareTo(o2.getPhone());
            }
        });

    }

    static class PhoneNumber {
        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", phone: " + phone;
        }
    }
}
