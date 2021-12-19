package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.an;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f61358a;

    /* renamed from: b  reason: collision with root package name */
    public int f61359b;

    static {
        Covode.recordClassIndex(37770);
    }

    public final Long b() {
        if (this.f61359b + 8 <= this.f61358a.length) {
            return Long.valueOf(String.valueOf(a()));
        }
        an.d("TEParcel", "out of border");
        return null;
    }

    public final int a() {
        int i2 = this.f61359b;
        int i3 = i2 + 4;
        byte[] bArr = this.f61358a;
        if (i3 > bArr.length) {
            an.d("TEParcel", "out of border");
            return -1;
        }
        int i4 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & Byte.MAX_VALUE) << 24);
        if ((bArr[i2 + 3] >> 7) != 0) {
            i4 -= Integer.MIN_VALUE;
        }
        this.f61359b = i2 + 4;
        return i4;
    }

    public e(byte[] bArr) {
        this.f61358a = bArr;
    }
}
