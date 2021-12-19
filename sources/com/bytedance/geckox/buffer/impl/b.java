package com.bytedance.geckox.buffer.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.a;
import com.bytedance.geckox.utils.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private RandomAccessFile f29762a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f29763b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private File f29764c;

    static {
        Covode.recordClassIndex(17276);
    }

    @Override // com.bytedance.geckox.buffer.a
    public final File f() {
        return this.f29764c;
    }

    @Override // com.bytedance.geckox.buffer.a
    public final long b() {
        return this.f29762a.length();
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int d() {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void e() {
        if (!this.f29763b.getAndSet(true)) {
            c.a(this.f29762a);
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void a() {
        if (this.f29763b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final long c() {
        if (!this.f29763b.get()) {
            return this.f29762a.getFilePointer();
        }
        throw new IOException("released!");
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int b(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void a(int i2) {
        a(new byte[]{(byte) i2});
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void b(long j2) {
        if (!this.f29763b.get()) {
            if (j2 < 0) {
                j2 = 0;
            }
            this.f29762a.seek(j2);
            return;
        }
        throw new IOException("released!");
    }

    b(File file) {
        this.f29764c = file;
        boolean mkdirs = file.getParentFile().mkdirs();
        try {
            this.f29762a = new RandomAccessFile(file, "rw");
        } catch (Exception e2) {
            boolean exists = file.getParentFile().exists();
            c.a(this.f29762a);
            if (e2 instanceof FileNotFoundException) {
                boolean mkdirs2 = file.getParentFile().mkdirs();
                boolean exists2 = file.getParentFile().exists();
                try {
                    this.f29762a = new RandomAccessFile(file, "rw");
                } catch (Exception unused) {
                    c.a(this.f29762a);
                    throw new IOException("create raf mSwap failed![2 dir mk:" + mkdirs2 + ",dir exist:+" + exists2 + ", dir mk:" + mkdirs + ",dir exist:+" + exists + "] path: " + file.getAbsolutePath() + " caused by: " + e2.getMessage(), e2);
                }
            } else {
                throw new IOException("create raf mSwap failed![1 dir mk:" + mkdirs + ",dir exist:+" + exists + "] path: " + file.getAbsolutePath() + " caused by: " + e2.getMessage(), e2);
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final synchronized long a(long j2) {
        long skipBytes;
        MethodCollector.i(8502);
        if (!this.f29763b.get()) {
            int i2 = (int) j2;
            if (((long) i2) == j2) {
                skipBytes = (long) this.f29762a.skipBytes(i2);
                MethodCollector.o(8502);
            } else {
                IOException iOException = new IOException("too large:".concat(String.valueOf(j2)));
                MethodCollector.o(8502);
                throw iOException;
            }
        } else {
            IOException iOException2 = new IOException("released!");
            MethodCollector.o(8502);
            throw iOException2;
        }
        return skipBytes;
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int b(byte[] bArr, int i2, int i3) {
        int read;
        MethodCollector.i(8972);
        if (this.f29763b.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.o(8972);
            throw iOException;
        } else if (bArr == null || i3 <= 0 || i2 < 0 || i2 >= bArr.length) {
            MethodCollector.o(8972);
            return 0;
        } else {
            if (i2 + i3 > bArr.length) {
                i3 = bArr.length - i2;
            }
            synchronized (this) {
                try {
                    read = this.f29762a.read(bArr, i2, i3);
                } finally {
                    MethodCollector.o(8972);
                }
            }
            return read;
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int a(byte[] bArr, int i2, int i3) {
        MethodCollector.i(8784);
        if (this.f29763b.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.o(8784);
            throw iOException;
        } else if (bArr == null || bArr.length == 0 || i3 <= 0) {
            MethodCollector.o(8784);
            return 0;
        } else if (i2 < 0 || i2 >= bArr.length) {
            MethodCollector.o(8784);
            return 0;
        } else {
            if (i2 + i3 > bArr.length) {
                i3 = bArr.length - i2;
            }
            synchronized (this) {
                try {
                    this.f29762a.write(bArr, i2, i3);
                } finally {
                    MethodCollector.o(8784);
                }
            }
            return i3;
        }
    }
}
