package home.work7;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
        this.data = getData();
        this.header = getHeader();

    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public int[][] getData() {
        return data;
    }

    public String[] getHeader() {
        return header;
    }

    public void save() {
        try {
            FileOutputStream saveData = new FileOutputStream(new File("test1.cvs"), false);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        BufferedReader br = null;
        AppData appData = new AppData();
        String[] myHeader = {"Value 1", "Value 2", "Value 3"};
        appData.setHeader(myHeader);
        String arrToString2 = Arrays.toString(myHeader);
        char[] charHeader = arrToString2.toCharArray();
        for (int i = 0; i < charHeader.length; i++) {
            //System.out.println("Element["+i+"] "+charHeader[i]);
        }
        int[][] myData = {{10, 20, 25}, {30, 40, 50}};
        appData.setData(myData);
        String arrToString = Arrays.deepToString(myData);
        char[] charData = arrToString.toCharArray();
        for (int i = 0; i < charData.length; i++) {
            //   System.out.println("Element["+i+"] "+charData[i]);
        }
        StringBuilder sb = new StringBuilder();
        File file = new File("test1.csv");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write(charHeader[1]);
            writer.write(charHeader[2]);
            writer.write(charHeader[3]);
            writer.write(charHeader[4]);
            writer.write(charHeader[5]);
            writer.write(" ");
            writer.write(charHeader[7]);
            writer.write(";");
            writer.write(charHeader[10]);
            writer.write(charHeader[11]);
            writer.write(charHeader[12]);
            writer.write(charHeader[13]);
            writer.write(charHeader[14]);
            writer.write(" ");
            writer.write(charHeader[16]);
            writer.write(";");
            writer.write(charHeader[19]);
            writer.write(charHeader[20]);
            writer.write(charHeader[21]);
            writer.write(charHeader[22]);
            writer.write(charHeader[23]);
            writer.write(charHeader[24]);
            writer.write(charHeader[25]);
            writer.write("\n");
            writer.write(charData[2]);
            writer.write(charData[3]);
            writer.write(";");
            writer.write(charData[6]);
            writer.write(charData[7]);
            writer.write(";");
            writer.write(charData[10]);
            writer.write(charData[11]);
            writer.write("\n");
            writer.write(charData[16]);
            writer.write(charData[17]);
            writer.write(";");
            writer.write(charData[20]);
            writer.write(charData[21]);
            writer.write(";");
            writer.write(charData[24]);
            writer.write(charData[25]);
            writer.write("\n");


        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
            try {
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Файл записан.");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
            reader.close();
            System.out.println("Поток закрыт.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

