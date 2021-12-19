package com.squareup.a.a.a;

import com.bytedance.covode.number.Covode;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    int f57566a;

    /* renamed from: b  reason: collision with root package name */
    int f57567b;

    /* renamed from: c  reason: collision with root package name */
    int f57568c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f57569d = new int[10];

    static {
        Covode.recordClassIndex(35918);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        if ((this.f57566a & 2) != 0) {
            return this.f57569d[1];
        }
        return -1;
    }

    public final int b() {
        if ((this.f57566a & 128) != 0) {
            return this.f57569d[7];
        }
        return 65536;
    }

    private boolean c(int i2) {
        if (((1 << i2) & this.f57567b) != 0) {
            return true;
        }
        return false;
    }

    private boolean d(int i2) {
        if (((1 << i2) & this.f57568c) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2) {
        if (((1 << i2) & this.f57566a) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int b(int i2) {
        int i3;
        if (d(i2)) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        if (c(i2)) {
            return i3 | 1;
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    public final n a(int i2, int i3, int i4) {
        int[] iArr = this.f57569d;
        if (i2 >= iArr.length) {
            return this;
        }
        int i5 = 1 << i2;
        this.f57566a |= i5;
        if ((i3 & 1) != 0) {
            this.f57567b |= i5;
        } else {
            this.f57567b &= i5 ^ -1;
        }
        if ((i3 & 2) != 0) {
            this.f57568c |= i5;
        } else {
            this.f57568c &= i5 ^ -1;
        }
        iArr[i2] = i4;
        return this;
    }
}
