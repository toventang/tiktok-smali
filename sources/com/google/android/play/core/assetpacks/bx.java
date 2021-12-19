package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

public final class bx extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final Enumeration<File> f52934a;

    /* renamed from: b  reason: collision with root package name */
    private InputStream f52935b;

    static {
        Covode.recordClassIndex(32716);
    }

    public bx(Enumeration<File> enumeration) {
        MethodCollector.i(6611);
        this.f52934a = enumeration;
        a();
        MethodCollector.o(6611);
    }

    private void a() {
        MethodCollector.i(6623);
        InputStream inputStream = this.f52935b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f52935b = this.f52934a.hasMoreElements() ? new FileInputStream(this.f52934a.nextElement()) : null;
        MethodCollector.o(6623);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        super.close();
        InputStream inputStream = this.f52935b;
        if (inputStream != null) {
            inputStream.close();
            this.f52935b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.i(6615);
        while (true) {
            InputStream inputStream = this.f52935b;
            if (inputStream != null) {
                int read = inputStream.read();
                if (read != -1) {
                    MethodCollector.o(6615);
                    return read;
                }
                a();
            } else {
                MethodCollector.o(6615);
                return -1;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(6621);
        if (this.f52935b == null) {
            MethodCollector.o(6621);
            return -1;
        } else if (bArr == null) {
            MethodCollector.o(6621);
            throw null;
        } else if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            MethodCollector.o(6621);
            throw indexOutOfBoundsException;
        } else if (i3 != 0) {
            do {
                int read = this.f52935b.read(bArr, i2, i3);
                if (read > 0) {
                    MethodCollector.o(6621);
                    return read;
                }
                a();
            } while (this.f52935b != null);
            MethodCollector.o(6621);
            return -1;
        } else {
            MethodCollector.o(6621);
            return 0;
        }
    }
}
