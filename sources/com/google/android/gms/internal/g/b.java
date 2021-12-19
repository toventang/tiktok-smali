package com.google.android.gms.internal.g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public interface b {
    static {
        Covode.recordClassIndex(31577);
    }

    ExecutorService a(ThreadFactory threadFactory);
}
