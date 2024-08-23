package com.jpeony.jvm.oom;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 【直接内存 OutOfMemoryError 异常演示】该类执行完ide都崩掉了，小心！！！
 * VM Args: -Xmx20M -XX:MaxDirectMemorySize=10M
 * <p>
 * 参数说明：-XX:MaxDirectMemorySize=10M直接内存大小设置。
 */
public class DirectMemoryOOM {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
