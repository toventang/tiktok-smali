package com.zhihu.matisse.internal.ui.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class c extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private int f156523a;

    /* renamed from: b  reason: collision with root package name */
    private int f156524b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f156525c = false;

    static {
        Covode.recordClassIndex(103927);
    }

    public c(int i2, int i3) {
        this.f156523a = i2;
        this.f156524b = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int d2 = RecyclerView.d(view);
        int i2 = this.f156523a;
        int i3 = d2 % i2;
        if (this.f156525c) {
            int i4 = this.f156524b;
            rect.left = i4 - ((i3 * i4) / i2);
            rect.right = ((i3 + 1) * this.f156524b) / this.f156523a;
            if (d2 < this.f156523a) {
                rect.top = this.f156524b;
            }
            rect.bottom = this.f156524b;
            return;
        }
        rect.left = (this.f156524b * i3) / i2;
        int i5 = this.f156524b;
        rect.right = i5 - (((i3 + 1) * i5) / this.f156523a);
        if (d2 >= this.f156523a) {
            rect.top = this.f156524b;
        }
    }
}
