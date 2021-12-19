package com.facebook.common.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import java.io.InputStream;
import java.io.OutputStream;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final int f47100a;

    /* renamed from: b  reason: collision with root package name */
    private final a f47101b;

    static {
        Covode.recordClassIndex(28664);
    }

    public l(a aVar) {
        this(aVar, (byte) 0);
    }

    private l(a aVar, byte b2) {
        i.a(true);
        this.f47100a = 16384;
        this.f47101b = aVar;
    }

    public final long a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(5036);
        byte[] bArr = (byte[]) this.f47101b.a(this.f47100a);
        long j2 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f47100a);
                if (read == -1) {
                    return j2;
                }
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
            } finally {
                this.f47101b.a(bArr);
                MethodCollector.o(5036);
            }
        }
    }
}
