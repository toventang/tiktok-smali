package com.bytedance.helios.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f30637a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(17794);
    }

    public static String a(Throwable th) {
        String str = "";
        l.c(th, str);
        String message = th.getMessage();
        if (message != null) {
            str = message;
        }
        return a(th, str);
    }

    public static String b(Throwable th) {
        l.c(th, "");
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName()).append(": ").append(th.getMessage()).append('\n');
        StackTraceElement[] stackTrace = th.getStackTrace();
        l.a((Object) stackTrace, "");
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("at ").append(stackTraceElement.toString()).append('\n');
        }
        String sb2 = sb.toString();
        l.a((Object) sb2, "");
        return sb2;
    }

    public static String a(Throwable th, String str) {
        String fileName;
        l.c(th, "");
        l.c(str, "");
        ArrayList<StackTraceElement> arrayList = new ArrayList();
        StackTraceElement[] stackTrace = th.getStackTrace();
        l.a((Object) stackTrace, "");
        for (StackTraceElement stackTraceElement : stackTrace) {
            l.a((Object) stackTraceElement, "");
            String className = stackTraceElement.getClassName();
            if (!(className == null || className.length() == 0 || (fileName = stackTraceElement.getFileName()) == null || fileName.length() == 0)) {
                String className2 = stackTraceElement.getClassName();
                l.a((Object) className2, "");
                if (!p.b(className2, "com.bytedance.helios.sdk.ActionInvokeEntrance", false)) {
                    arrayList.add(stackTraceElement);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName()).append(": ").append(str).append('\n');
        for (StackTraceElement stackTraceElement2 : arrayList) {
            sb.append("at ").append(stackTraceElement2.toString()).append('\n');
        }
        String sb2 = sb.toString();
        l.a((Object) sb2, "");
        return sb2;
    }
}
