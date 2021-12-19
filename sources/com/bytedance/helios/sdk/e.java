package com.bytedance.helios.sdk;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.h;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.sdk.c.a.a;
import com.bytedance.helios.sdk.c.c;
import com.bytedance.helios.sdk.d.b;
import com.bytedance.helios.sdk.d.g;
import com.bytedance.helios.sdk.d.i;
import com.bytedance.helios.sdk.d.k;
import com.bytedance.helios.sdk.d.n;
import com.bytedance.helios.sdk.d.s;
import com.bytedance.helios.sdk.d.w;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f30943a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final SparseArray<b> f30944b = new SparseArray<>();

    private e() {
    }

    static {
        Covode.recordClassIndex(17950);
        o.a(new com.bytedance.helios.sdk.c.e());
        o.a(h.a.a());
        o.f30686b = new com.bytedance.helios.sdk.c.b();
        o.f30688d = new c();
        a aVar = new a(new com.bytedance.helios.sdk.c.a.b());
        l.c(aVar, "");
        o.f30687c.add(aVar);
        a(new s());
        a(new g());
        a(new k());
        a(new i());
        a(new w());
        a(com.bytedance.helios.sdk.d.o.f30915b);
    }

    public static b a(int i2) {
        return f30944b.get(i2);
    }

    public static com.bytedance.helios.sdk.d.e b(int i2) {
        b a2 = a(i2);
        if (a2 != null) {
            return a2.a(i2);
        }
        return null;
    }

    private static void a(b bVar) {
        for (int i2 : bVar.a()) {
            f30944b.put(i2, bVar);
        }
    }

    public static n a(String str) {
        l.c(str, "");
        int size = f30944b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b valueAt = f30944b.valueAt(i2);
            if (valueAt instanceof n) {
                n nVar = (n) valueAt;
                if (l.a((Object) nVar.b(), (Object) str)) {
                    return nVar;
                }
            }
        }
        return null;
    }
}
