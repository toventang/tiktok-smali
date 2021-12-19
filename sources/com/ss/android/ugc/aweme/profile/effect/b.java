package com.ss.android.ugc.aweme.profile.effect;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;
import java.util.Objects;

public final class b extends RecyclerView.h {
    static {
        Covode.recordClassIndex(75074);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        if (((GridLayoutManager.b) layoutParams).f3768a % 2 != 0) {
            if (!gb.a(view.getContext())) {
                rect.left = n.a(0.5d);
            }
            rect.right = n.a(0.5d);
        } else {
            if (gb.a(view.getContext())) {
                rect.left = n.a(0.5d);
            }
            rect.right = n.a(0.5d);
        }
        rect.bottom = n.a(1.0d);
    }
}
