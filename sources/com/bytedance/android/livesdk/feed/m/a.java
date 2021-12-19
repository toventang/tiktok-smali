package com.bytedance.android.livesdk.feed.m;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;

public final class a extends RecyclerView.h {
    static {
        Covode.recordClassIndex(9740);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2;
        if (view.getVisibility() == 0) {
            i2 = y.a(3.0f);
        } else {
            i2 = 0;
        }
        RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
        if ((jVar instanceof StaggeredGridLayoutManager.b) && ((StaggeredGridLayoutManager.b) jVar).f3934b) {
            i2 = y.a(3.0f);
        }
        int a2 = y.a(1.5f);
        rect.set(a2, i2, a2, 0);
    }
}
