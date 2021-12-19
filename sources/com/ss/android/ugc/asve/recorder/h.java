package com.ss.android.ugc.asve.recorder;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<i> f62301a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final d f62302b;

    static {
        Covode.recordClassIndex(38283);
    }

    public h(d dVar) {
        l.d(dVar, "");
        this.f62302b = dVar;
    }

    @Override // com.ss.android.vesdk.r
    public final void onCallback(int i2, int i3, float f2, String str) {
        Iterator<T> it = this.f62301a.iterator();
        while (it.hasNext()) {
            it.next().onCallback(i2, i3, f2, str);
        }
    }
}
