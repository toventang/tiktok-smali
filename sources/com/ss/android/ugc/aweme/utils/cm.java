package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.d;
import com.bytedance.crash.j.i;
import com.ss.android.ugc.aweme.feed.s;
import h.f.a.a;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.List;

public final class cm {

    /* renamed from: a */
    public static final cm f142777a = new cm();

    private cm() {
    }

    static {
        Covode.recordClassIndex(93394);
    }

    private static Throwable a(Exception exc) {
        StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace.length > 3) {
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[3];
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, 3);
            exc.setStackTrace(stackTraceElementArr);
        }
        return exc;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        List<String> b2 = p.b(str, new String[]{"\n"});
        if (b2.isEmpty()) {
            return "";
        }
        int i2 = 0;
        StringBuilder sb = new StringBuilder();
        for (String str2 : b2) {
            if (i2 == 3) {
                break;
            }
            sb.append(str2 + "\n");
            i2++;
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public final void a(String str, a<z> aVar) {
        l.d(str, "");
        if (aVar != null) {
            try {
                aVar.invoke();
            } catch (Exception e2) {
                a(e2, "executeMethodSafely", str, "executeMethodSafely", "");
            }
        }
    }

    public static void a(Exception exc, String str, String str2, String str3, String str4) {
        l.d(exc, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        String b2 = s.b();
        StackTraceElement stackTraceElement = new StackTraceElement(str2, str3, str4, 0);
        String a2 = a(h.a.a(exc));
        Thread currentThread = Thread.currentThread();
        l.b(currentThread, "");
        d a3 = d.a(stackTraceElement, a2, str, currentThread.getName(), "EnsureNotReachHere");
        l.b(a3, "");
        a3.c("activity", b2);
        i.a(a3);
        com.bytedance.services.apm.api.a.a(a(exc), str);
    }
}
