package com.bytedance.librarian.elf;

import com.bytedance.librarian.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Elf64Header extends Elf.Header {

    /* renamed from: j  reason: collision with root package name */
    private final ElfParser f39804j;

    @Override // com.bytedance.librarian.elf.Elf.Header
    public final Elf.SectionHeader a() {
        return new Section64Header(this.f39804j, this);
    }

    @Override // com.bytedance.librarian.elf.Elf.Header
    public final Elf.ProgramHeader a(long j2) {
        return new Program64Header(this.f39804j, this, j2);
    }

    @Override // com.bytedance.librarian.elf.Elf.Header
    public final Elf.DynamicStructure a(long j2, int i2) {
        return new Dynamic64Structure(this.f39804j, this, j2, i2);
    }

    public Elf64Header(boolean z, ElfParser elfParser) {
        ByteOrder byteOrder;
        this.f39789a = z;
        this.f39804j = elfParser;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f39790b = elfParser.c(allocate, 16);
        this.f39791c = elfParser.a(allocate, 32);
        this.f39792d = elfParser.a(allocate, 40);
        this.f39793e = elfParser.c(allocate, 54);
        this.f39794f = elfParser.c(allocate, 56);
        this.f39795g = elfParser.c(allocate, 58);
        this.f39796h = elfParser.c(allocate, 60);
        this.f39797i = elfParser.c(allocate, 62);
    }
}
