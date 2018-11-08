import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ls {
    private ArrayList<StrInFile> fl = new ArrayList<>();

    public ArrayList<StrInFile> getFl() {
        return fl;
    }

    public Ls(String fileName) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "windows-1251"));

            String str = null;

            while((str=br.readLine())!=null) {
                fl.add(new StrInFile(str));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(fl);
    }
}

class StrInFile {
    // За период
    private String per;

    // Учетный месяц
    private String uchMonthDate;

    // Дата документа
    private String docDate;

    // Создан
    private String createDate;

    // Тип
    private String type;

    // Расход
    private String expens;

    // Сумма
    private String sum;

    // Статус
    private String status;

    public String getPer() {
        return per;
    }

    public String getUchMonthDate() {
        return uchMonthDate;
    }

    public String getDocDate() {
        return docDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getType() {
        return type;
    }

    public String getExpens() {
        return expens;
    }

    public String getSum() {
        return sum;
    }

    public String getStatus() {
        return status;
    }

    public StrInFile(String str) {
        String[] arrStr = str.split(";");

        // За период
        this.per = arrStr[0];

        // Учетный месяц
        this.uchMonthDate = arrStr[1];

        // Дата документа
        this.docDate = arrStr[2];

        // Создан
        this.createDate = arrStr[3];

        // Тип
        this.type = arrStr[4];

        // Расход
        this.expens = arrStr[5];

        // Сумма
        this.sum = arrStr[6];

        // Статус
        this.status = arrStr[7];
    }
}
