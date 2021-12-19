package com.bytedance.ies.abmock.datacenter.c;

import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.f;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.r;
import java.util.Iterator;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31813a;

    /* renamed from: b  reason: collision with root package name */
    public static o f31814b;

    static {
        Covode.recordClassIndex(18601);
    }

    /* renamed from: com.bytedance.ies.abmock.datacenter.c.c$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31815a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.abmock.datacenter.c.c.AnonymousClass1.<clinit>():void");
        }
    }

    public static void a(o oVar) {
        o a2 = oVar.i();
        Iterator<String> it = a2.f54898a.keySet().iterator();
        Map<String, ConfigItem> map = f.f31846a;
        while (it.hasNext()) {
            String next = it.next();
            if (map != null && map.containsKey(next)) {
                it.remove();
            }
        }
        e.f31819a.a(a2);
    }

    public static void c(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                a.f31807a.b(str, c2.c());
            } else if (oVar.b(str)) {
                a.f31807a.b(str, (String) null);
            } else {
                a.f31807a.c(str);
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    public static void d(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                a.f31807a.b(str, c2.f());
            } else {
                a.f31807a.c(str);
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    public static void e(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                a.f31807a.b(str, c2.d());
            } else {
                a.f31807a.c(str);
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    public static void f(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                a.f31807a.b(str, c2.e());
            } else {
                a.f31807a.c(str);
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    public static void h(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                a.f31807a.b(str, c2.toString());
            } else if (oVar.b(str)) {
                a.f31807a.b(str, (String) null);
            } else {
                a.f31807a.c(str);
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    public static void a(o oVar, String str) {
        int i2;
        try {
            r d2 = oVar.d(str);
            if (d2 == null) {
                a.f31807a.c(str);
            } else if (d2.f54900a instanceof Boolean) {
                a aVar = a.f31807a;
                if (d2.h()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                aVar.b(str, i2);
            } else {
                a.f31807a.b(str, d2.g());
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    public static void b(o oVar, String str) {
        boolean z;
        try {
            r d2 = oVar.d(str);
            if (d2 == null) {
                a.f31807a.c(str);
            } else if (d2.f54900a instanceof Number) {
                a aVar = a.f31807a;
                if (d2.g() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.b(str, z);
            } else {
                a.f31807a.b(str, d2.h());
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }

    public static void g(o oVar, String str) {
        try {
            l c2 = oVar.c(str);
            if (c2 != null) {
                a.f31807a.a(str, (String[]) a.f31807a.a().a(c2, String[].class));
            } else if (oVar.b(str)) {
                a.f31807a.a(str, (String[]) null);
            } else {
                a.f31807a.c(str);
            }
        } catch (Throwable th) {
            b.a(th + "  , key: " + str);
        }
    }
}
