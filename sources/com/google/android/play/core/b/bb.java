package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class bb {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<ba, List<Throwable>> f53126a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f53127b = new ReferenceQueue<>();

    static {
        Covode.recordClassIndex(32810);
    }

    bb() {
    }

    public final List<Throwable> a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f53127b.poll();
            if (poll == null) {
                break;
            }
            this.f53126a.remove(poll);
        }
        List<Throwable> list = this.f53126a.get(new ba(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f53126a.putIfAbsent(new ba(th, this.f53127b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
