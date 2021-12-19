package com.ss.android.ugc.aweme.autoplay.d;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.x;
import androidx.recyclerview.widget.y;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.j.h;

public class e extends y {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67392b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private x f67393c;

    /* renamed from: d  reason: collision with root package name */
    private x f67394d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f67395e;

    static {
        Covode.recordClassIndex(41501);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41502);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.ac
    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        this.f67395e = recyclerView;
    }

    public static final class b extends r {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f67396f;
        final /* synthetic */ RecyclerView.i n;

        static {
            Covode.recordClassIndex(41503);
        }

        @Override // androidx.recyclerview.widget.r
        public final float a(DisplayMetrics displayMetrics) {
            l.d(displayMetrics, "");
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        @Override // androidx.recyclerview.widget.r
        public final int b(int i2) {
            return h.c(100, super.b(i2));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, RecyclerView.i iVar, Context context) {
            super(context);
            this.f67396f = eVar;
            this.n = iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
        public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
            l.d(view, "");
            l.d(sVar, "");
            l.d(aVar, "");
            int[] a2 = this.f67396f.a(this.n, view);
            int i2 = a2[0];
            int i3 = a2[1];
            aVar.a(i2, i3, h.b(a(h.b(Math.abs(i2), Math.abs(i3))), 1), this.f4200b);
        }
    }

    /* access modifiers changed from: protected */
    public final x d(RecyclerView.i iVar) {
        l.d(iVar, "");
        if (this.f67393c == null) {
            this.f67393c = x.b(iVar);
        }
        x xVar = this.f67393c;
        if (xVar == null) {
            l.b();
        }
        return xVar;
    }

    /* access modifiers changed from: protected */
    public final x e(RecyclerView.i iVar) {
        l.d(iVar, "");
        if (this.f67394d == null) {
            this.f67394d = x.a(iVar);
        }
        x xVar = this.f67394d;
        if (xVar == null) {
            l.b();
        }
        return xVar;
    }

    @Override // androidx.recyclerview.widget.y, androidx.recyclerview.widget.ac
    public final View a(RecyclerView.i iVar) {
        l.d(iVar, "");
        if (iVar.g()) {
            return a(iVar, d(iVar));
        }
        if (iVar.f()) {
            return a(iVar, e(iVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.ac
    public final r c(RecyclerView.i iVar) {
        RecyclerView recyclerView;
        l.d(iVar, "");
        Context context = null;
        if (!(iVar instanceof RecyclerView.r.b) || (recyclerView = this.f67395e) == null || recyclerView.getContext() == null) {
            return null;
        }
        RecyclerView recyclerView2 = this.f67395e;
        if (recyclerView2 != null) {
            context = recyclerView2.getContext();
        }
        return new b(this, iVar, context);
    }

    /* access modifiers changed from: protected */
    public int a(View view, x xVar) {
        l.d(view, "");
        l.d(xVar, "");
        return xVar.a(view) - xVar.b();
    }

    /* access modifiers changed from: protected */
    public View a(RecyclerView.i iVar, x xVar) {
        int i2;
        l.d(iVar, "");
        l.d(xVar, "");
        int s = iVar.s();
        View view = null;
        if (s == 0) {
            return null;
        }
        if (iVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
            if (linearLayoutManager.n() == linearLayoutManager.A() - 1) {
                return null;
            }
        }
        int i3 = 0;
        if (iVar.p()) {
            i2 = xVar.b();
        } else {
            i2 = 0;
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = s - 1;
        if (i5 >= 0) {
            while (true) {
                View g2 = iVar.g(i3);
                int abs = Math.abs(xVar.a(g2) - i2);
                if (abs < i4) {
                    view = g2;
                    i4 = abs;
                }
                if (i3 == i5) {
                    break;
                }
                i3++;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.y, androidx.recyclerview.widget.ac
    public int[] a(RecyclerView.i iVar, View view) {
        l.d(iVar, "");
        l.d(view, "");
        int[] iArr = new int[2];
        int i2 = 0;
        do {
            iArr[i2] = 0;
            i2++;
        } while (i2 < 2);
        if (iVar.f()) {
            iArr[0] = a(view, e(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.g()) {
            iArr[1] = a(view, d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
