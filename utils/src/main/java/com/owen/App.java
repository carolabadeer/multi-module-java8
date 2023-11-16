package com.owen;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(call1pDependency());
    }

    public static String call1pDependency() {
        return com.mycompany.app.App.Encode();
    }
}
