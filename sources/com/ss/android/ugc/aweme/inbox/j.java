package com.ss.android.ugc.aweme.inbox;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class j extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public int f104293a;

    /* renamed from: b  reason: collision with root package name */
    public int f104294b;

    /* renamed from: c  reason: collision with root package name */
    private List<? extends InboxAdapterWidget> f104295c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f104296d = true;

    /* renamed from: e  reason: collision with root package name */
    private Paint f104297e;

    /* renamed from: f  reason: collision with root package name */
    private int f104298f;

    /* renamed from: g  reason: collision with root package name */
    private int f104299g;

    /* renamed from: h  reason: collision with root package name */
    private int f104300h;

    /* renamed from: i  reason: collision with root package name */
    private float f104301i;

    /* renamed from: j  reason: collision with root package name */
    private float f104302j;

    static {
        Covode.recordClassIndex(66784);
    }

    private final int a() {
        Iterator<T> it = this.f104295c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().g().getItemCount();
        }
        if (d()) {
            return i2;
        }
        return i2 - 1;
    }

    private final boolean b() {
        if (!(!this.f104295c.isEmpty()) || (this.f104295c.get(0) instanceof MultiAdapterWidget) || ((InboxAdapterWidget) this.f104295c.get(0)).g().getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    private final boolean c() {
        List<? extends InboxAdapterWidget> list = this.f104295c;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof MultiAdapterWidget) {
                arrayList.add(t);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            return ((MultiAdapterWidget) it.next()).b().c();
        }
        return false;
    }

    private final boolean d() {
        InboxAdapterWidget inboxAdapterWidget = (InboxAdapterWidget) n.j((List) this.f104295c);
        if (inboxAdapterWidget == null || (inboxAdapterWidget instanceof MultiAdapterWidget) || inboxAdapterWidget.g().getItemCount() == 0) {
            return true;
        }
        return l.a((Object) inboxAdapterWidget.bq_().getValue(), (Object) true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        float f2;
        Canvas canvas2 = canvas;
        l.d(canvas2, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        if (this.f104300h == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                int d2 = RecyclerView.d(childAt);
                if (!b() || d2 != 0) {
                    if (d2 < a()) {
                        l.b(childAt, "");
                        int bottom = childAt.getBottom();
                        int i3 = bottom - this.f104299g;
                        if (this.f104296d) {
                            if (!c() || (b() ? d2 != 1 : d2 != 0)) {
                                f2 = this.f104301i + 0.0f;
                            } else {
                                f2 = 0.0f;
                            }
                            canvas2.drawRect(f2, (float) i3, ((float) measuredWidth) - this.f104302j, (float) bottom, this.f104297e);
                        } else {
                            float f3 = (float) i3;
                            float f4 = (float) bottom;
                            canvas2.drawRect(0.0f, f3, this.f104301i, f4, this.f104297e);
                            float f5 = (float) measuredWidth;
                            canvas2 = canvas2;
                            canvas2.drawRect(f5 - this.f104302j, f3, f5, f4, this.f104297e);
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount2 = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = recyclerView.getChildAt(i4);
            if (RecyclerView.d(childAt2) < a()) {
                l.b(childAt2, "");
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int left = childAt2.getLeft() + ((RecyclerView.j) layoutParams).leftMargin;
                int i5 = left - this.f104299g;
                if (this.f104296d) {
                    canvas2.drawRect((float) i5, this.f104301i + 0.0f, (float) left, ((float) measuredHeight) - this.f104302j, this.f104297e);
                } else {
                    float f6 = (float) i5;
                    float f7 = this.f104301i;
                    float f8 = (float) left;
                    canvas2.drawRect(f6, f7 + 0.0f, f8, f7, this.f104297e);
                    float f9 = (float) measuredHeight;
                    canvas2.drawRect(f6, f9 - this.f104302j, f8, f9, this.f104297e);
                }
            } else {
                return;
            }
        }
    }

    public j(List<? extends InboxAdapterWidget> list, int i2, int i3, float f2) {
        l.d(list, "");
        this.f104295c = list;
        Paint paint = new Paint(1);
        this.f104297e = paint;
        this.f104298f = i2;
        this.f104299g = i3;
        this.f104300h = 1;
        this.f104293a = -1;
        this.f104301i = f2;
        this.f104302j = 0.0f;
        paint.setColor(i2);
        this.f104297e.setStyle(Paint.Style.FILL);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r0 = android.content.res.Resources.getSystem();
        h.f.b.l.a((java.lang.Object) r0, "");
        r1 = h.g.a.a(android.util.TypedValue.applyDimension(1, 8.0f, r0.getDisplayMetrics()));
     */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, androidx.recyclerview.widget.RecyclerView.s r9) {
        /*
            r5 = this;
            java.lang.String r4 = ""
            h.f.b.l.d(r6, r4)
            h.f.b.l.d(r7, r4)
            h.f.b.l.d(r8, r4)
            h.f.b.l.d(r9, r4)
            int r1 = androidx.recyclerview.widget.RecyclerView.d(r7)
            int r0 = r5.f104300h
            r3 = 1
            r2 = 0
            if (r0 != r3) goto L_0x0055
            boolean r0 = r5.b()
            if (r0 == 0) goto L_0x0041
            boolean r0 = r5.c()
            if (r0 == 0) goto L_0x0041
            r0 = 2
            if (r1 != r0) goto L_0x0053
        L_0x0027:
            r1 = 1090519040(0x41000000, float:8.0)
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            h.f.b.l.a(r0, r4)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r3, r1, r0)
            int r1 = h.g.a.a(r0)
        L_0x003c:
            r0 = 0
        L_0x003d:
            r6.set(r2, r1, r0, r2)
            return
        L_0x0041:
            boolean r0 = r5.b()
            if (r0 != 0) goto L_0x004d
            boolean r0 = r5.c()
            if (r0 == 0) goto L_0x0050
        L_0x004d:
            if (r1 != r3) goto L_0x0053
            goto L_0x0027
        L_0x0050:
            if (r1 != 0) goto L_0x0053
            goto L_0x0027
        L_0x0053:
            r1 = 0
            goto L_0x003c
        L_0x0055:
            int r0 = r5.f104293a
            if (r1 != r0) goto L_0x005d
            int r0 = r5.f104294b
        L_0x005b:
            r1 = 0
            goto L_0x003d
        L_0x005d:
            int r0 = r5.f104299g
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.j.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$s):void");
    }
}
