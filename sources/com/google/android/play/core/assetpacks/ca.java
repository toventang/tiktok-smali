package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.play.core.b.b;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

/* access modifiers changed from: package-private */
public final class ca {

    /* renamed from: a  reason: collision with root package name */
    static final b f52948a = new b("MergeSliceTaskHandler");

    /* renamed from: b  reason: collision with root package name */
    final ac f52949b;

    static {
        Covode.recordClassIndex(32720);
    }

    ca(ac acVar) {
        this.f52949b = acVar;
    }

    static void a(File file, File file2) {
        MethodCollector.i(8053);
        if (file.isDirectory()) {
            file2.mkdirs();
            File[] listFiles = file.listFiles();
            for (File file3 : listFiles) {
                a(file3, new File(file2, file3.getName()));
            }
            if (!a(file)) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                au auVar = new au(sb.toString());
                MethodCollector.o(8053);
                throw auVar;
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            au auVar2 = new au(sb2.toString());
            MethodCollector.o(8053);
            throw auVar2;
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            au auVar3 = new au(sb3.toString());
            MethodCollector.o(8053);
            throw auVar3;
        }
        MethodCollector.o(8053);
    }

    private static boolean a(File file) {
        MethodCollector.i(8057);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(8057);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(8057);
        return delete;
    }
}
