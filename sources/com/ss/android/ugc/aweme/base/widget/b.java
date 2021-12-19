package com.ss.android.ugc.aweme.base.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.widget.b.a;

public class b extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private int f68474a;

    /* renamed from: b  reason: collision with root package name */
    private int f68475b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f68476c = false;

    static {
        Covode.recordClassIndex(42161);
    }

    public b(int i2, int i3) {
        this.f68474a = i2;
        this.f68475b = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int d2 = RecyclerView.d(view);
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter instanceof g) {
            if (((g) adapter).b() != null) {
                if (d2 != 0) {
                    d2++;
                } else {
                    return;
                }
            }
        } else if (adapter instanceof a) {
            int b2 = ((a) adapter).f132896a.b();
            if (d2 >= b2) {
                d2 += b2;
            } else {
                return;
            }
        }
        int i2 = this.f68474a;
        int i3 = d2 % i2;
        if (this.f68476c) {
            int i4 = this.f68475b;
            rect.left = i4 - ((i3 * i4) / i2);
            rect.right = ((i3 + 1) * this.f68475b) / this.f68474a;
            if (d2 < this.f68474a) {
                rect.top = this.f68475b;
            }
            rect.bottom = this.f68475b;
            return;
        }
        rect.left = (this.f68475b * i3) / i2;
        int i5 = this.f68475b;
        rect.right = i5 - (((i3 + 1) * i5) / this.f68474a);
        if (d2 >= this.f68474a) {
            rect.top = this.f68475b;
        }
    }
}
