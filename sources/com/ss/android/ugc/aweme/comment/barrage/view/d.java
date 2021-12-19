package com.ss.android.ugc.aweme.comment.barrage.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public final int f71737a;

    /* renamed from: b  reason: collision with root package name */
    public final int f71738b;

    static {
        Covode.recordClassIndex(44119);
    }

    public d(int i2, int i3) {
        this.f71737a = i2;
        this.f71738b = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        if (RecyclerView.e(view) >= this.f71737a) {
            rect.top = this.f71738b;
        }
    }
}
