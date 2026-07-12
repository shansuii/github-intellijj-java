package basics;

public class chardatatypes {
    static void main() {//ascii values of a=97,A=65,0=48
        char ch = 'A';
        int x = ch; // implicit type casting
        System.out.println(x);
        char sh = 'b';
        int y = (int)sh;//it is explicit type casting.
        System.out.println(y);
        char anjali  = 'a';
        System.out.println((int)anjali);
        char bella = 'c';
        System.out.println(bella+bella);// any mathematic or arithematic operation on a ch will give an integer cz this will only work on integer
        System.out.println(ch*1);// or ch+0 for the same value of character.


        //now we will do int to char.
        int h = 65;
        char czh =(char)x;
        System.out.println(ch);
int m = 77;
char ff =  (char)m;
        System.out.println(ff);
    }
}
//BODMAS== arithmatic operators goes left to right./,* ,%>>-,+.