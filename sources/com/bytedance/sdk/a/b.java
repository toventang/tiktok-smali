package com.bytedance.sdk.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ug.a.j;
import com.bytedance.ug.a.o;
import com.bytedance.ug.a.q;
import com.ss.android.account.f;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f43105c;

    /* renamed from: a  reason: collision with root package name */
    public j f43106a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f43107b;

    static {
        Covode.recordClassIndex(26442);
    }

    private b() {
        if (this.f43106a == null) {
            o oVar = new o();
            oVar.f45745a = f.a().b();
            oVar.f45748d = false;
            oVar.f45746b = "account";
            oVar.f45747c = "0.1.9";
            oVar.f45749e = 0;
            this.f43106a = q.a(oVar.a());
        }
    }

    public static b a() {
        MethodCollector.i(13390);
        if (f43105c == null) {
            synchronized (b.class) {
                try {
                    if (f43105c == null) {
                        f43105c = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13390);
                    throw th;
                }
            }
        }
        b bVar = f43105c;
        MethodCollector.o(13390);
        return bVar;
    }

    public final void a(boolean z, String str) {
        j jVar = this.f43106a;
        if (jVar != null && this.f43107b) {
            int i2 = 0;
            if (!z) {
                i2 = 301;
            }
            jVar.a("1003", i2, str);
        }
    }

    public final void b(boolean z, String str) {
        j jVar = this.f43106a;
        if (jVar != null && this.f43107b) {
            int i2 = 0;
            if (!z) {
                i2 = 401;
            }
            jVar.a("1004", i2, str);
        }
    }
}
