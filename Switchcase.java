


import java.io.*;

class Switchcase {
    static int isVowel(char ch)
    {
        int check = 0;
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                check = 1;
        }
        return check;
    }

    public static void main(String[] args)
    {

        System.out.println("a is " + isVowel('a'));
        System.out.println("x is " + isVowel('x'));
    }
}