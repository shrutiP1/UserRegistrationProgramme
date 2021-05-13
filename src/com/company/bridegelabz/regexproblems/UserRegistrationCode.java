package com.company.bridegelabz.regexproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationCode
{
    public static boolean isMatchesFirstName(String name)
    {
        String regex1="^([A-Z][a-z]{3,30})$";
        Pattern p=Pattern.compile(regex1);
        Matcher m=p.matcher(name);
        return m.matches();
    }
    public static boolean isMatchesEmail(String text)
    {
        String regex="(^[a-zA-Z 1-9]+ *([.+-_]?[a-zA-Z 1-9]+)@([a-zA-Z 1-9][-]?)+[.][a-zA-Z ]{2,4}(.[a-zA-Z]{2})*$)";
        Pattern p=Pattern.compile(regex);
        Matcher m= p.matcher(text);
        return m.matches();
    }
    public static boolean isMatchesNo(String number)
    {
        String regex="^([0-9]{2}[: :][0-9]{10})$";
        Pattern P=Pattern.compile(regex);
        Matcher M= P.matcher(number);
        return M.matches();
    }
    public static boolean isMatches(String text)
    {
        String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-])(?=.{8,}).*$";
        Pattern p=Pattern.compile(regex);
        Matcher m= p.matcher(text);
        return m.matches();
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to User Registration Programme");
        String firstName="Shruti";
        System.out.println(isMatchesFirstName(firstName));
        String lastName="Shruti";
        System.out.println(isMatchesFirstName(lastName));
        String email="shruti.xyz@bri.com.in";
        System.out.println(isMatchesEmail(email));
        String mobileNo="91 9130416631";
        System.out.println(isMatchesNo(mobileNo));
        String s="Shruti@123";
        System.out.println(isMatches(s));
    }
}
