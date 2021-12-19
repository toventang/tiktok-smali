package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

final class o<K, V> extends m<K, V> {
    private final boolean accessOrder;

    /* renamed from: g  reason: collision with root package name */
    transient long[] f54096g;

    /* renamed from: h  reason: collision with root package name */
    private transient int f54097h;

    /* renamed from: i  reason: collision with root package name */
    private transient int f54098i;

    static {
        Covode.recordClassIndex(33530);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.m
    public final int a() {
        return this.f54097h;
    }

    o() {
        this(3);
    }

    @Override // com.google.c.c.m
    public final void clear() {
        super.clear();
        this.f54097h = -2;
        this.f54098i = -2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.m
    public final int e(int i2) {
        return (int) this.f54096g[i2];
    }

    o(int i2) {
        this(i2, (byte) 0);
    }

    private int f(int i2) {
        return (int) (this.f54096g[i2] >>> 32);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.m
    public final void b(int i2) {
        super.b(i2);
        this.f54096g = Arrays.copyOf(this.f54096g, i2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.m
    public final void a(int i2) {
        if (this.accessOrder) {
            b(f(i2), (int) this.f54096g[i2]);
            b(this.f54098i, i2);
            b(i2, -2);
            this.f54065e++;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.m
    public final void d(int i2) {
        int size = size() - 1;
        b(f(i2), (int) this.f54096g[i2]);
        if (i2 < size) {
            b(f(size), i2);
            b(i2, (int) this.f54096g[size]);
        }
        super.d(i2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.m
    public final int a(int i2, int i3) {
        if (i2 >= size()) {
            return i3;
        }
        return i2;
    }

    private o(int i2, byte b2) {
        super(i2, (byte) 0);
        this.accessOrder = false;
    }

    private void b(int i2, int i3) {
        if (i2 == -2) {
            this.f54097h = i3;
        } else {
            long[] jArr = this.f54096g;
            jArr[i2] = (jArr[i2] & -4294967296L) | (((long) i3) & 4294967295L);
        }
        if (i3 == -2) {
            this.f54098i = i2;
            return;
        }
        long[] jArr2 = this.f54096g;
        jArr2[i3] = (4294967295L & jArr2[i3]) | (((long) i2) << 32);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.m
    public final void a(int i2, float f2) {
        super.a(i2, f2);
        this.f54097h = -2;
        this.f54098i = -2;
        long[] jArr = new long[i2];
        this.f54096g = jArr;
        Arrays.fill(jArr, -1L);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.m
    public final void a(int i2, K k2, V v, int i3) {
        super.a(i2, k2, v, i3);
        b(this.f54098i, i2);
        b(i2, -2);
    }
}
