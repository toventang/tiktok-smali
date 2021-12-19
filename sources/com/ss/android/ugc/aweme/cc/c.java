package com.ss.android.ugc.aweme.cc;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cc.b.a;
import com.ss.android.ugc.aweme.experiment.fc;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f69799a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Long> f69800b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static a f69801c = new a();

    private c() {
    }

    static {
        Covode.recordClassIndex(43032);
    }

    public static final void a(String str) {
        l.d(str, "");
        if (fc.f90024a && !TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, Long> concurrentHashMap = f69800b;
            if (concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
            }
            concurrentHashMap.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static /* synthetic */ void a(String str, b bVar, int i2) {
        if ((i2 & 2) != 0) {
            bVar = b.SUCCESS;
        }
        a(str, bVar, (String) null);
    }

    public static final void a(String str, b bVar, String str2) {
        Map map;
        l.d(str, "");
        l.d(bVar, "");
        if (fc.f90024a && !TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, Long> concurrentHashMap = f69800b;
            if (concurrentHashMap.containsKey(str)) {
                long j2 = 0;
                if (bVar == b.SUCCESS) {
                    Long l2 = concurrentHashMap.get(str);
                    if (l2 != null && l2.longValue() > 0) {
                        j2 = System.currentTimeMillis() - l2.longValue();
                    } else {
                        return;
                    }
                }
                if (str2 != null) {
                    map = ag.a(v.a("from_scene", str2));
                } else {
                    map = null;
                }
                a(str, bVar, j2, map);
                concurrentHashMap.remove(str);
            }
        }
    }

    private static void a(String str, b bVar, long j2, Map<String, ? extends Object> map) {
        a aVar = f69801c;
        if (aVar != null) {
            aVar.a(str, bVar, j2, map);
        }
    }
}
