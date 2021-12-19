package com.bytedance.apm.l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f25168a;

    /* renamed from: b  reason: collision with root package name */
    public static String f25169b;

    /* renamed from: c  reason: collision with root package name */
    public static String f25170c;

    static {
        Covode.recordClassIndex(14669);
    }

    public static void a(String str) {
        f25169b = "https://" + str + "/monitor/collect/c/code_coverage";
    }

    public static boolean a(File file) {
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
}
