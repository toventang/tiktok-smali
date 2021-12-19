package com.ss.android.ugc.aweme.discover.alading;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends RecyclerView.c {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView.a<?> f80748a;

    static {
        Covode.recordClassIndex(50215);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void a() {
        super.a();
        this.f80748a.notifyDataSetChanged();
    }

    public c(RecyclerView.a<?> aVar) {
        l.d(aVar, "");
        this.f80748a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void b(int i2, int i3) {
        super.b(i2, i3);
        this.f80748a.notifyItemRangeInserted(i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void c(int i2, int i3) {
        super.c(i2, i3);
        this.f80748a.notifyItemRangeRemoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void a(int i2, int i3) {
        super.a(i2, i3);
        this.f80748a.notifyItemRangeChanged(i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void a(int i2, int i3, int i4) {
        super.a(i2, i3, i4);
        this.f80748a.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void a(int i2, int i3, Object obj) {
        super.a(i2, i3, obj);
        this.f80748a.notifyItemRangeChanged(i2, i3, obj);
    }
}
