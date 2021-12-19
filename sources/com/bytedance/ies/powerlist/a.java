package com.bytedance.ies.powerlist;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public abstract class a<T> {

    /* renamed from: a */
    final t<b<T>> f34255a = new t<>();

    static {
        Covode.recordClassIndex(20466);
    }

    public final void a(List<? extends T> list, boolean z) {
        l.c(list, "");
        this.f34255a.postValue(new b<>(list, z));
    }
}
