package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.i;
import com.google.c.a.k;
import com.google.c.c.av;
import java.util.Arrays;

final class ay<K> {

    /* renamed from: a  reason: collision with root package name */
    transient Object[] f53957a;

    /* renamed from: b  reason: collision with root package name */
    transient int[] f53958b;

    /* renamed from: c  reason: collision with root package name */
    public transient int f53959c;

    /* renamed from: d  reason: collision with root package name */
    transient int f53960d;

    /* renamed from: e  reason: collision with root package name */
    transient int[] f53961e;

    /* renamed from: f  reason: collision with root package name */
    transient long[] f53962f;

    /* renamed from: g  reason: collision with root package name */
    private transient float f53963g;

    /* renamed from: h  reason: collision with root package name */
    private transient int f53964h;

    static {
        Covode.recordClassIndex(33452);
    }

    private static long a(long j2, int i2) {
        return (j2 & -4294967296L) | (((long) i2) & 4294967295L);
    }

    class a extends av.a<K> {

        /* renamed from: a  reason: collision with root package name */
        final K f53965a;

        /* renamed from: b  reason: collision with root package name */
        int f53966b;

        static {
            Covode.recordClassIndex(33453);
        }

        @Override // com.google.c.c.au.a
        public final K a() {
            return this.f53965a;
        }

        @Override // com.google.c.c.au.a
        public final int b() {
            int i2 = this.f53966b;
            if (i2 == -1 || i2 >= ay.this.f53959c || !i.a(this.f53965a, ay.this.f53957a[this.f53966b])) {
                this.f53966b = ay.this.a(this.f53965a);
            }
            if (this.f53966b == -1) {
                return 0;
            }
            return ay.this.f53958b[this.f53966b];
        }

        a(int i2) {
            this.f53965a = (K) ay.this.f53957a[i2];
            this.f53966b = i2;
        }
    }

    ay() {
        f(3);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        if (this.f53959c == 0) {
            return -1;
        }
        return 0;
    }

    private static int[] g(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] h(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    ay(int i2) {
        this(i2, (byte) 0);
    }

    public final int b(Object obj) {
        int a2 = a(obj);
        if (a2 == -1) {
            return 0;
        }
        return this.f53958b[a2];
    }

    /* access modifiers changed from: package-private */
    public final int c(int i2) {
        k.a(i2, this.f53959c);
        return this.f53958b[i2];
    }

    private void i(int i2) {
        int length = this.f53962f.length;
        if (i2 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                j(max);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final K b(int i2) {
        k.a(i2, this.f53959c);
        return (K) this.f53957a[i2];
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        if (i2 > this.f53962f.length) {
            j(i2);
        }
        if (i2 >= this.f53964h) {
            k(Math.max(2, Integer.highestOneBit(i2 - 1) << 1));
        }
    }

    /* access modifiers changed from: package-private */
    public final int e(int i2) {
        return b(this.f53957a[i2], (int) (this.f53962f[i2] >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.ay<K> */
    /* JADX WARN: Multi-variable type inference failed */
    ay(ay<? extends K> ayVar) {
        f(ayVar.f53959c);
        int a2 = ayVar.a();
        while (a2 != -1) {
            a(ayVar.b(a2), ayVar.c(a2));
            a2 = ayVar.a(a2);
        }
    }

    private void f(int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        k.a(z, "Initial capacity must be non-negative");
        k.a(true, (Object) "Illegal load factor");
        int a2 = w.a(i2, 1.0d);
        this.f53961e = g(a2);
        this.f53963g = 1.0f;
        this.f53957a = new Object[i2];
        this.f53958b = new int[i2];
        this.f53962f = h(i2);
        this.f53964h = Math.max(1, (int) (((float) a2) * 1.0f));
    }

    private void j(int i2) {
        this.f53957a = Arrays.copyOf(this.f53957a, i2);
        this.f53958b = Arrays.copyOf(this.f53958b, i2);
        long[] jArr = this.f53962f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1L);
        }
        this.f53962f = copyOf;
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f53959c) {
            return i3;
        }
        return -1;
    }

    private void k(int i2) {
        if (this.f53961e.length >= 1073741824) {
            this.f53964h = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (((float) i2) * this.f53963g)) + 1;
        int[] g2 = g(i2);
        long[] jArr = this.f53962f;
        int length = g2.length - 1;
        for (int i4 = 0; i4 < this.f53959c; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & length;
            int i7 = g2[i6];
            g2[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.f53964h = i3;
        this.f53961e = g2;
    }

    private void l(int i2) {
        int i3 = this.f53959c - 1;
        if (i2 < i3) {
            Object[] objArr = this.f53957a;
            objArr[i2] = objArr[i3];
            int[] iArr = this.f53958b;
            iArr[i2] = iArr[i3];
            objArr[i3] = null;
            iArr[i3] = 0;
            long[] jArr = this.f53962f;
            long j2 = jArr[i3];
            jArr[i2] = j2;
            jArr[i3] = -1;
            int[] iArr2 = this.f53961e;
            int length = ((int) (j2 >>> 32)) & (iArr2.length - 1);
            int i4 = iArr2[length];
            if (i4 == i3) {
                iArr2[length] = i2;
                return;
            }
            while (true) {
                long[] jArr2 = this.f53962f;
                long j3 = jArr2[i4];
                int i5 = (int) j3;
                if (i5 == i3) {
                    jArr2[i4] = a(j3, i2);
                    return;
                }
                i4 = i5;
            }
        } else {
            this.f53957a[i2] = null;
            this.f53958b[i2] = 0;
            this.f53962f[i2] = -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj) {
        int a2 = w.a(obj);
        int[] iArr = this.f53961e;
        int i2 = iArr[(iArr.length - 1) & a2];
        while (i2 != -1) {
            long j2 = this.f53962f[i2];
            if (((int) (j2 >>> 32)) == a2 && i.a(obj, this.f53957a[i2])) {
                return i2;
            }
            i2 = (int) j2;
        }
        return -1;
    }

    private ay(int i2, byte b2) {
        f(i2);
    }

    /* access modifiers changed from: package-private */
    public final int b(Object obj, int i2) {
        int[] iArr = this.f53961e;
        int length = (iArr.length - 1) & i2;
        int i3 = iArr[length];
        if (i3 == -1) {
            return 0;
        }
        int i4 = -1;
        while (true) {
            if (((int) (this.f53962f[i3] >>> 32)) != i2 || !i.a(obj, this.f53957a[i3])) {
                int i5 = (int) this.f53962f[i3];
                if (i5 == -1) {
                    return 0;
                }
                i4 = i3;
                i3 = i5;
            } else {
                int i6 = this.f53958b[i3];
                if (i4 == -1) {
                    this.f53961e[length] = (int) this.f53962f[i3];
                } else {
                    long[] jArr = this.f53962f;
                    jArr[i4] = a(jArr[i4], (int) jArr[i3]);
                }
                l(i3);
                this.f53959c--;
                this.f53960d++;
                return i6;
            }
        }
    }

    public final int a(K k2, int i2) {
        k.b(i2, "count");
        long[] jArr = this.f53962f;
        Object[] objArr = this.f53957a;
        int[] iArr = this.f53958b;
        int a2 = w.a(k2);
        int[] iArr2 = this.f53961e;
        int length = (iArr2.length - 1) & a2;
        int i3 = this.f53959c;
        int i4 = iArr2[length];
        if (i4 == -1) {
            iArr2[length] = i3;
        } else {
            while (true) {
                long j2 = jArr[i4];
                if (((int) (j2 >>> 32)) != a2 || !i.a(k2, objArr[i4])) {
                    int i5 = (int) j2;
                    if (i5 == -1) {
                        jArr[i4] = a(j2, i3);
                        break;
                    }
                    i4 = i5;
                } else {
                    int i6 = iArr[i4];
                    iArr[i4] = i2;
                    return i6;
                }
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            int i7 = i3 + 1;
            i(i7);
            a(i3, k2, i2, a2);
            this.f53959c = i7;
            if (i3 >= this.f53964h) {
                k(this.f53961e.length * 2);
            }
            this.f53960d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        k.a(i2, this.f53959c);
        this.f53958b[i2] = i3;
    }

    private void a(int i2, K k2, int i3, int i4) {
        this.f53962f[i2] = (((long) i4) << 32) | 4294967295L;
        this.f53957a[i2] = k2;
        this.f53958b[i2] = i3;
    }
}
