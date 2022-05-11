package com.company;

public class EncodeDecodeTinyUrl {
    public static void main(String[] args) {
        String s = "https://leetcode.com/problems/design-tinyurl";

        EncodeDecodeTinyUrl encodeDecodeTinyUrl =  new EncodeDecodeTinyUrl();
        encodeDecodeTinyUrl.encode(s);
    }

    public static String encode(String longUrl) {
        String[] s = longUrl.split("/");
        String http = s[0];
        String[] host = s[2].split(".");
        String domain = host[0];
        String com = host[1];
        for(int i = 3; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        return longUrl;
    }

    public static String decode(String shortUrl) {
        return shortUrl;
    }
}
