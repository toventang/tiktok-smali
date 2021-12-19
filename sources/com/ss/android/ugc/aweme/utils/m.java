package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f143136a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(93696);
    }

    public static final String a() {
        StringBuilder sb = new StringBuilder();
        Activity[] activityStack = ActivityStack.getActivityStack();
        int min = Math.min(activityStack.length, 10);
        for (int i2 = 0; i2 < min; i2++) {
            if (i2 > 0) {
                sb.append("\n");
            }
            sb.append(activityStack[i2].getClass().getCanonicalName());
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static final String a(String[] strArr) {
        l.d(strArr, "");
        StringBuilder sb = new StringBuilder();
        Thread currentThread = Thread.currentThread();
        l.b(currentThread, "");
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str = strArr[i2];
                l.b(stackTraceElement, "");
                String className = stackTraceElement.getClassName();
                l.b(className, "");
                if (p.b(className, str, false)) {
                    if (!p.a((CharSequence) sb)) {
                        sb.append("\n");
                    }
                    sb.append(stackTraceElement.getClassName()).append("(").append(stackTraceElement.getMethodName()).append(":").append(stackTraceElement.getLineNumber()).append(")");
                } else {
                    i2++;
                }
            }
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }
}
