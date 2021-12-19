package com.bytedance.ies.ugc.network.partner.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f35249a;

    /* renamed from: b  reason: collision with root package name */
    public long f35250b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, Long> f35251c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, Long> f35252d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, Long> f35253e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, Long> f35254f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<String, Long> f35255g = new HashMap<>();

    static {
        Covode.recordClassIndex(21117);
    }

    public static long a(long j2, Long l2) {
        if (l2 == null) {
            return j2;
        }
        l2.longValue();
        return j2 + l2.longValue();
    }

    public final void a(String str, long j2) {
        l.d(str, "");
        HashMap<String, Long> hashMap = this.f35254f;
        hashMap.put(str, Long.valueOf(a(j2, hashMap.get(str))));
    }

    public static HashMap<String, Long> a(HashMap<String, Long> hashMap, HashMap<String, Long> hashMap2) {
        l.d(hashMap, "");
        for (Map.Entry<String, Long> entry : hashMap2.entrySet()) {
            hashMap.put(entry.getKey(), Long.valueOf(a(entry.getValue().longValue(), hashMap.get(entry.getKey()))));
        }
        return hashMap;
    }
}
