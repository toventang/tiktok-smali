package com.bytedance.librarian.elf;

import com.bytedance.librarian.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Program32Header extends Elf.ProgramHeader {
    public Program32Header(ElfParser elfParser, Elf.Header header, long j2) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (header.f39789a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j3 = header.f39791c + (j2 * ((long) header.f39793e));
        this.f39798a = elfParser.b(allocate, j3);
        this.f39799b = elfParser.b(allocate, 4 + j3);
        this.f39800c = elfParser.b(allocate, 8 + j3);
        this.f39801d = elfParser.b(allocate, j3 + 20);
    }
}
