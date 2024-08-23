package com.jpeony.concurrent.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用interrupt方法来中断线程，并不能马上就让线程中断，使用interrupt方法只是在当前线程中打了一个停止的标记，并不是真正的停止线程。
 */
public class InterruptMethod extends Thread {
    private final static Logger logger = LoggerFactory.getLogger(IsInterruptMethod.class);

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        // 循环10万次
        for (int i = 0; i < 100000; i++) {
            logger.info("i = {}", i + 1);
        }
        System.out.println("执行耗时:" + (System.currentTimeMillis() - start) / 1000);
    }

    public static void main(String[] args) {
        try {
            InterruptMethod thread = new InterruptMethod();
            // 启动InterruptMethod线程
            thread.start();
            // main线程休眠2秒
            Thread.sleep(2000);
            // 调用interrupt中断线程
            thread.interrupt();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
