package com.ss.android.ugc.aweme.ai;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private final int f66339a;

    static {
        Covode.recordClassIndex(40762);
    }

    public c(int i2) {
        this.f66339a = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager.b bVar = null;
        if (!(layoutManager instanceof GridLayoutManager)) {
            layoutManager = null;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof GridLayoutManager.b) {
                bVar = layoutParams;
            }
            GridLayoutManager.b bVar2 = bVar;
            if (bVar2 != null) {
                int i2 = gridLayoutManager.f3760b;
                if (1 == bVar2.f3769b) {
                    int i3 = bVar2.f3768a;
                    rect.left = (this.f66339a * i3) / i2;
                    int i4 = this.f66339a;
                    rect.right = i4 - (((i3 + 1) * i4) / i2);
                    rect.bottom = this.f66339a;
                }
            }
        }
    }
}
