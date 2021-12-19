package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;

public final class ae {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String f169;

    static {
        Covode.recordClassIndex(2712);
    }

    ae() {
    }

    public static File com_appsflyer_internal_ae_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static boolean com_appsflyer_internal_ae_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(3335);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(3335);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(3335);
        return delete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030 A[SYNTHETIC, Splitter:B:19:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048 A[SYNTHETIC, Splitter:B:31:0x0048] */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m126(java.io.File r6) {
        /*
            java.lang.String r5 = "Exception while trying to close the InstallationFile"
            r4 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0027 }
            java.lang.String r0 = "r"
            r3.<init>(r6, r0)     // Catch:{ IOException -> 0x0027 }
            long r1 = r3.length()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            int r0 = (int) r1     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            byte[] r4 = new byte[r0]     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r3.readFully(r4)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r3.close()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r3.close()     // Catch:{ IOException -> 0x001b }
            goto L_0x0039
        L_0x001b:
            r0 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r5, r0)
            goto L_0x0039
        L_0x0020:
            r1 = move-exception
            r4 = r3
            goto L_0x0046
        L_0x0023:
            r1 = move-exception
            r2 = r4
            r4 = r3
            goto L_0x0029
        L_0x0027:
            r1 = move-exception
            r2 = r4
        L_0x0029:
            java.lang.String r0 = "Exception while reading InstallationFile: "
            com.appsflyer.AFLogger.afErrorLog(r0, r1)     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0038
            r4.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r5, r0)
        L_0x0038:
            r4 = r2
        L_0x0039:
            java.lang.String r1 = new java.lang.String
            if (r4 == 0) goto L_0x0041
        L_0x003d:
            r1.<init>(r4)
            return r1
        L_0x0041:
            r0 = 0
            byte[] r4 = new byte[r0]
            goto L_0x003d
        L_0x0045:
            r1 = move-exception
        L_0x0046:
            if (r4 == 0) goto L_0x0050
            r4.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r0 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r5, r0)
        L_0x0050:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ae.m126(java.io.File):java.lang.String");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static synchronized String m127(WeakReference<Context> weakReference) {
        synchronized (ae.class) {
            MethodCollector.i(216);
            if (weakReference.get() == null) {
                String str = f169;
                MethodCollector.o(216);
                return str;
            }
            if (f169 == null) {
                String str2 = null;
                if (weakReference.get() != null) {
                    str2 = AppsFlyerLibCore.getSharedPreferences(weakReference.get()).getString("AF_INSTALLATION", null);
                }
                if (str2 != null) {
                    f169 = str2;
                } else {
                    try {
                        File file = new File(com_appsflyer_internal_ae_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(weakReference.get()), "AF_INSTALLATION");
                        if (!file.exists()) {
                            f169 = new StringBuilder().append(System.currentTimeMillis()).append("-").append(Math.abs(new SecureRandom().nextLong())).toString();
                        } else {
                            f169 = m126(file);
                            com_appsflyer_internal_ae_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                        }
                        String str3 = f169;
                        SharedPreferences.Editor edit = AppsFlyerLibCore.getSharedPreferences(weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", str3);
                        edit.apply();
                    } catch (Exception e2) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e2);
                    }
                }
                if (f169 != null) {
                    AppsFlyerProperties.getInstance().set("uid", f169);
                }
            }
            String str4 = f169;
            MethodCollector.o(216);
            return str4;
        }
    }
}
