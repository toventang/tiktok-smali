package com.ss.android.ugc.aweme.challenge.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class v extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private final int f70224a;

    static {
        Covode.recordClassIndex(43314);
    }

    private v(int i2) {
        this.f70224a = i2;
    }

    public v(int i2, byte b2) {
        this(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        GridLayoutManager.c cVar;
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            layoutManager = null;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager != null && (cVar = gridLayoutManager.f3765g) != null) {
            int d2 = RecyclerView.d(view);
            int i2 = gridLayoutManager.f3760b;
            if (cVar.a(d2) == 1) {
                int a2 = cVar.a(d2, i2);
                rect.left = (this.f70224a * a2) / i2;
                int i3 = this.f70224a;
                rect.right = i3 - (((a2 + 1) * i3) / i2);
                if (cVar.d(d2, i2) > 0) {
                    rect.top = this.f70224a;
                }
            }
        }
    }
}
