package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class er {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<eq, List<Throwable>> f50825a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f50826b = new ReferenceQueue<>();

    static {
        Covode.recordClassIndex(31766);
    }

    er() {
    }

    public final List<Throwable> a(Throwable th) {
        Reference<? extends Throwable> poll = this.f50826b.poll();
        while (poll != null) {
            this.f50825a.remove(poll);
            poll = this.f50826b.poll();
        }
        List<Throwable> list = this.f50825a.get(new eq(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f50825a.putIfAbsent(new eq(th, this.f50826b), vector);
        if (putIfAbsent == null) {
            return vector;
        }
        return putIfAbsent;
    }
}
