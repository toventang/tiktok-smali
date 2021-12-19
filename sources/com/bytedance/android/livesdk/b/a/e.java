package com.bytedance.android.livesdk.b.a;

import com.bytedance.covode.number.Covode;

public final class e implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public int f14192a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f14193b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f14194c;

    static {
        Covode.recordClassIndex(7861);
    }

    public e() {
        this((byte) 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public e clone() {
        try {
            e eVar = (e) super.clone();
            try {
                eVar.f14193b = (long[]) this.f14193b.clone();
                eVar.f14194c = (long[]) this.f14194c.clone();
                return eVar;
            } catch (CloneNotSupportedException unused) {
                return eVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public final String toString() {
        if (this.f14192a <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14192a * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f14192a; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f14193b[i2]);
            sb.append('=');
            sb.append(this.f14194c[i2]);
        }
        sb.append('}');
        return sb.toString();
    }

    private e(byte b2) {
        int a2 = b.a(10);
        this.f14193b = new long[a2];
        this.f14194c = new long[a2];
        this.f14192a = 0;
    }

    private void a(int i2) {
        int a2 = b.a(i2);
        long[] jArr = new long[a2];
        long[] jArr2 = new long[a2];
        long[] jArr3 = this.f14193b;
        System.arraycopy(jArr3, 0, jArr, 0, jArr3.length);
        long[] jArr4 = this.f14194c;
        System.arraycopy(jArr4, 0, jArr2, 0, jArr4.length);
        this.f14193b = jArr;
        this.f14194c = jArr2;
    }

    public final long a(long j2) {
        int a2 = c.a(this.f14193b, this.f14192a, j2);
        if (a2 < 0) {
            return 0;
        }
        return this.f14194c[a2];
    }

    public final void b(long j2, long j3) {
        int i2 = this.f14192a;
        if (i2 == 0 || j2 > this.f14193b[i2 - 1]) {
            if (i2 >= this.f14193b.length) {
                a(i2 + 1);
            }
            this.f14193b[i2] = j2;
            this.f14194c[i2] = j3;
            this.f14192a = i2 + 1;
            return;
        }
        a(j2, j3);
    }

    public final void a(long j2, long j3) {
        int a2 = c.a(this.f14193b, this.f14192a, j2);
        if (a2 >= 0) {
            this.f14194c[a2] = j3;
            return;
        }
        int i2 = a2 ^ -1;
        int i3 = this.f14192a;
        if (i3 >= this.f14193b.length) {
            a(i3 + 1);
        }
        int i4 = this.f14192a;
        if (i4 - i2 != 0) {
            long[] jArr = this.f14193b;
            int i5 = i2 + 1;
            System.arraycopy(jArr, i2, jArr, i5, i4 - i2);
            long[] jArr2 = this.f14194c;
            System.arraycopy(jArr2, i2, jArr2, i5, this.f14192a - i2);
        }
        this.f14193b[i2] = j2;
        this.f14194c[i2] = j3;
        this.f14192a++;
    }
}
