package com.ss.android.ugc.aweme.compliance.business.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import k.f;

public final class c extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final b f76917a;

    static {
        Covode.recordClassIndex(47543);
    }

    public final void reset() {
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f76917a.a((long) this.count);
    }

    public final synchronized boolean a() {
        MethodCollector.i(6246);
        boolean z = false;
        try {
            f fVar = new f();
            int i2 = 64;
            if (this.buf.length < 64) {
                i2 = this.buf.length;
            }
            byte[] bArr = this.buf;
            l.b(bArr, "");
            fVar.a(bArr, 0, i2);
            int i3 = 0;
            while (!fVar.e()) {
                int t = fVar.t();
                if (!Character.isISOControl(t) || Character.isWhitespace(t)) {
                    i3++;
                    if (i3 >= 16) {
                        break;
                    }
                } else {
                    MethodCollector.o(6246);
                    return false;
                }
            }
            z = true;
        } catch (EOFException unused) {
        }
        MethodCollector.o(6246);
        return z;
    }

    public c(b bVar) {
        l.d(bVar, "");
        MethodCollector.i(6252);
        this.f76917a = bVar;
        MethodCollector.o(6252);
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream
    public final void write(int i2) {
        MethodCollector.i(6218);
        long b2 = this.f76917a.b(1);
        synchronized (this) {
            if (b2 > 0) {
                try {
                    super.write(i2);
                } catch (Throwable th) {
                    MethodCollector.o(6218);
                    throw th;
                }
            }
        }
        MethodCollector.o(6218);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        MethodCollector.i(6219);
        long b2 = this.f76917a.b((long) i3);
        synchronized (this) {
            if (b2 > 0) {
                try {
                    super.write(bArr, i2, (int) b2);
                } catch (Throwable th) {
                    MethodCollector.o(6219);
                    throw th;
                }
            }
        }
        MethodCollector.o(6219);
    }
}
