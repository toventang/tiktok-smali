package com.google.c.e;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class b {
    static {
        Covode.recordClassIndex(33552);
    }

    public abstract InputStream a();

    protected b() {
    }

    public final long a(a aVar) {
        k.a(aVar);
        d dVar = new d(d.f54113a);
        try {
            InputStream inputStream = (InputStream) dVar.a(a());
            OutputStream outputStream = (OutputStream) dVar.a(aVar.a());
            k.a(inputStream);
            k.a(outputStream);
            byte[] bArr = new byte[8192];
            long j2 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    j2 += (long) read;
                } else {
                    dVar.close();
                    return j2;
                }
            }
        } catch (Throwable th) {
            dVar.close();
            throw th;
        }
    }
}
