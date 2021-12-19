package com.bytedance.librarian.elf;

import com.bytedance.librarian.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Elf32Header extends Elf.Header {

    /* renamed from: j  reason: collision with root package name */
    private final ElfParser f39803j;

    @Override // com.bytedance.librarian.elf.Elf.Header
    public final Elf.SectionHeader a() {
        return new Section32Header(this.f39803j, this);
    }

    @Override // com.bytedance.librarian.elf.Elf.Header
    public final Elf.ProgramHeader a(long j2) {
        return new Program32Header(this.f39803j, this, j2);
    }

    @Override // com.bytedance.librarian.elf.Elf.Header
    public final Elf.DynamicStructure a(long j2, int i2) {
        return new Dynamic32Structure(this.f39803j, this, j2, i2);
    }

    public Elf32Header(boolean z, ElfParser elfParser) {
        ByteOrder byteOrder;
        this.f39789a = z;
        this.f39803j = elfParser;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f39790b = elfParser.c(allocate, 16);
        this.f39791c = elfParser.b(allocate, 28);
        this.f39792d = elfParser.b(allocate, 32);
        this.f39793e = elfParser.c(allocate, 42);
        this.f39794f = elfParser.c(allocate, 44);
        this.f39795g = elfParser.c(allocate, 46);
        this.f39796h = elfParser.c(allocate, 48);
        this.f39797i = elfParser.c(allocate, 50);
    }
}
