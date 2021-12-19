package com.ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import java.util.Objects;

public final class i extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f73192a;

    /* renamed from: b  reason: collision with root package name */
    private final float f73193b = 5.5f;

    static {
        Covode.recordClassIndex(45087);
    }

    public i(Context context) {
        l.d(context, "");
        this.f73192a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        int d2 = ((StaggeredGridLayoutManager.b) layoutParams).d();
        int a2 = (int) r.a(this.f73192a, this.f73193b);
        if (d2 % 2 == 0) {
            rect.right = a2;
        } else {
            rect.left = a2;
        }
    }
}
