package com.ss.android.ugc.aweme.net.cache;

import androidx.c.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import h.f.b.l;

public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f112277c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final e<String, e<String, e>> f112278a;

    /* renamed from: b  reason: collision with root package name */
    public int f112279b;

    static {
        Covode.recordClassIndex(72151);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72152);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public j() {
        this.f112279b = 0;
        this.f112279b = 16;
        this.f112278a = new e<>(this.f112279b);
    }

    public final u<?> a(Request request) {
        boolean z;
        String str;
        e eVar;
        MethodCollector.i(6639);
        l.d(request, "");
        d b2 = b.b(request);
        if (b2 == null) {
            MethodCollector.o(6639);
            return null;
        }
        String e2 = b.e(request);
        String str2 = b2.f112259a;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = request.getPath();
        } else {
            str = b2.f112259a;
        }
        if (str == null) {
            MethodCollector.o(6639);
            return null;
        }
        synchronized (this.f112278a) {
            try {
                e<String, e> a2 = this.f112278a.a(str);
                if (a2 != null) {
                    eVar = a2.a(e2);
                } else {
                    eVar = null;
                }
            } finally {
                MethodCollector.o(6639);
            }
        }
        if (eVar == null) {
            MethodCollector.o(6639);
            return null;
        }
        l.d(eVar, "");
        if (System.currentTimeMillis() - eVar.f112264b > ((long) b2.f112261c)) {
            e<String, e> a3 = this.f112278a.a(str);
            if (a3 != null) {
                a3.b(e2);
            }
            return null;
        }
        u<?> uVar = eVar.f112263a;
        MethodCollector.o(6639);
        return uVar;
    }
}
