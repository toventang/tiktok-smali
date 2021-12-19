package com.bytedance.crash.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.DataOutputStream;
import java.io.OutputStream;

/* access modifiers changed from: package-private */
public final class g extends DataOutputStream {
    static {
        Covode.recordClassIndex(16232);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() {
    }

    public final void a() {
        super.close();
    }

    public g(OutputStream outputStream) {
        super(outputStream);
        MethodCollector.i(6891);
        MethodCollector.o(6891);
    }
}
