package com.ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ac;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.x;
import androidx.recyclerview.widget.y;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.experiment.aj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class GalleryLayoutManager extends RecyclerView.i implements RecyclerView.r.b {

    /* renamed from: a  reason: collision with root package name */
    int f93213a;

    /* renamed from: b  reason: collision with root package name */
    public int f93214b;

    /* renamed from: c  reason: collision with root package name */
    View f93215c;

    /* renamed from: d  reason: collision with root package name */
    public ac f93216d;

    /* renamed from: e  reason: collision with root package name */
    b f93217e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f93218f;

    /* renamed from: g  reason: collision with root package name */
    public int f93219g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<Activity> f93220h;

    /* renamed from: i  reason: collision with root package name */
    public d f93221i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<c> f93222j;

    /* renamed from: k  reason: collision with root package name */
    public RecyclerView f93223k;

    /* renamed from: l  reason: collision with root package name */
    public int f93224l;

    /* renamed from: m  reason: collision with root package name */
    private int f93225m;
    private int n;
    private boolean o;
    private f p;
    private x q;
    private x r;

    public interface c {
        static {
            Covode.recordClassIndex(59116);
        }

        void a(RecyclerView recyclerView, int i2);

        void h();
    }

    public interface d {
        static {
            Covode.recordClassIndex(59117);
        }

        void a(GalleryLayoutManager galleryLayoutManager, View view, float f2);
    }

    static {
        Covode.recordClassIndex(59113);
    }

    private int i() {
        return (this.J - v()) - t();
    }

    private int k() {
        return (this.K - w()) - u();
    }

    private f l() {
        if (this.p == null) {
            this.p = new f();
        }
        return this.p;
    }

    private x m() {
        if (this.f93219g == 0) {
            if (this.q == null) {
                this.q = x.a(this);
            }
            return this.q;
        }
        if (this.r == null) {
            this.r = x.b(this);
        }
        return this.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j b() {
        if (this.f93219g == 1) {
            return new e(-1, -2);
        }
        return new e(-2, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean f() {
        RecyclerView recyclerView = this.f93223k;
        if (recyclerView == null || recyclerView.n() || !this.o || this.f93219g != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean g() {
        RecyclerView recyclerView = this.f93223k;
        if (recyclerView == null || recyclerView.n() || !this.o || this.f93219g != 1) {
            return false;
        }
        return true;
    }

    public GalleryLayoutManager() {
        this.f93225m = 1;
        this.o = true;
        this.f93214b = -1;
        this.f93217e = new b(this, (byte) 0);
        this.f93218f = false;
        this.f93219g = 0;
        this.f93222j = new ArrayList<>();
        this.f93224l = 0;
        this.f93219g = 0;
        if (aj.b()) {
            this.f93216d = new y();
        } else {
            this.f93216d = new s();
        }
    }

    private void h() {
        f fVar = this.p;
        if (fVar != null) {
            fVar.f93230a.clear();
        }
        int i2 = this.f93214b;
        if (i2 != -1) {
            this.f93213a = i2;
        }
        int min = Math.min(Math.max(0, this.f93213a), A() - 1);
        this.f93213a = min;
        this.n = min;
        this.f93225m = min;
        this.f93214b = -1;
        View view = this.f93215c;
        if (view != null) {
            view.setSelected(false);
            this.f93215c = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean a(RecyclerView.j jVar) {
        return jVar instanceof e;
    }

    class b extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        int f93227a;

        /* renamed from: b  reason: collision with root package name */
        boolean f93228b;

        static {
            Covode.recordClassIndex(59115);
        }

        private b() {
        }

        /* synthetic */ b(GalleryLayoutManager galleryLayoutManager, byte b2) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            super.a(recyclerView, i2);
            this.f93227a = i2;
            if (i2 == 0) {
                GalleryLayoutManager.this.f93224l = 0;
                View a2 = GalleryLayoutManager.this.f93216d.a(recyclerView.getLayoutManager());
                if (a2 != null) {
                    recyclerView.getLayoutManager();
                    int e2 = RecyclerView.i.e(a2);
                    if (e2 != GalleryLayoutManager.this.f93214b) {
                        if (GalleryLayoutManager.this.f93215c != null) {
                            GalleryLayoutManager.this.f93215c.setSelected(false);
                        }
                        GalleryLayoutManager.this.f93215c = a2;
                        GalleryLayoutManager.this.f93215c.setSelected(true);
                        GalleryLayoutManager.this.f93214b = e2;
                        if (GalleryLayoutManager.this.f93222j != null) {
                            GalleryLayoutManager galleryLayoutManager = GalleryLayoutManager.this;
                            galleryLayoutManager.a(recyclerView, galleryLayoutManager.f93214b);
                        }
                    } else if (!GalleryLayoutManager.this.f93218f && GalleryLayoutManager.this.f93222j != null && this.f93228b) {
                        this.f93228b = false;
                        GalleryLayoutManager galleryLayoutManager2 = GalleryLayoutManager.this;
                        galleryLayoutManager2.a(recyclerView, galleryLayoutManager2.f93214b);
                    }
                }
            } else {
                GalleryLayoutManager.this.f93224l = 2;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            super.a(recyclerView, i2, i3);
            View a2 = GalleryLayoutManager.this.f93216d.a(recyclerView.getLayoutManager());
            if (a2 != null) {
                recyclerView.getLayoutManager();
                int e2 = RecyclerView.i.e(a2);
                if (e2 != GalleryLayoutManager.this.f93214b) {
                    if (GalleryLayoutManager.this.f93215c != null) {
                        GalleryLayoutManager.this.f93215c.setSelected(false);
                    }
                    GalleryLayoutManager.this.f93215c = a2;
                    GalleryLayoutManager.this.f93215c.setSelected(true);
                    GalleryLayoutManager.this.f93214b = e2;
                    if (!GalleryLayoutManager.this.f93218f && this.f93227a != 0) {
                        this.f93228b = true;
                    } else if (GalleryLayoutManager.this.f93222j != null) {
                        GalleryLayoutManager galleryLayoutManager = GalleryLayoutManager.this;
                        galleryLayoutManager.a(recyclerView, galleryLayoutManager.f93214b);
                    }
                }
            }
        }
    }

    public static class e extends RecyclerView.j {
        static {
            Covode.recordClassIndex(59118);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: package-private */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<Rect> f93230a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        int f93231b = 0;

        static {
            Covode.recordClassIndex(59119);
        }

        f() {
        }
    }

    public final void a(int i2) {
        RecyclerView recyclerView = this.f93223k;
        if (recyclerView != null && i2 >= 0) {
            a(recyclerView, (RecyclerView.s) null, i2);
        }
    }

    class a extends r {
        static {
            Covode.recordClassIndex(59114);
        }

        @Override // androidx.recyclerview.widget.r
        public final float a(DisplayMetrics displayMetrics) {
            if (aj.b()) {
                return super.a(displayMetrics) / 1.5f;
            }
            return super.a(displayMetrics);
        }

        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
        public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
            int i2;
            RecyclerView.i iVar = this.f3864i;
            int i3 = 0;
            if (iVar == null || !iVar.f()) {
                i2 = 0;
            } else {
                RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
                int o = RecyclerView.i.o(view) - jVar.leftMargin;
                int q = RecyclerView.i.q(view) + jVar.rightMargin;
                int t = iVar.t();
                int i4 = o + ((int) (((float) (q - o)) / 2.0f));
                i2 = ((int) (((float) ((iVar.J - iVar.v()) - t)) / 2.0f)) - i4;
            }
            RecyclerView.i iVar2 = this.f3864i;
            if (iVar2 != null && iVar2.g()) {
                RecyclerView.j jVar2 = (RecyclerView.j) view.getLayoutParams();
                int p = RecyclerView.i.p(view) - jVar2.topMargin;
                int r = RecyclerView.i.r(view) + jVar2.bottomMargin;
                int u = iVar2.u();
                int i5 = p + ((int) (((float) (r - p)) / 2.0f));
                i3 = ((int) (((float) ((iVar2.K - iVar2.w()) - u)) / 2.0f)) - i5;
            }
            int a2 = a((int) Math.sqrt((double) ((i2 * i2) + (i3 * i3))));
            if (a2 > 0) {
                aVar.a(-i2, -i3, a2, this.f4200b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r.b
    public final PointF d(int i2) {
        int i3 = -1;
        if (s() != 0 && i2 >= this.n) {
            i3 = 1;
        }
        PointF pointF = new PointF();
        if (this.f93219g == 0) {
            pointF.x = (float) i3;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) i3;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j a(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    private float a(View view, float f2) {
        int height;
        int b2 = b(view, f2);
        if (this.f93219g == 0) {
            height = view.getWidth();
        } else {
            height = view.getHeight();
        }
        return Math.max(-1.0f, Math.min(1.0f, (((float) b2) * 1.0f) / ((float) height)));
    }

    private int b(View view, float f2) {
        float height;
        int top;
        x m2 = m();
        int c2 = ((m2.c() - m2.b()) / 2) + m2.b();
        if (this.f93219g == 0) {
            height = ((float) (view.getWidth() / 2)) - f2;
            top = view.getLeft();
        } else {
            height = ((float) (view.getHeight() / 2)) - f2;
            top = view.getTop();
        }
        return (int) ((height + ((float) top)) - ((float) c2));
    }

    private void a(RecyclerView.o oVar, int i2) {
        int i3;
        if (A() != 0) {
            if (this.f93219g == 0) {
                int b2 = m().b();
                int c2 = m().c();
                if (s() > 0) {
                    if (i2 >= 0) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < s(); i5++) {
                            View g2 = g(i5 + i4);
                            if (q(g2) - i2 >= b2) {
                                break;
                            }
                            a(g2, oVar);
                            this.n++;
                            i4--;
                        }
                    } else {
                        for (int s = s() - 1; s >= 0; s--) {
                            View g3 = g(s);
                            if (o(g3) - i2 > c2) {
                                a(g3, oVar);
                                this.f93225m--;
                            }
                        }
                    }
                }
                int i6 = this.n;
                int k2 = k();
                int i7 = -1;
                if (i2 >= 0) {
                    if (s() != 0) {
                        View g4 = g(s() - 1);
                        i6 = e(g4) + 1;
                        i3 = q(g4);
                    } else {
                        i3 = -1;
                    }
                    for (int i8 = i6; i8 < A() && i3 < c2 + i2; i8++) {
                        Rect rect = l().f93230a.get(i8);
                        View c3 = oVar.c(i8);
                        c(c3);
                        if (rect == null) {
                            rect = new Rect();
                            l().f93230a.put(i8, rect);
                        }
                        l(c3);
                        int m2 = m(c3);
                        int n2 = n(c3);
                        int u = (int) (((float) u()) + (((float) (k2 - n2)) / 2.0f));
                        if (i3 == -1 && i6 == 0) {
                            int t = (int) (((float) t()) + (((float) (i() - m2)) / 2.0f));
                            rect.set(t, u, m2 + t, n2 + u);
                        } else {
                            rect.set(i3, u, m2 + i3, n2 + u);
                        }
                        a(c3, rect.left, rect.top, rect.right, rect.bottom);
                        i3 = rect.right;
                        this.f93225m = i8;
                    }
                } else {
                    if (s() > 0) {
                        View g5 = g(0);
                        i6 = e(g5) - 1;
                        i7 = o(g5);
                    }
                    while (i6 >= 0 && i7 > b2 + i2) {
                        Rect rect2 = l().f93230a.get(i6);
                        View c4 = oVar.c(i6);
                        a(c4, 0);
                        if (rect2 == null) {
                            rect2 = new Rect();
                            l().f93230a.put(i6, rect2);
                        }
                        l(c4);
                        int m3 = m(c4);
                        int n3 = n(c4);
                        int u2 = (int) (((float) u()) + (((float) (k2 - n3)) / 2.0f));
                        rect2.set(i7 - m3, u2, i7, n3 + u2);
                        a(c4, rect2.left, rect2.top, rect2.right, rect2.bottom);
                        i7 = rect2.left;
                        this.n = i6;
                        i6--;
                    }
                }
            } else {
                b(oVar, i2);
            }
            if (this.f93221i != null) {
                for (int i9 = 0; i9 < s(); i9++) {
                    View g6 = g(i9);
                    this.f93221i.a(this, g6, a(g6, (float) i2));
                }
            }
        }
    }

    private void b(RecyclerView.o oVar, int i2) {
        int i3;
        int b2 = m().b();
        int c2 = m().c();
        if (s() > 0) {
            if (i2 < 0) {
                for (int s = s() - 1; s >= 0; s--) {
                    View g2 = g(s);
                    if (p(g2) - i2 <= c2) {
                        break;
                    }
                    a(g2, oVar);
                    this.f93225m--;
                }
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < s(); i5++) {
                    View g3 = g(i5 + i4);
                    if (r(g3) - i2 >= b2) {
                        break;
                    }
                    a(g3, oVar);
                    this.n++;
                    i4--;
                }
            }
        }
        int i6 = this.n;
        int i7 = i();
        int i8 = -1;
        if (i2 >= 0) {
            if (s() != 0) {
                View g4 = g(s() - 1);
                i6 = e(g4) + 1;
                i3 = r(g4);
            } else {
                i3 = -1;
            }
            for (int i9 = i6; i9 < A() && i3 < c2 + i2; i9++) {
                Rect rect = l().f93230a.get(i9);
                View c3 = oVar.c(i9);
                c(c3);
                if (rect == null) {
                    rect = new Rect();
                    l().f93230a.put(i9, rect);
                }
                l(c3);
                int m2 = m(c3);
                int n2 = n(c3);
                int t = (int) (((float) t()) + (((float) (i7 - m2)) / 2.0f));
                if (i3 == -1 && i6 == 0) {
                    int u = (int) (((float) u()) + (((float) (k() - n2)) / 2.0f));
                    rect.set(t, u, m2 + t, n2 + u);
                } else {
                    rect.set(t, i3, m2 + t, n2 + i3);
                }
                a(c3, rect.left, rect.top, rect.right, rect.bottom);
                i3 = rect.bottom;
                this.f93225m = i9;
            }
            return;
        }
        if (s() > 0) {
            View g5 = g(0);
            i6 = e(g5) - 1;
            i8 = p(g5);
        }
        while (i6 >= 0 && i8 > b2 + i2) {
            Rect rect2 = l().f93230a.get(i6);
            View c4 = oVar.c(i6);
            a(c4, 0);
            if (rect2 == null) {
                rect2 = new Rect();
                l().f93230a.put(i6, rect2);
            }
            l(c4);
            int m3 = m(c4);
            int n3 = n(c4);
            int t2 = (int) (((float) t()) + (((float) (i7 - m3)) / 2.0f));
            rect2.set(t2, i8 - n3, m3 + t2, i8);
            a(c4, rect2.left, rect2.top, rect2.right, rect2.bottom);
            i8 = rect2.top;
            this.n = i6;
            i6--;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        if (A() == 0) {
            h();
            a(oVar);
        } else if (!sVar.f3882g) {
            if (sVar.a() == 0 || sVar.f3881f) {
                if (s() == 0 || sVar.f3881f) {
                    h();
                }
                this.f93213a = Math.min(Math.max(0, this.f93213a), A() - 1);
                a(oVar);
                if (this.f93219g == 0) {
                    a(oVar);
                    int b2 = m().b();
                    int c2 = m().c();
                    int i2 = this.f93213a;
                    Rect rect = new Rect();
                    int k2 = k();
                    View c3 = oVar.c(this.f93213a);
                    a(c3, 0);
                    l(c3);
                    int m2 = m(c3);
                    int n2 = n(c3);
                    int u = (int) (((float) u()) + (((float) (k2 - n2)) / 2.0f));
                    int t = (int) (((float) t()) + (((float) (i() - m2)) / 2.0f));
                    rect.set(t, u, m2 + t, n2 + u);
                    a(c3, rect.left, rect.top, rect.right, rect.bottom);
                    if (l().f93230a.get(i2) == null) {
                        l().f93230a.put(i2, rect);
                    } else {
                        l().f93230a.get(i2).set(rect);
                    }
                    this.n = i2;
                    this.f93225m = i2;
                    int o2 = o(c3);
                    int q2 = q(c3);
                    a(oVar, this.f93213a - 1, o2, b2);
                    b(oVar, this.f93213a + 1, q2, c2);
                } else {
                    a(oVar);
                    int b3 = m().b();
                    int c4 = m().c();
                    int i3 = this.f93213a;
                    Rect rect2 = new Rect();
                    int i4 = i();
                    View c5 = oVar.c(this.f93213a);
                    a(c5, 0);
                    l(c5);
                    int m3 = m(c5);
                    int n3 = n(c5);
                    int t2 = (int) (((float) t()) + (((float) (i4 - m3)) / 2.0f));
                    int u2 = (int) (((float) u()) + (((float) (k() - n3)) / 2.0f));
                    rect2.set(t2, u2, m3 + t2, n3 + u2);
                    a(c5, rect2.left, rect2.top, rect2.right, rect2.bottom);
                    if (l().f93230a.get(i3) == null) {
                        l().f93230a.put(i3, rect2);
                    } else {
                        l().f93230a.get(i3).set(rect2);
                    }
                    this.n = i3;
                    this.f93225m = i3;
                    int p2 = p(c5);
                    int r2 = r(c5);
                    c(oVar, this.f93213a - 1, p2, b3);
                    d(oVar, this.f93213a + 1, r2, c4);
                }
                if (this.f93221i != null) {
                    for (int i5 = 0; i5 < s(); i5++) {
                        View g2 = g(i5);
                        this.f93221i.a(this, g2, a(g2, 0.0f));
                    }
                }
                this.f93217e.a(this.f93223k, 0, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(RecyclerView recyclerView, int i2) {
        Iterator<c> it = this.f93222j.iterator();
        while (it.hasNext()) {
            it.next().a(recyclerView, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void b(RecyclerView recyclerView, int i2, int i3) {
        super.b(recyclerView, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        int min;
        if (s() == 0 || i2 == 0) {
            return 0;
        }
        int i3 = -i2;
        int c2 = ((m().c() - m().b()) / 2) + m().b();
        if (i2 > 0) {
            if (e(g(s() - 1)) == A() - 1) {
                View g2 = g(s() - 1);
                min = Math.max(0, Math.min(i2, (((g2.getRight() - g2.getLeft()) / 2) + g2.getLeft()) - c2));
            }
            int i4 = -i3;
            l().f93231b = i4;
            a(oVar, i4);
            h(i3);
            return i4;
        }
        if (this.n == 0) {
            View g3 = g(0);
            min = Math.min(0, Math.max(i2, (((g3.getRight() - g3.getLeft()) / 2) + g3.getLeft()) - c2));
        }
        int i42 = -i3;
        l().f93231b = i42;
        a(oVar, i42);
        h(i3);
        return i42;
        i3 = -min;
        int i422 = -i3;
        l().f93231b = i422;
        a(oVar, i422);
        h(i3);
        return i422;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        int min;
        if (s() == 0 || i2 == 0) {
            return 0;
        }
        int i3 = -i2;
        int c2 = ((m().c() - m().b()) / 2) + m().b();
        if (i2 > 0) {
            if (e(g(s() - 1)) == A() - 1) {
                View g2 = g(s() - 1);
                min = Math.max(0, Math.min(i2, (((r(g2) - p(g2)) / 2) + p(g2)) - c2));
            }
            int i4 = -i3;
            l().f93231b = i4;
            a(oVar, i4);
            i(i3);
            return i4;
        }
        if (this.n == 0) {
            View g3 = g(0);
            min = Math.min(0, Math.max(i2, (((r(g3) - p(g3)) / 2) + p(g3)) - c2));
        }
        int i42 = -i3;
        l().f93231b = i42;
        a(oVar, i42);
        i(i3);
        return i42;
        i3 = -min;
        int i422 = -i3;
        l().f93231b = i422;
        a(oVar, i422);
        i(i3);
        return i422;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        a aVar = new a(recyclerView.getContext());
        aVar.f3862g = i2;
        a(aVar);
    }

    private void a(RecyclerView.o oVar, int i2, int i3, int i4) {
        Rect rect = new Rect();
        int k2 = k();
        while (i2 >= 0 && i3 > i4) {
            View c2 = oVar.c(i2);
            a(c2, 0);
            l(c2);
            int m2 = m(c2);
            int n2 = n(c2);
            int u = (int) (((float) u()) + (((float) (k2 - n2)) / 2.0f));
            rect.set(i3 - m2, u, i3, n2 + u);
            a(c2, rect.left, rect.top, rect.right, rect.bottom);
            i3 = rect.left;
            this.n = i2;
            if (l().f93230a.get(i2) == null) {
                l().f93230a.put(i2, rect);
            } else {
                l().f93230a.get(i2).set(rect);
            }
            i2--;
        }
    }

    private void b(RecyclerView.o oVar, int i2, int i3, int i4) {
        Rect rect = new Rect();
        int k2 = k();
        while (i2 < A() && i3 < i4) {
            View c2 = oVar.c(i2);
            c(c2);
            l(c2);
            int m2 = m(c2);
            int n2 = n(c2);
            int u = (int) (((float) u()) + (((float) (k2 - n2)) / 2.0f));
            rect.set(i3, u, m2 + i3, n2 + u);
            a(c2, rect.left, rect.top, rect.right, rect.bottom);
            i3 = rect.right;
            this.f93225m = i2;
            if (l().f93230a.get(i2) == null) {
                l().f93230a.put(i2, rect);
            } else {
                l().f93230a.get(i2).set(rect);
            }
            i2++;
        }
    }

    private void c(RecyclerView.o oVar, int i2, int i3, int i4) {
        Rect rect = new Rect();
        int i5 = i();
        while (i2 >= 0 && i3 > i4) {
            View c2 = oVar.c(i2);
            a(c2, 0);
            l(c2);
            int m2 = m(c2);
            int n2 = n(c2);
            int t = (int) (((float) t()) + (((float) (i5 - m2)) / 2.0f));
            rect.set(t, i3 - n2, m2 + t, i3);
            a(c2, rect.left, rect.top, rect.right, rect.bottom);
            i3 = rect.top;
            this.n = i2;
            if (l().f93230a.get(i2) == null) {
                l().f93230a.put(i2, rect);
            } else {
                l().f93230a.get(i2).set(rect);
            }
            i2--;
        }
    }

    private void d(RecyclerView.o oVar, int i2, int i3, int i4) {
        Rect rect = new Rect();
        int i5 = i();
        while (i2 < A() && i3 < i4) {
            View c2 = oVar.c(i2);
            c(c2);
            l(c2);
            int m2 = m(c2);
            int n2 = n(c2);
            int t = (int) (((float) t()) + (((float) (i5 - m2)) / 2.0f));
            rect.set(t, i3, m2 + t, n2 + i3);
            a(c2, rect.left, rect.top, rect.right, rect.bottom);
            i3 = rect.bottom;
            this.f93225m = i2;
            if (l().f93230a.get(i2) == null) {
                l().f93230a.put(i2, rect);
            } else {
                l().f93230a.get(i2).set(rect);
            }
            i2++;
        }
    }
}
