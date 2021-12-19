package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i {
    static {
        Covode.recordClassIndex(21562);
    }

    private static List<Object> a(m mVar) {
        l.c(mVar, "");
        ArrayList arrayList = new ArrayList();
        int a2 = mVar.a();
        for (int i2 = 0; i2 < a2; i2++) {
            switch (j.f36137a[mVar.h(i2).ordinal()]) {
                case 1:
                    arrayList.add(mVar.d(i2));
                    break;
                case 2:
                    arrayList.add(Double.valueOf(mVar.b(i2)));
                    break;
                case 3:
                    arrayList.add(Boolean.valueOf(mVar.a(i2)));
                    break;
                case 4:
                    arrayList.add(Integer.valueOf(mVar.c(i2)));
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    n f2 = mVar.f(i2);
                    if (f2 != null) {
                        arrayList.add(a(f2));
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    m e2 = mVar.e(i2);
                    if (e2 != null) {
                        arrayList.add(a(e2));
                        break;
                    } else {
                        break;
                    }
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> a(n nVar) {
        l.c(nVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        l a2 = nVar.a();
        while (a2.a()) {
            String b2 = a2.b();
            switch (j.f36138b[nVar.j(b2).ordinal()]) {
                case 1:
                    linkedHashMap.put(b2, nVar.f(b2));
                    break;
                case 2:
                    linkedHashMap.put(b2, Double.valueOf(nVar.d(b2)));
                    break;
                case 3:
                    linkedHashMap.put(b2, Boolean.valueOf(nVar.c(b2)));
                    break;
                case 4:
                    linkedHashMap.put(b2, Integer.valueOf(nVar.e(b2)));
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    n h2 = nVar.h(b2);
                    if (h2 == null) {
                        break;
                    } else {
                        linkedHashMap.put(b2, a(h2));
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    m g2 = nVar.g(b2);
                    if (g2 == null) {
                        break;
                    } else {
                        linkedHashMap.put(b2, a(g2));
                        break;
                    }
            }
        }
        return linkedHashMap;
    }

    public static /* synthetic */ n b(n nVar, String str) {
        l.c(nVar, "");
        l.c(str, "");
        if (!nVar.a(str)) {
            return null;
        }
        k i2 = nVar.i(str);
        if (i2.a() == o.Map) {
            return i2.g();
        }
        return null;
    }

    public static /* synthetic */ m c(n nVar, String str) {
        l.c(nVar, "");
        l.c(str, "");
        if (!nVar.a(str)) {
            return null;
        }
        k i2 = nVar.i(str);
        if (i2.a() == o.Array) {
            return i2.f();
        }
        return null;
    }

    public static final double a(n nVar, String str, double d2) {
        l.c(nVar, "");
        l.c(str, "");
        if (!nVar.a(str)) {
            return d2;
        }
        k i2 = nVar.i(str);
        if (i2.a() == o.Number) {
            return i2.c();
        }
        return d2;
    }

    public static final int a(n nVar, String str, int i2) {
        l.c(nVar, "");
        l.c(str, "");
        if (!nVar.a(str)) {
            return i2;
        }
        k i3 = nVar.i(str);
        if (i3.a() == o.Int) {
            return i3.d();
        }
        return i2;
    }

    public static final String a(n nVar, String str, String str2) {
        l.c(nVar, "");
        l.c(str, "");
        l.c(str2, "");
        if (!nVar.a(str)) {
            return str2;
        }
        k i2 = nVar.i(str);
        if (i2.a() == o.String) {
            return i2.e();
        }
        return str2;
    }

    public static final boolean a(n nVar, String str, boolean z) {
        l.c(nVar, "");
        l.c(str, "");
        if (!nVar.a(str)) {
            return z;
        }
        k i2 = nVar.i(str);
        if (i2.a() == o.Boolean) {
            return i2.b();
        }
        return z;
    }
}
