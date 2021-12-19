package com.bytedance.b.g;

import android.os.Process;
import com.a;
import com.bytedance.covode.number.Covode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class d {
    static {
        Covode.recordClassIndex(15256);
    }

    static long a() {
        try {
            String[] split = a(a.a("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())})).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("VmSize")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return Long.parseLong(matcher.group());
                    }
                }
            }
            if (split.length > 12) {
                Matcher matcher2 = Pattern.compile("\\d+").matcher(split[12]);
                if (matcher2.find()) {
                    return Long.parseLong(matcher2.group());
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r2) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0015 }
            r1.<init>(r0)     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = a(r1)     // Catch:{ all -> 0x0013 }
            r1.close()
            return r0
        L_0x0013:
            r0 = move-exception
            goto L_0x0017
        L_0x0015:
            r0 = move-exception
            r1 = r2
        L_0x0017:
            if (r1 == 0) goto L_0x001c
            r1.close()
        L_0x001c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.g.d.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.io.InputStream r4) {
        /*
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002b }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x002b }
            r0.<init>(r4)     // Catch:{ all -> 0x002b }
            r2.<init>(r0)     // Catch:{ all -> 0x002b }
        L_0x0010:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = r3.append(r0)     // Catch:{ all -> 0x0028 }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x0020:
            r2.close()
            java.lang.String r0 = r3.toString()
            return r0
        L_0x0028:
            r0 = move-exception
            r1 = r2
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.g.d.a(java.io.InputStream):java.lang.String");
    }
}
