package com.bytedance.ies.xelement.pickview.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import java.util.Iterator;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f37382a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(22467);
    }

    public static void a(List<p<String, String>> list, g gVar) {
        l.c(list, "");
        l.c(gVar, "");
        String a2 = a(list, b.f37377f);
        if (a2 != null) {
            gVar.a(a2);
        }
        String a3 = a(list, b.f37378g);
        if (a3 != null) {
            gVar.b(a3);
        }
    }

    public static String a(List<p<String, String>> list, String str) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (l.a(t.getFirst(), (Object) str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return (String) t2.getSecond();
        }
        return null;
    }
}
