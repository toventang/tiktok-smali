package com.bytedance.librarian.elf;

import com.bytedance.librarian.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Dynamic32Structure extends Elf.DynamicStructure {
    public Dynamic32Structure(ElfParser elfParser, Elf.Header header, long j2, int i2) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (header.f39789a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j3 = j2 + ((long) (i2 * 8));
        this.f39787a = elfParser.b(allocate, j3);
        this.f39788b = elfParser.b(allocate, j3 + 4);
    }
}
