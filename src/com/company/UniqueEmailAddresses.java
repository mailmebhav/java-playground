package com.company;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        System.out.println("Starting program");
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        // int count = 0;
        Set<String> uniqueEmailIds = new HashSet<>();
        for(String email : emails) {
            String[] emailArr = email.split("@");
            String localName = emailArr[0];
            String domainName = emailArr[1];
            if(localName.contains("+")) {
                String[] localNameArr = localName.split("\\+");
//                Stream.of(localNameArr).forEach(e -> System.out.println(e));
                localName = localNameArr[0];
            }
//            System.out.println(localName);
            localName = localName.replace(".","");
//            System.out.println(localName);
            uniqueEmailIds.add(localName + "@" + domainName);
        }
//        System.out.println("Printing set");
//        Stream.of(uniqueEmailIds).forEach(e -> System.out.println(e));
        return uniqueEmailIds.size();
    }
}
