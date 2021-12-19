package com.ss.android.ugc.aweme.friends.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class d extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    int f96756a;

    /* renamed from: b  reason: collision with root package name */
    int f96757b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f96758c;

    /* renamed from: d  reason: collision with root package name */
    private int f96759d;

    /* renamed from: e  reason: collision with root package name */
    private int f96760e;

    /* renamed from: f  reason: collision with root package name */
    private int f96761f;

    /* renamed from: g  reason: collision with root package name */
    private float f96762g;

    /* renamed from: h  reason: collision with root package name */
    private float f96763h;

    static {
        Covode.recordClassIndex(61403);
    }

    public d(int i2, int i3, int i4) {
        this(i2, i3, i4, 0.0f, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2 = 0;
        if (this.f96761f == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            int itemCount = recyclerView.getAdapter().getItemCount();
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                int d2 = RecyclerView.d(childAt);
                if (d2 > 0 && d2 < itemCount - 1 && d2 != this.f96756a + 1) {
                    int top = childAt.getTop() + ((RecyclerView.j) childAt.getLayoutParams()).topMargin;
                    float f2 = (float) top;
                    float f3 = (float) (top + 1);
                    canvas.drawRect(0.0f, f2, this.f96762g + 0.0f, f3, this.f96758c);
                    float f4 = (float) measuredWidth;
                    canvas.drawRect(f4 - this.f96763h, f2, f4, f3, this.f96758c);
                }
                i2++;
            }
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount2 = recyclerView.getChildCount();
        while (i2 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i2);
            int d3 = RecyclerView.d(childAt2);
            if (d3 > 0 && d3 < childCount2 - 1 && d3 != this.f96756a + 1) {
                int left = childAt2.getLeft() + ((RecyclerView.j) childAt2.getLayoutParams()).leftMargin;
                float f5 = (float) (left - this.f96760e);
                canvas.drawRect(f5, 0.0f, f5, this.f96762g + 0.0f, this.f96758c);
                float f6 = (float) left;
                float f7 = (float) measuredHeight;
                canvas.drawRect(f6, f7 - this.f96763h, f6, f7, this.f96758c);
            }
            i2++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2;
        int i3;
        int d2 = RecyclerView.d(view);
        if (this.f96761f == 1) {
            if (d2 == this.f96756a) {
                i3 = this.f96757b;
            } else {
                i3 = this.f96760e;
            }
            rect.set(0, 0, 0, i3);
            return;
        }
        if (d2 == this.f96756a) {
            i2 = this.f96757b;
        } else {
            i2 = this.f96760e;
        }
        rect.set(0, 0, i2, 0);
    }

    public d(int i2, int i3, int i4, float f2, float f3) {
        this.f96756a = -1;
        this.f96759d = i2;
        this.f96760e = i3;
        this.f96761f = i4;
        Paint paint = new Paint(1);
        this.f96758c = paint;
        paint.setColor(this.f96759d);
        this.f96758c.setStyle(Paint.Style.FILL);
        this.f96762g = f2;
        this.f96763h = f3;
    }
}
