public class MixMatch
{
    public static void main (String[] args)
    {
        String varString = "Hi ";
        char varChar = 'a';
        short varShort = 1;
        int varInt = 7;
        long varLong = 11;
        float varFloat = 1.2f;
        double varDouble = 1.1245;
        boolean varBoolean = true;

        System.out.println(varString + "<- stores text, such as \"Hello\". String values are surrounded by double quotes \n" 
        + varChar +  " <- stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes \n" 
        + varShort + " <- Stores whole numbers from -32,768 to 32,767 \n" 
        + varInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647 \n"
        + varLong + " <- Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807\n"
        + varFloat + " <- Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits \n"
        + varDouble + " <- Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits \n"
        + varBoolean + " <- Stores true or false values \n ");
    }
}