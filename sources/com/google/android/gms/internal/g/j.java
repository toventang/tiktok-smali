package com.google.android.gms.internal.g;

import com.bytedance.covode.number.Covode;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<m, List<Throwable>> f50610a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f50611b = new ReferenceQueue<>();

    static {
        Covode.recordClassIndex(31586);
    }

    j() {
    }

    public final List<Throwable> a(Throwable th) {
        Reference<? extends Throwable> poll = this.f50611b.poll();
        while (poll != null) {
            this.f50610a.remove(poll);
            poll = this.f50611b.poll();
        }
        List<Throwable> list = this.f50610a.get(new m(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f50610a.putIfAbsent(new m(th, this.f50611b), vector);
        if (putIfAbsent == null) {
            return vector;
        }
        return putIfAbsent;
    }
}
