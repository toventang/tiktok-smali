package com.ss.android.ugc.aweme.emoji.f;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class c extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private final int f89321a;

    /* renamed from: b  reason: collision with root package name */
    private final int f89322b;

    static {
        Covode.recordClassIndex(56123);
    }

    public c(int i2, int i3) {
        this.f89321a = i2;
        this.f89322b = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int layoutPosition = ((RecyclerView.j) layoutParams).f3847c.getLayoutPosition();
        int i2 = this.f89321a;
        int i3 = layoutPosition % i2;
        rect.left = (this.f89322b * i3) / i2;
        int i4 = this.f89322b;
        rect.right = i4 - (((i3 + 1) * i4) / this.f89321a);
    }
}
