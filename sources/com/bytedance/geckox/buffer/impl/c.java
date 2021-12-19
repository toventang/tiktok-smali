package com.bytedance.geckox.buffer.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private long f29765a;

    /* renamed from: b  reason: collision with root package name */
    private long f29766b;

    /* renamed from: c  reason: collision with root package name */
    private RandomAccessFile f29767c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f29768d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private File f29769e;

    static {
        Covode.recordClassIndex(17277);
    }

    @Override // com.bytedance.geckox.buffer.a
    public final long b() {
        return this.f29765a;
    }

    @Override // com.bytedance.geckox.buffer.a
    public final File f() {
        return this.f29769e;
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int d() {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void e() {
        if (!this.f29768d.getAndSet(true)) {
            com.bytedance.geckox.utils.c.a(this.f29767c);
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void a() {
        if (this.f29768d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final long c() {
        if (!this.f29768d.get()) {
            return this.f29766b;
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r4 > r1) goto L_0x000e;
     */
    @Override // com.bytedance.geckox.buffer.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f29768d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001e
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
        L_0x000e:
            r4 = r1
        L_0x000f:
            r3.f29766b = r4
            java.io.RandomAccessFile r0 = r3.f29767c
            r0.seek(r4)
            return
        L_0x0017:
            long r1 = r3.f29765a
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x000f
            goto L_0x000e
        L_0x001e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "released!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.buffer.impl.c.b(long):void");
    }

    @Override // com.bytedance.geckox.buffer.a
    public final synchronized long a(long j2) {
        long j3;
        MethodCollector.i(8646);
        if (!this.f29768d.get()) {
            int i2 = (int) j2;
            if (((long) i2) == j2) {
                int skipBytes = this.f29767c.skipBytes(i2);
                this.f29766b = this.f29767c.getFilePointer();
                j3 = (long) skipBytes;
                MethodCollector.o(8646);
            } else {
                IOException iOException = new IOException("too large:".concat(String.valueOf(j2)));
                MethodCollector.o(8646);
                throw iOException;
            }
        } else {
            IOException iOException2 = new IOException("released!");
            MethodCollector.o(8646);
            throw iOException2;
        }
        return j3;
    }

    c(long j2, File file) {
        this.f29765a = j2;
        this.f29769e = file;
        boolean mkdirs = file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f29767c = randomAccessFile;
            randomAccessFile.setLength(j2);
        } catch (Exception e2) {
            boolean exists = file.getParentFile().exists();
            com.bytedance.geckox.utils.c.a(this.f29767c);
            if (e2 instanceof FileNotFoundException) {
                boolean mkdirs2 = file.getParentFile().mkdirs();
                boolean exists2 = file.getParentFile().exists();
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                    this.f29767c = randomAccessFile2;
                    randomAccessFile2.setLength(j2);
                } catch (Exception unused) {
                    com.bytedance.geckox.utils.c.a(this.f29767c);
                    throw new IOException("create raf swap failed[2 dir mk:" + mkdirs2 + ",dir exist:+" + exists2 + ", dir mk:" + mkdirs + ",dir exist:+" + exists + "]! path: " + file.getAbsolutePath() + " caused by: " + e2.getMessage(), e2);
                }
            } else {
                throw new IOException("create raf swap failed[1 dir mk:" + mkdirs + ",dir exist:+" + exists + "]! path: " + file.getAbsolutePath() + " caused by: " + e2.getMessage(), e2);
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int a(byte[] bArr, int i2, int i3) {
        MethodCollector.i(8652);
        if (this.f29768d.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.o(8652);
            throw iOException;
        } else if (bArr == null || bArr.length == 0 || i3 <= 0) {
            MethodCollector.o(8652);
            return 0;
        } else if (i2 < 0 || i2 >= bArr.length) {
            MethodCollector.o(8652);
            return 0;
        } else {
            if (i2 + i3 > bArr.length) {
                i3 = bArr.length - i2;
            }
            synchronized (this) {
                try {
                    long j2 = this.f29766b;
                    long j3 = this.f29765a;
                    if (j2 == j3) {
                        return 0;
                    }
                    if (((long) i3) + j2 > j3) {
                        i3 = (int) (j3 - j2);
                    }
                    this.f29767c.write(bArr, i2, i3);
                    this.f29766b += (long) i3;
                    MethodCollector.o(8652);
                    return i3;
                } finally {
                    MethodCollector.o(8652);
                }
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int b(byte[] bArr, int i2, int i3) {
        MethodCollector.i(9119);
        if (this.f29768d.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.o(9119);
            throw iOException;
        } else if (bArr == null || i3 <= 0 || i2 < 0 || i2 >= bArr.length) {
            MethodCollector.o(9119);
            return 0;
        } else {
            if (i2 + i3 > bArr.length) {
                i3 = bArr.length - i2;
            }
            synchronized (this) {
                try {
                    long j2 = this.f29766b;
                    long j3 = this.f29765a;
                    if (j2 == j3) {
                        return -1;
                    }
                    if (((long) i3) + j2 > j3) {
                        i3 = (int) (j3 - j2);
                    }
                    int read = this.f29767c.read(bArr, i2, i3);
                    if (read == -1) {
                        MethodCollector.o(9119);
                        return -1;
                    }
                    this.f29766b += (long) read;
                    MethodCollector.o(9119);
                    return read;
                } finally {
                    MethodCollector.o(9119);
                }
            }
        }
    }
}
