package com.ss.android.ugc.aweme.shortvideo.upload.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.Comparable;

public final class a<T extends Comparable<? super T>> {

    /* renamed from: a  reason: collision with root package name */
    public T f132094a;

    static {
        Covode.recordClassIndex(86527);
    }

    public a(T t) {
        l.d(t, "");
        this.f132094a = t;
    }

    public final void a(T t) {
        l.d(t, "");
        if (t.compareTo(this.f132094a) > 0) {
            this.f132094a = t;
        }
    }
}
