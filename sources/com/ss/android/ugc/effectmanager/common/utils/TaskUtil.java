package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;

public final class TaskUtil {
    public static final TaskUtil INSTANCE = new TaskUtil();
    private static final AtomicLong id = new AtomicLong(0);

    private TaskUtil() {
    }

    public final String generateTaskId() {
        return String.valueOf(id.incrementAndGet());
    }

    static {
        Covode.recordClassIndex(95349);
    }
}
