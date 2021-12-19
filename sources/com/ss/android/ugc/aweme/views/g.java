package com.ss.android.ugc.aweme.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class g extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    int f144612a;

    /* renamed from: b  reason: collision with root package name */
    int f144613b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f144614c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f144615d;

    /* renamed from: e  reason: collision with root package name */
    private int f144616e;

    /* renamed from: f  reason: collision with root package name */
    private int f144617f;

    /* renamed from: g  reason: collision with root package name */
    private int f144618g;

    /* renamed from: h  reason: collision with root package name */
    private float f144619h;

    /* renamed from: i  reason: collision with root package name */
    private float f144620i;

    static {
        Covode.recordClassIndex(94627);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2 = 0;
        if (this.f144618g == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                int top = childAt.getTop() + ((RecyclerView.j) childAt.getLayoutParams()).topMargin;
                int i3 = top - this.f144617f;
                if (this.f144614c) {
                    canvas.drawRect(this.f144619h + 0.0f, (float) i3, ((float) measuredWidth) - this.f144620i, (float) top, this.f144615d);
                } else {
                    float f2 = (float) i3;
                    float f3 = (float) top;
                    canvas.drawRect(0.0f, f2, this.f144619h, f3, this.f144615d);
                    float f4 = (float) measuredWidth;
                    canvas.drawRect(f4 - this.f144620i, f2, f4, f3, this.f144615d);
                }
                i2++;
            }
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount2 = recyclerView.getChildCount();
        while (i2 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i2);
            int left = childAt2.getLeft() + ((RecyclerView.j) childAt2.getLayoutParams()).leftMargin;
            int i4 = left - this.f144617f;
            if (this.f144614c) {
                canvas.drawRect((float) i4, this.f144619h + 0.0f, (float) left, ((float) measuredHeight) - this.f144620i, this.f144615d);
            } else {
                float f5 = (float) i4;
                float f6 = this.f144619h;
                float f7 = (float) left;
                canvas.drawRect(f5, f6 + 0.0f, f7, f6, this.f144615d);
                float f8 = (float) measuredHeight;
                canvas.drawRect(f5, f8 - this.f144620i, f7, f8, this.f144615d);
            }
            i2++;
        }
    }

    public g(int i2, int i3, float f2, float f3) {
        this(i2, i3, 1, f2, f3, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2;
        int i3;
        int d2 = RecyclerView.d(view);
        if (this.f144618g == 1) {
            if (d2 == this.f144612a) {
                i3 = this.f144613b;
            } else {
                i3 = this.f144617f;
            }
            rect.set(0, 0, 0, i3);
            return;
        }
        if (d2 == this.f144612a) {
            i2 = this.f144613b;
        } else {
            i2 = this.f144617f;
        }
        rect.set(0, 0, i2, 0);
    }

    public g(int i2, int i3, int i4, float f2, float f3, boolean z) {
        this.f144612a = -1;
        this.f144616e = i2;
        this.f144617f = i3;
        this.f144618g = i4;
        Paint paint = new Paint(1);
        this.f144615d = paint;
        paint.setColor(this.f144616e);
        this.f144615d.setStyle(Paint.Style.FILL);
        this.f144619h = f2;
        this.f144620i = f3;
        this.f144614c = z;
    }
}
