package com.facebook.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.a;
import com.facebook.common.d.i;
import com.facebook.common.d.m;
import com.facebook.h.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    private static d f47636b;

    /* renamed from: a  reason: collision with root package name */
    public List<c.a> f47637a;

    /* renamed from: c  reason: collision with root package name */
    private int f47638c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a f47639d = new a();

    static {
        Covode.recordClassIndex(28877);
    }

    private d() {
        a();
    }

    public static synchronized d b() {
        d dVar;
        synchronized (d.class) {
            MethodCollector.i(641);
            if (f47636b == null) {
                f47636b = new d();
            }
            dVar = f47636b;
            MethodCollector.o(641);
        }
        return dVar;
    }

    public final void a() {
        this.f47638c = this.f47639d.a();
        List<c.a> list = this.f47637a;
        if (list != null) {
            for (c.a aVar : list) {
                this.f47638c = Math.max(this.f47638c, aVar.a());
            }
        }
    }

    public static c a(InputStream inputStream) {
        try {
            d b2 = b();
            i.a(inputStream);
            int i2 = b2.f47638c;
            byte[] bArr = new byte[i2];
            int a2 = a(i2, inputStream, bArr);
            List<c.a> list = b2.f47637a;
            if (list != null) {
                for (c.a aVar : list) {
                    c a3 = aVar.a(bArr, a2);
                    if (!(a3 == null || a3 == c.f47633a)) {
                        return a3;
                    }
                }
            }
            c a4 = b2.f47639d.a(bArr, a2);
            if (a4 == null || a4 == c.f47633a) {
                return c.f47633a;
            }
            return a4;
        } catch (IOException e2) {
            throw m.b(e2);
        }
    }

    private static int a(int i2, InputStream inputStream, byte[] bArr) {
        boolean z;
        i.a(inputStream);
        i.a(bArr);
        if (bArr.length >= i2) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (!inputStream.markSupported()) {
            return a.a(inputStream, bArr, i2);
        }
        try {
            inputStream.mark(i2);
            return a.a(inputStream, bArr, i2);
        } finally {
            inputStream.reset();
        }
    }
}
