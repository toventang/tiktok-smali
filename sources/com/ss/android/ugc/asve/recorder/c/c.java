package com.ss.android.ugc.asve.recorder.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;
import h.f.a.b;
import h.f.b.l;

final class c implements VEListener.j {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ b f62168a;

    static {
        Covode.recordClassIndex(38211);
    }

    c(b bVar) {
        this.f62168a = bVar;
    }

    @Override // com.ss.android.vesdk.VEListener.j
    public final /* synthetic */ void a(int i2) {
        l.b(this.f62168a.invoke(Integer.valueOf(i2)), "");
    }
}
