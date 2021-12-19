package com.ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ac;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private int f71005a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final ac f71006b;

    /* renamed from: c  reason: collision with root package name */
    private final d f71007c;

    static {
        Covode.recordClassIndex(43719);
    }

    public i(ac acVar, d dVar) {
        l.d(acVar, "");
        l.d(dVar, "");
        this.f71006b = acVar;
        this.f71007c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        int i3;
        l.d(recyclerView, "");
        super.a(recyclerView, i2);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        View a2 = this.f71006b.a(layoutManager);
        if (a2 == null || layoutManager == null) {
            i3 = 0;
        } else {
            i3 = RecyclerView.i.e(a2);
        }
        this.f71007c.a(recyclerView, i2);
        if (i2 == 0 && this.f71005a != i3) {
            this.f71005a = i3;
            this.f71007c.a(i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        l.d(recyclerView, "");
        super.a(recyclerView, i2, i3);
        this.f71007c.a(recyclerView, this.f71005a, i2);
    }
}
