package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.effectplatform.a.c.a;
import h.f.b.l;
import java.io.InputStream;

public final class InputStreamByteRead implements a {
    private final InputStream inputStream;

    static {
        Covode.recordClassIndex(95542);
    }

    @Override // com.ss.ugc.effectplatform.a.c.a
    public final void close() {
        this.inputStream.close();
    }

    @Override // com.ss.ugc.effectplatform.a.c.a
    public final boolean available() {
        if (this.inputStream.available() >= 0) {
            return true;
        }
        return false;
    }

    public InputStreamByteRead(InputStream inputStream2) {
        l.c(inputStream2, "");
        this.inputStream = inputStream2;
    }

    @Override // com.ss.ugc.effectplatform.a.c.a
    public final int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(933);
        l.c(bArr, "");
        int read = this.inputStream.read(bArr, i2, i3);
        MethodCollector.o(933);
        return read;
    }
}
