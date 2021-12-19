package com.bytedance.librarian.elf;

import com.bytedance.librarian.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Section64Header extends Elf.SectionHeader {
    public Section64Header(ElfParser elfParser, Elf.Header header) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (header.f39789a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f39802a = elfParser.b(allocate, header.f39792d + ((long) (header.f39795g * 0)) + 44);
    }
}
