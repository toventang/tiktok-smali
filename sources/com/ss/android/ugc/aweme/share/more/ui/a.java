package com.ss.android.ugc.aweme.share.more.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.a.af;
import h.f.a.b;
import h.f.b.l;
import h.j.h;
import java.util.Iterator;

public final class a extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    int f124136a;

    /* renamed from: b  reason: collision with root package name */
    int f124137b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f124138c;

    /* renamed from: d  reason: collision with root package name */
    private final int f124139d;

    /* renamed from: e  reason: collision with root package name */
    private final b<Integer, Boolean> f124140e;

    static {
        Covode.recordClassIndex(81529);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(int i2, int i3, b<? super Integer, Boolean> bVar) {
        l.d(bVar, "");
        this.f124139d = i2;
        this.f124140e = bVar;
        Paint paint = new Paint();
        paint.setColor(i3);
        paint.setStyle(Paint.Style.FILL);
        this.f124138c = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        RecyclerView.i layoutManager;
        l.d(canvas, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        if (!recyclerView.n() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            l.b(layoutManager, "");
            Iterator it = h.a(0, recyclerView.getChildCount()).iterator();
            while (it.hasNext()) {
                int a2 = ((af) it).a();
                if (this.f124140e.invoke(Integer.valueOf(a2)).booleanValue()) {
                    View childAt = recyclerView.getChildAt(a2);
                    recyclerView.a(childAt);
                    int q = RecyclerView.i.q(childAt);
                    int r = RecyclerView.i.r(childAt);
                    canvas.drawRect(((float) RecyclerView.i.o(childAt)) + ((float) this.f124136a), (float) (r - this.f124139d), ((float) q) - ((float) this.f124137b), (float) r, this.f124138c);
                }
            }
        }
    }
}
