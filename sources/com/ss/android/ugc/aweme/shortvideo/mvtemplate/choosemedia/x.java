package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class x implements u {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter f129193a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView f129194b;

    static {
        Covode.recordClassIndex(84811);
    }

    @Override // androidx.recyclerview.widget.u
    public final void b(int i2, int i3) {
        this.f129193a.notifyItemRangeRemoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.u
    public final void c(int i2, int i3) {
        this.f129193a.notifyItemMoved(i2, i3);
    }

    public x(MvImageChooseAdapter mvImageChooseAdapter, RecyclerView recyclerView) {
        l.d(mvImageChooseAdapter, "");
        l.d(recyclerView, "");
        this.f129193a = mvImageChooseAdapter;
        this.f129194b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3) {
        this.f129193a.notifyItemRangeInserted(i2, i3);
        if (i2 == 0) {
            this.f129194b.b(0);
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3, Object obj) {
        this.f129193a.notifyDataSetChanged();
    }
}
