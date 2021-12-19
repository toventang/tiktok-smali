package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.i implements RecyclerView.r.b {
    private boolean L = true;
    private int[] M;
    private final Runnable N = new Runnable() {
        /* class androidx.recyclerview.widget.StaggeredGridLayoutManager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1516);
        }

        public final void run() {
            StaggeredGridLayoutManager.this.h();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f3896a = -1;

    /* renamed from: b  reason: collision with root package name */
    public c[] f3897b;

    /* renamed from: c  reason: collision with root package name */
    x f3898c;

    /* renamed from: d  reason: collision with root package name */
    x f3899d;

    /* renamed from: e  reason: collision with root package name */
    public int f3900e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3901f;

    /* renamed from: g  reason: collision with root package name */
    boolean f3902g;

    /* renamed from: h  reason: collision with root package name */
    int f3903h = -1;

    /* renamed from: i  reason: collision with root package name */
    int f3904i = Integer.MIN_VALUE;

    /* renamed from: j  reason: collision with root package name */
    LazySpanLookup f3905j = new LazySpanLookup();

    /* renamed from: k  reason: collision with root package name */
    public int f3906k = 2;

    /* renamed from: l  reason: collision with root package name */
    private int f3907l;

    /* renamed from: m  reason: collision with root package name */
    private final q f3908m;
    private BitSet n;
    private boolean o;
    private boolean p;
    private SavedState q;
    private int r;
    private final Rect s = new Rect();
    private final a t = new a();
    private boolean u = false;

    /* access modifiers changed from: package-private */
    public static class LazySpanLookup {

        /* renamed from: a  reason: collision with root package name */
        int[] f3910a;

        /* renamed from: b  reason: collision with root package name */
        List<FullSpanItem> f3911b;

        static {
            Covode.recordClassIndex(1517);
        }

        /* access modifiers changed from: package-private */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() {
                /* class androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1519);
                }

                /* Return type fixed from 'java.lang.Object[]' to match base method */
                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ FullSpanItem[] newArray(int i2) {
                    return new FullSpanItem[i2];
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }
            };

            /* renamed from: a  reason: collision with root package name */
            int f3912a;

            /* renamed from: b  reason: collision with root package name */
            int f3913b;

            /* renamed from: c  reason: collision with root package name */
            int[] f3914c;

            /* renamed from: d  reason: collision with root package name */
            boolean f3915d;

            public int describeContents() {
                return 0;
            }

            FullSpanItem() {
            }

            static {
                Covode.recordClassIndex(1518);
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3912a + ", mGapDir=" + this.f3913b + ", mHasUnwantedGapAfter=" + this.f3915d + ", mGapPerSpan=" + Arrays.toString(this.f3914c) + '}';
            }

            /* access modifiers changed from: package-private */
            public final int a(int i2) {
                int[] iArr = this.f3914c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            FullSpanItem(Parcel parcel) {
                this.f3912a = parcel.readInt();
                this.f3913b = parcel.readInt();
                this.f3915d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3914c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f3912a);
                parcel.writeInt(this.f3913b);
                parcel.writeInt(this.f3915d ? 1 : 0);
                int[] iArr = this.f3914c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3914c);
            }
        }

        LazySpanLookup() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            int[] iArr = this.f3910a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3911b = null;
        }

        private int e(int i2) {
            int length = this.f3910a.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }

        /* access modifiers changed from: package-private */
        public final int c(int i2) {
            int[] iArr = this.f3910a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        public final FullSpanItem d(int i2) {
            List<FullSpanItem> list = this.f3911b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3911b.get(size);
                if (fullSpanItem.f3912a == i2) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        private void f(int i2) {
            int[] iArr = this.f3910a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i2, 10) + 1)];
                this.f3910a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int[] iArr3 = new int[e(i2)];
                this.f3910a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3910a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        private int g(int i2) {
            if (this.f3911b == null) {
                return -1;
            }
            FullSpanItem d2 = d(i2);
            if (d2 != null) {
                this.f3911b.remove(d2);
            }
            int size = this.f3911b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                } else if (this.f3911b.get(i3).f3912a < i2) {
                    i3++;
                } else if (i3 != -1) {
                    this.f3911b.remove(i3);
                    return this.f3911b.get(i3).f3912a;
                }
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public final int a(int i2) {
            List<FullSpanItem> list = this.f3911b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3911b.get(size).f3912a >= i2) {
                        this.f3911b.remove(size);
                    }
                }
            }
            return b(i2);
        }

        /* access modifiers changed from: package-private */
        public final int b(int i2) {
            int[] iArr = this.f3910a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int g2 = g(i2);
            if (g2 == -1) {
                int[] iArr2 = this.f3910a;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.f3910a.length;
            }
            int min = Math.min(g2 + 1, this.f3910a.length);
            Arrays.fill(this.f3910a, i2, min, -1);
            return min;
        }

        public final void a(FullSpanItem fullSpanItem) {
            if (this.f3911b == null) {
                this.f3911b = new ArrayList();
            }
            int size = this.f3911b.size();
            for (int i2 = 0; i2 < size; i2++) {
                FullSpanItem fullSpanItem2 = this.f3911b.get(i2);
                if (fullSpanItem2.f3912a == fullSpanItem.f3912a) {
                    this.f3911b.remove(i2);
                }
                if (fullSpanItem2.f3912a >= fullSpanItem.f3912a) {
                    this.f3911b.add(i2, fullSpanItem);
                    return;
                }
            }
            this.f3911b.add(fullSpanItem);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, c cVar) {
            f(i2);
            this.f3910a[i2] = cVar.f3939e;
        }

        /* access modifiers changed from: package-private */
        public final void b(int i2, int i3) {
            int[] iArr = this.f3910a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                f(i4);
                int[] iArr2 = this.f3910a;
                System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
                Arrays.fill(this.f3910a, i2, i4, -1);
                d(i2, i3);
            }
        }

        private void c(int i2, int i3) {
            List<FullSpanItem> list = this.f3911b;
            if (list != null) {
                int i4 = i2 + i3;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f3911b.get(size);
                    if (fullSpanItem.f3912a >= i2) {
                        if (fullSpanItem.f3912a < i4) {
                            this.f3911b.remove(size);
                        } else {
                            fullSpanItem.f3912a -= i3;
                        }
                    }
                }
            }
        }

        private void d(int i2, int i3) {
            List<FullSpanItem> list = this.f3911b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f3911b.get(size);
                    if (fullSpanItem.f3912a >= i2) {
                        fullSpanItem.f3912a += i3;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            int[] iArr = this.f3910a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                f(i4);
                int[] iArr2 = this.f3910a;
                System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
                int[] iArr3 = this.f3910a;
                Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
                c(i2, i3);
            }
        }

        public final FullSpanItem a(int i2, int i3, int i4) {
            List<FullSpanItem> list = this.f3911b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                FullSpanItem fullSpanItem = this.f3911b.get(i5);
                if (fullSpanItem.f3912a >= i3) {
                    return null;
                }
                if (fullSpanItem.f3912a >= i2 && (i4 == 0 || fullSpanItem.f3913b == i4 || fullSpanItem.f3915d)) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(1515);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1521);
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
        int f3916a;

        /* renamed from: b  reason: collision with root package name */
        int f3917b;

        /* renamed from: c  reason: collision with root package name */
        int f3918c;

        /* renamed from: d  reason: collision with root package name */
        int[] f3919d;

        /* renamed from: e  reason: collision with root package name */
        int f3920e;

        /* renamed from: f  reason: collision with root package name */
        int[] f3921f;

        /* renamed from: g  reason: collision with root package name */
        List<LazySpanLookup.FullSpanItem> f3922g;

        /* renamed from: h  reason: collision with root package name */
        boolean f3923h;

        /* renamed from: i  reason: collision with root package name */
        boolean f3924i;

        /* renamed from: j  reason: collision with root package name */
        boolean f3925j;

        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        static {
            Covode.recordClassIndex(1520);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f3919d = null;
            this.f3918c = 0;
            this.f3920e = 0;
            this.f3921f = null;
            this.f3922g = null;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            this.f3919d = null;
            this.f3918c = 0;
            this.f3916a = -1;
            this.f3917b = -1;
        }

        public SavedState(SavedState savedState) {
            this.f3918c = savedState.f3918c;
            this.f3916a = savedState.f3916a;
            this.f3917b = savedState.f3917b;
            this.f3919d = savedState.f3919d;
            this.f3920e = savedState.f3920e;
            this.f3921f = savedState.f3921f;
            this.f3923h = savedState.f3923h;
            this.f3924i = savedState.f3924i;
            this.f3925j = savedState.f3925j;
            this.f3922g = savedState.f3922g;
        }

        SavedState(Parcel parcel) {
            boolean z;
            boolean z2;
            this.f3916a = parcel.readInt();
            this.f3917b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3918c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3919d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3920e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3921f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f3923h = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f3924i = z2;
            this.f3925j = parcel.readInt() == 1 ? true : z3;
            this.f3922g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f3916a);
            parcel.writeInt(this.f3917b);
            parcel.writeInt(this.f3918c);
            if (this.f3918c > 0) {
                parcel.writeIntArray(this.f3919d);
            }
            parcel.writeInt(this.f3920e);
            if (this.f3920e > 0) {
                parcel.writeIntArray(this.f3921f);
            }
            parcel.writeInt(this.f3923h ? 1 : 0);
            parcel.writeInt(this.f3924i ? 1 : 0);
            parcel.writeInt(this.f3925j ? 1 : 0);
            parcel.writeList(this.f3922g);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void a(RecyclerView recyclerView, RecyclerView.o oVar) {
        super.a(recyclerView, oVar);
        a(this.N);
        for (int i2 = 0; i2 < this.f3896a; i2++) {
            this.f3897b[i2].c();
        }
        recyclerView.requestLayout();
    }

    private boolean a(c cVar) {
        return this.f3902g ? cVar.b() < this.f3898c.c() && !((b) cVar.f3935a.get(cVar.f3935a.size() - 1).getLayoutParams()).f3934b : cVar.a() > this.f3898c.b() && !((b) cVar.f3935a.get(0).getLayoutParams()).f3934b;
    }

    public final void a(int i2) {
        a((String) null);
        if (i2 != this.f3896a) {
            k();
            this.f3896a = i2;
            this.n = new BitSet(this.f3896a);
            this.f3897b = new c[this.f3896a];
            for (int i3 = 0; i3 < this.f3896a; i3++) {
                this.f3897b[i3] = new c(i3);
            }
            o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(String str) {
        if (this.q == null) {
            super.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(Rect rect, int i2, int i3) {
        int a2;
        int a3;
        int t2 = t() + v();
        int u2 = u() + w();
        if (this.f3900e == 1) {
            a3 = a(i3, rect.height() + u2, v.i(this.w));
            a2 = a(i2, (this.f3907l * this.f3896a) + t2, v.h(this.w));
        } else {
            a2 = a(i2, rect.width() + t2, v.h(this.w));
            a3 = a(i3, (this.f3907l * this.f3896a) + u2, v.i(this.w));
        }
        d(a2, a3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.a aVar, RecyclerView.a aVar2) {
        this.f3905j.a();
        for (int i2 = 0; i2 < this.f3896a; i2++) {
            this.f3897b[i2].c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void a(RecyclerView.s sVar) {
        super.a(sVar);
        this.f3903h = -1;
        this.f3904i = Integer.MIN_VALUE;
        this.q = null;
        this.t.a();
    }

    public final int[] a(int[] iArr) {
        int a2;
        if (iArr == null) {
            iArr = new int[this.f3896a];
        } else if (iArr.length < this.f3896a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3896a + ", array size:" + iArr.length);
        }
        for (int i2 = 0; i2 < this.f3896a; i2++) {
            c cVar = this.f3897b[i2];
            if (StaggeredGridLayoutManager.this.f3901f) {
                a2 = cVar.a(cVar.f3935a.size() - 1, -1, false);
            } else {
                a2 = cVar.a(0, cVar.f3935a.size(), false);
            }
            iArr[i2] = a2;
        }
        return iArr;
    }

    public final int[] b(int[] iArr) {
        int a2;
        if (iArr == null) {
            iArr = new int[this.f3896a];
        } else if (iArr.length < this.f3896a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3896a + ", array size:" + iArr.length);
        }
        for (int i2 = 0; i2 < this.f3896a; i2++) {
            c cVar = this.f3897b[i2];
            if (StaggeredGridLayoutManager.this.f3901f) {
                a2 = cVar.a(0, cVar.f3935a.size(), false);
            } else {
                a2 = cVar.a(cVar.f3935a.size() - 1, -1, false);
            }
            iArr[i2] = a2;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.q = savedState;
            if (this.f3903h != -1) {
                savedState.b();
                this.q.a();
            }
            o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (s() > 0) {
            View b2 = b(false);
            View c2 = c(false);
            if (b2 != null && c2 != null) {
                int e2 = e(b2);
                int e3 = e(c2);
                if (e2 < e3) {
                    accessibilityEvent.setFromIndex(e2);
                    accessibilityEvent.setToIndex(e3);
                    return;
                }
                accessibilityEvent.setFromIndex(e3);
                accessibilityEvent.setToIndex(e2);
            }
        }
    }

    private void a(RecyclerView.o oVar, RecyclerView.s sVar, boolean z) {
        int c2;
        int o2 = o(Integer.MIN_VALUE);
        if (o2 != Integer.MIN_VALUE && (c2 = this.f3898c.c() - o2) > 0) {
            int i2 = c2 - (-c(-c2, oVar, sVar));
            if (z && i2 > 0) {
                this.f3898c.a(i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void b(RecyclerView recyclerView, int i2, int i3) {
        c(i2, i3, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        c(i2, i3, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        c(i2, i3, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
        c(i2, i3, 4);
    }

    private void a(RecyclerView.o oVar, q qVar) {
        int min;
        int min2;
        if (qVar.f4190a && !qVar.f4198i) {
            if (qVar.f4191b == 0) {
                if (qVar.f4194e == -1) {
                    b(oVar, qVar.f4196g);
                } else {
                    a(oVar, qVar.f4195f);
                }
            } else if (qVar.f4194e == -1) {
                int m2 = qVar.f4195f - m(qVar.f4195f);
                if (m2 < 0) {
                    min2 = qVar.f4196g;
                } else {
                    min2 = qVar.f4196g - Math.min(m2, qVar.f4191b);
                }
                b(oVar, min2);
            } else {
                int p2 = p(qVar.f4196g) - qVar.f4196g;
                if (p2 < 0) {
                    min = qVar.f4195f;
                } else {
                    min = Math.min(p2, qVar.f4191b) + qVar.f4195f;
                }
                a(oVar, min);
            }
        }
    }

    private void a(c cVar, int i2, int i3) {
        int i4 = cVar.f3938d;
        if (i2 == -1) {
            if (cVar.a() + i4 <= i3) {
                this.n.set(cVar.f3939e, false);
            }
        } else if (cVar.b() - i4 >= i3) {
            this.n.set(cVar.f3939e, false);
        }
    }

    private void a(RecyclerView.o oVar, int i2) {
        while (s() > 0) {
            View g2 = g(0);
            if (this.f3898c.b(g2) <= i2 && this.f3898c.c(g2) <= i2) {
                b bVar = (b) g2.getLayoutParams();
                if (bVar.f3934b) {
                    for (int i3 = 0; i3 < this.f3896a; i3++) {
                        if (this.f3897b[i3].f3935a.size() == 1) {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.f3896a; i4++) {
                        this.f3897b[i4].e();
                    }
                } else if (bVar.f3933a.f3935a.size() != 1) {
                    bVar.f3933a.e();
                } else {
                    return;
                }
                a(g2, oVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        r rVar = new r(recyclerView.getContext());
        rVar.f3862g = i2;
        a(rVar);
    }

    public final void a(int i2, int i3) {
        SavedState savedState = this.q;
        if (savedState != null) {
            savedState.b();
        }
        this.f3903h = i2;
        this.f3904i = i3;
        o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(int i2, int i3, RecyclerView.s sVar, RecyclerView.i.a aVar) {
        int b2;
        int i4;
        if (this.f3900e != 0) {
            i2 = i3;
        }
        if (!(s() == 0 || i2 == 0)) {
            b(i2, sVar);
            int[] iArr = this.M;
            if (iArr == null || iArr.length < this.f3896a) {
                this.M = new int[this.f3896a];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f3896a; i6++) {
                if (this.f3908m.f4193d == -1) {
                    b2 = this.f3908m.f4195f;
                    i4 = this.f3897b[i6].a(this.f3908m.f4195f);
                } else {
                    b2 = this.f3897b[i6].b(this.f3908m.f4196g);
                    i4 = this.f3908m.f4196g;
                }
                int i7 = b2 - i4;
                if (i7 >= 0) {
                    this.M[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.M, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f3908m.a(sVar); i8++) {
                aVar.a(this.f3908m.f4192c, this.M[i8]);
                this.f3908m.f4192c += this.f3908m.f4193d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        if (r11.f3900e == 1) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (C() == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (C() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r11.f3900e == 0) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0129 A[LOOP:3: B:93:0x0129->B:101:0x0140, LOOP_START, PHI: r2 
      PHI: (r2v3 int) = (r2v2 int), (r2v4 int) binds: [B:80:0x00ff, B:101:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.View r12, int r13, androidx.recyclerview.widget.RecyclerView.o r14, androidx.recyclerview.widget.RecyclerView.s r15) {
        /*
        // Method dump skipped, instructions count: 333
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):android.view.View");
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f3935a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f3936b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f3937c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f3938d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f3939e;

        static {
            Covode.recordClassIndex(1524);
        }

        private void j() {
            this.f3936b = Integer.MIN_VALUE;
            this.f3937c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            int i2 = this.f3936b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            h();
            return this.f3936b;
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            this.f3935a.clear();
            j();
            this.f3938d = 0;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            int i2 = this.f3937c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            i();
            return this.f3937c;
        }

        public final int f() {
            if (StaggeredGridLayoutManager.this.f3901f) {
                return b(this.f3935a.size() - 1, -1);
            }
            return b(0, this.f3935a.size());
        }

        public final int g() {
            if (StaggeredGridLayoutManager.this.f3901f) {
                return b(0, this.f3935a.size());
            }
            return b(this.f3935a.size() - 1, -1);
        }

        private void h() {
            LazySpanLookup.FullSpanItem d2;
            View view = this.f3935a.get(0);
            b bVar = (b) view.getLayoutParams();
            this.f3936b = StaggeredGridLayoutManager.this.f3898c.a(view);
            if (bVar.f3934b && (d2 = StaggeredGridLayoutManager.this.f3905j.d(bVar.f3847c.getLayoutPosition())) != null && d2.f3913b == -1) {
                this.f3936b -= d2.a(this.f3939e);
            }
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            int size = this.f3935a.size();
            View remove = this.f3935a.remove(size - 1);
            b bVar = (b) remove.getLayoutParams();
            bVar.f3933a = null;
            if (bVar.f3847c.isRemoved() || bVar.f3847c.isUpdated()) {
                this.f3938d -= StaggeredGridLayoutManager.this.f3898c.e(remove);
            }
            if (size == 1) {
                this.f3936b = Integer.MIN_VALUE;
            }
            this.f3937c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public final void e() {
            View remove = this.f3935a.remove(0);
            b bVar = (b) remove.getLayoutParams();
            bVar.f3933a = null;
            if (this.f3935a.size() == 0) {
                this.f3937c = Integer.MIN_VALUE;
            }
            if (bVar.f3847c.isRemoved() || bVar.f3847c.isUpdated()) {
                this.f3938d -= StaggeredGridLayoutManager.this.f3898c.e(remove);
            }
            this.f3936b = Integer.MIN_VALUE;
        }

        private void i() {
            LazySpanLookup.FullSpanItem d2;
            ArrayList<View> arrayList = this.f3935a;
            View view = arrayList.get(arrayList.size() - 1);
            b bVar = (b) view.getLayoutParams();
            this.f3937c = StaggeredGridLayoutManager.this.f3898c.b(view);
            if (bVar.f3934b && (d2 = StaggeredGridLayoutManager.this.f3905j.d(bVar.f3847c.getLayoutPosition())) != null && d2.f3913b == 1) {
                this.f3937c += d2.a(this.f3939e);
            }
        }

        /* access modifiers changed from: package-private */
        public final void c(int i2) {
            this.f3936b = i2;
            this.f3937c = i2;
        }

        /* access modifiers changed from: package-private */
        public final int a(int i2) {
            int i3 = this.f3936b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f3935a.size() == 0) {
                return i2;
            }
            h();
            return this.f3936b;
        }

        /* access modifiers changed from: package-private */
        public final void d(int i2) {
            int i3 = this.f3936b;
            if (i3 != Integer.MIN_VALUE) {
                this.f3936b = i3 + i2;
            }
            int i4 = this.f3937c;
            if (i4 != Integer.MIN_VALUE) {
                this.f3937c = i4 + i2;
            }
        }

        /* access modifiers changed from: package-private */
        public final int b(int i2) {
            int i3 = this.f3937c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f3935a.size() == 0) {
                return i2;
            }
            i();
            return this.f3937c;
        }

        /* access modifiers changed from: package-private */
        public final void b(View view) {
            b bVar = (b) view.getLayoutParams();
            bVar.f3933a = this;
            this.f3935a.add(view);
            this.f3937c = Integer.MIN_VALUE;
            if (this.f3935a.size() == 1) {
                this.f3936b = Integer.MIN_VALUE;
            }
            if (bVar.f3847c.isRemoved() || bVar.f3847c.isUpdated()) {
                this.f3938d += StaggeredGridLayoutManager.this.f3898c.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(View view) {
            b bVar = (b) view.getLayoutParams();
            bVar.f3933a = this;
            this.f3935a.add(0, view);
            this.f3936b = Integer.MIN_VALUE;
            if (this.f3935a.size() == 1) {
                this.f3937c = Integer.MIN_VALUE;
            }
            if (bVar.f3847c.isRemoved() || bVar.f3847c.isUpdated()) {
                this.f3938d += StaggeredGridLayoutManager.this.f3898c.e(view);
            }
        }

        private int b(int i2, int i3) {
            return a(i2, i3, false, false, true);
        }

        c(int i2) {
            this.f3939e = i2;
        }

        public final View a(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.f3935a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3935a.get(size);
                    if ((StaggeredGridLayoutManager.this.f3901f && StaggeredGridLayoutManager.e(view2) >= i2) || ((!StaggeredGridLayoutManager.this.f3901f && StaggeredGridLayoutManager.e(view2) <= i2) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3935a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.f3935a.get(i4);
                    if ((StaggeredGridLayoutManager.this.f3901f && StaggeredGridLayoutManager.e(view3) <= i2) || ((!StaggeredGridLayoutManager.this.f3901f && StaggeredGridLayoutManager.e(view3) >= i2) || !view3.hasFocusable())) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        public final int a(int i2, int i3, boolean z) {
            return a(i2, i3, z, true, false);
        }

        private int a(int i2, int i3, boolean z, boolean z2, boolean z3) {
            int i4;
            boolean z4;
            int b2 = StaggeredGridLayoutManager.this.f3898c.b();
            int c2 = StaggeredGridLayoutManager.this.f3898c.c();
            if (i3 > i2) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            while (i2 != i3) {
                View view = this.f3935a.get(i2);
                int a2 = StaggeredGridLayoutManager.this.f3898c.a(view);
                int b3 = StaggeredGridLayoutManager.this.f3898c.b(view);
                boolean z5 = false;
                if (!z3 ? a2 >= c2 : a2 > c2) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 ? b3 > b2 : b3 >= b2) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (z) {
                        if (z2) {
                            if (a2 >= b2 && b3 <= c2) {
                                return StaggeredGridLayoutManager.e(view);
                            }
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.e(view);
                    }
                    if (a2 < b2 || b3 > c2) {
                        return StaggeredGridLayoutManager.e(view);
                    }
                }
                i2 += i4;
            }
            return -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean w_() {
        if (this.f3906k != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean x_() {
        if (this.q == null) {
            return true;
        }
        return false;
    }

    public static class b extends RecyclerView.j {

        /* renamed from: a  reason: collision with root package name */
        c f3933a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3934b;

        static {
            Covode.recordClassIndex(1523);
        }

        public final int d() {
            c cVar = this.f3933a;
            if (cVar == null) {
                return -1;
            }
            return cVar.f3939e;
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

    private boolean C() {
        if (v.e(this.w) == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean f() {
        if (this.f3900e == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean g() {
        if (this.f3900e == 1) {
            return true;
        }
        return false;
    }

    public final void i() {
        a((String) null);
        if (this.f3906k != 0) {
            this.f3906k = 0;
            o();
        }
    }

    public final void k() {
        this.f3905j.a();
        o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void y_() {
        this.f3905j.a();
        o();
    }

    class a {

        /* renamed from: a  reason: collision with root package name */
        int f3926a;

        /* renamed from: b  reason: collision with root package name */
        int f3927b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3928c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3929d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3930e;

        /* renamed from: f  reason: collision with root package name */
        int[] f3931f;

        static {
            Covode.recordClassIndex(1522);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f3926a = -1;
            this.f3927b = Integer.MIN_VALUE;
            this.f3928c = false;
            this.f3929d = false;
            this.f3930e = false;
            int[] iArr = this.f3931f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        a() {
            a();
        }
    }

    private boolean D() {
        int b2 = this.f3897b[0].b(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.f3896a; i2++) {
            if (this.f3897b[i2].b(Integer.MIN_VALUE) != b2) {
                return false;
            }
        }
        return true;
    }

    private boolean E() {
        int a2 = this.f3897b[0].a(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.f3896a; i2++) {
            if (this.f3897b[i2].a(Integer.MIN_VALUE) != a2) {
                return false;
            }
        }
        return true;
    }

    private int F() {
        int s2 = s();
        if (s2 == 0) {
            return 0;
        }
        return e(g(s2 - 1));
    }

    private int G() {
        if (s() == 0) {
            return 0;
        }
        return e(g(0));
    }

    private void l() {
        this.f3898c = x.a(this, this.f3900e);
        this.f3899d = x.a(this, 1 - this.f3900e);
    }

    private void n() {
        boolean z = true;
        if (this.f3900e == 1 || !C()) {
            z = this.f3901f;
        } else if (this.f3901f) {
            z = false;
        }
        this.f3902g = z;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        int G;
        int F;
        int i2;
        if (s() == 0 || this.f3906k == 0 || !this.B) {
            return false;
        }
        if (this.f3902g) {
            G = F();
            F = G();
        } else {
            G = G();
            F = F();
        }
        if (G == 0 && m() != null) {
            this.f3905j.a();
            this.A = true;
            o();
            return true;
        } else if (!this.u) {
            return false;
        } else {
            if (this.f3902g) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            int i3 = F + 1;
            LazySpanLookup.FullSpanItem a2 = this.f3905j.a(G, i3, i2);
            if (a2 == null) {
                this.u = false;
                this.f3905j.a(i3);
                return false;
            }
            LazySpanLookup.FullSpanItem a3 = this.f3905j.a(G, a2.f3912a, i2 * -1);
            if (a3 == null) {
                this.f3905j.a(a2.f3912a);
            } else {
                this.f3905j.a(a3.f3912a + 1);
            }
            this.A = true;
            o();
            return true;
        }
    }

    private View m() {
        char c2;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int s2 = s() - 1;
        BitSet bitSet = new BitSet(this.f3896a);
        bitSet.set(0, this.f3896a, true);
        int i4 = -1;
        if (this.f3900e != 1 || !C()) {
            c2 = 65535;
        } else {
            c2 = 1;
        }
        if (this.f3902g) {
            i2 = -1;
        } else {
            i2 = s2 + 1;
            s2 = 0;
        }
        if (s2 < i2) {
            i4 = 1;
        }
        while (s2 != i2) {
            View g2 = g(s2);
            b bVar = (b) g2.getLayoutParams();
            if (bitSet.get(bVar.f3933a.f3939e)) {
                if (a(bVar.f3933a)) {
                    return g2;
                }
                bitSet.clear(bVar.f3933a.f3939e);
            }
            if (!bVar.f3934b && (i3 = s2 + i4) != i2) {
                View g3 = g(i3);
                if (this.f3902g) {
                    int b2 = this.f3898c.b(g2);
                    int b3 = this.f3898c.b(g3);
                    if (b2 < b3) {
                        return g2;
                    }
                    if (b2 != b3) {
                        continue;
                    }
                } else {
                    int a2 = this.f3898c.a(g2);
                    int a3 = this.f3898c.a(g3);
                    if (a2 > a3) {
                        return g2;
                    }
                    if (a2 != a3) {
                        continue;
                    }
                }
                if (bVar.f3933a.f3939e - ((b) g3.getLayoutParams()).f3933a.f3939e < 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (c2 < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                    return g2;
                }
            }
            s2 += i4;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final Parcelable e() {
        int G;
        View b2;
        int a2;
        int b3;
        if (this.q != null) {
            return new SavedState(this.q);
        }
        SavedState savedState = new SavedState();
        savedState.f3923h = this.f3901f;
        savedState.f3924i = this.o;
        savedState.f3925j = this.p;
        LazySpanLookup lazySpanLookup = this.f3905j;
        if (lazySpanLookup == null || lazySpanLookup.f3910a == null) {
            savedState.f3920e = 0;
        } else {
            savedState.f3921f = this.f3905j.f3910a;
            savedState.f3920e = savedState.f3921f.length;
            savedState.f3922g = this.f3905j.f3911b;
        }
        int i2 = -1;
        if (s() > 0) {
            if (this.o) {
                G = F();
            } else {
                G = G();
            }
            savedState.f3916a = G;
            if (this.f3902g) {
                b2 = c(true);
            } else {
                b2 = b(true);
            }
            if (b2 != null) {
                i2 = e(b2);
            }
            savedState.f3917b = i2;
            savedState.f3918c = this.f3896a;
            savedState.f3919d = new int[this.f3896a];
            for (int i3 = 0; i3 < this.f3896a; i3++) {
                if (this.o) {
                    a2 = this.f3897b[i3].b(Integer.MIN_VALUE);
                    if (a2 != Integer.MIN_VALUE) {
                        b3 = this.f3898c.c();
                    } else {
                        savedState.f3919d[i3] = a2;
                    }
                } else {
                    a2 = this.f3897b[i3].a(Integer.MIN_VALUE);
                    if (a2 != Integer.MIN_VALUE) {
                        b3 = this.f3898c.b();
                    } else {
                        savedState.f3919d[i3] = a2;
                    }
                }
                a2 -= b3;
                savedState.f3919d[i3] = a2;
            }
        } else {
            savedState.f3916a = -1;
            savedState.f3917b = -1;
            savedState.f3918c = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j b() {
        if (this.f3900e == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean a(RecyclerView.j jVar) {
        return jVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int c(RecyclerView.s sVar) {
        return j(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int d(RecyclerView.s sVar) {
        return h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int e(RecyclerView.s sVar) {
        return h(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int f(RecyclerView.s sVar) {
        return i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int g(RecyclerView.s sVar) {
        return i(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void j(int i2) {
        if (i2 == 0) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int b(RecyclerView.s sVar) {
        return j(sVar);
    }

    private void a(boolean z) {
        a((String) null);
        SavedState savedState = this.q;
        if (!(savedState == null || savedState.f3923h == z)) {
            this.q.f3923h = z;
        }
        this.f3901f = z;
        o();
    }

    private void b(int i2) {
        this.f3907l = i2 / this.f3896a;
        this.r = View.MeasureSpec.makeMeasureSpec(i2, this.f3899d.g());
    }

    private void f(int i2) {
        boolean z;
        this.f3908m.f4194e = i2;
        q qVar = this.f3908m;
        boolean z2 = this.f3902g;
        int i3 = 1;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i3 = -1;
        }
        qVar.f4193d = i3;
    }

    private int m(int i2) {
        int a2 = this.f3897b[0].a(i2);
        for (int i3 = 1; i3 < this.f3896a; i3++) {
            int a3 = this.f3897b[i3].a(i2);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int n(int i2) {
        int a2 = this.f3897b[0].a(i2);
        for (int i3 = 1; i3 < this.f3896a; i3++) {
            int a3 = this.f3897b[i3].a(i2);
            if (a3 < a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int o(int i2) {
        int b2 = this.f3897b[0].b(i2);
        for (int i3 = 1; i3 < this.f3896a; i3++) {
            int b3 = this.f3897b[i3].b(i2);
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private int p(int i2) {
        int b2 = this.f3897b[0].b(i2);
        for (int i3 = 1; i3 < this.f3896a; i3++) {
            int b3 = this.f3897b[i3].b(i2);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private int r(int i2) {
        boolean z;
        if (s() != 0) {
            if (i2 < G()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f3902g) {
                return -1;
            }
            return 1;
        } else if (this.f3902g) {
            return 1;
        } else {
            return -1;
        }
    }

    private void w(View view) {
        for (int i2 = this.f3896a - 1; i2 >= 0; i2--) {
            this.f3897b[i2].b(view);
        }
    }

    private void x(View view) {
        for (int i2 = this.f3896a - 1; i2 >= 0; i2--) {
            this.f3897b[i2].a(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r.b
    public final PointF d(int i2) {
        int r2 = r(i2);
        PointF pointF = new PointF();
        if (r2 == 0) {
            return null;
        }
        if (this.f3900e == 0) {
            pointF.x = (float) r2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) r2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void h(int i2) {
        super.h(i2);
        for (int i3 = 0; i3 < this.f3896a; i3++) {
            this.f3897b[i3].d(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void i(int i2) {
        super.i(i2);
        for (int i3 = 0; i3 < this.f3896a; i3++) {
            this.f3897b[i3].d(i2);
        }
    }

    private int h(RecyclerView.s sVar) {
        if (s() == 0) {
            return 0;
        }
        return aa.a(sVar, this.f3898c, b(!this.L), c(!this.L), this, this.L, this.f3902g);
    }

    private int i(RecyclerView.s sVar) {
        if (s() == 0) {
            return 0;
        }
        return aa.a(sVar, this.f3898c, b(!this.L), c(!this.L), this, this.L);
    }

    private int j(RecyclerView.s sVar) {
        if (s() == 0) {
            return 0;
        }
        return aa.b(sVar, this.f3898c, b(!this.L), c(!this.L), this, this.L);
    }

    private LazySpanLookup.FullSpanItem k(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3914c = new int[this.f3896a];
        for (int i3 = 0; i3 < this.f3896a; i3++) {
            fullSpanItem.f3914c[i3] = i2 - this.f3897b[i3].b(i2);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem l(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3914c = new int[this.f3896a];
        for (int i3 = 0; i3 < this.f3896a; i3++) {
            fullSpanItem.f3914c[i3] = this.f3897b[i3].a(i2) - i2;
        }
        return fullSpanItem;
    }

    private boolean q(int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f3900e == 0) {
            if (i2 == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f3902g) {
                return true;
            }
            return false;
        }
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f3902g) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == C()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i2) {
        SavedState savedState = this.q;
        if (!(savedState == null || savedState.f3916a == i2)) {
            this.q.b();
        }
        this.f3903h = i2;
        this.f3904i = Integer.MIN_VALUE;
        o();
    }

    private c a(q qVar) {
        int i2;
        int i3;
        int i4 = -1;
        if (q(qVar.f4194e)) {
            i2 = this.f3896a - 1;
            i3 = -1;
        } else {
            i2 = 0;
            i4 = this.f3896a;
            i3 = 1;
        }
        c cVar = null;
        if (qVar.f4194e == 1) {
            int i5 = Integer.MAX_VALUE;
            int b2 = this.f3898c.b();
            while (i2 != i4) {
                c cVar2 = this.f3897b[i2];
                int b3 = cVar2.b(b2);
                if (b3 < i5) {
                    cVar = cVar2;
                    i5 = b3;
                }
                i2 += i3;
            }
            return cVar;
        }
        int i6 = Integer.MIN_VALUE;
        int c2 = this.f3898c.c();
        while (i2 != i4) {
            c cVar3 = this.f3897b[i2];
            int a2 = cVar3.a(c2);
            if (a2 > i6) {
                cVar = cVar3;
                i6 = a2;
            }
            i2 += i3;
        }
        return cVar;
    }

    private View b(boolean z) {
        int b2 = this.f3898c.b();
        int c2 = this.f3898c.c();
        int s2 = s();
        View view = null;
        for (int i2 = 0; i2 < s2; i2++) {
            View g2 = g(i2);
            int a2 = this.f3898c.a(g2);
            if (this.f3898c.b(g2) > b2 && a2 < c2) {
                if (a2 >= b2 || !z) {
                    return g2;
                }
                if (view == null) {
                    view = g2;
                }
            }
        }
        return view;
    }

    private View c(boolean z) {
        int b2 = this.f3898c.b();
        int c2 = this.f3898c.c();
        View view = null;
        for (int s2 = s() - 1; s2 >= 0; s2--) {
            View g2 = g(s2);
            int a2 = this.f3898c.a(g2);
            int b3 = this.f3898c.b(g2);
            if (b3 > b2 && a2 < c2) {
                if (b3 <= c2 || !z) {
                    return g2;
                }
                if (view == null) {
                    view = g2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final RecyclerView.j a(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    private void e(int i2, int i3) {
        for (int i4 = 0; i4 < this.f3896a; i4++) {
            if (!this.f3897b[i4].f3935a.isEmpty()) {
                a(this.f3897b[i4], i2, i3);
            }
        }
    }

    public StaggeredGridLayoutManager(int i2, int i3) {
        this.f3900e = i3;
        a(i2);
        this.f3908m = new q();
        l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r7, androidx.recyclerview.widget.RecyclerView.s r8) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    private void b(int i2, RecyclerView.s sVar) {
        int G;
        int i3;
        if (i2 > 0) {
            G = F();
            i3 = 1;
        } else {
            G = G();
            i3 = -1;
        }
        this.f3908m.f4190a = true;
        a(G, sVar);
        f(i3);
        q qVar = this.f3908m;
        qVar.f4192c = G + qVar.f4193d;
        this.f3908m.f4191b = Math.abs(i2);
    }

    private void a(View view, b bVar) {
        if (bVar.f3934b) {
            if (this.f3900e == 1) {
                a(view, this.r, a(this.K, this.I, u() + w(), bVar.height, true));
            } else {
                a(view, a(this.J, this.H, t() + v(), bVar.width, true), this.r);
            }
        } else if (this.f3900e == 1) {
            a(view, a(this.f3907l, this.H, 0, bVar.width, false), a(this.K, this.I, u() + w(), bVar.height, true));
        } else {
            a(view, a(this.J, this.H, t() + v(), bVar.width, true), a(this.f3907l, this.I, 0, bVar.height, false));
        }
    }

    private void b(RecyclerView.o oVar, int i2) {
        for (int s2 = s() - 1; s2 >= 0; s2--) {
            View g2 = g(s2);
            if (this.f3898c.a(g2) >= i2 && this.f3898c.d(g2) >= i2) {
                b bVar = (b) g2.getLayoutParams();
                if (bVar.f3934b) {
                    for (int i3 = 0; i3 < this.f3896a; i3++) {
                        if (this.f3897b[i3].f3935a.size() == 1) {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.f3896a; i4++) {
                        this.f3897b[i4].d();
                    }
                } else if (bVar.f3933a.f3935a.size() != 1) {
                    bVar.f3933a.d();
                } else {
                    return;
                }
                a(g2, oVar);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:231:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x042c A[LOOP:0: B:1:0x0003->B:234:0x042c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x043d A[SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.recyclerview.widget.RecyclerView.o r13, androidx.recyclerview.widget.RecyclerView.s r14) {
        /*
        // Method dump skipped, instructions count: 1086
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        return c(i2, oVar, sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        return c(i2, oVar, sVar);
    }

    private void a(View view, int i2, int i3) {
        b(view, this.s);
        b bVar = (b) view.getLayoutParams();
        int b2 = b(i2, bVar.leftMargin + this.s.left, bVar.rightMargin + this.s.right);
        int b3 = b(i3, bVar.topMargin + this.s.top, bVar.bottomMargin + this.s.bottom);
        if (b(view, b2, b3, bVar)) {
            view.measure(b2, b3);
        }
    }

    private static int b(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode);
        }
        return i2;
    }

    private int c(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        if (s() == 0 || i2 == 0) {
            return 0;
        }
        b(i2, sVar);
        int a2 = a(oVar, this.f3908m, sVar);
        if (this.f3908m.f4191b >= a2) {
            if (i2 < 0) {
                i2 = -a2;
            } else {
                i2 = a2;
            }
        }
        this.f3898c.a(-i2);
        this.o = this.f3902g;
        this.f3908m.f4191b = 0;
        a(oVar, this.f3908m);
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3902g
            if (r0 == 0) goto L_0x003f
            int r5 = r6.F()
        L_0x0008:
            r4 = 8
            if (r9 != r4) goto L_0x003c
            if (r7 >= r8) goto L_0x0038
            int r3 = r8 + 1
        L_0x0010:
            r2 = r7
        L_0x0011:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.f3905j
            r0.b(r2)
            r1 = 1
            if (r9 == r1) goto L_0x0032
            r0 = 2
            if (r9 == r0) goto L_0x002c
            if (r9 == r4) goto L_0x0021
        L_0x001e:
            if (r3 > r5) goto L_0x0044
            return
        L_0x0021:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.f3905j
            r0.a(r7, r1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.f3905j
            r0.b(r8, r1)
            goto L_0x001e
        L_0x002c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.f3905j
            r0.a(r7, r8)
            goto L_0x001e
        L_0x0032:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.f3905j
            r0.b(r7, r8)
            goto L_0x001e
        L_0x0038:
            int r3 = r7 + 1
            r2 = r8
            goto L_0x0011
        L_0x003c:
            int r3 = r7 + r8
            goto L_0x0010
        L_0x003f:
            int r5 = r6.G()
            goto L_0x0008
        L_0x0044:
            boolean r0 = r6.f3902g
            if (r0 == 0) goto L_0x0052
            int r0 = r6.G()
        L_0x004c:
            if (r2 > r0) goto L_0x0051
            r6.o()
        L_0x0051:
            return
        L_0x0052:
            int r0 = r6.F()
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(int, int, int):void");
    }

    private int a(RecyclerView.o oVar, q qVar, RecyclerView.s sVar) {
        int i2;
        int b2;
        int o2;
        boolean z;
        c cVar;
        int a2;
        int e2;
        int b3;
        int e3;
        boolean E;
        int i3 = 0;
        this.n.set(0, this.f3896a, true);
        if (this.f3908m.f4198i) {
            if (qVar.f4194e == 1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = Integer.MIN_VALUE;
            }
        } else if (qVar.f4194e == 1) {
            i2 = qVar.f4196g + qVar.f4191b;
        } else {
            i2 = qVar.f4195f - qVar.f4191b;
        }
        e(qVar.f4194e, i2);
        if (this.f3902g) {
            b2 = this.f3898c.c();
        } else {
            b2 = this.f3898c.b();
        }
        boolean z2 = false;
        while (qVar.a(sVar) && (this.f3908m.f4198i || !this.n.isEmpty())) {
            View a3 = qVar.a(oVar);
            b bVar = (b) a3.getLayoutParams();
            int layoutPosition = bVar.f3847c.getLayoutPosition();
            int c2 = this.f3905j.c(layoutPosition);
            if (c2 == -1) {
                z = true;
                if (bVar.f3934b) {
                    cVar = this.f3897b[i3];
                } else {
                    cVar = a(qVar);
                }
                this.f3905j.a(layoutPosition, cVar);
            } else {
                z = false;
                cVar = this.f3897b[c2];
            }
            bVar.f3933a = cVar;
            if (qVar.f4194e == 1) {
                c(a3);
            } else {
                a(a3, i3);
            }
            a(a3, bVar);
            if (qVar.f4194e == 1) {
                if (bVar.f3934b) {
                    e2 = o(b2);
                } else {
                    e2 = cVar.b(b2);
                }
                a2 = this.f3898c.e(a3) + e2;
                if (z && bVar.f3934b) {
                    LazySpanLookup.FullSpanItem k2 = k(e2);
                    k2.f3913b = -1;
                    k2.f3912a = layoutPosition;
                    this.f3905j.a(k2);
                }
            } else {
                if (bVar.f3934b) {
                    a2 = n(b2);
                } else {
                    a2 = cVar.a(b2);
                }
                e2 = a2 - this.f3898c.e(a3);
                if (z && bVar.f3934b) {
                    LazySpanLookup.FullSpanItem l2 = l(a2);
                    l2.f3913b = 1;
                    l2.f3912a = layoutPosition;
                    this.f3905j.a(l2);
                }
            }
            if (bVar.f3934b && qVar.f4193d == -1) {
                if (!z) {
                    if (qVar.f4194e == 1) {
                        E = D();
                    } else {
                        E = E();
                    }
                    if (!E) {
                        LazySpanLookup.FullSpanItem d2 = this.f3905j.d(layoutPosition);
                        if (d2 != null) {
                            d2.f3915d = true;
                        }
                    }
                }
                this.u = true;
            }
            a(a3, bVar, qVar);
            if (!C() || this.f3900e != 1) {
                if (bVar.f3934b) {
                    b3 = this.f3899d.b();
                } else {
                    b3 = (cVar.f3939e * this.f3907l) + this.f3899d.b();
                }
                e3 = this.f3899d.e(a3) + b3;
            } else {
                if (bVar.f3934b) {
                    e3 = this.f3899d.c();
                } else {
                    e3 = this.f3899d.c() - (((this.f3896a - 1) - cVar.f3939e) * this.f3907l);
                }
                b3 = e3 - this.f3899d.e(a3);
            }
            if (this.f3900e == 1) {
                b(a3, b3, e2, e3, a2);
            } else {
                b(a3, e2, b3, a2, e3);
            }
            if (bVar.f3934b) {
                e(this.f3908m.f4194e, i2);
            } else {
                a(cVar, this.f3908m.f4194e, i2);
            }
            a(oVar, this.f3908m);
            if (this.f3908m.f4197h && a3.hasFocusable()) {
                if (bVar.f3934b) {
                    this.n.clear();
                } else {
                    this.n.set(cVar.f3939e, false);
                }
            }
            z2 = true;
            i3 = 0;
        }
        if (!z2) {
            a(oVar, this.f3908m);
        }
        if (this.f3908m.f4194e == -1) {
            o2 = this.f3898c.b() - n(this.f3898c.b());
        } else {
            o2 = o(this.f3898c.c()) - this.f3898c.c();
        }
        if (o2 > 0) {
            return Math.min(qVar.f4191b, o2);
        }
        return 0;
    }

    private void b(RecyclerView.o oVar, RecyclerView.s sVar, boolean z) {
        int b2;
        int n2 = n(Integer.MAX_VALUE);
        if (n2 != Integer.MAX_VALUE && (b2 = n2 - this.f3898c.b()) > 0) {
            int c2 = b2 - c(b2, oVar, sVar);
            if (z && c2 > 0) {
                this.f3898c.a(-c2);
            }
        }
    }

    private void a(View view, b bVar, q qVar) {
        if (qVar.f4194e == 1) {
            if (bVar.f3934b) {
                w(view);
            } else {
                bVar.f3933a.b(view);
            }
        } else if (bVar.f3934b) {
            x(view);
        } else {
            bVar.f3933a.a(view);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.i.b a2 = a(context, attributeSet, i2, i3);
        int i4 = a2.f3843a;
        if (i4 == 0 || i4 == 1) {
            a((String) null);
            if (i4 != this.f3900e) {
                this.f3900e = i4;
                x xVar = this.f3898c;
                this.f3898c = this.f3899d;
                this.f3899d = xVar;
                o();
            }
            a(a2.f3844b);
            a(a2.f3845c);
            this.f3908m = new q();
            l();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }
}
