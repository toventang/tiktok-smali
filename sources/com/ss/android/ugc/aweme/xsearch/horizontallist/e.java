package com.ss.android.ugc.aweme.xsearch.horizontallist;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.xsearch.b;
import h.a.ag;
import h.f.b.l;
import h.p;

public final class e extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private final b f145174a;

    static {
        Covode.recordClassIndex(94930);
    }

    private /* synthetic */ e() {
        this(null);
    }

    public e(b bVar) {
        this.f145174a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        l.d(recyclerView, "");
        super.a(recyclerView, i2, i3);
        b bVar = this.f145174a;
        if (bVar != null) {
            b.a(bVar, "scroll", ag.a(new p("scrollLeft", Integer.valueOf(i2))));
        }
    }
}
