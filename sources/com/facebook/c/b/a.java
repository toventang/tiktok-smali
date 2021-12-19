package com.facebook.c.b;

import android.os.Environment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.c.a.k;
import com.facebook.c.b.d;
import com.facebook.common.c.c;
import com.facebook.common.d.i;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f46958a = a.class;

    /* renamed from: b  reason: collision with root package name */
    static final long f46959b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c  reason: collision with root package name */
    public final File f46960c;

    /* renamed from: d  reason: collision with root package name */
    public final File f46961d;

    /* renamed from: e  reason: collision with root package name */
    public final com.facebook.c.a.b f46962e;

    /* renamed from: f  reason: collision with root package name */
    public final com.facebook.common.time.a f46963f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f46964g;

    static class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public final com.facebook.b.b f46967a;

        /* renamed from: b  reason: collision with root package name */
        private final String f46968b;

        /* renamed from: c  reason: collision with root package name */
        private long f46969c;

        /* renamed from: d  reason: collision with root package name */
        private long f46970d;

        static {
            Covode.recordClassIndex(28581);
        }

        @Override // com.facebook.c.b.d.a
        public final String a() {
            return this.f46968b;
        }

        @Override // com.facebook.c.b.d.a
        public final long b() {
            if (this.f46970d < 0) {
                this.f46970d = this.f46967a.f46951a.lastModified();
            }
            return this.f46970d;
        }

        @Override // com.facebook.c.b.d.a
        public final long c() {
            if (this.f46969c < 0) {
                this.f46969c = this.f46967a.f46951a.length();
            }
            return this.f46969c;
        }

        private b(String str, File file) {
            i.a(file);
            this.f46968b = (String) i.a(str);
            this.f46967a = com.facebook.b.b.a(file);
            this.f46969c = -1;
            this.f46970d = -1;
        }

        /* synthetic */ b(String str, File file, byte b2) {
            this(str, file);
        }
    }

    @Override // com.facebook.c.b.d
    public final boolean a() {
        return this.f46964g;
    }

    @Override // com.facebook.c.b.d
    public final void c() {
        com.facebook.common.c.a.a(this.f46960c);
    }

    class e implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final File f46973a;

        /* renamed from: c  reason: collision with root package name */
        private final String f46975c;

        static {
            Covode.recordClassIndex(28584);
        }

        @Override // com.facebook.c.b.d.b
        public final boolean b() {
            if (!this.f46973a.exists() || a(this.f46973a)) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.c.b.d.b
        public final com.facebook.b.a a() {
            MethodCollector.i(2496);
            File a2 = a.this.a(this.f46975c);
            try {
                File file = this.f46973a;
                i.a(file);
                i.a(a2);
                com.facebook.common.c.c.b(a2);
                if (!file.renameTo(a2)) {
                    Throwable th = null;
                    if (a2.exists()) {
                        th = new c.b(a2.getAbsolutePath());
                    } else if (!file.getParentFile().exists()) {
                        th = new c.C1165c(file.getAbsolutePath());
                    } else if (!file.exists()) {
                        th = new FileNotFoundException(file.getAbsolutePath());
                    }
                    c.d dVar = new c.d("Unknown error renaming " + file.getAbsolutePath() + " to " + a2.getAbsolutePath(), th);
                    MethodCollector.o(2496);
                    throw dVar;
                }
                if (a2.exists()) {
                    a2.setLastModified(a.this.f46963f.a());
                }
                com.facebook.b.b a3 = com.facebook.b.b.a(a2);
                MethodCollector.o(2496);
                return a3;
            } catch (c.d e2) {
                e2.getCause();
                MethodCollector.o(2496);
                throw e2;
            }
        }

        private static boolean a(File file) {
            MethodCollector.i(2517);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(2517);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(2517);
            return delete;
        }

        @Override // com.facebook.c.b.d.b
        public final void a(k kVar) {
            MethodCollector.i(2416);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f46973a);
                try {
                    com.facebook.common.d.c cVar = new com.facebook.common.d.c(fileOutputStream);
                    kVar.a(cVar);
                    cVar.flush();
                    long j2 = cVar.f47070a;
                    fileOutputStream.close();
                    if (this.f46973a.length() == j2) {
                        MethodCollector.o(2416);
                        return;
                    }
                    d dVar = new d(j2, this.f46973a.length());
                    MethodCollector.o(2416);
                    throw dVar;
                } catch (Throwable th) {
                    fileOutputStream.close();
                    MethodCollector.o(2416);
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                MethodCollector.o(2416);
                throw e2;
            }
        }

        public e(String str, File file) {
            this.f46975c = str;
            this.f46973a = file;
        }
    }

    static {
        Covode.recordClassIndex(28579);
    }

    @Override // com.facebook.c.b.d
    public final /* synthetic */ Collection d() {
        C1164a aVar = new C1164a(this, (byte) 0);
        com.facebook.common.c.a.a(this.f46961d, aVar);
        return Collections.unmodifiableList(aVar.f46965a);
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f46971a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46972b;

        static {
            Covode.recordClassIndex(28582);
        }

        public final String toString() {
            return this.f46971a + "(" + this.f46972b + ")";
        }

        c(String str, String str2) {
            this.f46971a = str;
            this.f46972b = str2;
        }

        /* synthetic */ c(String str, String str2, byte b2) {
            this(str, str2);
        }
    }

    @Override // com.facebook.c.b.d
    public final void b() {
        com.facebook.common.c.a.a(this.f46960c, new f(this, (byte) 0));
    }

    class f implements com.facebook.common.c.b {

        /* renamed from: b  reason: collision with root package name */
        private boolean f46977b;

        static {
            Covode.recordClassIndex(28585);
        }

        private f() {
        }

        @Override // com.facebook.common.c.b
        public final void a(File file) {
            if (!this.f46977b && file.equals(a.this.f46961d)) {
                this.f46977b = true;
            }
        }

        @Override // com.facebook.common.c.b
        public final void b(File file) {
            if (this.f46977b) {
                c a2 = a.this.a(file);
                boolean z = false;
                if (a2 != null) {
                    if (a2.f46971a != ".tmp") {
                        if (a2.f46971a == ".cnt") {
                            z = true;
                        }
                        i.b(z);
                        return;
                    } else if (file.lastModified() > a.this.f46963f.a() - a.f46959b) {
                        return;
                    }
                }
            }
            d(file);
        }

        @Override // com.facebook.common.c.b
        public final void c(File file) {
            if (!a.this.f46960c.equals(file) && !this.f46977b) {
                d(file);
            }
            if (this.f46977b && file.equals(a.this.f46961d)) {
                this.f46977b = false;
            }
        }

        private static boolean d(File file) {
            MethodCollector.i(2412);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(2412);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(2412);
            return delete;
        }

        /* synthetic */ f(a aVar, byte b2) {
            this();
        }
    }

    /* renamed from: com.facebook.c.b.a$a  reason: collision with other inner class name */
    class C1164a implements com.facebook.common.c.b {

        /* renamed from: a  reason: collision with root package name */
        final List<d.a> f46965a;

        static {
            Covode.recordClassIndex(28580);
        }

        @Override // com.facebook.common.c.b
        public final void a(File file) {
        }

        @Override // com.facebook.common.c.b
        public final void c(File file) {
        }

        private C1164a() {
            this.f46965a = new ArrayList();
        }

        @Override // com.facebook.common.c.b
        public final void b(File file) {
            c a2 = a.this.a(file);
            if (a2 != null && a2.f46971a == ".cnt") {
                this.f46965a.add(new b(a2.f46972b, file, (byte) 0));
            }
        }

        /* synthetic */ C1164a(a aVar, byte b2) {
            this();
        }
    }

    private File d(String str) {
        return new File(c(str));
    }

    @Override // com.facebook.c.b.d
    public final long a(d.a aVar) {
        return c(((b) aVar).f46967a.f46951a);
    }

    @Override // com.facebook.c.b.d
    public final long b(String str) {
        return c(a(str));
    }

    private static boolean b(File file) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                return file.getCanonicalPath().contains(externalStorageDirectory.toString());
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static long c(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (d(file)) {
            return length;
        }
        return -1;
    }

    private String c(String str) {
        return this.f46961d + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    private static boolean d(File file) {
        MethodCollector.i(1262);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(1262);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1262);
        return delete;
    }

    public final c a(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            String substring = name.substring(lastIndexOf);
            String str = ".cnt";
            if (!str.equals(substring)) {
                if (".tmp".equals(substring)) {
                    str = ".tmp";
                }
            }
            String substring2 = name.substring(0, lastIndexOf);
            if (str.equals(".tmp")) {
                int lastIndexOf2 = substring2.lastIndexOf(46);
                if (lastIndexOf2 > 0) {
                    substring2 = substring2.substring(0, lastIndexOf2);
                }
            }
            c cVar = new c(str, substring2);
            if (d(cVar.f46972b).equals(file.getParentFile())) {
                return cVar;
            }
            return null;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final File a(String str) {
        c cVar = new c(".cnt", str, (byte) 0);
        return new File(c(cVar.f46972b) + File.separator + cVar.f46972b + cVar.f46971a);
    }

    @Override // com.facebook.c.b.d
    public final boolean c(String str, Object obj) {
        return a(str).exists();
    }

    static class d extends IOException {
        public final long actual;
        public final long expected;

        static {
            Covode.recordClassIndex(28583);
        }

        public d(long j2, long j3) {
            super("File was not written completely. Expected: " + j2 + ", found: " + j3);
            this.expected = j2;
            this.actual = j3;
        }
    }

    @Override // com.facebook.c.b.d
    public final d.b a(String str, Object obj) {
        c cVar = new c(".tmp", str, (byte) 0);
        File d2 = d(cVar.f46972b);
        if (!d2.exists()) {
            try {
                com.facebook.common.c.c.a(d2);
            } catch (c.a e2) {
                throw e2;
            }
        }
        try {
            return new e(str, File.createTempFile(cVar.f46972b + ".", ".tmp", d2));
        } catch (IOException e3) {
            throw e3;
        }
    }

    @Override // com.facebook.c.b.d
    public final com.facebook.b.a b(String str, Object obj) {
        File a2 = a(str);
        if (!a2.exists()) {
            return null;
        }
        a2.setLastModified(this.f46963f.a());
        return com.facebook.b.b.a(a2);
    }

    public a(File file, int i2, com.facebook.c.a.b bVar) {
        i.a(file);
        this.f46960c = file;
        this.f46964g = b(file);
        File file2 = new File(file, com.a.a(null, "%s.ols%d.%d", new Object[]{"v2", 100, Integer.valueOf(i2)}));
        this.f46961d = file2;
        this.f46962e = bVar;
        if (file.exists()) {
            if (!file2.exists()) {
                com.facebook.common.c.a.b(file);
            }
            this.f46963f = com.facebook.common.time.c.f47146a;
        }
        try {
            com.facebook.common.c.c.a(file2);
        } catch (c.a unused) {
        }
        this.f46963f = com.facebook.common.time.c.f47146a;
    }
}
