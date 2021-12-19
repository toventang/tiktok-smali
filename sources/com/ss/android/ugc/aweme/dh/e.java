package com.ss.android.ugc.aweme.dh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;

public final class e extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public float f80114a;

    /* renamed from: b  reason: collision with root package name */
    public Paint f80115b;

    /* renamed from: c  reason: collision with root package name */
    public int f80116c = 1;

    /* renamed from: d  reason: collision with root package name */
    private float f80117d;

    static {
        Covode.recordClassIndex(49858);
    }

    public e() {
        Paint paint = new Paint();
        this.f80115b = paint;
        paint.setAntiAlias(true);
        this.f80115b.setColor(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int d2 = RecyclerView.d(childAt);
            if (!(d2 == 0 || d2 == childCount - 1)) {
                if (this.f80116c == 1) {
                    float top = ((float) childAt.getTop()) - this.f80114a;
                    canvas.drawRect(((float) recyclerView.getPaddingLeft()) + this.f80117d, top, ((float) (recyclerView.getWidth() - recyclerView.getPaddingRight())) - this.f80117d, (float) childAt.getTop(), this.f80115b);
                } else {
                    canvas.drawRect(((float) childAt.getLeft()) - this.f80114a, ((float) recyclerView.getPaddingTop()) + this.f80117d, (float) childAt.getLeft(), ((float) (recyclerView.getHeight() - recyclerView.getPaddingBottom())) - this.f80117d, this.f80115b);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (RecyclerView.d(view) != 0) {
            if (this.f80116c == 1) {
                rect.top = (int) this.f80114a;
            } else if (i.a(view.getContext())) {
                rect.right = (int) this.f80114a;
            } else {
                rect.left = (int) this.f80114a;
            }
        }
    }
}
