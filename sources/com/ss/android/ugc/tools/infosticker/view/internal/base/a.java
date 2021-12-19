package com.ss.android.ugc.tools.infosticker.view.internal.base;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private final float f149548a;

    static {
        Covode.recordClassIndex(98471);
    }

    public a(float f2) {
        this.f149548a = f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        rect.left = (int) Math.max(0.0f, this.f149548a);
        rect.right = (int) Math.max(0.0f, this.f149548a);
    }
}
