package com.ss.android.ugc.aweme.miniapp.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.google.gson.r;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import h.p;
import java.util.Arrays;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f109632a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(70159);
    }

    public static String a(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            r d2 = ((o) dg.a().a(str, o.class)).d("resso_label");
            l.b(d2, "");
            return d2.c();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static p<Long, Integer> b(String str) {
        o f2;
        o a2 = b.a();
        int i2 = 0;
        long j2 = Long.MAX_VALUE;
        if (a2 != null) {
            try {
                if (a2.b(str) && (f2 = a2.f(str)) != null) {
                    r d2 = f2.d("show_interval_in_millSeconds");
                    if (d2 != null) {
                        j2 = d2.f();
                    } else {
                        j2 = 0;
                    }
                    r d3 = f2.d("max_finish_count");
                    if (d3 != null) {
                        i2 = d3.g();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return new p<>(Long.valueOf(j2), Integer.valueOf(i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r10, java.lang.String r11) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r10, r0)
            h.f.b.l.d(r11, r0)
            com.google.gson.o r1 = com.ss.android.ugc.aweme.miniapp.a.b.a()
            r4 = 0
            r9 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L_0x0042
            boolean r0 = r1.b(r11)     // Catch:{ Exception -> 0x003e }
            if (r0 == 0) goto L_0x0042
            com.google.gson.o r1 = r1.f(r11)     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0042
            java.lang.String r0 = "show_interval_in_millSeconds"
            com.google.gson.r r0 = r1.d(r0)     // Catch:{ Exception -> 0x003e }
            if (r0 == 0) goto L_0x003b
            long r7 = r0.f()     // Catch:{ Exception -> 0x003e }
        L_0x002e:
            java.lang.String r0 = "max_finish_count"
            com.google.gson.r r0 = r1.d(r0)     // Catch:{ Exception -> 0x003e }
            if (r0 == 0) goto L_0x0042
            int r6 = r0.g()     // Catch:{ Exception -> 0x003e }
            goto L_0x0043
        L_0x003b:
            r7 = 0
            goto L_0x002e
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0042:
            r6 = 0
        L_0x0043:
            com.ss.android.ugc.aweme.miniapp.a.c r0 = a(r11, r10)
            if (r0 == 0) goto L_0x005a
            long r4 = r0.f109637b
            int r3 = r0.f109636a
        L_0x004d:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r4
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x005c
            if (r3 >= r6) goto L_0x005c
            r0 = 1
            return r0
        L_0x005a:
            r3 = 0
            goto L_0x004d
        L_0x005c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.a.a.a(android.content.Context, java.lang.String):boolean");
    }

    private static c a(String str, Context context) {
        boolean z;
        Object obj;
        long j2;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        String a2 = com.a.a("resso_exp_%s", Arrays.copyOf(new Object[]{g2.getCurUserId()}, 1));
        l.b(a2, "");
        try {
            Object a3 = com.bytedance.ies.xbridge.base.a.b.a(context).a(a2);
            if (!(a3 instanceof Map)) {
                a3 = null;
            }
            Map map = (Map) a3;
            if (map != null) {
                obj = map.get(str);
            } else {
                obj = null;
            }
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map2 = (Map) obj;
            if (map2 != null) {
                Object obj2 = map2.get("lifetime_finished_count");
                if (!(obj2 instanceof Double)) {
                    obj2 = null;
                }
                Double d2 = (Double) obj2;
                if (d2 != null) {
                    i2 = (int) d2.doubleValue();
                }
                Object obj3 = map2.get("last_finished_time");
                if (!(obj3 instanceof Double)) {
                    obj3 = null;
                }
                Double d3 = (Double) obj3;
                if (d3 != null) {
                    j2 = (long) d3.doubleValue();
                } else {
                    j2 = 0;
                }
                return new c(i2, j2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }
}
