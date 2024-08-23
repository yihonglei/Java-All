package com.jpeony.nio.transfer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * FileChannel的transferTo源码:
 * public abstract long transferTo(long position, long count, WritableByteChannel target) throws IOException;
 * transferTo()方法将数据从FileChannel传输到其他的Channel中。
 */
public class TransferToTest {
    /**
     * 文件复制: 将fromFile.txt文件内容复制到toFile.txt中
     */
    public static void main(String[] args) {
        try (
                // 指定文件创建文件输入流
                FileInputStream fromFile = new FileInputStream("C:\\mycode\\fromFile.txt");
                // 指定文件创建文件输出流
                FileOutputStream toFile = new FileOutputStream("C:\\mycode\\toFile.txt");
                // 获取通道
                FileChannel fromChannel = fromFile.getChannel();
                FileChannel toChannel = toFile.getChannel()) {

            // 定义position的位置为初始位置0
            long position = 0;

            // 获取文件总的字节数
            long count = fromChannel.size();

            // 从fromChannel通道缓冲区position位置开始读取count字节数写入到目标通道toChannel中
            fromChannel.transferTo(position, count, toChannel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
