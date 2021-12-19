package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;

final class ae extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f52775a;

    /* renamed from: b  reason: collision with root package name */
    private long f52776b;

    static {
        Covode.recordClassIndex(32670);
    }

    ae(InputStream inputStream, long j2) {
        MethodCollector.i(7367);
        this.f52775a = inputStream;
        this.f52776b = j2;
        MethodCollector.o(7367);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        super.close();
        this.f52775a.close();
        this.f52776b = 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        int read;
        MethodCollector.i(7433);
        long j2 = this.f52776b;
        if (j2 <= 0) {
            read = -1;
        } else {
            this.f52776b = j2 - 1;
            read = this.f52775a.read();
        }
        MethodCollector.o(7433);
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(7437);
        long j2 = this.f52776b;
        if (j2 <= 0) {
            MethodCollector.o(7437);
            return -1;
        }
        int read = this.f52775a.read(bArr, i2, (int) Math.min((long) i3, j2));
        if (read != -1) {
            this.f52776b -= (long) read;
        }
        MethodCollector.o(7437);
        return read;
    }
}
