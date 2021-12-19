package com.ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.port.in.g;
import f.a.t;
import h.f.b.l;
import java.io.File;
import java.util.concurrent.Callable;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f69677a = g.a().g().c().a("canvas");

    /* renamed from: b  reason: collision with root package name */
    public final c f69678b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f69679c;

    static {
        Covode.recordClassIndex(42970);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f69680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f69681b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f69682c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f69683d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f69684e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f69685f;

        static {
            Covode.recordClassIndex(42971);
        }

        a(f fVar, String str, String str2, boolean z, int i2, int i3) {
            this.f69680a = fVar;
            this.f69681b = str;
            this.f69682c = str2;
            this.f69683d = z;
            this.f69684e = i2;
            this.f69685f = i3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d2, code lost:
            if (r5 == false) goto L_0x00d4;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 234
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.canvas.f.a.call():java.lang.Object");
        }

        private static boolean a(File file) {
            MethodCollector.i(3413);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(3413);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(3413);
            return delete;
        }
    }

    public f(c cVar, boolean z) {
        l.d(cVar, "");
        this.f69678b = cVar;
        this.f69679c = z;
    }

    public final t<y> a(String str, int i2, int i3, boolean z, String str2) {
        l.d(str, "");
        l.d(str2, "");
        t<y> a2 = t.c(new a(this, str2, str, z, i2, i3)).a(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(a2, "");
        return a2;
    }
}
