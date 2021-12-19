package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class k extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public int f80675a;

    /* renamed from: b  reason: collision with root package name */
    private final int f80676b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f80677c;

    static {
        Covode.recordClassIndex(50179);
    }

    public k(int i2, boolean z) {
        this.f80676b = i2;
        this.f80677c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        if (((GridLayoutManager.b) layoutParams).f3768a % 2 == 0) {
            if (this.f80677c) {
                rect.left = this.f80676b;
            } else {
                rect.right = this.f80676b;
            }
        }
        rect.bottom = this.f80675a;
    }
}
