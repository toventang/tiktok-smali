package com.ss.android.ugc.aweme.contentlanguage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import h.f.b.l;
import java.util.Objects;

public final class m extends RecyclerView.h {
    static {
        Covode.recordClassIndex(48498);
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
            rect.left = n.a(4.0d);
        } else {
            rect.right = n.a(4.0d);
        }
        rect.bottom = n.a(8.0d);
    }
}
