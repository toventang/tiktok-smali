package com.ss.avframework.utils;

import com.bytedance.covode.number.Covode;

public class ExceptionTracer extends Throwable {
    static {
        Covode.recordClassIndex(100587);
    }

    public static void onJniException(Object obj) {
        if (obj != null && (obj instanceof Throwable)) {
            AVLog.logKibana(7, "Exception", "Jni Exception", (Throwable) obj);
            AVLog.ioe("Exception", "Jni Exception", (Throwable) obj);
        }
    }
}
