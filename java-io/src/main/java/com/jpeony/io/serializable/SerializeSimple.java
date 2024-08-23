package com.jpeony.io.serializable;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 序列化
 */
public class SerializeSimple {
    public static void main(String[] args) {
        Employee e = new Employee("yi", "beijing", 27, 101);
        try (FileOutputStream fileOut = new FileOutputStream("C:\\mycode\\employee.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("序列化数据保存在: C:\\mycode\\employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
