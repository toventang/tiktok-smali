package com.ss.android.ugc.aweme.social.widget.card.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class a extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private final h f133766a = i.a((h.f.a.a) C3469a.f133767a);

    static {
        Covode.recordClassIndex(87500);
    }

    private final Paint a() {
        return (Paint) this.f133766a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.b.a$a  reason: collision with other inner class name */
    static final class C3469a extends m implements h.f.a.a<Paint> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3469a f133767a = new C3469a();

        static {
            Covode.recordClassIndex(87501);
        }

        C3469a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint(1);
            paint.setColor(0);
            paint.setStyle(Paint.Style.FILL);
            return paint;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(canvas, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        float measuredHeight = (float) recyclerView.getMeasuredHeight();
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int d2 = RecyclerView.d(childAt);
            int childCount2 = recyclerView.getChildCount();
            if (d2 >= 0 && childCount2 >= d2) {
                l.b(childAt, "");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                float right = (float) (childAt.getRight() + ((RecyclerView.j) layoutParams).leftMargin);
                float f2 = right - b.f133768a;
                canvas.drawRect(f2, 0.0f, f2, 0.0f, a());
                canvas.drawRect(right, measuredHeight, right, measuredHeight, a());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        rect.set(0, 0, (int) b.f133768a, 0);
    }
}
