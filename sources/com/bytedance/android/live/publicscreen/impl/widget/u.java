package com.bytedance.android.live.publicscreen.impl.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class u extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private int f12590a;

    /* renamed from: b  reason: collision with root package name */
    private int f12591b = 1;

    static {
        Covode.recordClassIndex(6931);
    }

    public u(int i2) {
        this.f12590a = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int d2 = RecyclerView.d(view);
        int i2 = this.f12591b;
        if (i2 == 0) {
            if (d2 != 0) {
                rect.left = this.f12590a;
            }
        } else if (1 == i2) {
            rect.top = this.f12590a;
        }
    }
}
