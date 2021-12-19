package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.l;

public final class en {

    /* renamed from: a  reason: collision with root package name */
    public static final fb f118498a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final en f118499b = new en();

    private en() {
    }

    static {
        Covode.recordClassIndex(76968);
    }

    private static fb c() {
        return (fb) b.a().a(true, "tool_ve_setting_configs", fb.class, f118498a);
    }

    public static String b() {
        fb c2 = c();
        if (c2 == null) {
            return cc.a();
        }
        fe[] a2 = fd.a();
        int i2 = 0;
        if (a2 != null && a2.length != 0 && true && a2 != null) {
            int length = a2.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                fe feVar = a2[i2];
                if (l.a((Object) feVar.f118540a, (Object) c2.f118536b)) {
                    String str = feVar.f118541b;
                    if (str != null) {
                        return str;
                    }
                } else {
                    i2++;
                }
            }
        }
        return cc.a();
    }

    public static String a() {
        fb c2 = c();
        if (c2 == null) {
            String a2 = fc.a();
            l.b(a2, "");
            return a2;
        }
        fe[] a3 = fd.a();
        int i2 = 0;
        if (a3 != null && a3.length != 0 && true && a3 != null) {
            int length = a3.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                fe feVar = a3[i2];
                if (l.a((Object) feVar.f118540a, (Object) c2.f118535a)) {
                    String str = feVar.f118541b;
                    if (str != null) {
                        return str;
                    }
                } else {
                    i2++;
                }
            }
        }
        String a4 = fc.a();
        l.b(a4, "");
        return a4;
    }
}
