package com.google.android.gms.internal.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;

final class e extends OutputStream {
    static {
        Covode.recordClassIndex(31580);
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
    }

    e() {
        MethodCollector.i(4734);
        MethodCollector.o(4734);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        d.a(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        d.a(bArr);
    }
}
