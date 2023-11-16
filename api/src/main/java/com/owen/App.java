package com.owen;

// injected 1p dependency compatible with java 17
import com.example.MyUtility;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This class contains an injected 1p dependency that is compatible with java 17" );
        System.out.println(call1pDependency());
    }

    public static String call1pDependency() {
        return MyUtility.doNothing("Hello, World!");
    }
}
