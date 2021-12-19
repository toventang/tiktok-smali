package com.bytedance.apm.q;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class r {
    static {
        Covode.recordClassIndex(14718);
    }

    public static String b(Throwable th) {
        return a(th, 30);
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        Throwable cause = th.getCause();
        if (cause != null) {
            cause.printStackTrace(printWriter);
            Throwable cause2 = cause.getCause();
            if (cause2 != null) {
                cause2.printStackTrace(printWriter);
            }
        }
        String stringWriter2 = stringWriter.toString();
        printWriter.close();
        if (stringWriter2.length() > 1024) {
            return stringWriter2.substring(0, 1024);
        }
        return stringWriter2;
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            throw new IllegalArgumentException("stackTraceElements must not be null or empty");
        }
        StringBuilder sb = new StringBuilder(stackTraceElementArr.length * 30);
        int i2 = 0;
        while (i2 < stackTraceElementArr.length && i2 <= 40) {
            if (i2 == 0) {
                if ("getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName())) {
                    i2++;
                }
            } else if (i2 == 1 && "getStackTrace".equals(stackTraceElementArr[1].getMethodName())) {
                i2++;
            }
            sb.append("\tat " + stackTraceElementArr[i2].getClassName()).append(".").append(stackTraceElementArr[i2].getMethodName()).append("(").append(stackTraceElementArr[i2].getFileName()).append(":").append(stackTraceElementArr[i2].getLineNumber()).append(")\n");
            i2++;
        }
        return sb.toString();
    }

    public static String a(Throwable th, int i2) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            i3++;
            sb.append("\tat " + stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
            if (i3 > i2) {
                break;
            }
        }
        return sb.toString();
    }
}
