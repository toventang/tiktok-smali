package com.facebook.common.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class c {
    static {
        Covode.recordClassIndex(28624);
    }

    public static class a extends IOException {
        static {
            Covode.recordClassIndex(28625);
        }

        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static class b extends IOException {
        static {
            Covode.recordClassIndex(28626);
        }

        public b(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.common.c.c$c  reason: collision with other inner class name */
    public static class C1165c extends FileNotFoundException {
        static {
            Covode.recordClassIndex(28627);
        }

        public C1165c(String str) {
            super(str);
        }
    }

    public static class d extends IOException {
        static {
            Covode.recordClassIndex(28628);
        }

        public d(String str) {
            super(str);
        }

        public d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static void a(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!b(file)) {
                    throw new a(file.getAbsolutePath(), new b(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new a(file.getAbsolutePath());
        }
    }

    public static boolean b(File file) {
        MethodCollector.i(5234);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(5234);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(5234);
        return delete;
    }
}
