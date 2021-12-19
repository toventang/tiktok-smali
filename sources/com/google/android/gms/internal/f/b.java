package com.google.android.gms.internal.f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public interface b {
    static {
        Covode.recordClassIndex(31572);
    }

    ScheduledExecutorService a(ThreadFactory threadFactory);
}
