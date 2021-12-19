package com.bytedance.apm.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile f f24347a;

    static {
        Covode.recordClassIndex(14299);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (r4.exists() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x006a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.util.List<java.lang.String> r8) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.a.a.a(java.util.List):java.lang.String");
    }

    private static boolean a(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ac A[SYNTHETIC, Splitter:B:60:0x01ac] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r12, long r13, long r15, java.lang.String r17, final com.bytedance.apm.a.d r18) {
        /*
        // Method dump skipped, instructions count: 437
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.a.a.a(java.lang.String, long, long, java.lang.String, com.bytedance.apm.a.d):void");
    }
}
