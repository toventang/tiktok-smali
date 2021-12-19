package com.facebook.j.a;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

final class a {

    /* renamed from: a  reason: collision with root package name */
    byte[] f48720a;

    /* renamed from: b  reason: collision with root package name */
    int f48721b;

    /* renamed from: c  reason: collision with root package name */
    int f48722c;

    /* renamed from: d  reason: collision with root package name */
    char f48723d;

    /* renamed from: e  reason: collision with root package name */
    boolean f48724e;

    static {
        Covode.recordClassIndex(29373);
    }

    a() {
    }

    private void d() {
        if (!this.f48724e) {
            throw new IllegalStateException("Must call useDelimiter first");
        }
    }

    public final void c() {
        a();
        d();
        e();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f48720a == null) {
            throw new IllegalStateException("Must call reset first");
        }
    }

    private int e() {
        a();
        d();
        int i2 = this.f48722c;
        int i3 = this.f48721b;
        if (i2 > i3) {
            int a2 = a(this.f48720a, i3, i2, this.f48723d);
            if (a2 == -1) {
                int i4 = this.f48722c;
                int i5 = i4 - this.f48721b;
                this.f48721b = i4;
                return i5;
            }
            int i6 = a2 - this.f48721b;
            this.f48721b = a2 + 1;
            return i6;
        }
        throw new NoSuchElementException("Reading past end of input stream at " + this.f48721b + ".");
    }

    public final int b() {
        a();
        d();
        int i2 = this.f48721b;
        int e2 = e();
        byte[] bArr = this.f48720a;
        int i3 = e2 + i2;
        int i4 = 0;
        while (i2 < i3) {
            int i5 = i2 + 1;
            int i6 = bArr[i2] - 48;
            if (i6 < 0 || i6 > 9) {
                throw new NumberFormatException("Invalid int in buffer at " + (i5 - 1) + ".");
            }
            i4 = (i4 * 10) + i6;
            i2 = i5;
        }
        return i4;
    }

    public final boolean a(String str) {
        int i2 = this.f48721b;
        if (str.length() != e()) {
            return false;
        }
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) != this.f48720a[i2]) {
                return false;
            }
            i2++;
        }
        return true;
    }

    private static int a(byte[] bArr, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (bArr[i2] == c2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
