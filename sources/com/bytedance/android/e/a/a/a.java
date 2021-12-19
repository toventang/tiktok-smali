package com.bytedance.android.e.a.a;

import com.bytedance.android.e.a.a.d;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class a extends d.a {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f6854b;

    /* renamed from: c  reason: collision with root package name */
    private int f6855c;

    static {
        Covode.recordClassIndex(3325);
    }

    @Override // com.bytedance.android.e.a.a.d.b
    public final boolean a() {
        if (this.f6854b.length - this.f6855c > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.e.a.a.d.b
    public final byte b() {
        byte[] bArr = this.f6854b;
        int i2 = this.f6855c;
        this.f6855c = i2 + 1;
        return bArr[i2];
    }

    a(byte[] bArr) {
        this.f6854b = bArr;
    }

    @Override // com.bytedance.android.e.a.a.d.b
    public final void a(long j2) {
        this.f6855c = (int) (((long) this.f6855c) + j2);
    }

    @Override // com.bytedance.android.e.a.a.d.b
    public final byte[] b(long j2) {
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f6854b, this.f6855c, bArr, 0, i2);
        this.f6855c += i2;
        return bArr;
    }

    @Override // com.bytedance.android.e.a.a.d.b
    public final String c(long j2) {
        String str = new String(this.f6854b, this.f6855c, (int) j2, f6860a);
        this.f6855c = (int) (((long) this.f6855c) + j2);
        return str;
    }
}
