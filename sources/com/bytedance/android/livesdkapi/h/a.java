package com.bytedance.android.livesdkapi.h;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class a {
    @com.google.gson.a.a
    public com.bytedance.android.livesdk.model.message.a.a L = com.bytedance.android.livesdk.model.message.a.a.DEFAULT;
    public transient long M;
    public volatile long N = SystemClock.elapsedRealtime();
    @c(a = "common")
    public b O;

    static {
        Covode.recordClassIndex(13770);
    }

    public boolean b() {
        return false;
    }

    public final boolean a(long j2) {
        long j3;
        b bVar = this.O;
        if (bVar != null) {
            j3 = bVar.f23211c;
        } else {
            j3 = 0;
        }
        if (j2 == 0 || j2 != j3) {
            return false;
        }
        return true;
    }
}
