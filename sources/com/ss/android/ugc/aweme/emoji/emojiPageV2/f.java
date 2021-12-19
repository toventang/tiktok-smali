package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class f extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public final int f89179a;

    /* renamed from: b  reason: collision with root package name */
    public final int f89180b;

    static {
        Covode.recordClassIndex(56070);
    }

    public f(int i2, int i3) {
        this.f89179a = i2;
        this.f89180b = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        int d2 = ((StaggeredGridLayoutManager.b) layoutParams).d() % 3;
        if (d2 == 0) {
            rect.left = 0;
        } else if (d2 == 1 || d2 == 2) {
            rect.left = this.f89180b;
        }
        rect.bottom = this.f89180b;
    }
}
