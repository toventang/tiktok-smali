package com.ss.android.ugc.aweme.tools.draft.viewholder;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class i extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private LinearLayoutManager f139932a;

    static {
        Covode.recordClassIndex(91442);
    }

    public abstract void a();

    public abstract boolean b();

    public abstract boolean c();

    public i(LinearLayoutManager linearLayoutManager) {
        l.d(linearLayoutManager, "");
        this.f139932a = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        l.d(recyclerView, "");
        super.a(recyclerView, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        l.d(recyclerView, "");
        super.a(recyclerView, i2, i3);
        int s = this.f139932a.s();
        int A = this.f139932a.A();
        int k2 = this.f139932a.k();
        if (!c() && !b() && s + k2 >= A && k2 >= 0) {
            a();
        }
    }
}
