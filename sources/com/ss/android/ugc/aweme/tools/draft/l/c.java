package com.ss.android.ugc.aweme.tools.draft.l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class c extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    int f139815a = -1;

    /* renamed from: b  reason: collision with root package name */
    int f139816b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f139817c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f139818d;

    /* renamed from: e  reason: collision with root package name */
    private int f139819e;

    /* renamed from: f  reason: collision with root package name */
    private int f139820f;

    /* renamed from: g  reason: collision with root package name */
    private int f139821g;

    /* renamed from: h  reason: collision with root package name */
    private float f139822h;

    /* renamed from: i  reason: collision with root package name */
    private float f139823i;

    static {
        Covode.recordClassIndex(91392);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2 = 0;
        if (this.f139821g == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                int top = childAt.getTop() + ((RecyclerView.j) childAt.getLayoutParams()).topMargin;
                int i3 = top - this.f139820f;
                if (this.f139817c) {
                    canvas.drawRect(this.f139822h + 0.0f, (float) i3, ((float) measuredWidth) - this.f139823i, (float) top, this.f139818d);
                } else {
                    float f2 = (float) i3;
                    float f3 = (float) top;
                    canvas.drawRect(0.0f, f2, this.f139822h, f3, this.f139818d);
                    float f4 = (float) measuredWidth;
                    canvas.drawRect(f4 - this.f139823i, f2, f4, f3, this.f139818d);
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
            int i4 = left - this.f139820f;
            if (this.f139817c) {
                canvas.drawRect((float) i4, this.f139822h + 0.0f, (float) left, ((float) measuredHeight) - this.f139823i, this.f139818d);
            } else {
                float f5 = (float) i4;
                float f6 = this.f139822h;
                float f7 = (float) left;
                canvas.drawRect(f5, f6 + 0.0f, f7, f6, this.f139818d);
                float f8 = (float) measuredHeight;
                canvas.drawRect(f5, f8 - this.f139823i, f7, f8, this.f139818d);
            }
            i2++;
        }
    }

    public c(int i2, int i3, float f2, float f3) {
        this.f139819e = i2;
        this.f139820f = i3;
        this.f139821g = 1;
        Paint paint = new Paint(1);
        this.f139818d = paint;
        paint.setColor(this.f139819e);
        this.f139818d.setStyle(Paint.Style.FILL);
        this.f139822h = f2;
        this.f139823i = f3;
        this.f139817c = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2;
        int i3;
        int d2 = RecyclerView.d(view);
        if (this.f139821g == 1) {
            if (d2 == this.f139815a) {
                i3 = this.f139816b;
            } else {
                i3 = this.f139820f;
            }
            rect.set(0, 0, 0, i3);
            return;
        }
        if (d2 == this.f139815a) {
            i2 = this.f139816b;
        } else {
            i2 = this.f139820f;
        }
        rect.set(0, 0, i2, 0);
    }
}
