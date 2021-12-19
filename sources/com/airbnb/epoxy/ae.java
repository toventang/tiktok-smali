package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ae extends RecyclerView.c {

    /* renamed from: a  reason: collision with root package name */
    boolean f5008a;

    static {
        Covode.recordClassIndex(2106);
    }

    ae() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void a() {
        if (!this.f5008a) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void a(int i2, int i3) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void b(int i2, int i3) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void c(int i2, int i3) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void a(int i2, int i3, int i4) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void a(int i2, int i3, Object obj) {
        a();
    }
}
