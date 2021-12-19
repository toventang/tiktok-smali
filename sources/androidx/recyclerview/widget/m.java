package androidx.recyclerview.widget;

import androidx.core.d.g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadLocal<m> f4136a = new ThreadLocal<>();

    /* renamed from: e  reason: collision with root package name */
    static Comparator<b> f4137e = new Comparator<b>() {
        /* class androidx.recyclerview.widget.m.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1600);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
            boolean z;
            boolean z2;
            b bVar3 = bVar;
            b bVar4 = bVar2;
            if (bVar3.f4149d == null) {
                z = true;
            } else {
                z = false;
            }
            if (bVar4.f4149d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (bVar3.f4149d == null) {
                    return 1;
                }
                return -1;
            } else if (bVar3.f4146a == bVar4.f4146a) {
                int i2 = bVar4.f4147b - bVar3.f4147b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = bVar3.f4148c - bVar4.f4148c;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            } else if (bVar3.f4146a) {
                return -1;
            } else {
                return 1;
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    ArrayList<RecyclerView> f4138b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    long f4139c;

    /* renamed from: d  reason: collision with root package name */
    long f4140d;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<b> f4141f = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public static class a implements RecyclerView.i.a {

        /* renamed from: a  reason: collision with root package name */
        int f4142a;

        /* renamed from: b  reason: collision with root package name */
        int f4143b;

        /* renamed from: c  reason: collision with root package name */
        int[] f4144c;

        /* renamed from: d  reason: collision with root package name */
        int f4145d;

        static {
            Covode.recordClassIndex(1601);
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            int[] iArr = this.f4144c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4145d = 0;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(int i2) {
            if (this.f4144c != null) {
                int i3 = this.f4145d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f4144c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i.a
        public final void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i3 >= 0) {
                int i4 = this.f4145d * 2;
                int[] iArr = this.f4144c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4144c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[(i4 * 2)];
                    this.f4144c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4144c;
                iArr4[i4] = i2;
                iArr4[i4 + 1] = i3;
                this.f4145d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(RecyclerView recyclerView, boolean z) {
            this.f4145d = 0;
            int[] iArr = this.f4144c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.i iVar = recyclerView.o;
            if (recyclerView.n != null && iVar != null && iVar.E) {
                if (z) {
                    if (!recyclerView.f3813g.d()) {
                        iVar.a(recyclerView.n.getItemCount(), this);
                    }
                } else if (!recyclerView.p()) {
                    iVar.a(this.f4142a, this.f4143b, recyclerView.G, this);
                }
                if (this.f4145d > iVar.F) {
                    iVar.F = this.f4145d;
                    iVar.G = z;
                    recyclerView.f3811e.b();
                }
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4146a;

        /* renamed from: b  reason: collision with root package name */
        public int f4147b;

        /* renamed from: c  reason: collision with root package name */
        public int f4148c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f4149d;

        /* renamed from: e  reason: collision with root package name */
        public int f4150e;

        static {
            Covode.recordClassIndex(1602);
        }

        b() {
        }
    }

    static {
        Covode.recordClassIndex(1599);
    }

    m() {
    }

    public final void run() {
        Throwable th;
        long j2;
        RecyclerView recyclerView;
        b bVar;
        boolean z;
        long j3 = 0;
        try {
            g.a("RV Prefetch");
            if (!this.f4138b.isEmpty()) {
                int size = this.f4138b.size();
                long j4 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView2 = this.f4138b.get(i2);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j4 = Math.max(recyclerView2.getDrawingTime(), j4);
                    }
                }
                if (j4 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j4) + this.f4140d;
                    int size2 = this.f4138b.size();
                    int i3 = 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        RecyclerView recyclerView3 = this.f4138b.get(i4);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            recyclerView3.F.a(recyclerView3, false);
                            i3 += recyclerView3.F.f4145d;
                        }
                    }
                    this.f4141f.ensureCapacity(i3);
                    int i5 = 0;
                    for (int i6 = 0; i6 < size2; i6++) {
                        RecyclerView recyclerView4 = this.f4138b.get(i6);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            a aVar = recyclerView4.F;
                            int abs = Math.abs(aVar.f4142a) + Math.abs(aVar.f4143b);
                            for (int i7 = 0; i7 < aVar.f4145d * 2; i7 += 2) {
                                if (i5 >= this.f4141f.size()) {
                                    bVar = new b();
                                    this.f4141f.add(bVar);
                                } else {
                                    bVar = this.f4141f.get(i5);
                                }
                                int i8 = aVar.f4144c[i7 + 1];
                                if (i8 <= abs) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                try {
                                    bVar.f4146a = z;
                                    bVar.f4147b = abs;
                                    bVar.f4148c = i8;
                                    bVar.f4149d = recyclerView4;
                                    bVar.f4150e = aVar.f4144c[i7];
                                    i5++;
                                } catch (Throwable th2) {
                                    th = th2;
                                    j3 = 0;
                                    this.f4139c = j3;
                                    g.a();
                                    throw th;
                                }
                            }
                        }
                    }
                    Collections.sort(this.f4141f, f4137e);
                    for (int i9 = 0; i9 < this.f4141f.size(); i9++) {
                        b bVar2 = this.f4141f.get(i9);
                        if (bVar2.f4149d == null) {
                            break;
                        }
                        if (bVar2.f4146a) {
                            j2 = Long.MAX_VALUE;
                        } else {
                            j2 = nanos;
                        }
                        RecyclerView.ViewHolder a2 = a(bVar2.f4149d, bVar2.f4150e, j2);
                        if (!(a2 == null || a2.mNestedRecyclerView == null || !a2.isBound() || a2.isInvalid() || (recyclerView = a2.mNestedRecyclerView.get()) == null)) {
                            if (recyclerView.A && recyclerView.f3814h.b() != 0) {
                                recyclerView.b();
                            }
                            a aVar2 = recyclerView.F;
                            aVar2.a(recyclerView, true);
                            if (aVar2.f4145d != 0) {
                                try {
                                    g.a("RV Nested Prefetch");
                                    RecyclerView.s sVar = recyclerView.G;
                                    RecyclerView.a aVar3 = recyclerView.n;
                                    sVar.f3879d = 1;
                                    sVar.f3880e = aVar3.getItemCount();
                                    sVar.f3882g = false;
                                    sVar.f3883h = false;
                                    sVar.f3884i = false;
                                    for (int i10 = 0; i10 < aVar2.f4145d * 2; i10 += 2) {
                                        a(recyclerView, aVar2.f4144c[i10], nanos);
                                    }
                                } finally {
                                    g.a();
                                }
                            }
                        }
                        bVar2.f4146a = false;
                        bVar2.f4147b = 0;
                        bVar2.f4148c = 0;
                        bVar2.f4149d = null;
                        bVar2.f4150e = 0;
                    }
                    j3 = 0;
                }
            }
            this.f4139c = j3;
            g.a();
        } catch (Throwable th3) {
            th = th3;
            this.f4139c = j3;
            g.a();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f4139c == 0) {
            this.f4139c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        a aVar = recyclerView.F;
        aVar.f4142a = i2;
        aVar.f4143b = i3;
    }

    private static RecyclerView.ViewHolder a(RecyclerView recyclerView, int i2, long j2) {
        int b2 = recyclerView.f3814h.b();
        for (int i3 = 0; i3 < b2; i3++) {
            RecyclerView.ViewHolder c2 = RecyclerView.c(recyclerView.f3814h.c(i3));
            if (c2.mPosition == i2 && !c2.isInvalid()) {
                return null;
            }
        }
        RecyclerView.o oVar = recyclerView.f3811e;
        try {
            recyclerView.j();
            RecyclerView.ViewHolder a2 = RecyclerView.o.a(oVar, i2, j2);
            if (a2 != null) {
                if (!a2.isBound() || a2.isInvalid()) {
                    oVar.a(a2, false);
                } else {
                    oVar.a(a2.itemView);
                }
            }
            return a2;
        } finally {
            recyclerView.b(false);
        }
    }
}
