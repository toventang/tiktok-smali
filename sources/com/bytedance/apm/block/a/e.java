package com.bytedance.apm.block.a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public long[] f24580a = new long[4];

    /* renamed from: b  reason: collision with root package name */
    public boolean f24581b;

    static {
        Covode.recordClassIndex(14472);
    }

    public final boolean a() {
        long[] jArr = this.f24580a;
        if (jArr[0] - jArr[2] > 100) {
            return true;
        }
        return false;
    }

    public final void a(long j2) {
        long[] jArr = this.f24580a;
        if (jArr[0] == 0) {
            jArr[0] = SystemClock.uptimeMillis();
        }
        long[] jArr2 = this.f24580a;
        jArr2[1] = jArr2[1] + 1;
        if (j2 < jArr2[2]) {
            jArr2[2] = j2;
        }
        if (j2 > jArr2[3]) {
            jArr2[3] = j2;
        }
        this.f24581b = true;
    }
}
