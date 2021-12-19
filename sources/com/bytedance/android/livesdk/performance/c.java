package com.bytedance.android.livesdk.performance;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    public final h.c f20207a;

    static {
        Covode.recordClassIndex(11925);
    }

    public c(h.c cVar) {
        this.f20207a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        l.d(recyclerView, "");
        super.a(recyclerView, i2);
        if (i2 != 0) {
            h.c cVar = this.f20207a;
            if (cVar != null) {
                cVar.a();
                return;
            }
            return;
        }
        h.c cVar2 = this.f20207a;
        if (cVar2 != null) {
            cVar2.b();
        }
    }
}
