package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.x;
import com.bytedance.covode.number.Covode;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.i implements RecyclerView.r.b, a {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ boolean f49613j = true;

    /* renamed from: k  reason: collision with root package name */
    private static final Rect f49614k = new Rect();
    private int L;
    private int M;
    private SparseArray<View> N;
    private final Context O;
    private View P;
    private int Q;
    private c.a R;

    /* renamed from: a  reason: collision with root package name */
    public int f49615a;

    /* renamed from: b  reason: collision with root package name */
    public int f49616b;

    /* renamed from: c  reason: collision with root package name */
    public int f49617c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f49618d;

    /* renamed from: e  reason: collision with root package name */
    public List<b> f49619e;

    /* renamed from: f  reason: collision with root package name */
    public final c f49620f;

    /* renamed from: g  reason: collision with root package name */
    public x f49621g;

    /* renamed from: h  reason: collision with root package name */
    public x f49622h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f49623i;

    /* renamed from: l  reason: collision with root package name */
    private int f49624l;

    /* renamed from: m  reason: collision with root package name */
    private int f49625m;
    private boolean n;
    private RecyclerView.o o;
    private RecyclerView.s p;
    private b q;
    private a r;
    private SavedState s;
    private int t;
    private int u;

    public static class LayoutParams extends RecyclerView.j implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() {
            /* class com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.AnonymousClass1 */

            static {
                Covode.recordClassIndex(31031);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ LayoutParams[] newArray(int i2) {
                return new LayoutParams[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private float f49626a;

        /* renamed from: b  reason: collision with root package name */
        private float f49627b = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        private int f49628g = -1;

        /* renamed from: h  reason: collision with root package name */
        private float f49629h = -1.0f;

        /* renamed from: i  reason: collision with root package name */
        private int f49630i;

        /* renamed from: j  reason: collision with root package name */
        private int f49631j;

        /* renamed from: k  reason: collision with root package name */
        private int f49632k = 16777215;

        /* renamed from: l  reason: collision with root package name */
        private int f49633l = 16777215;

        /* renamed from: m  reason: collision with root package name */
        private boolean f49634m;

        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int a() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int b() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float c() {
            return this.f49626a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float d() {
            return this.f49627b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int e() {
            return this.f49628g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return this.f49630i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g() {
            return this.f49631j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return this.f49632k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i() {
            return this.f49633l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean j() {
            return this.f49634m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float k() {
            return this.f49629h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int l() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.bottomMargin;
        }

        static {
            Covode.recordClassIndex(31030);
        }

        public LayoutParams() {
            super(-2, -2);
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void a(int i2) {
            this.f49630i = i2;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void b(int i2) {
            this.f49631j = i2;
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            boolean z;
            this.f49626a = parcel.readFloat();
            this.f49627b = parcel.readFloat();
            this.f49628g = parcel.readInt();
            this.f49629h = parcel.readFloat();
            this.f49630i = parcel.readInt();
            this.f49631j = parcel.readInt();
            this.f49632k = parcel.readInt();
            this.f49633l = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f49634m = z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeFloat(this.f49626a);
            parcel.writeFloat(this.f49627b);
            parcel.writeInt(this.f49628g);
            parcel.writeFloat(this.f49629h);
            parcel.writeInt(this.f49630i);
            parcel.writeInt(this.f49631j);
            parcel.writeInt(this.f49632k);
            parcel.writeInt(this.f49633l);
            parcel.writeByte(this.f49634m ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.google.android.flexbox.FlexboxLayoutManager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(31033);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public int f49635a;

        /* renamed from: b  reason: collision with root package name */
        public int f49636b;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        static {
            Covode.recordClassIndex(31032);
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f49635a + ", mAnchorOffset=" + this.f49636b + '}';
        }

        private SavedState(Parcel parcel) {
            this.f49635a = parcel.readInt();
            this.f49636b = parcel.readInt();
        }

        public final boolean a(int i2) {
            int i3 = this.f49635a;
            if (i3 < 0 || i3 >= i2) {
                return false;
            }
            return true;
        }

        private SavedState(SavedState savedState) {
            this.f49635a = savedState.f49635a;
            this.f49636b = savedState.f49636b;
        }

        /* synthetic */ SavedState(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f49635a);
            parcel.writeInt(this.f49636b);
        }

        /* synthetic */ SavedState(SavedState savedState, byte b2) {
            this(savedState);
        }
    }

    @Override // com.google.android.flexbox.a
    public final int c() {
        return this.f49615a;
    }

    @Override // com.google.android.flexbox.a
    public final int d() {
        return this.f49616b;
    }

    @Override // com.google.android.flexbox.a
    public final int h() {
        return this.f49624l;
    }

    @Override // com.google.android.flexbox.a
    public final int k() {
        return this.f49625m;
    }

    @Override // com.google.android.flexbox.a
    public final List<b> l() {
        return this.f49619e;
    }

    public final void b(int i2) {
        if (this.f49615a != i2) {
            r();
            this.f49615a = i2;
            this.f49621g = null;
            this.f49622h = null;
            H();
            o();
        }
    }

    @Override // com.google.android.flexbox.a
    public final int a(View view) {
        int s2;
        int t2;
        if (i()) {
            s2 = u(view);
            t2 = v(view);
        } else {
            s2 = s(view);
            t2 = t(view);
        }
        return s2 + t2;
    }

    @Override // com.google.android.flexbox.a
    public final void a(View view, b bVar) {
        b(view, f49614k);
        if (i()) {
            int u2 = u(view) + v(view);
            bVar.f49660e += u2;
            bVar.f49661f += u2;
            return;
        }
        int s2 = s(view) + t(view);
        bVar.f49660e += s2;
        bVar.f49661f += s2;
    }

    @Override // com.google.android.flexbox.a
    public final View a(int i2) {
        return f(i2);
    }

    @Override // com.google.android.flexbox.a
    public final int a(int i2, int i3) {
        return a(this.J, this.H, i2, i3, f());
    }

    @Override // com.google.android.flexbox.a
    public final void a(int i2, View view) {
        this.N.put(i2, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j b() {
        return new LayoutParams();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean a(RecyclerView.j jVar) {
        return jVar instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.s = (SavedState) parcelable;
            o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        super.a(recyclerView, i2, i3);
        k(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
        super.a(recyclerView, i2, i3, obj);
        k(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void b(RecyclerView recyclerView, int i2, int i3) {
        super.b(recyclerView, i2, i3);
        k(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        super.a(recyclerView, i2, i3, i4);
        k(Math.min(i2, i3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02a0  */
    @Override // androidx.recyclerview.widget.RecyclerView.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.recyclerview.widget.RecyclerView.o r24, androidx.recyclerview.widget.RecyclerView.s r25) {
        /*
        // Method dump skipped, instructions count: 1206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.c(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.s sVar) {
        super.a(sVar);
        this.s = null;
        this.t = -1;
        this.u = Integer.MIN_VALUE;
        this.Q = -1;
        this.r.a();
        this.N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        r rVar = new r(recyclerView.getContext());
        rVar.f3862g = i2;
        a(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.o oVar) {
        super.a(recyclerView, oVar);
        if (this.f49623i) {
            c(oVar);
            oVar.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        if (!i() || (this.f49616b == 0 && i())) {
            int c2 = c(i2, oVar, sVar);
            this.N.clear();
            return c2;
        }
        int n2 = n(i2);
        this.r.f49641d += n2;
        this.f49622h.a(-n2);
        return n2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        if (i() || (this.f49616b == 0 && !i())) {
            int c2 = c(i2, oVar, sVar);
            this.N.clear();
            return c2;
        }
        int n2 = n(i2);
        this.r.f49641d += n2;
        this.f49622h.a(-n2);
        return n2;
    }

    @Override // com.google.android.flexbox.a
    public final int a() {
        return this.p.a();
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ boolean f49637h = true;

        /* renamed from: a  reason: collision with root package name */
        public int f49638a;

        /* renamed from: b  reason: collision with root package name */
        public int f49639b;

        /* renamed from: c  reason: collision with root package name */
        public int f49640c;

        /* renamed from: d  reason: collision with root package name */
        public int f49641d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f49642e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f49643f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f49644g;

        static {
            Covode.recordClassIndex(31034);
        }

        public final void a() {
            this.f49638a = -1;
            this.f49639b = -1;
            this.f49640c = Integer.MIN_VALUE;
            boolean z = false;
            this.f49643f = false;
            this.f49644g = false;
            if (FlexboxLayoutManager.this.i()) {
                if (FlexboxLayoutManager.this.f49616b == 0) {
                    if (FlexboxLayoutManager.this.f49615a == 1) {
                        z = true;
                    }
                    this.f49642e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f49616b == 2) {
                    z = true;
                }
                this.f49642e = z;
            } else if (FlexboxLayoutManager.this.f49616b == 0) {
                if (FlexboxLayoutManager.this.f49615a == 3) {
                    z = true;
                }
                this.f49642e = z;
            } else {
                if (FlexboxLayoutManager.this.f49616b == 2) {
                    z = true;
                }
                this.f49642e = z;
            }
        }

        public final void b() {
            int b2;
            int b3;
            if (FlexboxLayoutManager.this.i() || !FlexboxLayoutManager.this.f49618d) {
                if (this.f49642e) {
                    b2 = FlexboxLayoutManager.this.f49621g.c();
                } else {
                    b2 = FlexboxLayoutManager.this.f49621g.b();
                }
                this.f49640c = b2;
                return;
            }
            if (this.f49642e) {
                b3 = FlexboxLayoutManager.this.f49621g.c();
            } else {
                b3 = FlexboxLayoutManager.this.J - FlexboxLayoutManager.this.f49621g.b();
            }
            this.f49640c = b3;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f49638a + ", mFlexLinePosition=" + this.f49639b + ", mCoordinate=" + this.f49640c + ", mPerpendicularCoordinate=" + this.f49641d + ", mLayoutFromEnd=" + this.f49642e + ", mValid=" + this.f49643f + ", mAssignedFromSavedState=" + this.f49644g + '}';
        }

        private a() {
        }

        /* synthetic */ a(FlexboxLayoutManager flexboxLayoutManager, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f49646a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f49647b;

        /* renamed from: c  reason: collision with root package name */
        public int f49648c;

        /* renamed from: d  reason: collision with root package name */
        public int f49649d;

        /* renamed from: e  reason: collision with root package name */
        public int f49650e;

        /* renamed from: f  reason: collision with root package name */
        public int f49651f;

        /* renamed from: g  reason: collision with root package name */
        public int f49652g;

        /* renamed from: h  reason: collision with root package name */
        public int f49653h;

        /* renamed from: i  reason: collision with root package name */
        public int f49654i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f49655j;

        static {
            Covode.recordClassIndex(31035);
        }

        private b() {
            this.f49653h = 1;
            this.f49654i = 1;
        }

        public final String toString() {
            return "LayoutState{mAvailable=" + this.f49646a + ", mFlexLinePosition=" + this.f49648c + ", mPosition=" + this.f49649d + ", mOffset=" + this.f49650e + ", mScrollingOffset=" + this.f49651f + ", mLastScrollDelta=" + this.f49652g + ", mItemDirection=" + this.f49653h + ", mLayoutDirection=" + this.f49654i + '}';
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(31029);
    }

    private void G() {
        if (this.q == null) {
            this.q = new b((byte) 0);
        }
    }

    private void H() {
        this.f49619e.clear();
        this.r.a();
        this.r.f49641d = 0;
    }

    @Override // com.google.android.flexbox.a
    public final boolean i() {
        int i2 = this.f49615a;
        if (i2 == 0 || i2 == 1) {
            return true;
        }
        return false;
    }

    private void E() {
        int i2;
        boolean z;
        if (i()) {
            i2 = this.I;
        } else {
            i2 = this.H;
        }
        b bVar = this.q;
        if (i2 == 0 || i2 == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        bVar.f49647b = z;
    }

    private int I() {
        View a2 = a(0, s(), false);
        if (a2 == null) {
            return -1;
        }
        return e(a2);
    }

    public final int C() {
        View a2 = a(s() - 1, -1, false);
        if (a2 == null) {
            return -1;
        }
        return e(a2);
    }

    public final int D() {
        View a2 = a(s() - 1, -1, true);
        if (a2 == null) {
            return -1;
        }
        return e(a2);
    }

    public final void m() {
        int i2 = this.f49616b;
        if (i2 != 1) {
            if (i2 == 0) {
                r();
                H();
            }
            this.f49616b = 1;
            this.f49621g = null;
            this.f49622h = null;
            o();
        }
    }

    public final void n() {
        if (this.f49624l != 4) {
            r();
            H();
            this.f49624l = 4;
            o();
        }
    }

    private void F() {
        if (this.f49621g == null) {
            if (i()) {
                if (this.f49616b != 0) {
                    this.f49621g = x.b(this);
                    this.f49622h = x.a(this);
                    return;
                }
            } else if (this.f49616b == 0) {
                this.f49621g = x.b(this);
                this.f49622h = x.a(this);
                return;
            }
            this.f49621g = x.a(this);
            this.f49622h = x.b(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final Parcelable e() {
        if (this.s != null) {
            return new SavedState(this.s, (byte) 0);
        }
        SavedState savedState = new SavedState();
        if (s() > 0) {
            View g2 = g(0);
            savedState.f49635a = e(g2);
            savedState.f49636b = this.f49621g.a(g2) - this.f49621g.b();
        } else {
            savedState.f49635a = -1;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean f() {
        int i2;
        if (this.f49616b == 0) {
            return i();
        }
        if (!i()) {
            return true;
        }
        int i3 = this.J;
        View view = this.P;
        if (view != null) {
            i2 = view.getWidth();
        } else {
            i2 = 0;
        }
        if (i3 > i2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean g() {
        int i2;
        if (this.f49616b != 0) {
            if (!i()) {
                int i3 = this.K;
                View view = this.P;
                if (view != null) {
                    i2 = view.getHeight();
                } else {
                    i2 = 0;
                }
                if (i3 > i2) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (!i()) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.google.android.flexbox.a
    public final int j() {
        if (this.f49619e.size() == 0) {
            return 0;
        }
        int i2 = Integer.MIN_VALUE;
        int size = this.f49619e.size();
        for (int i3 = 0; i3 < size; i3++) {
            i2 = Math.max(i2, this.f49619e.get(i3).f49660e);
        }
        return i2;
    }

    public FlexboxLayoutManager(Context context) {
        this(context, (byte) 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int b(RecyclerView.s sVar) {
        return j(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int c(RecyclerView.s sVar) {
        return j(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int d(RecyclerView.s sVar) {
        return i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int e(RecyclerView.s sVar) {
        return i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int f(RecyclerView.s sVar) {
        return h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int g(RecyclerView.s sVar) {
        return h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView recyclerView) {
        super.c(recyclerView);
        this.P = (View) recyclerView.getParent();
    }

    private View f(int i2) {
        View view = this.N.get(i2);
        if (view != null) {
            return view;
        }
        return this.o.c(i2);
    }

    @Override // com.google.android.flexbox.a
    public final int b(View view) {
        int u2;
        int v;
        if (i()) {
            u2 = s(view);
            v = t(view);
        } else {
            u2 = u(view);
            v = v(view);
        }
        return u2 + v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i2) {
        this.t = i2;
        this.u = Integer.MIN_VALUE;
        SavedState savedState = this.s;
        if (savedState != null) {
            savedState.f49635a = -1;
        }
        o();
    }

    private int h(RecyclerView.s sVar) {
        if (s() == 0) {
            return 0;
        }
        int a2 = sVar.a();
        F();
        View l2 = l(a2);
        View m2 = m(a2);
        if (sVar.a() == 0 || l2 == null || m2 == null) {
            return 0;
        }
        return Math.min(this.f49621g.e(), this.f49621g.b(m2) - this.f49621g.a(l2));
    }

    private View l(int i2) {
        int i3;
        if (f49613j || this.f49620f.f49670a != null) {
            View b2 = b(0, s(), i2);
            if (b2 == null || (i3 = this.f49620f.f49670a[e(b2)]) == -1) {
                return null;
            }
            return b(b2, this.f49619e.get(i3));
        }
        throw new AssertionError();
    }

    private View m(int i2) {
        if (f49613j || this.f49620f.f49670a != null) {
            View b2 = b(s() - 1, -1, i2);
            if (b2 == null) {
                return null;
            }
            return c(b2, this.f49619e.get(this.f49620f.f49670a[e(b2)]));
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r.b
    public final PointF d(int i2) {
        int i3;
        if (s() == 0) {
            return null;
        }
        if (i2 < e(g(0))) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        if (i()) {
            return new PointF(0.0f, (float) i3);
        }
        return new PointF((float) i3, 0.0f);
    }

    private int i(RecyclerView.s sVar) {
        if (s() == 0) {
            return 0;
        }
        int a2 = sVar.a();
        View l2 = l(a2);
        View m2 = m(a2);
        if (!(sVar.a() == 0 || l2 == null || m2 == null)) {
            if (f49613j || this.f49620f.f49670a != null) {
                int e2 = e(l2);
                int e3 = e(m2);
                int abs = Math.abs(this.f49621g.b(m2) - this.f49621g.a(l2));
                int i2 = this.f49620f.f49670a[e2];
                if (!(i2 == 0 || i2 == -1)) {
                    return Math.round((((float) i2) * (((float) abs) / ((float) ((this.f49620f.f49670a[e3] - i2) + 1)))) + ((float) (this.f49621g.b() - this.f49621g.a(l2))));
                }
            } else {
                throw new AssertionError();
            }
        }
        return 0;
    }

    private int j(RecyclerView.s sVar) {
        if (s() == 0) {
            return 0;
        }
        int a2 = sVar.a();
        View l2 = l(a2);
        View m2 = m(a2);
        if (sVar.a() == 0 || l2 == null || m2 == null) {
            return 0;
        }
        if (f49613j || this.f49620f.f49670a != null) {
            int I = I();
            return (int) ((((float) Math.abs(this.f49621g.b(m2) - this.f49621g.a(l2))) / ((float) ((C() - I) + 1))) * ((float) sVar.a()));
        }
        throw new AssertionError();
    }

    private void k(int i2) {
        if (i2 < C()) {
            int s2 = s();
            this.f49620f.c(s2);
            this.f49620f.b(s2);
            this.f49620f.d(s2);
            if (!f49613j && this.f49620f.f49670a == null) {
                throw new AssertionError();
            } else if (i2 < this.f49620f.f49670a.length) {
                this.Q = i2;
                View g2 = g(0);
                if (g2 != null) {
                    this.t = e(g2);
                    if (i() || !this.f49618d) {
                        this.u = this.f49621g.a(g2) - this.f49621g.b();
                    } else {
                        this.u = this.f49621g.b(g2) + this.f49621g.f();
                    }
                }
            }
        }
    }

    private int n(int i2) {
        int height;
        int i3;
        int i4;
        if (s() == 0 || i2 == 0) {
            return 0;
        }
        F();
        boolean i5 = i();
        View view = this.P;
        if (i5) {
            height = view.getWidth();
            i3 = this.J;
        } else {
            height = view.getHeight();
            i3 = this.K;
        }
        if (v.e(this.w) == 1) {
            int abs = Math.abs(i2);
            if (i2 < 0) {
                i4 = Math.min((i3 + this.r.f49641d) - height, abs);
            } else if (this.r.f49641d + i2 <= 0) {
                return i2;
            } else {
                i4 = this.r.f49641d;
            }
        } else if (i2 > 0) {
            return Math.min((i3 - this.r.f49641d) - height, i2);
        } else {
            if (this.r.f49641d + i2 >= 0) {
                return i2;
            }
            i4 = this.r.f49641d;
        }
        return -i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.a aVar, RecyclerView.a aVar2) {
        r();
    }

    @Override // com.google.android.flexbox.a
    public final int b(int i2, int i3) {
        return a(this.K, this.I, i2, i3, g());
    }

    private FlexboxLayoutManager(Context context, byte b2) {
        this.f49625m = -1;
        this.f49619e = new ArrayList();
        this.f49620f = new c(this);
        this.r = new a(this, (byte) 0);
        this.t = -1;
        this.u = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.M = Integer.MIN_VALUE;
        this.N = new SparseArray<>();
        this.Q = -1;
        this.R = new c.a();
        b(0);
        m();
        n();
        this.C = true;
        this.O = context;
    }

    private void a(RecyclerView.o oVar, b bVar) {
        if (bVar.f49655j) {
            if (bVar.f49654i == -1) {
                c(oVar, bVar);
            } else {
                b(oVar, bVar);
            }
        }
    }

    private View b(View view, b bVar) {
        boolean i2 = i();
        int i3 = bVar.f49663h;
        for (int i4 = 1; i4 < i3; i4++) {
            View g2 = g(i4);
            if (!(g2 == null || g2.getVisibility() == 8)) {
                if (!this.f49618d || i2) {
                    if (this.f49621g.a(view) <= this.f49621g.a(g2)) {
                    }
                } else if (this.f49621g.b(view) >= this.f49621g.b(g2)) {
                }
                view = g2;
            }
        }
        return view;
    }

    private View c(View view, b bVar) {
        boolean i2 = i();
        int s2 = (s() - bVar.f49663h) - 1;
        for (int s3 = s() - 2; s3 > s2; s3--) {
            View g2 = g(s3);
            if (!(g2 == null || g2.getVisibility() == 8)) {
                if (!this.f49618d || i2) {
                    if (this.f49621g.b(view) >= this.f49621g.b(g2)) {
                    }
                } else if (this.f49621g.a(view) <= this.f49621g.a(g2)) {
                }
                view = g2;
            }
        }
        return view;
    }

    private boolean a(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int t2 = t();
        int u2 = u();
        int v = this.J - v();
        int w = this.K - w();
        int o2 = o(view) - ((RecyclerView.j) view.getLayoutParams()).leftMargin;
        int p2 = p(view) - ((RecyclerView.j) view.getLayoutParams()).topMargin;
        int q2 = q(view) + ((RecyclerView.j) view.getLayoutParams()).rightMargin;
        int r2 = r(view) + ((RecyclerView.j) view.getLayoutParams()).bottomMargin;
        if (t2 > o2 || v < q2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (o2 >= v || q2 >= t2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (u2 > p2 || w < r2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (p2 >= w || r2 >= u2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z) {
            if (!z2 || !z4) {
                return false;
            }
            return true;
        } else if (!z3 || !z5) {
            return false;
        } else {
            return true;
        }
    }

    private void b(RecyclerView.o oVar, b bVar) {
        if (bVar.f49651f >= 0) {
            if (f49613j || this.f49620f.f49670a != null) {
                int s2 = s();
                if (s2 != 0) {
                    int i2 = this.f49620f.f49670a[e(g(0))];
                    int i3 = -1;
                    if (i2 != -1) {
                        b bVar2 = this.f49619e.get(i2);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= s2) {
                                break;
                            }
                            View g2 = g(i4);
                            if (!b(g2, bVar.f49651f)) {
                                break;
                            }
                            if (bVar2.p == e(g2)) {
                                if (i2 >= this.f49619e.size() - 1) {
                                    i3 = i4;
                                    break;
                                }
                                i2 += bVar.f49654i;
                                bVar2 = this.f49619e.get(i2);
                                i3 = i4;
                            }
                            i4++;
                        }
                        a(oVar, 0, i3);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    private void c(RecyclerView.o oVar, b bVar) {
        if (bVar.f49651f >= 0) {
            if (f49613j || this.f49620f.f49670a != null) {
                this.f49621g.d();
                int s2 = s();
                if (s2 != 0) {
                    int i2 = s2 - 1;
                    int i3 = this.f49620f.f49670a[e(g(i2))];
                    if (i3 != -1) {
                        b bVar2 = this.f49619e.get(i3);
                        int i4 = i2;
                        while (true) {
                            if (i4 < 0) {
                                break;
                            }
                            View g2 = g(i4);
                            if (!c(g2, bVar.f49651f)) {
                                break;
                            }
                            if (bVar2.o == e(g2)) {
                                if (i3 <= 0) {
                                    s2 = i4;
                                    break;
                                }
                                i3 += bVar.f49654i;
                                bVar2 = this.f49619e.get(i3);
                                s2 = i4;
                            }
                            i4--;
                        }
                        a(oVar, s2, i2);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.e(int, int):void");
    }

    private boolean c(View view, int i2) {
        if (i() || !this.f49618d) {
            if (this.f49621g.a(view) >= this.f49621g.d() - i2) {
                return true;
            }
            return false;
        } else if (this.f49621g.b(view) <= i2) {
            return true;
        } else {
            return false;
        }
    }

    private int a(b bVar, b bVar2) {
        float f2;
        float f3;
        float f4;
        View view;
        float f5;
        if (f49613j || this.f49620f.f49671b != null) {
            int u2 = u();
            int w = w();
            int i2 = this.K;
            int i3 = bVar2.f49650e;
            int i4 = bVar2.f49650e;
            if (bVar2.f49654i == -1) {
                i3 -= bVar.f49662g;
                i4 += bVar.f49662g;
            }
            int i5 = bVar2.f49649d;
            int i6 = this.f49617c;
            if (i6 == 0) {
                f3 = (float) u2;
                f2 = (float) (i2 - w);
                f4 = 0.0f;
            } else if (i6 == 1) {
                f3 = (float) ((i2 - bVar.f49660e) + w);
                f2 = (float) (bVar.f49660e - u2);
                f4 = 0.0f;
            } else if (i6 == 2) {
                f3 = ((float) u2) + (((float) (i2 - bVar.f49660e)) / 2.0f);
                f2 = ((float) (i2 - w)) - (((float) (i2 - bVar.f49660e)) / 2.0f);
                f4 = 0.0f;
            } else if (i6 == 3) {
                f3 = (float) u2;
                if (bVar.f49663h != 1) {
                    f5 = (float) (bVar.f49663h - 1);
                } else {
                    f5 = 1.0f;
                }
                f4 = ((float) (i2 - bVar.f49660e)) / f5;
                f2 = (float) (i2 - w);
            } else if (i6 == 4) {
                if (bVar.f49663h != 0) {
                    f4 = ((float) (i2 - bVar.f49660e)) / ((float) bVar.f49663h);
                } else {
                    f4 = 0.0f;
                }
                float f6 = (float) u2;
                float f7 = f4 / 2.0f;
                f3 = f6 + f7;
                f2 = ((float) (i2 - w)) - f7;
            } else if (i6 == 5) {
                if (bVar.f49663h != 0) {
                    f4 = ((float) (i2 - bVar.f49660e)) / ((float) (bVar.f49663h + 1));
                } else {
                    f4 = 0.0f;
                }
                f3 = ((float) u2) + f4;
                f2 = ((float) (i2 - w)) - f4;
            } else {
                throw new IllegalStateException("Invalid justifyContent is set: " + this.f49617c);
            }
            float f8 = f3 - ((float) this.r.f49641d);
            float f9 = f2 - ((float) this.r.f49641d);
            float max = Math.max(f4, 0.0f);
            int i7 = 0;
            int i8 = bVar.f49663h;
            for (int i9 = i5; i9 < i5 + i8; i9++) {
                View f10 = f(i9);
                if (f10 != null) {
                    long j2 = this.f49620f.f49671b[i9];
                    int i10 = (int) j2;
                    int i11 = (int) (j2 >> 32);
                    LayoutParams layoutParams = (LayoutParams) f10.getLayoutParams();
                    if (c(f10, i10, i11, layoutParams)) {
                        f10.measure(i10, i11);
                    }
                    float s2 = f8 + ((float) (layoutParams.topMargin + s(f10)));
                    float t2 = f9 - ((float) (layoutParams.rightMargin + t(f10)));
                    if (bVar2.f49654i == 1) {
                        b(f10, f49614k);
                        c(f10);
                    } else {
                        b(f10, f49614k);
                        a(f10, i7);
                        i7++;
                    }
                    int u3 = i3 + u(f10);
                    int v = i4 - v(f10);
                    boolean z = this.f49618d;
                    if (!z) {
                        view = f10;
                        if (this.n) {
                            this.f49620f.a(view, bVar, z, u3, Math.round(t2) - view.getMeasuredHeight(), u3 + view.getMeasuredWidth(), Math.round(t2));
                        } else {
                            this.f49620f.a(view, bVar, z, u3, Math.round(s2), u3 + view.getMeasuredWidth(), Math.round(s2) + view.getMeasuredHeight());
                        }
                    } else if (this.n) {
                        view = f10;
                        this.f49620f.a(f10, bVar, z, v - f10.getMeasuredWidth(), Math.round(t2) - f10.getMeasuredHeight(), v, Math.round(t2));
                    } else {
                        view = f10;
                        this.f49620f.a(view, bVar, z, v - view.getMeasuredWidth(), Math.round(s2), v, Math.round(s2) + view.getMeasuredHeight());
                    }
                    f8 = s2 + ((float) (view.getMeasuredHeight() + layoutParams.topMargin + t(view))) + max;
                    f9 = t2 - (((float) ((view.getMeasuredHeight() + layoutParams.bottomMargin) + s(view))) + max);
                }
            }
            bVar2.f49648c += this.q.f49654i;
            return bVar.f49662g;
        }
        throw new AssertionError();
    }

    private boolean b(View view, int i2) {
        if (i() || !this.f49618d) {
            if (this.f49621g.b(view) <= i2) {
                return true;
            }
            return false;
        } else if (this.f49621g.d() - this.f49621g.a(view) <= i2) {
            return true;
        } else {
            return false;
        }
    }

    private void a(RecyclerView.o oVar, int i2, int i3) {
        while (i3 >= i2) {
            a(i3, oVar);
            i3--;
        }
    }

    private View a(int i2, int i3, boolean z) {
        int i4;
        if (i3 > i2) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        while (i2 != i3) {
            View g2 = g(i2);
            if (a(g2, z)) {
                return g2;
            }
            i2 += i4;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView recyclerView, int i2, int i3) {
        super.c(recyclerView, i2, i3);
        k(i2);
    }

    private static boolean c(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i2) {
                return true;
            }
            return false;
        } else if (size >= i2) {
            return true;
        } else {
            return false;
        }
    }

    private View b(int i2, int i3, int i4) {
        int i5;
        F();
        G();
        int b2 = this.f49621g.b();
        int c2 = this.f49621g.c();
        if (i3 > i2) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View g2 = g(i2);
            int e2 = e(g2);
            if (e2 >= 0 && e2 < i4) {
                if (((RecyclerView.j) g2.getLayoutParams()).f3847c.isRemoved()) {
                    if (view2 == null) {
                        view2 = g2;
                    }
                } else if (this.f49621g.a(g2) >= b2 && this.f49621g.b(g2) <= c2) {
                    return g2;
                } else {
                    if (view == null) {
                        view = g2;
                    }
                }
            }
            i2 += i5;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r7 > 0) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r7 < 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int c(int r7, androidx.recyclerview.widget.RecyclerView.o r8, androidx.recyclerview.widget.RecyclerView.s r9) {
        /*
            r6 = this;
            int r0 = r6.s()
            r5 = 0
            if (r0 == 0) goto L_0x0009
            if (r7 != 0) goto L_0x000a
        L_0x0009:
            return r5
        L_0x000a:
            r6.F()
            com.google.android.flexbox.FlexboxLayoutManager$b r0 = r6.q
            r4 = 1
            r0.f49655j = r4
            boolean r0 = r6.i()
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6.f49618d
            if (r0 == 0) goto L_0x0034
            r3 = 1
            if (r7 >= 0) goto L_0x0038
        L_0x001f:
            int r2 = java.lang.Math.abs(r7)
            r6.e(r4, r2)
            com.google.android.flexbox.FlexboxLayoutManager$b r0 = r6.q
            int r1 = r0.f49651f
            com.google.android.flexbox.FlexboxLayoutManager$b r0 = r6.q
            int r0 = r6.a(r8, r9, r0)
            int r1 = r1 + r0
            if (r1 >= 0) goto L_0x003a
            return r5
        L_0x0034:
            r3 = 0
            if (r7 <= 0) goto L_0x0038
            goto L_0x001f
        L_0x0038:
            r4 = -1
            goto L_0x001f
        L_0x003a:
            if (r3 == 0) goto L_0x004b
            if (r2 <= r1) goto L_0x0040
            int r7 = -r4
            int r7 = r7 * r1
        L_0x0040:
            androidx.recyclerview.widget.x r1 = r6.f49621g
            int r0 = -r7
            r1.a(r0)
            com.google.android.flexbox.FlexboxLayoutManager$b r0 = r6.q
            r0.f49652g = r7
            return r7
        L_0x004b:
            if (r2 <= r1) goto L_0x0040
            int r7 = r4 * r1
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.c(int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):int");
    }

    private void a(a aVar, boolean z, boolean z2) {
        if (z2) {
            E();
        } else {
            this.q.f49647b = false;
        }
        if (i() || !this.f49618d) {
            this.q.f49646a = this.f49621g.c() - aVar.f49640c;
        } else {
            this.q.f49646a = aVar.f49640c - v();
        }
        this.q.f49649d = aVar.f49638a;
        this.q.f49653h = 1;
        this.q.f49654i = 1;
        this.q.f49650e = aVar.f49640c;
        this.q.f49651f = Integer.MIN_VALUE;
        this.q.f49648c = aVar.f49639b;
        if (z && this.f49619e.size() > 1 && aVar.f49639b >= 0 && aVar.f49639b < this.f49619e.size() - 1) {
            this.q.f49648c++;
            this.q.f49649d += this.f49619e.get(aVar.f49639b).f49663h;
        }
    }

    private int a(RecyclerView.o oVar, RecyclerView.s sVar, b bVar) {
        int i2;
        float f2;
        float f3;
        float f4;
        float f5;
        if (bVar.f49651f != Integer.MIN_VALUE) {
            if (bVar.f49646a < 0) {
                bVar.f49651f += bVar.f49646a;
            }
            a(oVar, bVar);
        }
        int i3 = bVar.f49646a;
        int i4 = bVar.f49646a;
        boolean i5 = i();
        int i6 = 0;
        while (true) {
            if (i4 <= 0 && !this.q.f49647b) {
                break;
            }
            List<b> list = this.f49619e;
            if (bVar.f49649d < 0 || bVar.f49649d >= sVar.a() || bVar.f49648c < 0 || bVar.f49648c >= list.size()) {
                break;
            }
            b bVar2 = this.f49619e.get(bVar.f49648c);
            bVar.f49649d = bVar2.o;
            if (!i()) {
                i2 = a(bVar2, bVar);
            } else if (f49613j || this.f49620f.f49671b != null) {
                int t2 = t();
                int v = v();
                int i7 = this.J;
                int i8 = bVar.f49650e;
                if (bVar.f49654i == -1) {
                    i8 -= bVar2.f49662g;
                }
                int i9 = bVar.f49649d;
                int i10 = this.f49617c;
                if (i10 != 0) {
                    if (i10 == 1) {
                        f3 = (float) ((i7 - bVar2.f49660e) + v);
                        f2 = (float) (bVar2.f49660e - t2);
                    } else if (i10 == 2) {
                        f3 = (((float) (i7 - bVar2.f49660e)) / 2.0f) + ((float) t2);
                        f2 = ((float) (i7 - v)) - (((float) (i7 - bVar2.f49660e)) / 2.0f);
                    } else if (i10 == 3) {
                        f3 = (float) t2;
                        if (bVar2.f49663h != 1) {
                            f5 = (float) (bVar2.f49663h - 1);
                        } else {
                            f5 = 1.0f;
                        }
                        f4 = ((float) (i7 - bVar2.f49660e)) / f5;
                        f2 = (float) (i7 - v);
                    } else if (i10 == 4) {
                        if (bVar2.f49663h != 0) {
                            f4 = ((float) (i7 - bVar2.f49660e)) / ((float) bVar2.f49663h);
                        } else {
                            f4 = 0.0f;
                        }
                        float f6 = f4 / 2.0f;
                        f3 = ((float) t2) + f6;
                        f2 = ((float) (i7 - v)) - f6;
                    } else if (i10 == 5) {
                        if (bVar2.f49663h != 0) {
                            f4 = ((float) (i7 - bVar2.f49660e)) / ((float) (bVar2.f49663h + 1));
                        } else {
                            f4 = 0.0f;
                        }
                        f3 = ((float) t2) + f4;
                        f2 = ((float) (i7 - v)) - f4;
                    } else {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f49617c);
                    }
                    f4 = 0.0f;
                } else {
                    f3 = (float) t2;
                    f2 = (float) (i7 - v);
                    f4 = 0.0f;
                }
                float f7 = f3 - ((float) this.r.f49641d);
                float f8 = f2 - ((float) this.r.f49641d);
                float max = Math.max(f4, 0.0f);
                int i11 = bVar2.f49663h;
                int i12 = 0;
                for (int i13 = i9; i13 < i9 + i11; i13++) {
                    View f9 = f(i13);
                    if (f9 != null) {
                        if (bVar.f49654i == 1) {
                            b(f9, f49614k);
                            c(f9);
                        } else {
                            b(f9, f49614k);
                            a(f9, i12);
                            i12++;
                        }
                        long j2 = this.f49620f.f49671b[i13];
                        int i14 = (int) j2;
                        int i15 = (int) (j2 >> 32);
                        LayoutParams layoutParams = (LayoutParams) f9.getLayoutParams();
                        if (c(f9, i14, i15, layoutParams)) {
                            f9.measure(i14, i15);
                        }
                        float u2 = f7 + ((float) (layoutParams.leftMargin + u(f9)));
                        float v2 = f8 - ((float) (layoutParams.rightMargin + v(f9)));
                        int s2 = i8 + s(f9);
                        if (this.f49618d) {
                            this.f49620f.a(f9, bVar2, Math.round(v2) - f9.getMeasuredWidth(), s2, Math.round(v2), s2 + f9.getMeasuredHeight());
                        } else {
                            this.f49620f.a(f9, bVar2, Math.round(u2), s2, Math.round(u2) + f9.getMeasuredWidth(), s2 + f9.getMeasuredHeight());
                        }
                        f7 = u2 + ((float) (f9.getMeasuredWidth() + layoutParams.rightMargin + v(f9))) + max;
                        f8 = v2 - (((float) ((f9.getMeasuredWidth() + layoutParams.leftMargin) + u(f9))) + max);
                    }
                }
                bVar.f49648c += this.q.f49654i;
                i2 = bVar2.f49662g;
            } else {
                throw new AssertionError();
            }
            i6 += i2;
            if (i5 || !this.f49618d) {
                bVar.f49650e += bVar2.f49662g * bVar.f49654i;
            } else {
                bVar.f49650e -= bVar2.f49662g * bVar.f49654i;
            }
            i4 -= bVar2.f49662g;
        }
        bVar.f49646a -= i6;
        if (bVar.f49651f != Integer.MIN_VALUE) {
            bVar.f49651f += i6;
            if (bVar.f49646a < 0) {
                bVar.f49651f += bVar.f49646a;
            }
            a(oVar, bVar);
        }
        return i3 - bVar.f49646a;
    }

    private void b(a aVar, boolean z, boolean z2) {
        if (z2) {
            E();
        } else {
            this.q.f49647b = false;
        }
        if (i() || !this.f49618d) {
            this.q.f49646a = aVar.f49640c - this.f49621g.b();
        } else {
            this.q.f49646a = (this.P.getWidth() - aVar.f49640c) - this.f49621g.b();
        }
        this.q.f49649d = aVar.f49638a;
        this.q.f49653h = 1;
        this.q.f49654i = -1;
        this.q.f49650e = aVar.f49640c;
        this.q.f49651f = Integer.MIN_VALUE;
        this.q.f49648c = aVar.f49639b;
        if (z && aVar.f49639b > 0 && this.f49619e.size() > aVar.f49639b) {
            this.q.f49648c--;
            this.q.f49649d -= this.f49619e.get(aVar.f49639b).f49663h;
        }
    }

    private int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar, boolean z) {
        int i3;
        int b2;
        if (i() || !this.f49618d) {
            int b3 = i2 - this.f49621g.b();
            if (b3 <= 0) {
                return 0;
            }
            i3 = -c(b3, oVar, sVar);
        } else {
            int c2 = this.f49621g.c() - i2;
            if (c2 <= 0) {
                return 0;
            }
            i3 = c(-c2, oVar, sVar);
        }
        int i4 = i2 + i3;
        if (!z || (b2 = i4 - this.f49621g.b()) <= 0) {
            return i3;
        }
        this.f49621g.a(-b2);
        return i3 - b2;
    }

    private int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar, boolean z) {
        int i3;
        int c2;
        if (i() || !this.f49618d) {
            int c3 = this.f49621g.c() - i2;
            if (c3 <= 0) {
                return 0;
            }
            i3 = -c(-c3, oVar, sVar);
        } else {
            int b2 = i2 - this.f49621g.b();
            if (b2 <= 0) {
                return 0;
            }
            i3 = c(b2, oVar, sVar);
        }
        int i4 = i2 + i3;
        if (!z || (c2 = this.f49621g.c() - i4) <= 0) {
            return i3;
        }
        this.f49621g.a(c2);
        return c2 + i3;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f49625m = -1;
        this.f49619e = new ArrayList();
        this.f49620f = new c(this);
        this.r = new a(this, (byte) 0);
        this.t = -1;
        this.u = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.M = Integer.MIN_VALUE;
        this.N = new SparseArray<>();
        this.Q = -1;
        this.R = new c.a();
        RecyclerView.i.b a2 = a(context, attributeSet, i2, i3);
        int i4 = a2.f3843a;
        if (i4 != 0) {
            if (i4 == 1) {
                if (a2.f3845c) {
                    b(3);
                } else {
                    b(2);
                }
            }
        } else if (a2.f3845c) {
            b(1);
        } else {
            b(0);
        }
        m();
        n();
        this.C = true;
        this.O = context;
    }

    private boolean c(View view, int i2, int i3, RecyclerView.j jVar) {
        if (view.isLayoutRequested() || !this.D || !c(view.getWidth(), i2, jVar.width) || !c(view.getHeight(), i3, jVar.height)) {
            return true;
        }
        return false;
    }
}
