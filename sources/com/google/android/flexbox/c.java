package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.h.h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class c {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ boolean f49669c = true;

    /* renamed from: a  reason: collision with root package name */
    int[] f49670a;

    /* renamed from: b  reason: collision with root package name */
    long[] f49671b;

    /* renamed from: d  reason: collision with root package name */
    private final a f49672d;

    /* renamed from: e  reason: collision with root package name */
    private boolean[] f49673e;

    /* renamed from: f  reason: collision with root package name */
    private long[] f49674f;

    private static long b(int i2, int i3) {
        return (((long) i2) & 4294967295L) | (((long) i3) << 32);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        List<b> f49675a;

        /* renamed from: b  reason: collision with root package name */
        int f49676b;

        static {
            Covode.recordClassIndex(31039);
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f49675a = null;
            this.f49676b = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar, int i2, int i3, int i4, List<b> list) {
        a(aVar, i2, i3, i4, -1, list);
    }

    /* access modifiers changed from: package-private */
    public final void b(a aVar, int i2, int i3, int i4, List<b> list) {
        a(aVar, i2, i3, 0, i4, list);
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar, int i2, int i3, int i4, int i5, List<b> list) {
        int b2;
        int i6 = i4;
        List<b> list2 = list;
        boolean i7 = this.f49672d.i();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        aVar.f49675a = list2;
        boolean z = i5 == -1;
        int a2 = a(i7);
        int b3 = b(i7);
        int c2 = c(i7);
        int d2 = d(i7);
        b bVar = new b();
        bVar.o = i6;
        int i8 = a2 + b3;
        bVar.f49660e = i8;
        int a3 = this.f49672d.a();
        int i9 = 0;
        int i10 = 0;
        int i11 = Integer.MIN_VALUE;
        while (i6 < a3) {
            View a4 = this.f49672d.a(i6);
            if (a4 == null) {
                if (a(i6, a3, bVar)) {
                    a(list2, bVar, i6, i10);
                }
            } else if (a4.getVisibility() == 8) {
                bVar.f49664i++;
                bVar.f49663h++;
                if (a(i6, a3, bVar)) {
                    a(list2, bVar, i6, i10);
                }
            } else {
                if (a4 instanceof CompoundButton) {
                    a((CompoundButton) a4);
                }
                FlexItem flexItem = (FlexItem) a4.getLayoutParams();
                if (flexItem.e() == 4) {
                    bVar.n.add(Integer.valueOf(i6));
                }
                int a5 = a(flexItem, i7);
                if (flexItem.k() != -1.0f && mode == 1073741824) {
                    a5 = Math.round(((float) size) * flexItem.k());
                }
                if (i7) {
                    b2 = this.f49672d.a(c(flexItem, true) + i8 + d(flexItem, true), a5);
                    int b4 = this.f49672d.b(c2 + d2 + e(flexItem, true) + f(flexItem, true) + i10, b(flexItem, true));
                    a4.measure(b2, b4);
                    a(i6, b2, b4, a4);
                } else {
                    int a6 = this.f49672d.a(c2 + d2 + e(flexItem, false) + f(flexItem, false) + i10, b(flexItem, false));
                    b2 = this.f49672d.b(c(flexItem, false) + i8 + d(flexItem, false), a5);
                    a4.measure(a6, b2);
                    a(i6, a6, b2, a4);
                }
                this.f49672d.a(i6, a4);
                a(a4, i6);
                i9 = View.combineMeasuredStates(i9, a4.getMeasuredState());
                if (a(a4, mode, size, bVar.f49660e, a(a4, i7) + c(flexItem, i7) + d(flexItem, i7), flexItem, list2.size())) {
                    if (bVar.a() > 0) {
                        a(list2, bVar, i6 > 0 ? i6 - 1 : 0, i10);
                        i10 += bVar.f49662g;
                    }
                    if (i7) {
                        if (flexItem.b() == -1) {
                            a aVar2 = this.f49672d;
                            a4.measure(b2, aVar2.b(aVar2.u() + this.f49672d.w() + flexItem.m() + flexItem.o() + i10, flexItem.b()));
                            a(a4, i6);
                        }
                    } else if (flexItem.a() == -1) {
                        a aVar3 = this.f49672d;
                        a4.measure(aVar3.a(aVar3.t() + this.f49672d.v() + flexItem.l() + flexItem.n() + i10, flexItem.a()), b2);
                        a(a4, i6);
                    }
                    bVar = new b();
                    bVar.f49663h = 1;
                    bVar.f49660e = i8;
                    bVar.o = i6;
                    i11 = Integer.MIN_VALUE;
                } else {
                    bVar.f49663h++;
                }
                bVar.q |= flexItem.c() != 0.0f;
                bVar.r |= flexItem.d() != 0.0f;
                int[] iArr = this.f49670a;
                if (iArr != null) {
                    iArr[i6] = list2.size();
                }
                bVar.f49660e += a(a4, i7) + c(flexItem, i7) + d(flexItem, i7);
                bVar.f49665j += flexItem.c();
                bVar.f49666k += flexItem.d();
                this.f49672d.a(a4, bVar);
                i11 = Math.max(i11, b(a4, i7) + e(flexItem, i7) + f(flexItem, i7) + this.f49672d.b(a4));
                bVar.f49662g = Math.max(bVar.f49662g, i11);
                if (i7) {
                    if (this.f49672d.d() != 2) {
                        bVar.f49667l = Math.max(bVar.f49667l, a4.getBaseline() + flexItem.m());
                    } else {
                        bVar.f49667l = Math.max(bVar.f49667l, (a4.getMeasuredHeight() - a4.getBaseline()) + flexItem.o());
                    }
                }
                if (a(i6, a3, bVar)) {
                    a(list2, bVar, i6, i10);
                    i10 += bVar.f49662g;
                }
                if (i5 != -1 && list2.size() > 0 && list2.get(list2.size() - 1).p >= i5 && i6 >= i5 && !z) {
                    i10 = -bVar.f49662g;
                    z = true;
                }
                if (i10 > i3 && z) {
                    break;
                }
                i6++;
            }
            i6++;
        }
        aVar.f49676b = i9;
    }

    private boolean a(View view, int i2, int i3, int i4, int i5, FlexItem flexItem, int i6) {
        if (this.f49672d.d() == 0) {
            return false;
        }
        if (flexItem.j()) {
            return true;
        }
        if (i2 == 0) {
            return false;
        }
        int k2 = this.f49672d.k();
        if (k2 != -1 && k2 <= i6 + 1) {
            return false;
        }
        int a2 = this.f49672d.a(view);
        if (a2 > 0) {
            i5 += a2;
        }
        if (i3 < i4 + i5) {
            return true;
        }
        return false;
    }

    private static boolean a(int i2, int i3, b bVar) {
        return i2 == i3 - 1 && bVar.a() != 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        a(i2, i3, 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4) {
        int size;
        int t;
        int v;
        e(this.f49672d.a());
        if (i4 < this.f49672d.a()) {
            int c2 = this.f49672d.c();
            int c3 = this.f49672d.c();
            if (c3 == 0 || c3 == 1) {
                int mode = View.MeasureSpec.getMode(i2);
                size = View.MeasureSpec.getSize(i2);
                int j2 = this.f49672d.j();
                if (mode != 1073741824 && j2 <= size) {
                    size = j2;
                }
                t = this.f49672d.t();
                v = this.f49672d.v();
            } else if (c3 == 2 || c3 == 3) {
                int mode2 = View.MeasureSpec.getMode(i3);
                size = View.MeasureSpec.getSize(i3);
                if (mode2 != 1073741824) {
                    size = this.f49672d.j();
                }
                t = this.f49672d.u();
                v = this.f49672d.w();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(c2)));
            }
            int i5 = t + v;
            int[] iArr = this.f49670a;
            List<b> l2 = this.f49672d.l();
            int size2 = l2.size();
            for (int i6 = iArr != null ? iArr[i4] : 0; i6 < size2; i6++) {
                b bVar = l2.get(i6);
                if (bVar.f49660e < size && bVar.q) {
                    a(bVar, size, i5, false);
                } else if (bVar.f49660e > size && bVar.r) {
                    b(bVar, size, i5, false);
                }
            }
        }
    }

    private void a(b bVar, int i2, int i3, boolean z) {
        double d2;
        double d3;
        int i4 = 1;
        while (bVar.f49665j > 0.0f && i2 >= bVar.f49660e) {
            int i5 = bVar.f49660e;
            float f2 = ((float) (i2 - bVar.f49660e)) / bVar.f49665j;
            bVar.f49660e = i3 + bVar.f49661f;
            if (!z) {
                bVar.f49662g = Integer.MIN_VALUE;
            }
            int i6 = 0;
            boolean z2 = false;
            int i7 = 0;
            float f3 = 0.0f;
            while (i6 < bVar.f49663h) {
                int i8 = bVar.o + i6;
                View a2 = this.f49672d.a(i8);
                if (a2 != null && a2.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) a2.getLayoutParams();
                    int c2 = this.f49672d.c();
                    if (c2 == 0 || c2 == i4) {
                        int measuredWidth = a2.getMeasuredWidth();
                        long[] jArr = this.f49674f;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i8];
                        }
                        int measuredHeight = a2.getMeasuredHeight();
                        long[] jArr2 = this.f49674f;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i8] >> 32);
                        }
                        if (!this.f49673e[i8] && flexItem.c() > 0.0f) {
                            float c3 = ((float) measuredWidth) + (flexItem.c() * f2);
                            if (i6 == bVar.f49663h - 1) {
                                c3 += f3;
                                f3 = 0.0f;
                            }
                            int round = Math.round(c3);
                            if (round > flexItem.h()) {
                                round = flexItem.h();
                                this.f49673e[i8] = true;
                                bVar.f49665j -= flexItem.c();
                                z2 = true;
                            } else {
                                f3 += c3 - ((float) round);
                                double d4 = (double) f3;
                                if (d4 > 1.0d) {
                                    round++;
                                    Double.isNaN(d4);
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round--;
                                    Double.isNaN(d4);
                                    d2 = d4 + 1.0d;
                                }
                                f3 = (float) d2;
                            }
                            int b2 = b(flexItem, bVar.f49668m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            a2.measure(makeMeasureSpec, b2);
                            measuredWidth = a2.getMeasuredWidth();
                            measuredHeight = a2.getMeasuredHeight();
                            a(i8, makeMeasureSpec, b2, a2);
                            this.f49672d.a(i8, a2);
                        }
                        i7 = Math.max(i7, measuredHeight + flexItem.m() + flexItem.o() + this.f49672d.b(a2));
                        bVar.f49660e += measuredWidth + flexItem.l() + flexItem.n();
                    } else {
                        int measuredHeight2 = a2.getMeasuredHeight();
                        long[] jArr3 = this.f49674f;
                        if (jArr3 != null) {
                            measuredHeight2 = (int) (jArr3[i8] >> 32);
                        }
                        int measuredWidth2 = a2.getMeasuredWidth();
                        long[] jArr4 = this.f49674f;
                        if (jArr4 != null) {
                            measuredWidth2 = (int) jArr4[i8];
                        }
                        if (!this.f49673e[i8] && flexItem.c() > 0.0f) {
                            float c4 = ((float) measuredHeight2) + (flexItem.c() * f2);
                            if (i6 == bVar.f49663h - 1) {
                                c4 += f3;
                                f3 = 0.0f;
                            }
                            int round2 = Math.round(c4);
                            if (round2 > flexItem.i()) {
                                round2 = flexItem.i();
                                this.f49673e[i8] = true;
                                bVar.f49665j -= flexItem.c();
                                z2 = true;
                            } else {
                                f3 += c4 - ((float) round2);
                                double d5 = (double) f3;
                                if (d5 > 1.0d) {
                                    round2++;
                                    Double.isNaN(d5);
                                    d3 = d5 - 1.0d;
                                } else if (d5 < -1.0d) {
                                    round2--;
                                    Double.isNaN(d5);
                                    d3 = d5 + 1.0d;
                                }
                                f3 = (float) d3;
                            }
                            int a3 = a(flexItem, bVar.f49668m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            a2.measure(a3, makeMeasureSpec2);
                            measuredWidth2 = a2.getMeasuredWidth();
                            measuredHeight2 = a2.getMeasuredHeight();
                            a(i8, a3, makeMeasureSpec2, a2);
                            this.f49672d.a(i8, a2);
                        }
                        i7 = Math.max(i7, measuredWidth2 + flexItem.l() + flexItem.n() + this.f49672d.b(a2));
                        bVar.f49660e += measuredHeight2 + flexItem.m() + flexItem.o();
                    }
                    bVar.f49662g = Math.max(bVar.f49662g, i7);
                }
                i6++;
                i4 = 1;
            }
            if (z2 && i5 != bVar.f49660e) {
                i4 = 1;
                z = true;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        a(0);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        View a2;
        if (i2 < this.f49672d.a()) {
            int c2 = this.f49672d.c();
            if (this.f49672d.h() == 4) {
                int[] iArr = this.f49670a;
                List<b> l2 = this.f49672d.l();
                int size = l2.size();
                for (int i3 = iArr != null ? iArr[i2] : 0; i3 < size; i3++) {
                    b bVar = l2.get(i3);
                    int i4 = bVar.f49663h;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = bVar.o + i5;
                        if (!(i5 >= this.f49672d.a() || (a2 = this.f49672d.a(i6)) == null || a2.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) a2.getLayoutParams();
                            if (flexItem.e() == -1 || flexItem.e() == 4) {
                                if (c2 == 0 || c2 == 1) {
                                    a(a2, bVar.f49662g, i6);
                                } else if (c2 == 2 || c2 == 3) {
                                    b(a2, bVar.f49662g, i6);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(c2)));
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (b bVar2 : this.f49672d.l()) {
                Iterator<Integer> it = bVar2.n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next = it.next();
                        View a3 = this.f49672d.a(next.intValue());
                        if (c2 == 0 || c2 == 1) {
                            a(a3, bVar2.f49662g, next.intValue());
                        } else if (c2 == 2 || c2 == 3) {
                            b(a3, bVar2.f49662g, next.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(c2)));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, b bVar, int i2, int i3, int i4, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int h2 = this.f49672d.h();
        if (flexItem.e() != -1) {
            h2 = flexItem.e();
        }
        int i6 = bVar.f49662g;
        if (h2 != 0) {
            if (h2 != 1) {
                if (h2 == 2) {
                    int measuredHeight = (((i6 - view.getMeasuredHeight()) + flexItem.m()) - flexItem.o()) / 2;
                    if (this.f49672d.d() != 2) {
                        int i7 = i3 + measuredHeight;
                        view.layout(i2, i7, i4, view.getMeasuredHeight() + i7);
                        return;
                    }
                    int i8 = i3 - measuredHeight;
                    view.layout(i2, i8, i4, view.getMeasuredHeight() + i8);
                    return;
                } else if (h2 != 3) {
                    if (h2 != 4) {
                        return;
                    }
                } else if (this.f49672d.d() != 2) {
                    int max = Math.max(bVar.f49667l - view.getBaseline(), flexItem.m());
                    view.layout(i2, i3 + max, i4, i5 + max);
                    return;
                } else {
                    int max2 = Math.max((bVar.f49667l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.o());
                    view.layout(i2, i3 - max2, i4, i5 - max2);
                    return;
                }
            } else if (this.f49672d.d() != 2) {
                int i9 = i3 + i6;
                view.layout(i2, (i9 - view.getMeasuredHeight()) - flexItem.o(), i4, i9 - flexItem.o());
                return;
            } else {
                view.layout(i2, (i3 - i6) + view.getMeasuredHeight() + flexItem.m(), i4, (i5 - i6) + view.getMeasuredHeight() + flexItem.m());
                return;
            }
        }
        if (this.f49672d.d() != 2) {
            view.layout(i2, i3 + flexItem.m(), i4, i5 + flexItem.m());
        } else {
            view.layout(i2, i3 - flexItem.o(), i4, i5 - flexItem.o());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, b bVar, boolean z, int i2, int i3, int i4, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int h2 = this.f49672d.h();
        if (flexItem.e() != -1) {
            h2 = flexItem.e();
        }
        int i6 = bVar.f49662g;
        if (h2 != 0) {
            if (h2 != 1) {
                if (h2 == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i6 - view.getMeasuredWidth()) + h.a(marginLayoutParams)) - h.b(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i2 + measuredWidth, i3, i4 + measuredWidth, i5);
                        return;
                    } else {
                        view.layout(i2 - measuredWidth, i3, i4 - measuredWidth, i5);
                        return;
                    }
                } else if (!(h2 == 3 || h2 == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i2 + i6) - view.getMeasuredWidth()) - flexItem.n(), i3, ((i4 + i6) - view.getMeasuredWidth()) - flexItem.n(), i5);
                return;
            } else {
                view.layout((i2 - i6) + view.getMeasuredWidth() + flexItem.l(), i3, (i4 - i6) + view.getMeasuredWidth() + flexItem.l(), i5);
                return;
            }
        }
        if (!z) {
            view.layout(i2 + flexItem.l(), i3, i4 + flexItem.l(), i5);
        } else {
            view.layout(i2 - flexItem.n(), i3, i4 - flexItem.n(), i5);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<b> list, int i2) {
        if (!f49669c) {
            if (this.f49670a == null) {
                throw new AssertionError();
            } else if (this.f49671b == null) {
                throw new AssertionError();
            }
        }
        int i3 = this.f49670a[i2];
        if (i3 == -1) {
            i3 = 0;
        }
        for (int size = list.size() - 1; size >= i3; size--) {
            list.remove(size);
        }
        int[] iArr = this.f49670a;
        int length = iArr.length - 1;
        if (i2 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i2, length, -1);
        }
        long[] jArr = this.f49671b;
        int length2 = jArr.length - 1;
        if (i2 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i2, length2, 0L);
        }
    }

    static {
        Covode.recordClassIndex(31038);
    }

    c(a aVar) {
        this.f49672d = aVar;
    }

    private int c(boolean z) {
        if (z) {
            return this.f49672d.u();
        }
        return this.f49672d.x();
    }

    private int d(boolean z) {
        if (z) {
            return this.f49672d.w();
        }
        return this.f49672d.y();
    }

    private int a(boolean z) {
        if (z) {
            return this.f49672d.x();
        }
        return this.f49672d.u();
    }

    private int b(boolean z) {
        if (z) {
            return this.f49672d.y();
        }
        return this.f49672d.w();
    }

    private void e(int i2) {
        boolean[] zArr = this.f49673e;
        if (zArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f49673e = new boolean[i2];
        } else if (zArr.length < i2) {
            int length = zArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f49673e = new boolean[i2];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        long[] jArr = this.f49671b;
        if (jArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f49671b = new long[i2];
        } else if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f49671b = Arrays.copyOf(jArr, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        int[] iArr = this.f49670a;
        if (iArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f49670a = new int[i2];
        } else if (iArr.length < i2) {
            int length = iArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f49670a = Arrays.copyOf(iArr, i2);
        }
    }

    private static void a(CompoundButton compoundButton) {
        int minimumWidth;
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int f2 = flexItem.f();
        int g2 = flexItem.g();
        Drawable a2 = androidx.core.widget.c.a(compoundButton);
        int i2 = 0;
        if (a2 == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = a2.getMinimumWidth();
            i2 = a2.getMinimumHeight();
        }
        if (f2 == -1) {
            f2 = minimumWidth;
        }
        flexItem.a(f2);
        if (g2 == -1) {
            g2 = i2;
        }
        flexItem.b(g2);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        long[] jArr = this.f49674f;
        if (jArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f49674f = new long[i2];
        } else if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f49674f = Arrays.copyOf(jArr, i2);
        }
    }

    private static int a(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private static int b(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private static int c(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.l();
        }
        return flexItem.m();
    }

    private static int d(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.n();
        }
        return flexItem.o();
    }

    private static int e(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.m();
        }
        return flexItem.l();
    }

    private static int f(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.o();
        }
        return flexItem.n();
    }

    private static int a(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.a();
        }
        return flexItem.b();
    }

    private static int b(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.b();
        }
        return flexItem.a();
    }

    private int a(FlexItem flexItem, int i2) {
        a aVar = this.f49672d;
        int a2 = aVar.a(aVar.t() + this.f49672d.v() + flexItem.l() + flexItem.n() + i2, flexItem.a());
        int size = View.MeasureSpec.getSize(a2);
        if (size > flexItem.h()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.h(), View.MeasureSpec.getMode(a2));
        }
        if (size < flexItem.f()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.f(), View.MeasureSpec.getMode(a2));
        }
        return a2;
    }

    private int b(FlexItem flexItem, int i2) {
        a aVar = this.f49672d;
        int b2 = aVar.b(aVar.u() + this.f49672d.w() + flexItem.m() + flexItem.o() + i2, flexItem.b());
        int size = View.MeasureSpec.getSize(b2);
        if (size > flexItem.i()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.i(), View.MeasureSpec.getMode(b2));
        }
        if (size < flexItem.g()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.g(), View.MeasureSpec.getMode(b2));
        }
        return b2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.view.View r6, int r7) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            com.google.android.flexbox.FlexItem r4 = (com.google.android.flexbox.FlexItem) r4
            int r3 = r6.getMeasuredWidth()
            int r2 = r6.getMeasuredHeight()
            int r1 = r4.f()
            r0 = 1
            if (r3 >= r1) goto L_0x0048
            int r3 = r4.f()
        L_0x0019:
            r1 = 1
        L_0x001a:
            int r0 = r4.g()
            if (r2 >= r0) goto L_0x003a
            int r2 = r4.g()
        L_0x0024:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r1, r0)
            r5.a(r7, r1, r0, r6)
            com.google.android.flexbox.a r0 = r5.f49672d
            r0.a(r7, r6)
        L_0x0039:
            return
        L_0x003a:
            int r0 = r4.i()
            if (r2 <= r0) goto L_0x0045
            int r2 = r4.i()
            goto L_0x0024
        L_0x0045:
            if (r1 == 0) goto L_0x0039
            goto L_0x0024
        L_0x0048:
            int r0 = r4.h()
            if (r3 <= r0) goto L_0x0053
            int r3 = r4.h()
            goto L_0x0019
        L_0x0053:
            r1 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.c.a(android.view.View, int):void");
    }

    private void b(View view, int i2, int i3) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i2 - flexItem.l()) - flexItem.n()) - this.f49672d.b(view), flexItem.f()), flexItem.h());
        long[] jArr = this.f49674f;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i3] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        a(i3, makeMeasureSpec2, makeMeasureSpec, view);
        this.f49672d.a(i3, view);
    }

    private void a(View view, int i2, int i3) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i2 - flexItem.m()) - flexItem.o()) - this.f49672d.b(view), flexItem.g()), flexItem.i());
        long[] jArr = this.f49674f;
        if (jArr != null) {
            measuredWidth = (int) jArr[i3];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        a(i3, makeMeasureSpec, makeMeasureSpec2, view);
        this.f49672d.a(i3, view);
    }

    private static void a(List<b> list, b bVar, int i2, int i3) {
        bVar.f49668m = i3;
        bVar.p = i2;
        list.add(bVar);
    }

    private void a(int i2, int i3, int i4, View view) {
        long[] jArr = this.f49671b;
        if (jArr != null) {
            jArr[i2] = b(i3, i4);
        }
        long[] jArr2 = this.f49674f;
        if (jArr2 != null) {
            jArr2[i2] = b(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void b(b bVar, int i2, int i3, boolean z) {
        int i4 = 1;
        while (true) {
            int i5 = bVar.f49660e;
            if (bVar.f49666k > 0.0f && i2 <= bVar.f49660e) {
                float f2 = ((float) (bVar.f49660e - i2)) / bVar.f49666k;
                bVar.f49660e = i3 + bVar.f49661f;
                if (!z) {
                    bVar.f49662g = Integer.MIN_VALUE;
                }
                int i6 = 0;
                boolean z2 = false;
                int i7 = 0;
                float f3 = 0.0f;
                while (i6 < bVar.f49663h) {
                    int i8 = bVar.o + i6;
                    View a2 = this.f49672d.a(i8);
                    if (a2 != null && a2.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) a2.getLayoutParams();
                        int c2 = this.f49672d.c();
                        if (c2 == 0 || c2 == i4) {
                            int measuredWidth = a2.getMeasuredWidth();
                            long[] jArr = this.f49674f;
                            if (jArr != null) {
                                measuredWidth = (int) jArr[i8];
                            }
                            int measuredHeight = a2.getMeasuredHeight();
                            long[] jArr2 = this.f49674f;
                            if (jArr2 != null) {
                                measuredHeight = (int) (jArr2[i8] >> 32);
                            }
                            if (!this.f49673e[i8] && flexItem.d() > 0.0f) {
                                float d2 = ((float) measuredWidth) - (flexItem.d() * f2);
                                if (i6 == bVar.f49663h - 1) {
                                    d2 += f3;
                                    f3 = 0.0f;
                                }
                                int round = Math.round(d2);
                                if (round < flexItem.f()) {
                                    round = flexItem.f();
                                    this.f49673e[i8] = true;
                                    bVar.f49666k -= flexItem.d();
                                    z2 = true;
                                } else {
                                    f3 += d2 - ((float) round);
                                    double d3 = (double) f3;
                                    if (d3 > 1.0d) {
                                        round++;
                                        f3 -= 1.0f;
                                    } else if (d3 < -1.0d) {
                                        round--;
                                        f3 += 1.0f;
                                    }
                                }
                                int b2 = b(flexItem, bVar.f49668m);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                a2.measure(makeMeasureSpec, b2);
                                measuredWidth = a2.getMeasuredWidth();
                                measuredHeight = a2.getMeasuredHeight();
                                a(i8, makeMeasureSpec, b2, a2);
                                this.f49672d.a(i8, a2);
                            }
                            i7 = Math.max(i7, measuredHeight + flexItem.m() + flexItem.o() + this.f49672d.b(a2));
                            bVar.f49660e += measuredWidth + flexItem.l() + flexItem.n();
                        } else {
                            int measuredHeight2 = a2.getMeasuredHeight();
                            long[] jArr3 = this.f49674f;
                            if (jArr3 != null) {
                                measuredHeight2 = (int) (jArr3[i8] >> 32);
                            }
                            int measuredWidth2 = a2.getMeasuredWidth();
                            long[] jArr4 = this.f49674f;
                            if (jArr4 != null) {
                                measuredWidth2 = (int) jArr4[i8];
                            }
                            if (!this.f49673e[i8] && flexItem.d() > 0.0f) {
                                float d4 = ((float) measuredHeight2) - (flexItem.d() * f2);
                                if (i6 == bVar.f49663h - 1) {
                                    d4 += f3;
                                    f3 = 0.0f;
                                }
                                int round2 = Math.round(d4);
                                if (round2 < flexItem.g()) {
                                    round2 = flexItem.g();
                                    this.f49673e[i8] = true;
                                    bVar.f49666k -= flexItem.d();
                                    z2 = true;
                                } else {
                                    f3 += d4 - ((float) round2);
                                    double d5 = (double) f3;
                                    if (d5 > 1.0d) {
                                        round2++;
                                        f3 -= 1.0f;
                                    } else if (d5 < -1.0d) {
                                        round2--;
                                        f3 += 1.0f;
                                    }
                                }
                                int a3 = a(flexItem, bVar.f49668m);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                a2.measure(a3, makeMeasureSpec2);
                                measuredWidth2 = a2.getMeasuredWidth();
                                measuredHeight2 = a2.getMeasuredHeight();
                                a(i8, a3, makeMeasureSpec2, a2);
                                this.f49672d.a(i8, a2);
                            }
                            i7 = Math.max(i7, measuredWidth2 + flexItem.l() + flexItem.n() + this.f49672d.b(a2));
                            bVar.f49660e += measuredHeight2 + flexItem.m() + flexItem.o();
                        }
                        bVar.f49662g = Math.max(bVar.f49662g, i7);
                    }
                    i6++;
                    i4 = 1;
                }
                if (z2 && i5 != bVar.f49660e) {
                    i4 = 1;
                    z = true;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(a aVar, int i2, int i3, int i4, List<b> list) {
        a(aVar, i2, i3, i4, -1, list);
    }

    /* access modifiers changed from: package-private */
    public final void d(a aVar, int i2, int i3, int i4, List<b> list) {
        a(aVar, i2, i3, 0, i4, list);
    }
}
