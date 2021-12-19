package com.bytedance.librarian.elf;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.elf.Elf;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElfParser implements Elf, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final int f39805a = 1179403647;

    /* renamed from: b  reason: collision with root package name */
    private final FileChannel f39806b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39806b.close();
    }

    public final List<String> a() {
        boolean z;
        Elf.Header elf64Header;
        ByteOrder byteOrder;
        Elf.DynamicStructure a2;
        this.f39806b.position(0L);
        ArrayList arrayList = new ArrayList();
        this.f39806b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (b(allocate, 0) == 1179403647) {
            short e2 = e(allocate, 4);
            if (e(allocate, 5) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (e2 == 1) {
                elf64Header = new Elf32Header(z, this);
            } else if (e2 == 2) {
                elf64Header = new Elf64Header(z, this);
            } else {
                throw new IllegalStateException("Invalid class type!");
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            if (elf64Header.f39789a) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            allocate2.order(byteOrder);
            long j2 = (long) elf64Header.f39794f;
            if (j2 == 65535) {
                j2 = elf64Header.a().f39802a;
            }
            long j3 = 0;
            while (true) {
                if (j3 >= j2) {
                    break;
                }
                Elf.ProgramHeader a3 = elf64Header.a(j3);
                if (a3.f39798a == 2) {
                    long j4 = a3.f39799b;
                    if (j4 != 0) {
                        ArrayList<Long> arrayList2 = new ArrayList();
                        long j5 = 0;
                        int i2 = 0;
                        do {
                            a2 = elf64Header.a(j4, i2);
                            if (a2.f39787a == 1) {
                                arrayList2.add(Long.valueOf(a2.f39788b));
                            } else if (a2.f39787a == 5) {
                                j5 = a2.f39788b;
                            }
                            i2++;
                        } while (a2.f39787a != 0);
                        if (j5 != 0) {
                            long a4 = a(elf64Header, j2, j5);
                            for (Long l2 : arrayList2) {
                                arrayList.add(d(allocate2, l2.longValue() + a4));
                            }
                            return arrayList;
                        }
                        throw new IllegalStateException("String table offset not found!");
                    }
                } else {
                    j3++;
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public ElfParser(File file) {
        MethodCollector.i(12703);
        if (file == null || !file.exists()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("File is null or does not exist");
            MethodCollector.o(12703);
            throw illegalArgumentException;
        }
        this.f39806b = new FileInputStream(file).getChannel();
        MethodCollector.o(12703);
    }

    private short e(ByteBuffer byteBuffer, long j2) {
        a(byteBuffer, j2, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    public final long a(ByteBuffer byteBuffer, long j2) {
        a(byteBuffer, j2, 8);
        return byteBuffer.getLong();
    }

    /* access modifiers changed from: protected */
    public final long b(ByteBuffer byteBuffer, long j2) {
        a(byteBuffer, j2, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    public final int c(ByteBuffer byteBuffer, long j2) {
        a(byteBuffer, j2, 2);
        return byteBuffer.getShort() & 65535;
    }

    private String d(ByteBuffer byteBuffer, long j2) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j3 = 1 + j2;
            short e2 = e(byteBuffer, j2);
            if (e2 == 0) {
                return sb.toString();
            }
            sb.append((char) e2);
            j2 = j3;
        }
    }

    private static long a(Elf.Header header, long j2, long j3) {
        for (long j4 = 0; j4 < j2; j4++) {
            Elf.ProgramHeader a2 = header.a(j4);
            if (a2.f39798a == 1 && a2.f39800c <= j3 && j3 <= a2.f39800c + a2.f39801d) {
                return (j3 - a2.f39800c) + a2.f39799b;
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    private void a(ByteBuffer byteBuffer, long j2, int i2) {
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        long j3 = 0;
        while (j3 < ((long) i2)) {
            int read = this.f39806b.read(byteBuffer, j2 + j3);
            if (read != -1) {
                j3 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
