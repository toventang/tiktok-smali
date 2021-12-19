package com.airbnb.lottie.e.a;

import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class n<V, O> implements m<V, O> {

    /* renamed from: a  reason: collision with root package name */
    final List<a<V>> f5362a;

    static {
        Covode.recordClassIndex(2256);
    }

    public List<a<V>> b() {
        return this.f5362a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f5362a.isEmpty()) {
            sb.append("values=").append(Arrays.toString(this.f5362a.toArray()));
        }
        return sb.toString();
    }

    n(List<a<V>> list) {
        this.f5362a = list;
    }

    n(V v) {
        this(Collections.singletonList(new a(v)));
    }
}
