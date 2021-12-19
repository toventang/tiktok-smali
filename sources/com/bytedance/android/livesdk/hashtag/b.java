package com.bytedance.android.livesdk.hashtag;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class b extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private boolean f18125a;

    /* renamed from: b  reason: collision with root package name */
    private final a<z> f18126b;

    static {
        Covode.recordClassIndex(10063);
    }

    public b(a<z> aVar) {
        l.d(aVar, "");
        this.f18126b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        l.d(recyclerView, "");
        super.a(recyclerView, i2);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (i2 == 0 && this.f18125a && linearLayoutManager.n() == linearLayoutManager.A() - 1) {
            this.f18126b.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        boolean z;
        l.d(recyclerView, "");
        super.a(recyclerView, i2, i3);
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f18125a = z;
    }
}
