package com.ss.bytertc.base.utils;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtils {
    static {
        Covode.recordClassIndex(100719);
    }

    public static String cause(Throwable th) {
        String str = null;
        while (th != null && th.getCause() != null) {
            str = th.getCause().toString();
            th = th.getCause();
        }
        return str;
    }

    public static String stackTrace(Throwable th) {
        th.printStackTrace(new PrintWriter(new StringWriter()));
        return th.toString();
    }
}
