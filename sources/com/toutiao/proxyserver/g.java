package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import java.io.File;

public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    final File f154855a;

    static {
        Covode.recordClassIndex(103137);
    }

    private File f(String str) {
        return new File(this.f154855a, str);
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.b
    public final File a(String str) {
        return f(str);
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.b
    public final File e(String str) {
        return f(str);
    }

    public static boolean a(File file) {
        MethodCollector.i(12641);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(12641);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12641);
        return delete;
    }
}
