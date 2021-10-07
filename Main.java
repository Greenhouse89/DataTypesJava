public class Main {
    public static void main(String[] args) {
        
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value + " + myMaxIntValue);
        //32 bits 

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
       //overflow - it skips back and cyles to MIN
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));
        //results in underflow cycles back to MAX

        int myMaxIntTest = 2_147_483_647;
        //you can format by entering underscores

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        //8 bits 

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        //16 bits 

        long myLongValue = 100L;
        //64 bits
        //add L to let computer know it is a long

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinLongValue);
        System.out.println("Short Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647L;

        //small can fit into larger 
    
    }
}