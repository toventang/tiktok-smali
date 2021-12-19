package com.squareup.a.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import k.aa;
import k.q;
import k.y;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f57724a = new a() {
        /* class com.squareup.a.a.c.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35965);
        }

        @Override // com.squareup.a.a.c.a
        public final aa a(File file) {
            return q.c(file);
        }

        @Override // com.squareup.a.a.c.a
        public final boolean e(File file) {
            return file.exists();
        }

        @Override // com.squareup.a.a.c.a
        public final long f(File file) {
            return file.length();
        }

        @Override // com.squareup.a.a.c.a
        public final y b(File file) {
            try {
                return q.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return q.a(file);
            }
        }

        @Override // com.squareup.a.a.c.a
        public final y c(File file) {
            try {
                return q.b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return q.b(file);
            }
        }

        @Override // com.squareup.a.a.c.a
        public final void d(File file) {
            if (!h(file) && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }

        @Override // com.squareup.a.a.c.a
        public final void g(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        g(file2);
                    }
                    if (!h(file2)) {
                        throw new IOException("failed to delete ".concat(String.valueOf(file2)));
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }

        private static boolean h(File file) {
            MethodCollector.i(9319);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(9319);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(9319);
            return delete;
        }

        @Override // com.squareup.a.a.c.a
        public final void a(File file, File file2) {
            MethodCollector.i(9501);
            d(file2);
            if (file.renameTo(file2)) {
                MethodCollector.o(9501);
                return;
            }
            IOException iOException = new IOException("failed to rename " + file + " to " + file2);
            MethodCollector.o(9501);
            throw iOException;
        }
    };

    aa a(File file);

    void a(File file, File file2);

    y b(File file);

    y c(File file);

    void d(File file);

    boolean e(File file);

    long f(File file);

    void g(File file);

    static {
        Covode.recordClassIndex(35964);
    }
}
