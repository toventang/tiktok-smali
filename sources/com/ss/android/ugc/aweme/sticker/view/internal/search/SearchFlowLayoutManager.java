package com.ss.android.ugc.aweme.sticker.view.internal.search;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;

public final class SearchFlowLayoutManager extends RecyclerView.i {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<View> f136467a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Rect> f136468b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private int f136469c;

    /* renamed from: d  reason: collision with root package name */
    private int f136470d;

    /* renamed from: e  reason: collision with root package name */
    private int f136471e;

    /* renamed from: f  reason: collision with root package name */
    private int f136472f;

    static {
        Covode.recordClassIndex(89134);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean f() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean g() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean x_() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j b() {
        return new RecyclerView.j(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.a<?> aVar, RecyclerView.a<?> aVar2) {
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        int A = A();
        for (int i2 = 0; i2 < A; i2++) {
            View view = this.f136467a.get(i2);
            l.b(view, "");
            Rect rect = this.f136468b.get(i2);
            l.b(rect, "");
            Rect rect2 = rect;
            a(view, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        int i3 = this.f136471e;
        int i4 = this.f136470d;
        int i5 = 0;
        if (i3 - i4 <= 0) {
            return 0;
        }
        int i6 = this.f136472f;
        int i7 = i2 + i6;
        if (i7 >= 0) {
            if (i7 > i3 - i4) {
                i5 = i3 - i4;
            } else {
                i5 = i7;
            }
        }
        int i8 = i5 - i6;
        i(-i8);
        this.f136472f = i5;
        return i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.o oVar, RecyclerView.s sVar, int i2, int i3) {
        l.d(oVar, "");
        l.d(sVar, "");
        super.a(oVar, sVar, i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int a2 = (int) r.a(12.0f);
        c(oVar);
        oVar.a();
        this.f136467a.clear();
        this.f136471e = 0;
        this.f136469c = (size - v()) - t();
        int t = t();
        int u = u();
        int A = A();
        for (int i4 = 0; i4 < A; i4++) {
            View b2 = oVar.b(i4);
            l.b(b2, "");
            c(b2);
            l(b2);
            this.f136467a.put(i4, b2);
        }
        int A2 = A();
        int i5 = u;
        for (int i6 = 0; i6 < A2; i6++) {
            View view = this.f136467a.get(i6);
            l.b(view, "");
            View view2 = view;
            int m2 = m(view2);
            int n = n(view2);
            if (m2 > this.f136469c - t) {
                t = t();
                i5 = u;
            }
            int i7 = n + i5;
            this.f136468b.put(i6, new Rect(t, i5, t + m2, i7));
            t += m2 + a2;
            if (i7 >= u) {
                u = i7 + a2;
            }
        }
        int u2 = u - u();
        this.f136471e = u2;
        int u3 = u2 + u() + w();
        if (mode == Integer.MIN_VALUE ? u3 <= size2 : mode != 1073741824) {
            size2 = u3;
        }
        this.f136470d = (size2 - u()) - w();
        d(size, size2);
    }
}
