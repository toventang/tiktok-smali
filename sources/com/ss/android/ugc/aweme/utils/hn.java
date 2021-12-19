package com.ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.google.c.a.t;
import java.util.concurrent.TimeUnit;

public final class hn extends t {

    /* renamed from: b  reason: collision with root package name */
    public static hn f143067b = new hn();

    private hn() {
    }

    static {
        Covode.recordClassIndex(93635);
    }

    @Override // com.google.c.a.t
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis());
    }
}
