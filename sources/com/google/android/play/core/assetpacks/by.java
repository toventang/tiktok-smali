package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

final class by {

    /* renamed from: a  reason: collision with root package name */
    public int f52936a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f52937b = new byte[4096];

    /* renamed from: c  reason: collision with root package name */
    private int f52938c;

    /* renamed from: d  reason: collision with root package name */
    private long f52939d;

    /* renamed from: e  reason: collision with root package name */
    private long f52940e;

    /* renamed from: f  reason: collision with root package name */
    private int f52941f;

    /* renamed from: g  reason: collision with root package name */
    private int f52942g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f52943h;

    /* renamed from: i  reason: collision with root package name */
    private String f52944i;

    static {
        Covode.recordClassIndex(32717);
    }

    public by() {
        b();
    }

    private final int a(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.f52938c;
        if (i5 >= i2) {
            return 0;
        }
        int min = Math.min(i4, i2 - i5);
        System.arraycopy(bArr, i3, this.f52937b, this.f52938c, min);
        int i6 = this.f52938c + min;
        this.f52938c = i6;
        if (i6 < i2) {
            return -1;
        }
        return min;
    }

    private void b() {
        this.f52938c = 0;
        this.f52941f = -1;
        this.f52939d = -1;
        this.f52943h = false;
        this.f52936a = 30;
        this.f52940e = -1;
        this.f52942g = -1;
        this.f52944i = null;
    }

    public final int a(byte[] bArr, int i2, int i3) {
        int a2 = a(30, bArr, i2, i3);
        if (a2 == -1) {
            return -1;
        }
        if (this.f52939d == -1) {
            long a3 = bw.a(this.f52937b, 0);
            this.f52939d = a3;
            if (a3 == 67324752) {
                this.f52943h = false;
                this.f52940e = bw.a(this.f52937b, 18);
                this.f52942g = bw.b(this.f52937b, 8);
                this.f52941f = bw.b(this.f52937b, 26);
                int b2 = this.f52941f + 30 + bw.b(this.f52937b, 28);
                this.f52936a = b2;
                int length = this.f52937b.length;
                if (length < b2) {
                    do {
                        length += length;
                    } while (length < b2);
                    this.f52937b = Arrays.copyOf(this.f52937b, length);
                }
            } else {
                this.f52943h = true;
            }
        }
        int a4 = a(this.f52936a, bArr, i2 + a2, i3 - a2);
        if (a4 == -1) {
            return -1;
        }
        int i4 = a2 + a4;
        if (!this.f52943h && this.f52944i == null) {
            this.f52944i = new String(this.f52937b, 30, this.f52941f);
        }
        return i4;
    }

    public final cs a() {
        int i2 = this.f52938c;
        int i3 = this.f52936a;
        if (i2 < i3) {
            return cs.a(this.f52944i, this.f52940e, this.f52942g, true, Arrays.copyOf(this.f52937b, i2), this.f52943h);
        }
        cs a2 = cs.a(this.f52944i, this.f52940e, this.f52942g, false, Arrays.copyOf(this.f52937b, i3), this.f52943h);
        b();
        return a2;
    }
}
