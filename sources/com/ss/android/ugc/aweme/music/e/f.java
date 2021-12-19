package com.ss.android.ugc.aweme.music.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, a> f111429a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, a> f111430b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(71589);
    }

    public final void a() {
        for (Map.Entry<String, a> entry : this.f111429a.entrySet()) {
            entry.getKey();
            entry.getValue().a();
        }
        for (Map.Entry<String, a> entry2 : this.f111430b.entrySet()) {
            entry2.getKey();
            entry2.getValue().a();
        }
        this.f111429a.clear();
        this.f111430b.clear();
    }

    public final void a(String str, a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        if (aVar instanceof g) {
            this.f111429a.put(str, aVar);
        } else {
            this.f111430b.put(str, aVar);
        }
    }

    public final void b(String str, a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        if (aVar instanceof g) {
            this.f111429a.remove(str);
        } else {
            this.f111430b.remove(str);
        }
    }
}
