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
    public static void main(String[] args)
    {
        System.out.println("Welcome to User Registration Programme");
        String firstName="Shruti";
        System.out.println(isMatchesFirstName(firstName));
        String lastName="Shruti";
        System.out.println(isMatchesFirstName(lastName));
    }
}
