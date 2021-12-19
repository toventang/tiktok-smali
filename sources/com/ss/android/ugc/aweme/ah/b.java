package com.ss.android.ugc.aweme.ah;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.a.a;
import com.ss.android.ugc.aweme.shortvideo.edit.s;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f66310a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(40739);
    }

    public static final void a(HashMap<String, Integer> hashMap, Set<String> set) {
        l.d(hashMap, "");
        l.d(set, "");
        Iterator<Map.Entry<String, Integer>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> next = it.next();
            l.b(next, "");
            Map.Entry<String, Integer> entry = next;
            if (set.contains(entry.getKey()) && (!l.a((Object) entry.getKey(), (Object) "music") || !a.a() || !s.b())) {
                it.remove();
            }
        }
    }
}
