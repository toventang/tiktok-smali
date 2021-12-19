package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.a.d;
import androidx.core.h.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    boolean f3759a;

    /* renamed from: b  reason: collision with root package name */
    public int f3760b = -1;

    /* renamed from: c  reason: collision with root package name */
    int[] f3761c;

    /* renamed from: d  reason: collision with root package name */
    View[] f3762d;

    /* renamed from: e  reason: collision with root package name */
    final SparseIntArray f3763e = new SparseIntArray();

    /* renamed from: f  reason: collision with root package name */
    final SparseIntArray f3764f = new SparseIntArray();

    /* renamed from: g  reason: collision with root package name */
    public c f3765g = new a();

    /* renamed from: h  reason: collision with root package name */
    final Rect f3766h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public boolean f3767i;

    static {
        Covode.recordClassIndex(1461);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a(boolean z) {
        if (!z) {
            super.a(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.o oVar, RecyclerView.s sVar, View view, d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.a(view, dVar);
            return;
        }
        b bVar = (b) layoutParams;
        int a2 = a(oVar, sVar, bVar.f3847c.getLayoutPosition());
        if (this.f3778j == 0) {
            dVar.a(d.c.a(bVar.f3768a, bVar.f3769b, a2, 1));
        } else {
            dVar.a(d.c.a(a2, 1, bVar.f3768a, bVar.f3769b));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public void a(RecyclerView.s sVar) {
        super.a(sVar);
        this.f3759a = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        this.f3765g.f3770a.clear();
        this.f3765g.f3771b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.f3765g.f3770a.clear();
        this.f3765g.f3771b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.f3765g.f3770a.clear();
        this.f3765g.f3771b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean a(RecyclerView.j jVar) {
        return jVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(Rect rect, int i2, int i3) {
        int a2;
        int a3;
        if (this.f3761c == null) {
            super.a(rect, i2, i3);
        }
        int t = t() + v();
        int u = u() + w();
        if (this.f3778j == 1) {
            a3 = a(i3, rect.height() + u, v.i(this.w));
            int[] iArr = this.f3761c;
            a2 = a(i2, iArr[iArr.length - 1] + t, v.h(this.w));
        } else {
            a2 = a(i2, rect.width() + t, v.h(this.w));
            int[] iArr2 = this.f3761c;
            a3 = a(i3, iArr2[iArr2.length - 1] + u, v.i(this.w));
        }
        d(a2, a3);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a(RecyclerView.o oVar, RecyclerView.s sVar, LinearLayoutManager.a aVar, int i2) {
        boolean z;
        super.a(oVar, sVar, aVar, i2);
        C();
        if (sVar.a() > 0 && !sVar.f3882g) {
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            int b2 = b(oVar, sVar, aVar.f3786b);
            if (z) {
                while (b2 > 0 && aVar.f3786b > 0) {
                    aVar.f3786b--;
                    b2 = b(oVar, sVar, aVar.f3786b);
                }
            } else {
                int a2 = sVar.a() - 1;
                int i3 = aVar.f3786b;
                while (i3 < a2) {
                    int i4 = i3 + 1;
                    int b3 = b(oVar, sVar, i4);
                    if (b3 <= b2) {
                        break;
                    }
                    i3 = i4;
                    b2 = b3;
                }
                aVar.f3786b = i3;
            }
        }
        D();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View a(RecyclerView.o oVar, RecyclerView.s sVar, boolean z, boolean z2) {
        int i2;
        int s = s();
        int i3 = -1;
        int i4 = 1;
        if (z2) {
            i2 = s() - 1;
            i4 = -1;
        } else {
            i3 = s;
            i2 = 0;
        }
        int a2 = sVar.a();
        i();
        int b2 = this.f3779k.b();
        int c2 = this.f3779k.c();
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View g2 = g(i2);
            int e2 = e(g2);
            if (e2 >= 0 && e2 < a2 && b(oVar, sVar, e2) == 0) {
                if (((RecyclerView.j) g2.getLayoutParams()).f3847c.isRemoved()) {
                    if (view2 == null) {
                        view2 = g2;
                    }
                } else if (this.f3779k.a(g2) < c2 && this.f3779k.b(g2) >= b2) {
                    return g2;
                } else {
                    if (view == null) {
                        view = g2;
                    }
                }
            }
            i2 += i4;
        }
        return view != null ? view : view2;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a(RecyclerView.s sVar, LinearLayoutManager.c cVar, RecyclerView.i.a aVar) {
        int i2 = this.f3760b;
        for (int i3 = 0; i3 < this.f3760b && cVar.a(sVar) && i2 > 0; i3++) {
            int i4 = cVar.f3797d;
            aVar.a(i4, Math.max(0, cVar.f3800g));
            i2 -= this.f3765g.a(i4);
            cVar.f3797d += cVar.f3798e;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a(RecyclerView.o oVar, RecyclerView.s sVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int makeMeasureSpec;
        int a2;
        View a3;
        int h2 = this.f3779k.h();
        boolean z = false;
        boolean z2 = h2 != 1073741824;
        int i6 = s() > 0 ? this.f3761c[this.f3760b] : 0;
        if (z2) {
            C();
        }
        boolean z3 = cVar.f3798e == 1;
        int i7 = this.f3760b;
        if (!z3) {
            i7 = b(oVar, sVar, cVar.f3797d) + c(oVar, sVar, cVar.f3797d);
        }
        int i8 = 0;
        while (i8 < this.f3760b && cVar.a(sVar) && i7 > 0) {
            int i9 = cVar.f3797d;
            int c2 = c(oVar, sVar, i9);
            if (c2 <= this.f3760b) {
                i7 -= c2;
                if (i7 < 0 || (a3 = cVar.a(oVar)) == null) {
                    break;
                }
                this.f3762d[i8] = a3;
                i8++;
            } else {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + c2 + " spans but GridLayoutManager has only " + this.f3760b + " spans.");
            }
        }
        if (i8 == 0) {
            bVar.f3791b = true;
            return;
        }
        float f2 = 0.0f;
        a(oVar, sVar, i8, z3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            View view = this.f3762d[i10];
            if (cVar.f3805l == null) {
                if (z3) {
                    c(view);
                } else {
                    int i12 = z ? 1 : 0;
                    int i13 = z ? 1 : 0;
                    int i14 = z ? 1 : 0;
                    a(view, i12);
                }
            } else if (z3) {
                a_(view);
            } else {
                b_(view);
            }
            b(view, this.f3766h);
            a(view, h2, z);
            int e2 = this.f3779k.e(view);
            if (e2 > i11) {
                i11 = e2;
            }
            float f3 = (((float) this.f3779k.f(view)) * 1.0f) / ((float) ((b) view.getLayoutParams()).f3769b);
            if (f3 > f2) {
                f2 = f3;
            }
            i10++;
            z = false;
        }
        if (z2) {
            k(Math.max(Math.round(f2 * ((float) this.f3760b)), i6));
            i11 = 0;
            for (int i15 = 0; i15 < i8; i15++) {
                View view2 = this.f3762d[i15];
                a(view2, 1073741824, true);
                int e3 = this.f3779k.e(view2);
                if (e3 > i11) {
                    i11 = e3;
                }
            }
        }
        for (int i16 = 0; i16 < i8; i16++) {
            View view3 = this.f3762d[i16];
            if (this.f3779k.e(view3) != i11) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f3848d;
                int i17 = rect.top + rect.bottom + bVar2.topMargin + bVar2.bottomMargin;
                int i18 = rect.left + rect.right + bVar2.leftMargin + bVar2.rightMargin;
                int e4 = e(bVar2.f3768a, bVar2.f3769b);
                if (this.f3778j == 1) {
                    makeMeasureSpec = a(e4, 1073741824, i18, bVar2.width, false);
                    a2 = View.MeasureSpec.makeMeasureSpec(i11 - i17, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i18, 1073741824);
                    a2 = a(e4, 1073741824, i17, bVar2.height, false);
                }
                a(view3, makeMeasureSpec, a2, true);
            }
        }
        bVar.f3790a = i11;
        if (this.f3778j != 1) {
            if (cVar.f3799f == -1) {
                i3 = cVar.f3795b;
                i5 = i3 - i11;
            } else {
                i5 = cVar.f3795b;
                i3 = i11 + i5;
            }
            i2 = 0;
            i4 = 0;
        } else if (cVar.f3799f == -1) {
            i2 = cVar.f3795b;
            i4 = i2 - i11;
            i5 = 0;
            i3 = 0;
        } else {
            i4 = cVar.f3795b;
            i2 = i11 + i4;
            i3 = 0;
            i5 = 0;
        }
        for (int i19 = 0; i19 < i8; i19++) {
            View view4 = this.f3762d[i19];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f3778j != 1) {
                i4 = u() + this.f3761c[bVar3.f3768a];
                i2 = this.f3779k.f(view4) + i4;
            } else if (h()) {
                i3 = t() + this.f3761c[this.f3760b - bVar3.f3768a];
                i5 = i3 - this.f3779k.f(view4);
            } else {
                i5 = t() + this.f3761c[bVar3.f3768a];
                i3 = this.f3779k.f(view4) + i5;
            }
            b(view4, i5, i4, i3, i2);
            if (bVar3.f3847c.isRemoved() || bVar3.f3847c.isUpdated()) {
                bVar.f3792c = true;
            }
            bVar.f3793d |= view4.hasFocusable();
        }
        Arrays.fill(this.f3762d, (Object) null);
    }

    public final void a(int i2) {
        if (i2 != this.f3760b) {
            this.f3759a = true;
            if (i2 > 0) {
                this.f3760b = i2;
                this.f3765g.f3770a.clear();
                o();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided ".concat(String.valueOf(i2)));
        }
    }

    private void D() {
        View[] viewArr = this.f3762d;
        if (viewArr == null || viewArr.length != this.f3760b) {
            this.f3762d = new View[this.f3760b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public boolean x_() {
        if (this.s != null || this.f3759a) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void y_() {
        this.f3765g.f3770a.clear();
        this.f3765g.f3771b.clear();
    }

    private void C() {
        int w;
        int u;
        if (this.f3778j == 1) {
            w = this.J - v();
            u = t();
        } else {
            w = this.K - w();
            u = u();
        }
        k(w - u);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j b() {
        if (this.f3778j == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public void a(c cVar) {
        this.f3765g = cVar;
    }

    private void k(int i2) {
        this.f3761c = a(this.f3761c, this.f3760b, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int c(RecyclerView.s sVar) {
        if (this.f3767i) {
            return h(sVar);
        }
        return super.c(sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int d(RecyclerView.s sVar) {
        if (this.f3767i) {
            return i(sVar);
        }
        return super.d(sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int e(RecyclerView.s sVar) {
        if (this.f3767i) {
            return i(sVar);
        }
        return super.e(sVar);
    }

    public static class b extends RecyclerView.j {

        /* renamed from: a  reason: collision with root package name */
        public int f3768a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f3769b;

        static {
            Covode.recordClassIndex(1463);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(int i2, int i3) {
            super(i2, i3);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public GridLayoutManager(int i2) {
        a(i2);
    }

    private int h(RecyclerView.s sVar) {
        if (!(s() == 0 || sVar.a() == 0)) {
            i();
            View c2 = c(!this.o);
            View d2 = d(!this.o);
            if (!(c2 == null || d2 == null)) {
                if (!this.o) {
                    return this.f3765g.c(sVar.a() - 1, this.f3760b) + 1;
                }
                int b2 = this.f3779k.b(d2) - this.f3779k.a(c2);
                int c3 = this.f3765g.c(e(c2), this.f3760b);
                return (int) ((((float) b2) / ((float) ((this.f3765g.c(e(d2), this.f3760b) - c3) + 1))) * ((float) (this.f3765g.c(sVar.a() - 1, this.f3760b) + 1)));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int b(RecyclerView.s sVar) {
        if (this.f3767i) {
            return h(sVar);
        }
        return super.b(sVar);
    }

    private int i(RecyclerView.s sVar) {
        int max;
        if (!(s() == 0 || sVar.a() == 0)) {
            i();
            boolean z = this.o;
            View c2 = c(!z);
            View d2 = d(!z);
            if (!(c2 == null || d2 == null)) {
                int c3 = this.f3765g.c(e(c2), this.f3760b);
                int c4 = this.f3765g.c(e(d2), this.f3760b);
                int min = Math.min(c3, c4);
                int max2 = Math.max(c3, c4);
                int c5 = this.f3765g.c(sVar.a() - 1, this.f3760b) + 1;
                if (this.f3781m) {
                    max = Math.max(0, (c5 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f3779k.b(d2) - this.f3779k.a(c2))) / ((float) ((this.f3765g.c(e(d2), this.f3760b) - this.f3765g.c(e(c2), this.f3760b)) + 1)))) + ((float) (this.f3779k.b() - this.f3779k.a(c2))));
            }
        }
        return 0;
    }

    public static final class a extends c {
        static {
            Covode.recordClassIndex(1462);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2, int i3) {
            return i2 % i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j a(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f3770a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f3771b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        public boolean f3772c = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3773d = false;

        static {
            Covode.recordClassIndex(1464);
        }

        public abstract int a(int i2);

        /* access modifiers changed from: package-private */
        public final int b(int i2, int i3) {
            if (!this.f3772c) {
                return a(i2, i3);
            }
            int i4 = this.f3770a.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int a2 = a(i2, i3);
            this.f3770a.put(i2, a2);
            return a2;
        }

        /* access modifiers changed from: package-private */
        public final int c(int i2, int i3) {
            if (!this.f3773d) {
                return d(i2, i3);
            }
            int i4 = this.f3771b.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int d2 = d(i2, i3);
            this.f3771b.put(i2, d2);
            return d2;
        }

        private static int a(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i4) < i2) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            int i5 = i3 - 1;
            if (i5 < 0 || i5 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i5);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(int r6, int r7) {
            /*
                r5 = this;
                int r4 = r5.a(r6)
                r3 = 0
                if (r4 != r7) goto L_0x0008
                return r3
            L_0x0008:
                boolean r0 = r5.f3772c
                if (r0 == 0) goto L_0x0030
                android.util.SparseIntArray r0 = r5.f3770a
                int r2 = a(r0, r6)
                if (r2 < 0) goto L_0x0030
                android.util.SparseIntArray r0 = r5.f3770a
                int r1 = r0.get(r2)
                int r0 = r5.a(r2)
                int r1 = r1 + r0
            L_0x001f:
                int r2 = r2 + 1
            L_0x0021:
                if (r2 >= r6) goto L_0x0033
                int r0 = r5.a(r2)
                int r1 = r1 + r0
                if (r1 != r7) goto L_0x002c
                r1 = 0
                goto L_0x001f
            L_0x002c:
                if (r1 <= r7) goto L_0x001f
                r1 = r0
                goto L_0x001f
            L_0x0030:
                r2 = 0
                r1 = 0
                goto L_0x0021
            L_0x0033:
                int r4 = r4 + r1
                if (r4 > r7) goto L_0x0037
                return r1
            L_0x0037:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.a(int, int):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int d(int r6, int r7) {
            /*
                r5 = this;
                boolean r1 = r5.f3773d
                r0 = 0
                if (r1 == 0) goto L_0x003d
                android.util.SparseIntArray r0 = r5.f3771b
                int r1 = a(r0, r6)
                r0 = -1
                if (r1 == r0) goto L_0x003d
                android.util.SparseIntArray r0 = r5.f3771b
                int r4 = r0.get(r1)
                int r3 = r1 + 1
                int r2 = r5.b(r1, r7)
                int r0 = r5.a(r1)
                int r2 = r2 + r0
                if (r2 != r7) goto L_0x0024
                int r4 = r4 + 1
            L_0x0023:
                r2 = 0
            L_0x0024:
                int r1 = r5.a(r6)
            L_0x0028:
                if (r3 >= r6) goto L_0x0040
                int r0 = r5.a(r3)
                int r2 = r2 + r0
                if (r2 != r7) goto L_0x0037
                int r4 = r4 + 1
                r2 = 0
            L_0x0034:
                int r3 = r3 + 1
                goto L_0x0028
            L_0x0037:
                if (r2 <= r7) goto L_0x0034
                int r4 = r4 + 1
                r2 = r0
                goto L_0x0034
            L_0x003d:
                r4 = 0
                r3 = 0
                goto L_0x0023
            L_0x0040:
                int r2 = r2 + r1
                if (r2 <= r7) goto L_0x0045
                int r4 = r4 + 1
            L_0x0045:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int b(RecyclerView.o oVar, RecyclerView.s sVar) {
        if (this.f3778j == 1) {
            return this.f3760b;
        }
        if (sVar.a() <= 0) {
            return 0;
        }
        return a(oVar, sVar, sVar.a() - 1) + 1;
    }

    private int e(int i2, int i3) {
        if (this.f3778j != 1 || !h()) {
            int[] iArr = this.f3761c;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f3761c;
        int i4 = this.f3760b;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        if (sVar.f3882g) {
            int s = s();
            for (int i2 = 0; i2 < s; i2++) {
                b bVar = (b) g(i2).getLayoutParams();
                int layoutPosition = bVar.f3847c.getLayoutPosition();
                this.f3763e.put(layoutPosition, bVar.f3769b);
                this.f3764f.put(layoutPosition, bVar.f3768a);
            }
        }
        super.c(oVar, sVar);
        this.f3763e.clear();
        this.f3764f.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int a(RecyclerView.o oVar, RecyclerView.s sVar) {
        if (this.f3778j == 0) {
            return this.f3760b;
        }
        if (sVar.a() <= 0) {
            return 0;
        }
        return a(oVar, sVar, sVar.a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        C();
        D();
        return super.a(i2, oVar, sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        C();
        D();
        return super.b(i2, oVar, sVar);
    }

    private int a(RecyclerView.o oVar, RecyclerView.s sVar, int i2) {
        if (!sVar.f3882g) {
            return this.f3765g.c(i2, this.f3760b);
        }
        int a2 = oVar.a(i2);
        if (a2 == -1) {
            return 0;
        }
        return this.f3765g.c(a2, this.f3760b);
    }

    private int b(RecyclerView.o oVar, RecyclerView.s sVar, int i2) {
        if (!sVar.f3882g) {
            return this.f3765g.b(i2, this.f3760b);
        }
        int i3 = this.f3764f.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int a2 = oVar.a(i2);
        if (a2 == -1) {
            return 0;
        }
        return this.f3765g.b(a2, this.f3760b);
    }

    private int c(RecyclerView.o oVar, RecyclerView.s sVar, int i2) {
        if (!sVar.f3882g) {
            return this.f3765g.a(i2);
        }
        int i3 = this.f3763e.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int a2 = oVar.a(i2);
        if (a2 == -1) {
            return 1;
        }
        return this.f3765g.a(a2);
    }

    public GridLayoutManager(int i2, int i3, boolean z) {
        super(i3, false);
        a(i2);
    }

    private void a(View view, int i2, boolean z) {
        int a2;
        int a3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f3848d;
        int i3 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i4 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int e2 = e(bVar.f3768a, bVar.f3769b);
        if (this.f3778j == 1) {
            a3 = a(e2, i2, i4, bVar.width, false);
            a2 = a(this.f3779k.e(), this.I, i3, bVar.height, true);
        } else {
            a2 = a(e2, i2, i3, bVar.height, false);
            a3 = a(this.f3779k.e(), this.H, i4, bVar.width, true);
        }
        a(view, a3, a2, z);
    }

    private static int[] a(int[] iArr, int i2, int i3) {
        int i4;
        if (!(iArr != null && iArr.length == i2 + 1 && iArr[iArr.length - 1] == i3)) {
            iArr = new int[(i2 + 1)];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i3 / i2;
        int i7 = i3 % i2;
        int i8 = 0;
        for (int i9 = 1; i9 <= i2; i9++) {
            i5 += i7;
            if (i5 <= 0 || i2 - i5 >= i7) {
                i4 = i6;
            } else {
                i4 = i6 + 1;
                i5 -= i2;
            }
            i8 += i4;
            iArr[i9] = i8;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void b(RecyclerView recyclerView, int i2, int i3) {
        this.f3765g.f3770a.clear();
        this.f3765g.f3771b.clear();
    }

    private void a(View view, int i2, int i3, boolean z) {
        boolean b2;
        RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
        if (z) {
            b2 = a(view, i2, i3, jVar);
        } else {
            b2 = b(view, i2, i3, jVar);
        }
        if (b2) {
            view.measure(i2, i3);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(a(context, attributeSet, i2, i3).f3844b);
    }

    private void a(RecyclerView.o oVar, RecyclerView.s sVar, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i2;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = i2 - 1;
            i4 = -1;
        }
        while (i3 != i6) {
            View view = this.f3762d[i3];
            b bVar = (b) view.getLayoutParams();
            bVar.f3769b = c(oVar, sVar, e(view));
            bVar.f3768a = i5;
            i5 += bVar.f3769b;
            i3 += i4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
        if (r6 == r0) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r21 == null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0126, code lost:
        return r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fc  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.View r26, int r27, androidx.recyclerview.widget.RecyclerView.o r28, androidx.recyclerview.widget.RecyclerView.s r29) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):android.view.View");
    }
}
