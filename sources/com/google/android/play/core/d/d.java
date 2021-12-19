package com.google.android.play.core.d;

import android.content.Context;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.play.core.b.r;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final long f53194a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f53195b;

    /* renamed from: c  reason: collision with root package name */
    private File f53196c;

    static {
        Covode.recordClassIndex(32878);
    }

    public d(Context context) {
        this.f53195b = context;
        this.f53194a = (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static File a(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    static void b(File file) {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    private static void c(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                c(file2);
            }
        }
        if (file.exists() && !d(file)) {
            throw new IOException(a.a("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    public static String d(String str) {
        return String.valueOf(str).concat(".apk");
    }

    private final File f(String str) {
        File a2 = a(e(), str);
        b(a2);
        return a2;
    }

    private final File g() {
        if (this.f53196c == null) {
            Context context = this.f53195b;
            if (context != null) {
                this.f53196c = a(context);
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f53196c, "splitcompat");
        b(file);
        return file;
    }

    public final File a(String str) {
        return a(c(), d(str));
    }

    public final File a(String str, String str2) {
        return a(f(str), str2);
    }

    public final void a() {
        File g2 = g();
        String[] list = g2.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f53194a))) {
                    File file = new File(g2, str);
                    String.valueOf(String.valueOf(file)).length();
                    c(file);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(File file) {
        r.a(file.getParentFile().getParentFile().equals(e()), "File to remove is not a native library");
        c(file);
    }

    public final File b() {
        File file = new File(d(), "unverified-splits");
        b(file);
        return file;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        c(f(str));
    }

    public final File c() {
        File file = new File(d(), "verified-splits");
        b(file);
        return file;
    }

    /* access modifiers changed from: package-private */
    public final Set<File> c(String str) {
        HashSet hashSet = new HashSet();
        File[] listFiles = f(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    public final File d() {
        File file = new File(g(), Long.toString(this.f53194a));
        b(file);
        return file;
    }

    /* access modifiers changed from: package-private */
    public final File e() {
        File file = new File(d(), "native-libraries");
        b(file);
        return file;
    }

    /* access modifiers changed from: package-private */
    public final void e(String str) {
        c(a(str));
    }

    /* access modifiers changed from: package-private */
    public final Set<r> f() {
        File c2 = c();
        HashSet hashSet = new HashSet();
        File[] listFiles = c2.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new r(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    private static boolean d(File file) {
        MethodCollector.i(8478);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(8478);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(8478);
        return delete;
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }
}
