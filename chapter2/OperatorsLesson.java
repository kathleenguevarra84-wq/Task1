package chapter2;

public class OperatorsLesson {
    public static void main(String[] args) {
        
        //shift ops
        System.out.println(2<<2);
        //in binary    0 0 1 0
        //equivalent   8 4 2 1
        //<< means 1 in binary will move 2 space
        //from 0 0 1 0 will become 1 0 0 0
        //so 1 0 0 0 in binary
        //   8 4 2 1 is equal to 8

        System.out.println(8>>1);
        // from 1 0 0 0 to 0 1 0 0
        //      8 4 2 1    8 4 2 1
        // from 8 to 4

        System.out.println(15>>>1);
        // 3 arrows AND sign
        // 1 1 1 1 shifts to 0 1 1 1
        // 8 4 2 1 = 15
        // 0 1 1 1 = 7

        System.out.println(+3+ +6);
        System.out.println(3+6);
        System.out.println(+3+ -(+6));
        // positive sign can be put or not

        //post unary operator use the no before adding 1
        int a=0;
        System.out.println(a++); //value is 0
        System.out.println(a); // value is 0 + 1
        System.out.println(a++); // value is 1
        System.out.println(a); // value is 1 + 1

        //pre unary operator use the no before adding 1
        System.out.println(++a);
        //use the value of a first before adding 1
        //last value of a is 2 plus 1 = 3

        // ! - Not operator or reverse boolean
        boolean x = false;
        System.out.println(x); //false
        x=!x;
        System.out.println(x); // true

        //negation operator "-" reverses a numeric expressio
        double y = 1.21;
        System.out.println(y); //1.21
        y = -y;
        System.out.println(y);//-1.21
        y = -y;
        System.out.println(y);//1.21

//casting primitives
//int xx = (int)1.0;
//short yy = (short)1921222; // Stored as 20678
//int zz = (int)9L;
//long tt = 192301398193810323L;
        short xxx = 10;
        short yyy = 30;
        short zzz = (short) (xxx*yyy);
        System.out.println("z = "+zzz);
     // Logical Operators
     // boolean x = true || (y<4);
        boolean bugs2 = (xxx>=10 || (++xxx <=7)); // short circuit ||
        System.out.println("Boolean xxx || = "+xxx);
        boolean bugs = (xxx>=10 | (++xxx <=7));
        System.out.println("Boolean xxx | = "+xxx); // or gate |
        
//compound assignment
        int aa=2, bb=3;
        aa = aa*bb;
        System.out.println("aa = "+aa);

        int aaa=2, bbb=3;
        aaa *=bbb;
        System.out.println("Compond sign aaa = "+aaa);

        long c=10;
        int d=5;
        // d=d*c; does not compile
        d *= c;
        System.out.println("d="+d);
       
        long e=5;
        long f=(e=3);
        System.out.println(e);
        System.out.println(f);

//Relational Operators
        int g=10, h=20, i=10;
        System.out.println(g<h); // true
        System.out.println(g<=h);// true
        System.out.println(g>=i);// true
        System.out.println(g>i);// false
  
    }
}
