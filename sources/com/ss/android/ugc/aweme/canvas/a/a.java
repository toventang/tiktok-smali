package com.ss.android.ugc.aweme.canvas.a;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    private static final Comparator<C1576a> f69616f = new Comparator<C1576a>() {
        /* class com.ss.android.ugc.aweme.canvas.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(42951);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C1576a aVar, C1576a aVar2) {
            return aVar2.a() - aVar.a();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final int[] f69617a;

    /* renamed from: b  reason: collision with root package name */
    final int[] f69618b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b.c> f69619c;

    /* renamed from: d  reason: collision with root package name */
    final b.AbstractC1577b[] f69620d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f69621e = new float[3];

    private static int b(int i2, int i3, int i4) {
        return (i4 > i3 ? i2 << (i4 - i3) : i2 >> (i3 - i4)) & ((1 << i4) - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.canvas.a.a$a  reason: collision with other inner class name */
    public class C1576a {

        /* renamed from: a  reason: collision with root package name */
        int f69622a;

        /* renamed from: c  reason: collision with root package name */
        private int f69624c;

        /* renamed from: d  reason: collision with root package name */
        private int f69625d;

        /* renamed from: e  reason: collision with root package name */
        private int f69626e;

        /* renamed from: f  reason: collision with root package name */
        private int f69627f;

        /* renamed from: g  reason: collision with root package name */
        private int f69628g;

        /* renamed from: h  reason: collision with root package name */
        private int f69629h;

        /* renamed from: i  reason: collision with root package name */
        private int f69630i;

        /* renamed from: j  reason: collision with root package name */
        private int f69631j;

        static {
            Covode.recordClassIndex(42952);
        }

        private int f() {
            return (this.f69622a + 1) - this.f69624c;
        }

        /* access modifiers changed from: package-private */
        public final boolean b() {
            if (f() > 1) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            return ((this.f69627f - this.f69626e) + 1) * ((this.f69629h - this.f69628g) + 1) * ((this.f69631j - this.f69630i) + 1);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            int[] iArr = a.this.f69617a;
            int[] iArr2 = a.this.f69618b;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = 0;
            for (int i9 = this.f69624c; i9 <= this.f69622a; i9++) {
                int i10 = iArr[i9];
                i8 += iArr2[i10];
                int i11 = (i10 >> 10) & 31;
                int i12 = (i10 >> 5) & 31;
                int i13 = i10 & 31;
                if (i11 > i5) {
                    i5 = i11;
                }
                if (i11 < i2) {
                    i2 = i11;
                }
                if (i12 > i6) {
                    i6 = i12;
                }
                if (i12 < i3) {
                    i3 = i12;
                }
                if (i13 > i7) {
                    i7 = i13;
                }
                if (i13 < i4) {
                    i4 = i13;
                }
            }
            this.f69626e = i2;
            this.f69627f = i5;
            this.f69628g = i3;
            this.f69629h = i6;
            this.f69630i = i4;
            this.f69631j = i7;
            this.f69625d = i8;
        }

        /* access modifiers changed from: package-private */
        public final int d() {
            int i2;
            int i3 = this.f69627f - this.f69626e;
            int i4 = this.f69629h - this.f69628g;
            int i5 = this.f69631j - this.f69630i;
            if (i3 >= i4 && i3 >= i5) {
                i2 = -3;
            } else if (i4 < i3 || i4 < i5) {
                i2 = -1;
            } else {
                i2 = -2;
            }
            int[] iArr = a.this.f69617a;
            int[] iArr2 = a.this.f69618b;
            a.a(iArr, i2, this.f69624c, this.f69622a);
            Arrays.sort(iArr, this.f69624c, this.f69622a + 1);
            a.a(iArr, i2, this.f69624c, this.f69622a);
            int i6 = this.f69625d / 2;
            int i7 = this.f69624c;
            int i8 = 0;
            while (true) {
                int i9 = this.f69622a;
                if (i7 > i9) {
                    return this.f69624c;
                }
                i8 += iArr2[iArr[i7]];
                if (i8 >= i6) {
                    return Math.min(i9 - 1, i7);
                }
                i7++;
            }
        }

        /* access modifiers changed from: package-private */
        public final b.c e() {
            int[] iArr = a.this.f69617a;
            int[] iArr2 = a.this.f69618b;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = this.f69624c; i6 <= this.f69622a; i6++) {
                int i7 = iArr[i6];
                int i8 = iArr2[i7];
                i3 += i8;
                i2 += ((i7 >> 10) & 31) * i8;
                i4 += ((i7 >> 5) & 31) * i8;
                i5 += i8 * (i7 & 31);
            }
            float f2 = (float) i3;
            return new b.c(a.a(Math.round(((float) i2) / f2), Math.round(((float) i4) / f2), Math.round(((float) i5) / f2)), i3);
        }

        C1576a(int i2, int i3) {
            this.f69624c = i2;
            this.f69622a = i3;
            c();
        }
    }

    static {
        Covode.recordClassIndex(42950);
    }

    private static int a(int i2) {
        return a((i2 >> 10) & 31, (i2 >> 5) & 31, i2 & 31);
    }

    private List<b.c> a(Collection<C1576a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C1576a aVar : collection) {
            b.c e2 = aVar.e();
            if (!a(e2.a())) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    private boolean a(float[] fArr) {
        b.AbstractC1577b[] bVarArr = this.f69620d;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f69620d[i2].a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void a(PriorityQueue<C1576a> priorityQueue, int i2) {
        C1576a poll;
        while (priorityQueue.size() < i2 && (poll = priorityQueue.poll()) != null && poll.b()) {
            if (poll.b()) {
                int d2 = poll.d();
                C1576a aVar = new C1576a(d2 + 1, poll.f69622a);
                poll.f69622a = d2;
                poll.c();
                priorityQueue.offer(aVar);
                priorityQueue.offer(poll);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
    }

    static int a(int i2, int i3, int i4) {
        return Color.rgb(b(i2, 5, 8), b(i3, 5, 8), b(i4, 5, 8));
    }

    public a(int[] iArr, int i2, b.AbstractC1577b[] bVarArr) {
        this.f69620d = bVarArr;
        int[] iArr2 = new int[32768];
        this.f69618b = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (((iArr[i3] >> 24) & 255) == 255) {
                int i4 = iArr[i3];
                int b2 = b(Color.blue(i4), 8, 5) | (b(Color.red(i4), 8, 5) << 10) | (b(Color.green(i4), 8, 5) << 5);
                iArr[i3] = b2;
                iArr2[b2] = iArr2[b2] + 1;
            }
        }
        int i5 = 0;
        int i6 = 0;
        do {
            if (iArr2[i5] > 0) {
                int a2 = a(i5);
                androidx.core.graphics.a.a(Color.red(a2), Color.green(a2), Color.blue(a2), this.f69621e);
                if (a(this.f69621e)) {
                    iArr2[i5] = 0;
                }
            }
            i6 = iArr2[i5] > 0 ? i6 + 1 : i6;
            i5++;
        } while (i5 < 32768);
        int[] iArr3 = new int[i6];
        this.f69617a = iArr3;
        int i7 = 0;
        int i8 = 0;
        do {
            if (iArr2[i7] > 0) {
                iArr3[i8] = i7;
                i8++;
            }
            i7++;
        } while (i7 < 32768);
        if (i6 <= i2) {
            this.f69619c = new ArrayList();
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = iArr3[i9];
                this.f69619c.add(new b.c(a(i10), iArr2[i10]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i2, f69616f);
        priorityQueue.offer(new C1576a(0, this.f69617a.length - 1));
        a(priorityQueue, i2);
        this.f69619c = a(priorityQueue);
    }

    static void a(int[] iArr, int i2, int i3, int i4) {
        if (i2 == -2) {
            while (i3 <= i4) {
                int i5 = iArr[i3];
                iArr[i3] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
                i3++;
            }
        } else if (i2 == -1) {
            while (i3 <= i4) {
                int i6 = iArr[i3];
                iArr[i3] = ((i6 >> 10) & 31) | ((i6 & 31) << 10) | (((i6 >> 5) & 31) << 5);
                i3++;
            }
        }
    }
}
