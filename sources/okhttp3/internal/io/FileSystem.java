package okhttp3.internal.io;

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

public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() {
        /* class okhttp3.internal.io.FileSystem.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106300);
        }

        @Override // okhttp3.internal.io.FileSystem
        public final boolean exists(File file) {
            return file.exists();
        }

        @Override // okhttp3.internal.io.FileSystem
        public final long size(File file) {
            return file.length();
        }

        @Override // okhttp3.internal.io.FileSystem
        public final aa source(File file) {
            return q.c(file);
        }

        @Override // okhttp3.internal.io.FileSystem
        public final y appendingSink(File file) {
            try {
                return q.b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return q.b(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public final void delete(File file) {
            if (!okhttp3_internal_io_FileSystem$1_com_ss_android_ugc_aweme_storage_FileLancet_delete(file) && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public final y sink(File file) {
            try {
                return q.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return q.a(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public final void deleteContents(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!okhttp3_internal_io_FileSystem$1_com_ss_android_ugc_aweme_storage_FileLancet_delete(file2)) {
                        throw new IOException("failed to delete ".concat(String.valueOf(file2)));
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }

        public static boolean okhttp3_internal_io_FileSystem$1_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
            MethodCollector.i(3692);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(3692);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(3692);
            return delete;
        }

        @Override // okhttp3.internal.io.FileSystem
        public final void rename(File file, File file2) {
            MethodCollector.i(4143);
            delete(file2);
            if (file.renameTo(file2)) {
                MethodCollector.o(4143);
                return;
            }
            IOException iOException = new IOException("failed to rename " + file + " to " + file2);
            MethodCollector.o(4143);
            throw iOException;
        }
    };

    y appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    y sink(File file);

    long size(File file);

    aa source(File file);

    static {
        Covode.recordClassIndex(106299);
    }
}
