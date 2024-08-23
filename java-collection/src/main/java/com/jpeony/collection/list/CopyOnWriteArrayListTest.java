package com.jpeony.collection.list;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * CopyOnWriteArrayList 线程安全，使用副本，实现读写分离
 */
public class CopyOnWriteArrayListTest {
    public static void main(String[] args) throws InterruptedException {
        final List<Integer> list = new CopyOnWriteArrayList<>();

        // 线程A将0-1000添加到List
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(i);
                }
            }
        });

        // 线程B将1000-2000添加到List
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 1000; j < 2000; j++) {
                    list.add(j);
                }
            }
        });

        // 启动线程
        threadA.start();
        threadB.start();

        // main线程休眠一秒，让子线程处理完
        Thread.sleep(1000);

        // 输出list元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第 " + (i + 1) + " 个元素为：" + list.get(i));
        }
    }
}
