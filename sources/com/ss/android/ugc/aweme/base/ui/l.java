package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;

public class l extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68374a = l.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final int f68375b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final int f68376c;

    /* renamed from: d  reason: collision with root package name */
    private final int f68377d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f68378e;

    /* renamed from: f  reason: collision with root package name */
    private int f68379f;

    /* renamed from: g  reason: collision with root package name */
    private int f68380g;

    static {
        Covode.recordClassIndex(42099);
    }

    public static l a(Context context) {
        l lVar = new l(1, context.getResources().getColor(R.color.b2));
        int a2 = n.a(16.0d);
        int a3 = n.a(16.0d);
        lVar.f68379f = a2;
        lVar.f68380g = a3;
        return lVar;
    }

    public l(int i2, int i3) {
        Paint paint = new Paint();
        this.f68378e = paint;
        paint.setAntiAlias(true);
        paint.setColor(i3);
        this.f68376c = i2;
        this.f68377d = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
        int i2 = 0;
        if (this.f68375b == 1) {
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft() + this.f68379f;
            int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f68380g;
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != null) {
                    int bottom = childAt.getBottom() + ((RecyclerView.j) childAt.getLayoutParams()).bottomMargin;
                    canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) (this.f68377d + bottom), this.f68378e);
                    i2++;
                } else {
                    return;
                }
            }
            return;
        }
        int childCount2 = recyclerView.getChildCount();
        int paddingTop = recyclerView.getPaddingTop();
        while (i2 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i2);
            if (childAt2 != null) {
                int height = childAt2.getHeight() - recyclerView.getPaddingBottom();
                int right = childAt2.getRight() + ((RecyclerView.j) childAt2.getLayoutParams()).rightMargin;
                canvas.drawRect((float) right, (float) paddingTop, (float) (this.f68377d + right), (float) height, this.f68378e);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        int a2 = sVar.a();
        int e2 = RecyclerView.e(view);
        if (e2 == -1 || !(layoutManager instanceof LinearLayoutManager) || (layoutManager instanceof GridLayoutManager)) {
            return;
        }
        if (this.f68375b == 1) {
            if (e2 == a2) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, 0, this.f68376c);
            }
        } else if (e2 == a2) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, this.f68376c, 0);
        }
    }
}
