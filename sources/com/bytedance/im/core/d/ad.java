package com.bytedance.im.core.d;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.a.d;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.internal.utils.j;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, aq> f37690a = new LruCache<>(30);

    static {
        Covode.recordClassIndex(22657);
    }

    public static aq a(String str) {
        aq aqVar = f37690a.get(str);
        if (aqVar == null) {
            try {
                String a2 = d.a(str, "repaired_range_list");
                if (!TextUtils.isEmpty(a2)) {
                    aqVar = (aq) h.f38770a.a(a2, aq.class);
                    if (aqVar == null) {
                    }
                    f37690a.put(str, aqVar);
                }
            } catch (Exception e2) {
                j.b("CheckRangeListStore get rangeList failed", e2);
            }
            aqVar = new aq();
            f37690a.put(str, aqVar);
        }
        return aqVar;
    }

    public static void a(final String str, final aq aqVar) {
        if (aqVar != null) {
            f37690a.put(str, aqVar);
            com.bytedance.im.core.internal.e.d.a(new c<Boolean>() {
                /* class com.bytedance.im.core.d.ad.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22658);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public Boolean a() {
                    try {
                        return Boolean.valueOf(d.a(str, "repaired_range_list", h.f38770a.b(aqVar.copy())));
                    } catch (Exception e2) {
                        j.b("CheckRangeListStore update rangeList failed", e2);
                        return false;
                    }
                }
            }, null, a.a());
        }
    }
}
