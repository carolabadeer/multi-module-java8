package com.owen;

// injected 1p dependency compatible with java 17
import com.example.MyUtility;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This class contains an injected 1p dependency that is compatible with java 17" );

        String reversed = MyUtility.doNothing("Hello, World!");
        System.out.println(reversed);
    }
}
