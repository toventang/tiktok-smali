package com.benchmark.mediacodec;

import com.bytedance.covode.number.Covode;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public int f6279a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f6280b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f6281c;

    /* renamed from: d  reason: collision with root package name */
    public long f6282d;

    /* renamed from: e  reason: collision with root package name */
    public long f6283e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6284f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6285g;

    static {
        Covode.recordClassIndex(3020);
    }

    public final boolean a() {
        int i2 = this.f6279a;
        if (i2 == 17) {
            int[] iArr = this.f6281c;
            if (iArr == null || iArr.length != 3) {
                return false;
            }
            return true;
        } else if (i2 == 16 || i2 == 14 || i2 == 15) {
            int[] iArr2 = this.f6281c;
            if (iArr2 == null || iArr2.length <= 0) {
                return false;
            }
            return true;
        } else if (this.f6280b != null) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Format: " + this.f6279a + "; PTS: " + this.f6282d + "; DTS: " + this.f6283e + "; isEOF: " + this.f6285g + "; isKeyFrame: " + this.f6284f;
    }
}
