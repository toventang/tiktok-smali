package com.ss.ugc.aweme.performance.core.monitor.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f153383a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(101824);
    }

    public static StackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return null;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (a.a(stackTraceElement)) {
                stackTraceElementArr2[i2] = stackTraceElement;
                i2++;
            }
        }
        return stackTraceElementArr2;
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                l.c(stackTraceElement, "");
                l.c(sb, "");
                sb.append("  at ").append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
            }
        }
        String sb2 = sb.toString();
        l.a((Object) sb2, "");
        return sb2;
    }
}
