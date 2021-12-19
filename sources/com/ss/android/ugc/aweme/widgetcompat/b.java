package com.ss.android.ugc.aweme.widgetcompat;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class b extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private int f145068a;

    /* renamed from: b  reason: collision with root package name */
    private int f145069b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f145070c = false;

    static {
        Covode.recordClassIndex(94861);
    }

    public b(int i2, int i3) {
        this.f145068a = i2;
        this.f145069b = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int d2 = RecyclerView.d(view);
        recyclerView.getAdapter();
        int i2 = this.f145068a;
        int i3 = d2 % i2;
        if (this.f145070c) {
            int i4 = this.f145069b;
            rect.left = i4 - ((i3 * i4) / i2);
            rect.right = ((i3 + 1) * this.f145069b) / this.f145068a;
            if (d2 < this.f145068a) {
                rect.top = this.f145069b;
            }
            rect.bottom = this.f145069b;
            return;
        }
        rect.left = (this.f145069b * i3) / i2;
        int i5 = this.f145069b;
        rect.right = i5 - (((i3 + 1) * i5) / this.f145068a);
        if (d2 >= this.f145068a) {
            rect.top = this.f145069b;
        }
    }
}
