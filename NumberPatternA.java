import java.util.Scanner;

public class NumberPatternA {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int Size;

        System.out.println("Give size");
        Size=sc.nextInt();

        System.out.println("Pattern 'W' ");

        for(int Cycles=1; Cycles<=Size;Cycles++){
            for (int Cycles_2=1;Cycles_2<Cycles+1;Cycles_2++){
                System.out.format("%2d",Cycles_2);
            }
            System.out.println("\n");
        }

        System.out.println("Pattern 'X' ");

        for (int Cycles=0;Cycles<Size;Cycles++){
            for(int Cycles_11=0;Cycles_11<(Cycles*2);Cycles_11++){
                System.out.print(' ');
            }
            for(int Cycles_2=1;Cycles_2<=(Size-Cycles);Cycles_2++){
                System.out.format("%2d",Cycles_2);
            }
            System.out.println("\n");
        }

        System.out.println("Pattern 'Y' ");

        for (int Cycles=0;Cycles<Size;Cycles++){
            for(int Cycles_11=1;Cycles_11<(Size-Cycles)*2;Cycles_11++){
                System.out.print(' ');
            }
            for(int Cycles_2=Cycles+1;Cycles_2>0;Cycles_2--){
                System.out.format("%2d",Cycles_2);
            }
            System.out.println("\n");
        }

        System.out.println("Pattern 'Z' ");

        for (int Cycles=Size;Cycles>0;Cycles--){
            for(int Cycles_2=Cycles;Cycles_2>0;Cycles_2--){
                System.out.format("%2d",Cycles_2);
            }
            System.out.println("\n");
        }

    }
}
