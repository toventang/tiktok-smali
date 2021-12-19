package com.bytedance.android.live.broadcast.c.a;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.a;
import com.bytedance.covode.number.Covode;

public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public long f7800a;

    /* renamed from: b  reason: collision with root package name */
    public long f7801b;

    static {
        Covode.recordClassIndex(3854);
    }

    public void a() {
    }

    public void a(int i2, String str) {
    }

    public void b() {
    }

    public void b(int i2, String str) {
    }

    public final long c() {
        long j2;
        if (this.f7800a > 0) {
            j2 = SystemClock.uptimeMillis() - this.f7800a;
        } else {
            j2 = 0;
        }
        this.f7800a = 0;
        return j2;
    }

    public final long d() {
        long j2;
        if (this.f7801b > 0) {
            j2 = SystemClock.uptimeMillis() - this.f7801b;
        } else {
            j2 = 0;
        }
        this.f7801b = 0;
        return j2;
    }
}
