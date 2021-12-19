package com.bytedance.analytics.b;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f6560a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static m<? super String, ? super String, z> f6561b;

    static {
        Covode.recordClassIndex(3156);
    }

    private f() {
    }

    public static final void a(String str) {
        l.d(str, "");
        m<? super String, ? super String, z> mVar = f6561b;
        if (mVar != null) {
            mVar.invoke("BTMLogTag", str);
        }
    }

    private static void b(String str) {
        m<? super String, ? super String, z> mVar = f6561b;
        if (mVar != null) {
            mVar.invoke("BTMLogTag_Page", str);
        }
    }

    public static void a(com.bytedance.analytics.page.f fVar) {
        String str;
        String str2 = "";
        l.d(fVar, str2);
        if (f6561b != null) {
            String str3 = fVar.q;
            if (str3 != null) {
                List<String> b2 = p.b(str3, new String[]{"."});
                str = b2.get(1) + '.' + b2.get(2) + '.' + b2.get(3);
            } else {
                str = str2;
            }
            String str4 = fVar.s;
            Object obj = str2;
            if (str4 != null) {
                obj = p.c(str4, new String[]{"."}).get(1);
            }
            b("name:" + fVar.f6571b + ",back:" + fVar.o + ",pre:" + str + ",duration:" + fVar.n + "ms,lastStay:" + ((String) obj));
        }
    }
}
