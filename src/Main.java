import java.io.*;

public class Main {

    public static void main(String[] args) {

        Ls ls = new Ls("ls1.csv");

        for (StrInFile strInFile : ls.getFl()) {
            System.out.print(strInFile.getUchMonthDate() + " ");
            System.out.print(strInFile.getDocDate() + " ");
            System.out.print(strInFile.getCreateDate() + " ");
            System.out.print(strInFile.getType() + " ");
            System.out.print(strInFile.getExpens() + " ");
            System.out.print(strInFile.getSum() + " ");
            System.out.print(strInFile.getStatus() + " ");
            System.out.println(" ");
        }
    }
}
