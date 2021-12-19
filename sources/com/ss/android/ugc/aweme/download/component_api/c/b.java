package com.ss.android.ugc.aweme.download.component_api.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import h.f.b.l;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f83099a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(51802);
    }

    public final void a(String str) {
        l.d(str, "");
        try {
            b(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(3750);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(3750);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(3750);
        return delete;
    }

    private void b(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    l.b(file2, "");
                    if (file2.isDirectory()) {
                        b(file2.getPath());
                    } else {
                        a(file2);
                    }
                }
                a(file);
            }
        }
    }
}
