package com.gregorybahr.chip8emulator.emulator;

/**
 * Created by bahrg on 3/6/17.
 */

public class Rom {
    private String file;
    private String name;

    public Rom(String file, String name) {
        this.file = file;
        this.name = name;
    }

    public String getFile() {
        return file;
    }

    public String getName() {
        return name;
    }


}
