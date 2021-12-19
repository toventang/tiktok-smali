package com.ss.android.socialbase.downloader.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.k.g;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public BufferedOutputStream f60865a;

    /* renamed from: b  reason: collision with root package name */
    public FileDescriptor f60866b;

    /* renamed from: c  reason: collision with root package name */
    private RandomAccessFile f60867c;

    static {
        Covode.recordClassIndex(37546);
    }

    public final void a() {
        BufferedOutputStream bufferedOutputStream = this.f60865a;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
        FileDescriptor fileDescriptor = this.f60866b;
        if (fileDescriptor != null) {
            fileDescriptor.sync();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g.a(this.f60867c, this.f60865a);
    }

    public final void a(long j2) {
        this.f60867c.seek(j2);
    }

    public final void b(long j2) {
        this.f60867c.setLength(j2);
    }

    public final void a(byte[] bArr, int i2) {
        MethodCollector.i(13032);
        this.f60865a.write(bArr, 0, i2);
        MethodCollector.o(13032);
    }

    public c(File file, int i2) {
        MethodCollector.i(12936);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f60867c = randomAccessFile;
            this.f60866b = randomAccessFile.getFD();
            if (i2 > 0) {
                if (i2 < 8192) {
                    i2 = 8192;
                } else if (i2 > 131072) {
                    i2 = 131072;
                }
                this.f60865a = new BufferedOutputStream(new FileOutputStream(this.f60867c.getFD()), i2);
                MethodCollector.o(12936);
                return;
            }
            this.f60865a = new BufferedOutputStream(new FileOutputStream(this.f60867c.getFD()));
            MethodCollector.o(12936);
        } catch (IOException e2) {
            BaseException baseException = new BaseException(1039, e2);
            MethodCollector.o(12936);
            throw baseException;
        }
    }
}
