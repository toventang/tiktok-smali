package com.appsflyer.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class aa {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static aa f163 = new aa();

    public static int com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2, Throwable th) {
        return 0;
    }

    private aa() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static aa m116() {
        return f163;
    }

    static {
        Covode.recordClassIndex(2707);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static File m119(Context context) {
        return new File(com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "AFRequestCache");
    }

    public static File com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static j m115(File file) {
        Throwable th;
        MethodCollector.i(3736);
        try {
            FileReader fileReader = new FileReader(file);
            try {
                char[] cArr = new char[((int) file.length())];
                fileReader.read(cArr);
                j jVar = new j(cArr);
                jVar.f266 = file.getName();
                try {
                    fileReader.close();
                } catch (IOException unused) {
                }
                MethodCollector.o(3736);
                return jVar;
            } catch (Exception unused2) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Exception unused3) {
                    }
                }
                MethodCollector.o(3736);
                return null;
            } catch (Throwable th2) {
                th = th2;
                try {
                    fileReader.close();
                } catch (IOException unused4) {
                }
                MethodCollector.o(3736);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            MethodCollector.o(3736);
            throw th;
        }
    }

    public static boolean com_appsflyer_internal_aa_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(5086);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(5086);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(5086);
        return delete;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static List<j> m117(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_LogLancet_i("AppsFlyer_5.4.1", new StringBuilder("Found cached request").append(file2.getName()).toString());
                    arrayList.add(m115(file2));
                }
            }
        } catch (Exception unused) {
            com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_LogLancet_i("AppsFlyer_5.4.1", "Could not cache request");
        }
        return arrayList;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m118(String str, Context context) {
        File file = new File(new File(com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "AFRequestCache"), str);
        com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_LogLancet_i("AppsFlyer_5.4.1", new StringBuilder("Deleting ").append(str).append(" from cache").toString());
        if (file.exists()) {
            try {
                com_appsflyer_internal_aa_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
            } catch (Exception e2) {
                com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_LogLancet_i("AppsFlyer_5.4.1", new StringBuilder("Could not delete ").append(str).append(" from cache").toString(), e2);
            }
        }
    }
}
