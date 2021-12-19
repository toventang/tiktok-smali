package com.bytedance.android.livesdk.as;

import com.bytedance.android.e.a.a.d;
import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.live.sdk.msg.b.h;
import h.f.b.l;
import h.m.d;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;

public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Type f14074a;

    static {
        Covode.recordClassIndex(7806);
    }

    public f(Type type) {
        l.d(type, "");
        this.f14074a = type;
    }

    @Override // com.ss.ugc.live.sdk.msg.b.h
    public final Object a(byte[] bArr) {
        MethodCollector.i(10618);
        l.d(bArr, "");
        if (l.a(this.f14074a, String.class)) {
            String str = new String(bArr, d.f158808a);
            MethodCollector.o(10618);
            return str;
        } else if (l.a(this.f14074a, d.b.class)) {
            d.b a2 = com.bytedance.android.e.a.a.d.a(new ByteArrayInputStream(bArr));
            l.b(a2, "");
            MethodCollector.o(10618);
            return a2;
        } else {
            Object a3 = new e(this.f14074a).a(bArr);
            if (a3 == null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                com.google.gson.f fVar = e.a.f9628b;
                a3 = fVar.a(fVar.a((Reader) new InputStreamReader(byteArrayInputStream)), this.f14074a);
            }
            l.b(a3, "");
            MethodCollector.o(10618);
            return a3;
        }
    }
}
