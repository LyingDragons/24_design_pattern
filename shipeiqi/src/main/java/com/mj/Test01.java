package com.mj;

public class Test01 {

    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter(new LogWriteFileServiceImpl());
        classAdapter.writeDbFile(null);
    }
}
