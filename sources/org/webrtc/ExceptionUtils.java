package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtils {
    static {
        Covode.recordClassIndex(106586);
    }

    public static String stackTrace(Throwable th) {
        th.printStackTrace(new PrintWriter(new StringWriter()));
        return th.toString();
    }
}
