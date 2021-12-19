package com.ss.android.ugc.aweme.kids.a.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, b> f105274a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, b> f105275b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(67487);
    }

    public final void a(String str, b bVar) {
        l.d(str, "");
        l.d(bVar, "");
        if (bVar instanceof g) {
            this.f105274a.put(str, bVar);
        } else {
            this.f105275b.put(str, bVar);
        }
    }

    public final void b(String str, b bVar) {
        l.d(str, "");
        l.d(bVar, "");
        if (bVar instanceof g) {
            this.f105274a.remove(str);
        } else {
            this.f105275b.remove(str);
        }
    }
}
