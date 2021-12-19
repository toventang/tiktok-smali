package com.ss.android.ugc.aweme.tools.draft.b;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.tools.draft.h.b;
import h.f.b.l;
import h.m.p;
import java.io.File;

public final class a implements DatabaseErrorHandler {
    static {
        Covode.recordClassIndex(91163);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r1.hasNext() != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r0 = r1.next().second;
        h.f.b.l.b(r0, "");
        a((java.lang.String) r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r0 = r6.getPath();
        h.f.b.l.b(r0, "");
        a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(334);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e A[ExcHandler: all (r2v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v13 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v13 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0036, B:7:0x003a, B:8:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r6) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.b.a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }

    private static void a(String str, SQLiteDatabase sQLiteDatabase) {
        int i2;
        boolean z;
        MethodCollector.i(339);
        if (!p.a(str, ":memory:", true)) {
            int length = str.length() - 1;
            int i3 = 0;
            boolean z2 = false;
            while (i3 <= length) {
                if (!z2) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (l.a(str.charAt(i2), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z) {
                        break;
                    }
                    length--;
                } else if (!z) {
                    z2 = true;
                } else {
                    i3++;
                }
            }
            if (str.subSequence(i3, length + 1).toString().length() != 0) {
                g.a().c().a().b(sQLiteDatabase);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                    MethodCollector.o(339);
                    return;
                } catch (Exception e2) {
                    b.a("delete failed: " + e2.getMessage(), false);
                    MethodCollector.o(339);
                    return;
                }
            }
        }
        MethodCollector.o(339);
    }
}
