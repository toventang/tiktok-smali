package com.bytedance.android.a.a.h;

import com.bytedance.android.a.a.e;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(3204);
    }

    public static String a(String str) {
        com.bytedance.android.a.a.f.a aVar = e.d().f6645c;
        if (aVar != null && aVar.f6658b) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i2 = 1; i2 < stackTrace.length; i2++) {
                try {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!(stackTraceElement.getClassName().equals(Thread.class.getCanonicalName()) || stackTraceElement.getClassName().equals(a.class.getCanonicalName()))) {
                        return "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")#" + stackTraceElement.getMethodName() + ". " + str;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return str;
    }
}
