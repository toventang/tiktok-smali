package com.ss.android.ugc.aweme.qrcode.e;

import android.content.Context;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.video.e;
import java.io.File;

public final class d {
    static {
        Covode.recordClassIndex(77796);
    }

    static String a() {
        File a2 = a(com.bytedance.ies.ugc.appcontext.d.a());
        if (a2 == null) {
            return null;
        }
        e.a(a2);
        return a2.getAbsolutePath();
    }

    static final /* synthetic */ Object a(File file) {
        try {
            b(file);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean c(int i2) {
        if (a(i2) != null) {
            return true;
        }
        return false;
    }

    public static File a(int i2) {
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        File file = new File(a2, b(i2));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public static void d(int i2) {
        File a2;
        if (c(i2) && (a2 = a(i2)) != null && a2.exists()) {
            i.b(new f(a2), i.f4824a);
        }
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    static String b(int i2) {
        String str;
        StringBuilder append = new StringBuilder().append(b.g().getCurUserId());
        if (i2 == 1) {
            str = "_qrcode_image_cache_for_invite";
        } else {
            str = "_qrcode_image_cache";
        }
        return append.append(str).toString();
    }

    private static boolean b(File file) {
        MethodCollector.i(587);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(587);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(587);
        return delete;
    }
}
