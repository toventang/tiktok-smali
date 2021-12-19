package com.ss.android.agilelogger.c;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

public final class d {
    static {
        Covode.recordClassIndex(36554);
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "ALOG:UnknownHostException";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
        } catch (Throwable unused) {
        }
        printWriter.flush();
        return stringWriter.toString();
    }
}
