package com.ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class e<V> extends FutureTask<V> implements Comparable<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Comparable<?> f149994a;

    static {
        Covode.recordClassIndex(98742);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l.d(obj, "");
        if (obj instanceof e) {
            obj = ((e) obj).f149994a;
        }
        Comparable<?> comparable = this.f149994a;
        if (comparable == null || obj == null) {
            return 0;
        }
        Objects.requireNonNull(comparable, "null cannot be cast to non-null type kotlin.Comparable<kotlin.Any>");
        return comparable.compareTo(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Callable<V> callable, Comparable<?> comparable) {
        super(callable);
        l.d(callable, "");
        this.f149994a = comparable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Runnable runnable, V v, Comparable<?> comparable) {
        super(runnable, v);
        l.d(runnable, "");
        this.f149994a = comparable;
    }
}
