package com.ss.android.ugc.aweme.account.n;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f65165a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(40063);
    }

    public static final String a(Exception exc) {
        l.d(exc, "");
        StringBuilder append = new StringBuilder().append(exc.getMessage());
        StackTraceElement[] stackTrace = exc.getStackTrace();
        int i2 = 0;
        if (!(stackTrace == null || stackTrace.length == 0)) {
            append.append(" | ");
            int length = stackTrace.length;
            int length2 = stackTrace.length;
            int i3 = 0;
            while (i2 < length2) {
                int i4 = i3 + 1;
                append.append(stackTrace[i2]);
                if (i3 != length - 1) {
                    append.append("\n");
                }
                i2++;
                i3 = i4;
            }
        }
        String sb = append.toString();
        l.b(sb, "");
        return sb;
    }
}
