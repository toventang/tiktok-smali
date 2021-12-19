package com.bytedance.crash.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f27588a = new ArrayList();

    static {
        Covode.recordClassIndex(16195);
    }

    public static String a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String a2 = a(applicationInfo.sourceDir, str, file);
        if (a2 == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 21) {
            return a2;
        }
        for (String str2 : applicationInfo.splitSourceDirs) {
            a2 = a(str2, str, file);
            if (a2 == null) {
                return null;
            }
        }
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.Closeable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r12, java.lang.String r13, java.io.File r14) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.f.b.a(java.lang.String, java.lang.String, java.io.File):java.lang.String");
    }
}
