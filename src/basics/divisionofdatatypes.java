package basics;

import org.w3c.dom.ls.LSOutput;

public class divisionofdatatypes {
    static void main() {
        double x = 5/2;   //int/int=int.
        System.out.println(x);
        double y = 5.0/2.0;  // double/double=double.
        System.out.println(y);
        double z = 5.0/2;   //double/int=double
        System.out.println(z);
        //every division will give double if there is one double value.
        //only in is give when there is both or all int values.
    }



}
