package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.play.core.b.bg;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class ce {

    /* renamed from: a  reason: collision with root package name */
    final ac f52954a;

    /* renamed from: b  reason: collision with root package name */
    final bg<dj> f52955b;

    /* renamed from: c  reason: collision with root package name */
    final bm f52956c;

    /* renamed from: d  reason: collision with root package name */
    final bg<Executor> f52957d;

    /* renamed from: e  reason: collision with root package name */
    final ay f52958e;

    static {
        Covode.recordClassIndex(32724);
    }

    ce(ac acVar, bg<dj> bgVar, bm bmVar, bg<Executor> bgVar2, ay ayVar) {
        this.f52954a = acVar;
        this.f52955b = bgVar;
        this.f52956c = bmVar;
        this.f52957d = bgVar2;
        this.f52958e = ayVar;
    }

    static boolean a(File file) {
        MethodCollector.i(6588);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6588);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6588);
        return delete;
    }
}
