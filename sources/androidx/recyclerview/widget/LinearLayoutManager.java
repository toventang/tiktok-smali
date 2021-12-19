package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.i implements RecyclerView.r.b, n.d {

    /* renamed from: a  reason: collision with root package name */
    private c f3774a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3775b;

    /* renamed from: c  reason: collision with root package name */
    private final b f3776c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f3777d;

    /* renamed from: j  reason: collision with root package name */
    public int f3778j;

    /* renamed from: k  reason: collision with root package name */
    x f3779k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3780l;

    /* renamed from: m  reason: collision with root package name */
    boolean f3781m;
    public boolean n;
    public boolean o;
    int p;
    int q;
    public boolean r;
    SavedState s;
    final a t;
    public int u;

    static {
        Covode.recordClassIndex(1465);
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.o oVar, RecyclerView.s sVar, a aVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean w_() {
        return true;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.recyclerview.widget.LinearLayoutManager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1467);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        int f3782a;

        /* renamed from: b  reason: collision with root package name */
        int f3783b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3784c;

        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (this.f3782a >= 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(1466);
        }

        public SavedState(SavedState savedState) {
            this.f3782a = savedState.f3782a;
            this.f3783b = savedState.f3783b;
            this.f3784c = savedState.f3784c;
        }

        SavedState(Parcel parcel) {
            this.f3782a = parcel.readInt();
            this.f3783b = parcel.readInt();
            this.f3784c = parcel.readInt() != 1 ? false : true;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f3782a);
            parcel.writeInt(this.f3783b);
            parcel.writeInt(this.f3784c ? 1 : 0);
        }
    }

    /* access modifiers changed from: protected */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3790a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3791b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3792c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3793d;

        static {
            Covode.recordClassIndex(1469);
        }

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f3790a = 0;
            this.f3791b = false;
            this.f3792c = false;
            this.f3793d = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.o oVar) {
        super.a(recyclerView, oVar);
        if (this.r) {
            c(oVar);
            oVar.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (s() > 0) {
            accessibilityEvent.setFromIndex(k());
            accessibilityEvent.setToIndex(m());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.s = savedState;
            if (this.p != -1) {
                savedState.f3782a = -1;
            }
            o();
        }
    }

    public void a(boolean z) {
        a((String) null);
        if (this.n != z) {
            this.n = z;
            o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        r rVar = new r(recyclerView.getContext());
        rVar.f3862g = i2;
        a(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void a(RecyclerView.s sVar) {
        super.a(sVar);
        this.s = null;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.t.a();
    }

    public void a(int i2, int i3) {
        this.p = i2;
        this.q = i3;
        SavedState savedState = this.s;
        if (savedState != null) {
            savedState.f3782a = -1;
        }
        o();
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.s sVar, c cVar, RecyclerView.i.a aVar) {
        int i2 = cVar.f3797d;
        if (i2 >= 0 && i2 < sVar.a()) {
            aVar.a(i2, Math.max(0, cVar.f3800g));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 != false) goto L_0x0016;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6, androidx.recyclerview.widget.RecyclerView.i.a r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.s
            r4 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0026
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.s
            boolean r1 = r0.f3784c
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.s
            int r2 = r0.f3782a
        L_0x0014:
            if (r1 == 0) goto L_0x0035
        L_0x0016:
            r1 = 0
        L_0x0017:
            int r0 = r5.u
            if (r1 >= r0) goto L_0x0037
            if (r2 < 0) goto L_0x0037
            if (r2 >= r6) goto L_0x0037
            r7.a(r2, r3)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0026:
            r5.C()
            boolean r1 = r5.f3781m
            int r2 = r5.p
            if (r2 != r4) goto L_0x0014
            if (r1 == 0) goto L_0x0034
            int r2 = r6 + -1
            goto L_0x0016
        L_0x0034:
            r2 = 0
        L_0x0035:
            r4 = 1
            goto L_0x0016
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.a(int, androidx.recyclerview.widget.RecyclerView$i$a):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(int i2, int i3, RecyclerView.s sVar, RecyclerView.i.a aVar) {
        if (this.f3778j != 0) {
            i2 = i3;
        }
        if (s() != 0 && i2 != 0) {
            i();
            a(i2 > 0 ? 1 : -1, Math.abs(i2), true, sVar);
            a(sVar, this.f3774a, aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void a(String str) {
        if (this.s == null) {
            super.a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.o oVar, RecyclerView.s sVar, c cVar, b bVar) {
        int u2;
        int f2;
        int i2;
        int i3;
        View a2 = cVar.a(oVar);
        if (a2 == null) {
            bVar.f3791b = true;
            return;
        }
        RecyclerView.j jVar = (RecyclerView.j) a2.getLayoutParams();
        boolean z = false;
        if (cVar.f3805l == null) {
            if (this.f3781m == (cVar.f3799f == -1)) {
                c(a2);
            } else {
                a(a2, 0);
            }
        } else {
            boolean z2 = this.f3781m;
            if (cVar.f3799f == -1) {
                z = true;
            }
            if (z2 == z) {
                a_(a2);
            } else {
                b_(a2);
            }
        }
        l(a2);
        bVar.f3790a = this.f3779k.e(a2);
        if (this.f3778j == 1) {
            if (h()) {
                i3 = this.J - v();
                i2 = i3 - this.f3779k.f(a2);
            } else {
                i2 = t();
                i3 = this.f3779k.f(a2) + i2;
            }
            if (cVar.f3799f == -1) {
                f2 = cVar.f3795b;
                u2 = cVar.f3795b - bVar.f3790a;
            } else {
                u2 = cVar.f3795b;
                f2 = cVar.f3795b + bVar.f3790a;
            }
        } else {
            u2 = u();
            f2 = this.f3779k.f(a2) + u2;
            if (cVar.f3799f == -1) {
                i3 = cVar.f3795b;
                i2 = cVar.f3795b - bVar.f3790a;
            } else {
                i2 = cVar.f3795b;
                i3 = cVar.f3795b + bVar.f3790a;
            }
        }
        b(a2, i2, u2, i3, f2);
        if (jVar.f3847c.isRemoved() || jVar.f3847c.isUpdated()) {
            bVar.f3792c = true;
        }
        bVar.f3793d = a2.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    public View a(RecyclerView.o oVar, RecyclerView.s sVar, boolean z, boolean z2) {
        int i2;
        int i3;
        i();
        int s2 = s();
        int i4 = -1;
        if (z2) {
            i2 = s() - 1;
            i3 = -1;
        } else {
            i4 = s2;
            i2 = 0;
            i3 = 1;
        }
        int a2 = sVar.a();
        int b2 = this.f3779k.b();
        int c2 = this.f3779k.c();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i4) {
            View g2 = g(i2);
            int e2 = e(g2);
            int a3 = this.f3779k.a(g2);
            int b3 = this.f3779k.b(g2);
            if (e2 >= 0 && e2 < a2) {
                if (!((RecyclerView.j) g2.getLayoutParams()).f3847c.isRemoved()) {
                    boolean z3 = b3 <= b2 && a3 < b2;
                    boolean z4 = a3 >= c2 && b3 > c2;
                    if (!z3 && !z4) {
                        return g2;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = g2;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = g2;
                    }
                    view2 = g2;
                } else if (view3 == null) {
                    view3 = g2;
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068 A[RETURN] */
    @Override // androidx.recyclerview.widget.RecyclerView.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a(android.view.View r6, int r7, androidx.recyclerview.widget.RecyclerView.o r8, androidx.recyclerview.widget.RecyclerView.s r9) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):android.view.View");
    }

    @Override // androidx.recyclerview.widget.n.d
    public final void a(View view, View view2) {
        a("Cannot drop a view during a scroll or layout calculation");
        i();
        C();
        int e2 = e(view);
        int e3 = e(view2);
        char c2 = e2 < e3 ? (char) 1 : 65535;
        if (this.f3781m) {
            if (c2 == 1) {
                a(e3, this.f3779k.c() - (this.f3779k.a(view2) + this.f3779k.e(view)));
            } else {
                a(e3, this.f3779k.c() - this.f3779k.b(view2));
            }
        } else if (c2 == 65535) {
            a(e3, this.f3779k.a(view2));
        } else {
            a(e3, this.f3779k.b(view2) - this.f3779k.e(view));
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        x f3785a;

        /* renamed from: b  reason: collision with root package name */
        int f3786b;

        /* renamed from: c  reason: collision with root package name */
        int f3787c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3788d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3789e;

        static {
            Covode.recordClassIndex(1468);
        }

        a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f3786b = -1;
            this.f3787c = Integer.MIN_VALUE;
            this.f3788d = false;
            this.f3789e = false;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            int b2;
            if (this.f3788d) {
                b2 = this.f3785a.c();
            } else {
                b2 = this.f3785a.b();
            }
            this.f3787c = b2;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f3786b + ", mCoordinate=" + this.f3787c + ", mLayoutFromEnd=" + this.f3788d + ", mValid=" + this.f3789e + '}';
        }

        public final void b(View view, int i2) {
            if (this.f3788d) {
                this.f3787c = this.f3785a.b(view) + this.f3785a.a();
            } else {
                this.f3787c = this.f3785a.a(view);
            }
            this.f3786b = i2;
        }

        public final void a(View view, int i2) {
            int a2 = this.f3785a.a();
            if (a2 >= 0) {
                b(view, i2);
                return;
            }
            this.f3786b = i2;
            if (this.f3788d) {
                int c2 = (this.f3785a.c() - a2) - this.f3785a.b(view);
                this.f3787c = this.f3785a.c() - c2;
                if (c2 > 0) {
                    int e2 = this.f3787c - this.f3785a.e(view);
                    int b2 = this.f3785a.b();
                    int min = e2 - (b2 + Math.min(this.f3785a.a(view) - b2, 0));
                    if (min < 0) {
                        this.f3787c += Math.min(c2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int a3 = this.f3785a.a(view);
            int b3 = a3 - this.f3785a.b();
            this.f3787c = a3;
            if (b3 > 0) {
                int c3 = (this.f3785a.c() - Math.min(0, (this.f3785a.c() - a2) - this.f3785a.b(view))) - (a3 + this.f3785a.e(view));
                if (c3 < 0) {
                    this.f3787c -= Math.min(b3, -c3);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f3794a = true;

        /* renamed from: b  reason: collision with root package name */
        int f3795b;

        /* renamed from: c  reason: collision with root package name */
        int f3796c;

        /* renamed from: d  reason: collision with root package name */
        int f3797d;

        /* renamed from: e  reason: collision with root package name */
        int f3798e;

        /* renamed from: f  reason: collision with root package name */
        int f3799f;

        /* renamed from: g  reason: collision with root package name */
        int f3800g;

        /* renamed from: h  reason: collision with root package name */
        int f3801h;

        /* renamed from: i  reason: collision with root package name */
        int f3802i;

        /* renamed from: j  reason: collision with root package name */
        boolean f3803j;

        /* renamed from: k  reason: collision with root package name */
        int f3804k;

        /* renamed from: l  reason: collision with root package name */
        List<RecyclerView.ViewHolder> f3805l;

        /* renamed from: m  reason: collision with root package name */
        boolean f3806m;

        static {
            Covode.recordClassIndex(1470);
        }

        c() {
        }

        private View a() {
            int size = this.f3805l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f3805l.get(i2).itemView;
                RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
                if (!jVar.f3847c.isRemoved() && this.f3797d == jVar.f3847c.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(RecyclerView.s sVar) {
            int i2 = this.f3797d;
            if (i2 < 0 || i2 >= sVar.a()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final View a(RecyclerView.o oVar) {
            if (this.f3805l != null) {
                return a();
            }
            View c2 = oVar.c(this.f3797d);
            this.f3797d += this.f3798e;
            return c2;
        }

        private View b(View view) {
            int layoutPosition;
            int size = this.f3805l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f3805l.get(i3).itemView;
                RecyclerView.j jVar = (RecyclerView.j) view3.getLayoutParams();
                if (view3 != view && !jVar.f3847c.isRemoved() && (layoutPosition = (jVar.f3847c.getLayoutPosition() - this.f3797d) * this.f3798e) >= 0 && layoutPosition < i2) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    }
                    i2 = layoutPosition;
                }
            }
            return view2;
        }

        public final void a(View view) {
            View b2 = b(view);
            if (b2 == null) {
                this.f3797d = -1;
            } else {
                this.f3797d = ((RecyclerView.j) b2.getLayoutParams()).f3847c.getLayoutPosition();
            }
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    private View G() {
        return g(0, s());
    }

    private View H() {
        return g(s() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean f() {
        if (this.f3778j == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean g() {
        if (this.f3778j == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        if (v.e(this.w) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        if (this.f3774a == null) {
            this.f3774a = new c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean x_() {
        if (this.s == null && this.f3775b == this.n) {
            return true;
        }
        return false;
    }

    private void C() {
        boolean z = true;
        if (this.f3778j == 1 || !h()) {
            z = this.f3780l;
        } else if (this.f3780l) {
            z = false;
        }
        this.f3781m = z;
    }

    private boolean D() {
        if (this.f3779k.g() == 0 && this.f3779k.d() == 0) {
            return true;
        }
        return false;
    }

    private View E() {
        int i2;
        if (this.f3781m) {
            i2 = s() - 1;
        } else {
            i2 = 0;
        }
        return g(i2);
    }

    private View F() {
        int s2;
        if (this.f3781m) {
            s2 = 0;
        } else {
            s2 = s() - 1;
        }
        return g(s2);
    }

    public final int k() {
        View a2 = a(0, s(), false, true);
        if (a2 == null) {
            return -1;
        }
        return e(a2);
    }

    public final int l() {
        View a2 = a(0, s(), true, false);
        if (a2 == null) {
            return -1;
        }
        return e(a2);
    }

    public final int m() {
        View a2 = a(s() - 1, -1, false, true);
        if (a2 == null) {
            return -1;
        }
        return e(a2);
    }

    public final int n() {
        View a2 = a(s() - 1, -1, true, false);
        if (a2 == null) {
            return -1;
        }
        return e(a2);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean z_() {
        if (!(this.I == 1073741824 || this.H == 1073741824)) {
            int s2 = s();
            for (int i2 = 0; i2 < s2; i2++) {
                ViewGroup.LayoutParams layoutParams = g(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public RecyclerView.j b() {
        return new RecyclerView.j(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public Parcelable e() {
        if (this.s != null) {
            return new SavedState(this.s);
        }
        SavedState savedState = new SavedState();
        if (s() > 0) {
            i();
            boolean z = this.f3775b ^ this.f3781m;
            savedState.f3784c = z;
            if (z) {
                View F = F();
                savedState.f3783b = this.f3779k.c() - this.f3779k.b(F);
                savedState.f3782a = e(F);
            } else {
                View E = E();
                savedState.f3782a = e(E);
                savedState.f3783b = this.f3779k.a(E) - this.f3779k.b();
            }
        } else {
            savedState.f3782a = -1;
        }
        return savedState;
    }

    private void a(a aVar) {
        e(aVar.f3786b, aVar.f3787c);
    }

    private void b(a aVar) {
        f(aVar.f3786b, aVar.f3787c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public int c(RecyclerView.s sVar) {
        return j(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public int d(RecyclerView.s sVar) {
        return h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public int e(RecyclerView.s sVar) {
        return h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public int f(RecyclerView.s sVar) {
        return i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public int g(RecyclerView.s sVar) {
        return i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public int b(RecyclerView.s sVar) {
        return j(sVar);
    }

    /* access modifiers changed from: package-private */
    public final View c(boolean z) {
        if (this.f3781m) {
            return a(s() - 1, -1, z, true);
        }
        return a(0, s(), z, true);
    }

    /* access modifiers changed from: package-private */
    public final View d(boolean z) {
        if (this.f3781m) {
            return a(0, s(), z, true);
        }
        return a(s() - 1, -1, z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void e(int i2) {
        this.p = i2;
        this.q = Integer.MIN_VALUE;
        SavedState savedState = this.s;
        if (savedState != null) {
            savedState.f3782a = -1;
        }
        o();
    }

    private int h(RecyclerView.s sVar) {
        if (s() == 0) {
            return 0;
        }
        i();
        return aa.a(sVar, this.f3779k, c(!this.o), d(!this.o), this, this.o, this.f3781m);
    }

    private int i(RecyclerView.s sVar) {
        if (s() == 0) {
            return 0;
        }
        i();
        return aa.a(sVar, this.f3779k, c(!this.o), d(!this.o), this, this.o);
    }

    private int j(RecyclerView.s sVar) {
        if (s() == 0) {
            return 0;
        }
        i();
        return aa.b(sVar, this.f3779k, c(!this.o), d(!this.o), this, this.o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r.b
    public PointF d(int i2) {
        if (s() == 0) {
            return null;
        }
        boolean z = false;
        int i3 = 1;
        if (i2 < e(g(0))) {
            z = true;
        }
        if (z != this.f3781m) {
            i3 = -1;
        }
        if (this.f3778j == 0) {
            return new PointF((float) i3, 0.0f);
        }
        return new PointF(0.0f, (float) i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final View c(int i2) {
        int s2 = s();
        if (s2 == 0) {
            return null;
        }
        int e2 = i2 - e(g(0));
        if (e2 >= 0 && e2 < s2) {
            View g2 = g(e2);
            if (e(g2) == i2) {
                return g2;
            }
        }
        return super.c(i2);
    }

    /* access modifiers changed from: package-private */
    public final int f(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 == 130 && this.f3778j == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f3778j == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f3778j == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f3778j == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f3778j != 1 && h()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f3778j != 1 && h()) {
            return 1;
        } else {
            return -1;
        }
    }

    public final void b(int i2) {
        if (i2 == 0 || i2 == 1) {
            a((String) null);
            if (i2 != this.f3778j || this.f3779k == null) {
                x a2 = x.a(this, i2);
                this.f3779k = a2;
                this.t.f3785a = a2;
                this.f3778j = i2;
                o();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(i2)));
    }

    public final void b(boolean z) {
        a((String) null);
        if (z != this.f3780l) {
            this.f3780l = z;
            o();
        }
    }

    public LinearLayoutManager(int i2, boolean z) {
        this.f3778j = 1;
        this.o = true;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.t = new a();
        this.f3776c = new b();
        this.u = 2;
        this.f3777d = new int[2];
        b(i2);
        b(z);
    }

    private void e(int i2, int i3) {
        int i4;
        this.f3774a.f3796c = this.f3779k.c() - i3;
        c cVar = this.f3774a;
        if (this.f3781m) {
            i4 = -1;
        } else {
            i4 = 1;
        }
        cVar.f3798e = i4;
        this.f3774a.f3797d = i2;
        this.f3774a.f3799f = 1;
        this.f3774a.f3795b = i3;
        this.f3774a.f3800g = Integer.MIN_VALUE;
    }

    private void f(int i2, int i3) {
        int i4;
        this.f3774a.f3796c = i3 - this.f3779k.b();
        this.f3774a.f3797d = i2;
        c cVar = this.f3774a;
        if (this.f3781m) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        cVar.f3798e = i4;
        this.f3774a.f3799f = -1;
        this.f3774a.f3795b = i3;
        this.f3774a.f3800g = Integer.MIN_VALUE;
    }

    private View g(int i2, int i3) {
        int i4;
        int i5;
        i();
        if (i3 <= i2 && i3 >= i2) {
            return g(i2);
        }
        if (this.f3779k.a(g(i2)) < this.f3779k.b()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        if (this.f3778j == 0) {
            return this.x.a(i2, i3, i4, i5);
        }
        return this.y.a(i2, i3, i4, i5);
    }

    private void a(RecyclerView.o oVar, c cVar) {
        if (cVar.f3794a && !cVar.f3806m) {
            int i2 = cVar.f3800g;
            int i3 = cVar.f3802i;
            if (cVar.f3799f == -1) {
                int s2 = s();
                if (i2 >= 0) {
                    int d2 = (this.f3779k.d() - i2) + i3;
                    if (this.f3781m) {
                        for (int i4 = 0; i4 < s2; i4++) {
                            View g2 = g(i4);
                            if (this.f3779k.a(g2) < d2 || this.f3779k.d(g2) < d2) {
                                a(oVar, 0, i4);
                                return;
                            }
                        }
                        return;
                    }
                    int i5 = s2 - 1;
                    for (int i6 = i5; i6 >= 0; i6--) {
                        View g3 = g(i6);
                        if (this.f3779k.a(g3) < d2 || this.f3779k.d(g3) < d2) {
                            a(oVar, i5, i6);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int i7 = i2 - i3;
                int s3 = s();
                if (this.f3781m) {
                    int i8 = s3 - 1;
                    for (int i9 = i8; i9 >= 0; i9--) {
                        View g4 = g(i9);
                        if (this.f3779k.b(g4) > i7 || this.f3779k.c(g4) > i7) {
                            a(oVar, i8, i9);
                            return;
                        }
                    }
                    return;
                }
                for (int i10 = 0; i10 < s3; i10++) {
                    View g5 = g(i10);
                    if (this.f3779k.b(g5) > i7 || this.f3779k.c(g5) > i7) {
                        a(oVar, 0, i10);
                        return;
                    }
                }
            }
        }
    }

    private void a(RecyclerView.s sVar, int[] iArr) {
        int i2;
        int i3;
        if (sVar.f3876a != -1) {
            i2 = this.f3779k.e();
        } else {
            i2 = 0;
        }
        if (this.f3774a.f3799f == -1) {
            i3 = 0;
        } else {
            i3 = i2;
            i2 = 0;
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int a2;
        int i8;
        View c2;
        int a3;
        int i9;
        int i10;
        View a4;
        boolean z2;
        boolean z3;
        int i11;
        boolean z4;
        boolean z5;
        int a5;
        if (!(this.s == null && this.p == -1) && sVar.a() == 0) {
            c(oVar);
            return;
        }
        SavedState savedState = this.s;
        if (savedState != null && savedState.a()) {
            this.p = this.s.f3782a;
        }
        i();
        this.f3774a.f3794a = false;
        C();
        View z6 = z();
        if (!this.t.f3789e || this.p != -1 || this.s != null) {
            this.t.a();
            this.t.f3788d = this.f3781m ^ this.n;
            a aVar = this.t;
            if (!sVar.f3882g && (i11 = this.p) != -1) {
                if (i11 < 0 || i11 >= sVar.a()) {
                    this.p = -1;
                    this.q = Integer.MIN_VALUE;
                } else {
                    aVar.f3786b = this.p;
                    SavedState savedState2 = this.s;
                    if (savedState2 == null || !savedState2.a()) {
                        if (this.q == Integer.MIN_VALUE) {
                            View c3 = c(this.p);
                            if (c3 == null) {
                                if (s() > 0) {
                                    if (this.p < e(g(0))) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 == this.f3781m) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    aVar.f3788d = z5;
                                }
                                aVar.b();
                            } else if (this.f3779k.e(c3) > this.f3779k.e()) {
                                aVar.b();
                            } else if (this.f3779k.a(c3) - this.f3779k.b() < 0) {
                                aVar.f3787c = this.f3779k.b();
                                aVar.f3788d = false;
                            } else if (this.f3779k.c() - this.f3779k.b(c3) < 0) {
                                aVar.f3787c = this.f3779k.c();
                                aVar.f3788d = true;
                            } else {
                                if (aVar.f3788d) {
                                    a5 = this.f3779k.b(c3) + this.f3779k.a();
                                } else {
                                    a5 = this.f3779k.a(c3);
                                }
                                aVar.f3787c = a5;
                            }
                        } else {
                            aVar.f3788d = this.f3781m;
                            if (this.f3781m) {
                                aVar.f3787c = this.f3779k.c() - this.q;
                            } else {
                                aVar.f3787c = this.f3779k.b() + this.q;
                            }
                        }
                        this.t.f3789e = true;
                    } else {
                        aVar.f3788d = this.s.f3784c;
                        if (aVar.f3788d) {
                            aVar.f3787c = this.f3779k.c() - this.s.f3783b;
                        } else {
                            aVar.f3787c = this.f3779k.b() + this.s.f3783b;
                        }
                        this.t.f3789e = true;
                    }
                }
            }
            if (s() != 0) {
                View z7 = z();
                if (z7 != null) {
                    RecyclerView.j jVar = (RecyclerView.j) z7.getLayoutParams();
                    if (!jVar.f3847c.isRemoved() && jVar.f3847c.getLayoutPosition() >= 0 && jVar.f3847c.getLayoutPosition() < sVar.a()) {
                        aVar.a(z7, e(z7));
                        this.t.f3789e = true;
                    }
                }
                if (this.f3775b == this.n && (a4 = a(oVar, sVar, aVar.f3788d, this.n)) != null) {
                    aVar.b(a4, e(a4));
                    if (!sVar.f3882g && x_()) {
                        int a6 = this.f3779k.a(a4);
                        int b2 = this.f3779k.b(a4);
                        int b3 = this.f3779k.b();
                        int c4 = this.f3779k.c();
                        if (b2 > b3 || a6 >= b3) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (a6 < c4 || b2 <= c4) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z2 || z3) {
                            if (aVar.f3788d) {
                                b3 = c4;
                            }
                            aVar.f3787c = b3;
                        }
                    }
                    this.t.f3789e = true;
                }
            }
            aVar.b();
            if (this.n) {
                i10 = sVar.a() - 1;
            } else {
                i10 = 0;
            }
            aVar.f3786b = i10;
            this.t.f3789e = true;
        } else if (z6 != null && (this.f3779k.a(z6) >= this.f3779k.c() || this.f3779k.b(z6) <= this.f3779k.b())) {
            this.t.a(z6, e(z6));
        }
        c cVar = this.f3774a;
        if (cVar.f3804k >= 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        cVar.f3799f = i2;
        int[] iArr = this.f3777d;
        iArr[0] = 0;
        iArr[1] = 0;
        a(sVar, iArr);
        int max = Math.max(0, this.f3777d[0]) + this.f3779k.b();
        int max2 = Math.max(0, this.f3777d[1]) + this.f3779k.f();
        if (!(!sVar.f3882g || (i8 = this.p) == -1 || this.q == Integer.MIN_VALUE || (c2 = c(i8)) == null)) {
            if (this.f3781m) {
                i9 = this.f3779k.c() - this.f3779k.b(c2);
                a3 = this.q;
            } else {
                a3 = this.f3779k.a(c2) - this.f3779k.b();
                i9 = this.q;
            }
            int i12 = i9 - a3;
            if (i12 > 0) {
                max += i12;
            } else {
                max2 -= i12;
            }
        }
        if (!this.t.f3788d ? !this.f3781m : this.f3781m) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        a(oVar, sVar, this.t, i3);
        a(oVar);
        this.f3774a.f3806m = D();
        this.f3774a.f3803j = sVar.f3882g;
        this.f3774a.f3802i = 0;
        if (this.t.f3788d) {
            b(this.t);
            this.f3774a.f3801h = max;
            a(oVar, this.f3774a, sVar, false);
            i5 = this.f3774a.f3795b;
            int i13 = this.f3774a.f3797d;
            if (this.f3774a.f3796c > 0) {
                max2 += this.f3774a.f3796c;
            }
            a(this.t);
            this.f3774a.f3801h = max2;
            this.f3774a.f3797d += this.f3774a.f3798e;
            a(oVar, this.f3774a, sVar, false);
            i4 = this.f3774a.f3795b;
            if (this.f3774a.f3796c > 0) {
                int i14 = this.f3774a.f3796c;
                f(i13, i5);
                this.f3774a.f3801h = i14;
                a(oVar, this.f3774a, sVar, false);
                i5 = this.f3774a.f3795b;
            }
        } else {
            a(this.t);
            this.f3774a.f3801h = max2;
            a(oVar, this.f3774a, sVar, false);
            i4 = this.f3774a.f3795b;
            int i15 = this.f3774a.f3797d;
            if (this.f3774a.f3796c > 0) {
                max += this.f3774a.f3796c;
            }
            b(this.t);
            this.f3774a.f3801h = max;
            this.f3774a.f3797d += this.f3774a.f3798e;
            a(oVar, this.f3774a, sVar, false);
            i5 = this.f3774a.f3795b;
            if (this.f3774a.f3796c > 0) {
                int i16 = this.f3774a.f3796c;
                e(i15, i4);
                this.f3774a.f3801h = i16;
                a(oVar, this.f3774a, sVar, false);
                i4 = this.f3774a.f3795b;
            }
        }
        if (s() > 0) {
            if (this.f3781m ^ this.n) {
                int a7 = a(i4, oVar, sVar, true);
                i6 = i5 + a7;
                i7 = i4 + a7;
                a2 = b(i6, oVar, sVar, false);
            } else {
                int b4 = b(i5, oVar, sVar, true);
                i6 = i5 + b4;
                i7 = i4 + b4;
                a2 = a(i7, oVar, sVar, false);
            }
            i5 = i6 + a2;
            i4 = i7 + a2;
        }
        if (sVar.f3886k && s() != 0 && !sVar.f3882g && x_()) {
            List<RecyclerView.ViewHolder> list = oVar.f3854d;
            int size = list.size();
            int e2 = e(g(0));
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                RecyclerView.ViewHolder viewHolder = list.get(i19);
                if (!viewHolder.isRemoved()) {
                    if (viewHolder.getLayoutPosition() < e2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.f3781m) {
                        i17 += this.f3779k.e(viewHolder.itemView);
                    } else {
                        i18 += this.f3779k.e(viewHolder.itemView);
                    }
                }
            }
            this.f3774a.f3805l = list;
            if (i17 > 0) {
                f(e(E()), i5);
                this.f3774a.f3801h = i17;
                this.f3774a.f3796c = 0;
                this.f3774a.a((View) null);
                a(oVar, this.f3774a, sVar, false);
            }
            if (i18 > 0) {
                e(e(F()), i4);
                this.f3774a.f3801h = i18;
                this.f3774a.f3796c = 0;
                this.f3774a.a((View) null);
                a(oVar, this.f3774a, sVar, false);
            }
            this.f3774a.f3805l = null;
        }
        if (!sVar.f3882g) {
            x xVar = this.f3779k;
            xVar.f4219b = xVar.e();
        } else {
            this.t.a();
        }
        this.f3775b = this.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        if (this.f3778j == 1) {
            return 0;
        }
        return c(i2, oVar, sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        if (this.f3778j == 0) {
            return 0;
        }
        return c(i2, oVar, sVar);
    }

    private void a(RecyclerView.o oVar, int i2, int i3) {
        if (i2 != i3) {
            if (i3 > i2) {
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    a(i4, oVar);
                }
                return;
            }
            while (i2 > i3) {
                a(i2, oVar);
                i2--;
            }
        }
    }

    private int c(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        int i3;
        if (s() == 0 || i2 == 0) {
            return 0;
        }
        i();
        this.f3774a.f3794a = true;
        if (i2 > 0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int abs = Math.abs(i2);
        a(i3, abs, true, sVar);
        int a2 = this.f3774a.f3800g + a(oVar, this.f3774a, sVar, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i2 = i3 * a2;
        }
        this.f3779k.a(-i2);
        this.f3774a.f3804k = i2;
        return i2;
    }

    private int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar, boolean z) {
        int c2;
        int c3 = this.f3779k.c() - i2;
        if (c3 <= 0) {
            return 0;
        }
        int i3 = -c(-c3, oVar, sVar);
        int i4 = i2 + i3;
        if (!z || (c2 = this.f3779k.c() - i4) <= 0) {
            return i3;
        }
        this.f3779k.a(c2);
        return c2 + i3;
    }

    private int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar, boolean z) {
        int b2;
        int b3 = i2 - this.f3779k.b();
        if (b3 <= 0) {
            return 0;
        }
        int i3 = -c(b3, oVar, sVar);
        int i4 = i2 + i3;
        if (!z || (b2 = i4 - this.f3779k.b()) <= 0) {
            return i3;
        }
        this.f3779k.a(-b2);
        return i3 - b2;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f3778j = 1;
        this.o = true;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.t = new a();
        this.f3776c = new b();
        this.u = 2;
        this.f3777d = new int[2];
        RecyclerView.i.b a2 = a(context, attributeSet, i2, i3);
        b(a2.f3843a);
        b(a2.f3845c);
        a(a2.f3846d);
    }

    private int a(RecyclerView.o oVar, c cVar, RecyclerView.s sVar, boolean z) {
        int i2 = cVar.f3796c;
        if (cVar.f3800g != Integer.MIN_VALUE) {
            if (cVar.f3796c < 0) {
                cVar.f3800g += cVar.f3796c;
            }
            a(oVar, cVar);
        }
        int i3 = cVar.f3796c + cVar.f3801h;
        b bVar = this.f3776c;
        while (true) {
            if ((!cVar.f3806m && i3 <= 0) || !cVar.a(sVar)) {
                break;
            }
            bVar.a();
            a(oVar, sVar, cVar, bVar);
            if (bVar.f3791b) {
                break;
            }
            cVar.f3795b += bVar.f3790a * cVar.f3799f;
            if (!bVar.f3792c || cVar.f3805l != null || !sVar.f3882g) {
                cVar.f3796c -= bVar.f3790a;
                i3 -= bVar.f3790a;
            }
            if (cVar.f3800g != Integer.MIN_VALUE) {
                cVar.f3800g += bVar.f3790a;
                if (cVar.f3796c < 0) {
                    cVar.f3800g += cVar.f3796c;
                }
                a(oVar, cVar);
            }
            if (z && bVar.f3793d) {
                break;
            }
        }
        return i2 - cVar.f3796c;
    }

    private View a(int i2, int i3, boolean z, boolean z2) {
        int i4;
        i();
        int i5 = 320;
        if (z) {
            i4 = 24579;
        } else {
            i4 = 320;
        }
        if (!z2) {
            i5 = 0;
        }
        if (this.f3778j == 0) {
            return this.x.a(i2, i3, i4, i5);
        }
        return this.y.a(i2, i3, i4, i5);
    }

    private void a(int i2, int i3, boolean z, RecyclerView.s sVar) {
        int i4;
        int b2;
        this.f3774a.f3806m = D();
        this.f3774a.f3799f = i2;
        int[] iArr = this.f3777d;
        boolean z2 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        a(sVar, iArr);
        int max = Math.max(0, this.f3777d[0]);
        int max2 = Math.max(0, this.f3777d[1]);
        if (i2 == 1) {
            z2 = true;
        }
        c cVar = this.f3774a;
        if (z2) {
            i4 = max2;
        } else {
            i4 = max;
        }
        cVar.f3801h = i4;
        c cVar2 = this.f3774a;
        if (!z2) {
            max = max2;
        }
        cVar2.f3802i = max;
        if (z2) {
            this.f3774a.f3801h += this.f3779k.f();
            View F = F();
            c cVar3 = this.f3774a;
            if (this.f3781m) {
                i5 = -1;
            }
            cVar3.f3798e = i5;
            this.f3774a.f3797d = e(F) + this.f3774a.f3798e;
            this.f3774a.f3795b = this.f3779k.b(F);
            b2 = this.f3779k.b(F) - this.f3779k.c();
        } else {
            View E = E();
            this.f3774a.f3801h += this.f3779k.b();
            c cVar4 = this.f3774a;
            if (!this.f3781m) {
                i5 = -1;
            }
            cVar4.f3798e = i5;
            this.f3774a.f3797d = e(E) + this.f3774a.f3798e;
            this.f3774a.f3795b = this.f3779k.a(E);
            b2 = (-this.f3779k.a(E)) + this.f3779k.b();
        }
        this.f3774a.f3796c = i3;
        if (z) {
            this.f3774a.f3796c -= b2;
        }
        this.f3774a.f3800g = b2;
    }
}
