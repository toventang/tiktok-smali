package com.bytedance.lottie.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class n<V, O> implements m<V, O> {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<V>> f40486a;

    static {
        Covode.recordClassIndex(24887);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f40486a.isEmpty()) {
            sb.append("values=").append(Arrays.toString(this.f40486a.toArray()));
        }
        return sb.toString();
    }

    n(List<a<V>> list) {
        this.f40486a = list;
    }

    n(V v) {
        this(Collections.singletonList(new a(v)));
    }
}
