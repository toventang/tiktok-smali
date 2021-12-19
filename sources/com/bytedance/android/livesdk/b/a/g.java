package com.bytedance.android.livesdk.b.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class g {

    /* renamed from: d  reason: collision with root package name */
    private static final String f14195d = g.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Long, String> f14196a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, String> f14197b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Map<Long, Long> f14198c = new HashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static g f14199a = new g();

        static {
            Covode.recordClassIndex(7864);
        }
    }

    static {
        Covode.recordClassIndex(7863);
    }

    public final void a() {
        this.f14196a.clear();
        this.f14197b.clear();
        this.f14198c.clear();
    }

    public final String a(long j2) {
        return this.f14196a.get(Long.valueOf(j2));
    }

    public final long a(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        for (Long l2 : this.f14196a.keySet()) {
            long longValue = l2.longValue();
            if (TextUtils.equals(str, this.f14196a.get(Long.valueOf(longValue)))) {
                return longValue;
            }
        }
        return 0;
    }

    public final void b(long j2) {
        if (this.f14198c.containsValue(Long.valueOf(j2))) {
            for (Map.Entry<Long, Long> entry : this.f14198c.entrySet()) {
                if (entry.getValue().equals(Long.valueOf(j2))) {
                    this.f14198c.remove(entry.getKey());
                    return;
                }
            }
        }
    }

    public final long c(long j2) {
        if (j2 <= 0) {
            return -1;
        }
        for (Map.Entry<Long, Long> entry : this.f14198c.entrySet()) {
            if (entry.getValue().equals(Long.valueOf(j2))) {
                return entry.getKey().longValue();
            }
        }
        return -1;
    }

    public final int b(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        if (str.equals(d.a().f14184e)) {
            return 0;
        }
        for (Map.Entry<Integer, String> entry : this.f14197b.entrySet()) {
            if (entry.getValue().equals(str)) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    public final void a(int i2, String str) {
        if (!TextUtils.isEmpty(str)) {
            int i3 = 1;
            if (i2 == 0) {
                i2 = 1;
            }
            if (this.f14197b.containsKey(Integer.valueOf(i2))) {
                while (this.f14197b.containsKey(Integer.valueOf(i3))) {
                    i3++;
                    if (i3 > 3) {
                        return;
                    }
                }
                this.f14197b.put(Integer.valueOf(i3), str);
                return;
            }
            this.f14197b.put(Integer.valueOf(i2), str);
        }
    }

    public final void a(long j2, String str) {
        com.bytedance.android.live.core.c.a.a(3, f14195d, "saveInteractId -> interactIdStr = ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            this.f14196a.put(Long.valueOf(j2), str);
        }
    }
}
