package com.ss.android.e;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f59474a = "joke_essay";

    /* renamed from: b  reason: collision with root package name */
    protected static String f59475b;

    /* renamed from: c  reason: collision with root package name */
    protected static String f59476c;

    /* renamed from: d  reason: collision with root package name */
    protected static String f59477d;

    /* renamed from: e  reason: collision with root package name */
    protected static String f59478e;

    /* renamed from: f  reason: collision with root package name */
    protected static String f59479f;

    /* renamed from: g  reason: collision with root package name */
    protected static boolean f59480g;

    /* renamed from: h  reason: collision with root package name */
    protected static String f59481h;

    /* renamed from: l  reason: collision with root package name */
    protected static volatile boolean f59482l;

    /* renamed from: i  reason: collision with root package name */
    protected final int f59483i;

    /* renamed from: j  reason: collision with root package name */
    protected final int f59484j;

    /* renamed from: k  reason: collision with root package name */
    protected final Context f59485k;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.e.a$a  reason: collision with other inner class name */
    public static class C1296a {

        /* renamed from: a  reason: collision with root package name */
        public long f59489a;

        /* renamed from: b  reason: collision with root package name */
        public long f59490b;

        /* renamed from: c  reason: collision with root package name */
        public String f59491c;

        static {
            Covode.recordClassIndex(36729);
        }

        private C1296a() {
        }

        /* synthetic */ C1296a(byte b2) {
            this();
        }
    }

    public static String a() {
        return f59478e;
    }

    /* access modifiers changed from: package-private */
    public static class b implements com.facebook.common.c.b {

        /* renamed from: a  reason: collision with root package name */
        final List<C1296a> f59492a;

        static {
            Covode.recordClassIndex(36730);
        }

        @Override // com.facebook.common.c.b
        public final void a(File file) {
        }

        @Override // com.facebook.common.c.b
        public final void c(File file) {
        }

        private b() {
            this.f59492a = new ArrayList();
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.facebook.common.c.b
        public final void b(File file) {
            C1296a aVar = new C1296a((byte) 0);
            aVar.f59489a = file.lastModified();
            aVar.f59490b = file.length();
            aVar.f59491c = file.getAbsolutePath();
            this.f59492a.add(aVar);
        }
    }

    static {
        Covode.recordClassIndex(36725);
    }

    public static long d() {
        try {
            return 0 + e.a(new File(f59476c), false);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static boolean e() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception e2) {
            if (!Logger.debug()) {
                return false;
            }
            e2.printStackTrace();
            return false;
        }
    }

    public final void c() {
        try {
            e.a(f59478e);
        } catch (Exception unused) {
        }
        if (d() > 20971520) {
            long a2 = a(20971520, f59477d);
            if (a2 < 20971520) {
                a(20971520 - a2, f59479f);
            }
        }
    }

    public final void b() {
        if (!f59482l && d() >= 62914560) {
            g.f59497a.f59499b = System.currentTimeMillis();
            f59482l = true;
            new e() {
                /* class com.ss.android.e.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(36727);
                }

                @Override // com.bytedance.common.utility.b.e
                public final void run() {
                    Process.setThreadPriority(10);
                    System.currentTimeMillis();
                    try {
                        System.currentTimeMillis();
                        a.this.c();
                    } catch (Exception unused) {
                    }
                    System.currentTimeMillis();
                    a.f59482l = false;
                    try {
                        g.f59497a.a(a.this);
                    } catch (Exception unused2) {
                    }
                }
            }.a();
        }
        if (!f59482l) {
            long j2 = g.f59497a.f59499b;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j2 < 86400000) {
                try {
                    g.f59497a.a(this);
                } catch (Exception unused) {
                }
            } else {
                g.f59497a.f59499b = currentTimeMillis;
                f59482l = true;
                new e() {
                    /* class com.ss.android.e.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(36726);
                    }

                    @Override // com.bytedance.common.utility.b.e
                    public final void run() {
                        MethodCollector.i(3783);
                        Process.setThreadPriority(10);
                        System.currentTimeMillis();
                        try {
                            Thread.sleep(10000);
                            System.currentTimeMillis();
                            a.a(a.this.f59483i, a.this.f59484j);
                        } catch (Exception unused) {
                        }
                        System.currentTimeMillis();
                        a.f59482l = false;
                        try {
                            g.f59497a.a(a.this);
                            MethodCollector.o(3783);
                        } catch (Exception unused2) {
                            MethodCollector.o(3783);
                        }
                    }
                }.a();
            }
        }
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    private static File b(Context context) {
        if (d.f107193a != null && d.f107197e) {
            return d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r0 != null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(android.content.Context r4) {
        /*
        // Method dump skipped, instructions count: 279
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.e.a.a(android.content.Context):void");
    }

    private static boolean a(File file) {
        MethodCollector.i(4098);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(4098);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(4098);
        return delete;
    }

    private a(Context context, byte b2) {
        this.f59483i = 5;
        this.f59484j = 1;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f59485k = applicationContext;
        if (!f59480g) {
            a(context);
        }
    }

    protected static void a(int i2, int i3) {
        try {
            e.a(f59478e);
        } catch (Exception unused) {
        }
        a(i2, new File(f59477d));
        if (!m.a(f59479f)) {
            a(i3, new File(f59479f));
        }
    }

    private long a(long j2, String str) {
        b bVar = new b((byte) 0);
        com.facebook.common.c.a.a(new File(str), bVar);
        ArrayList<C1296a> arrayList = new ArrayList(Collections.unmodifiableList(bVar.f59492a));
        Collections.sort(arrayList, new Comparator<C1296a>() {
            /* class com.ss.android.e.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(36728);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(C1296a aVar, C1296a aVar2) {
                C1296a aVar3 = aVar;
                C1296a aVar4 = aVar2;
                if (aVar3.f59489a == aVar4.f59489a) {
                    return 0;
                }
                if (aVar3.f59489a > aVar4.f59489a) {
                    return -1;
                }
                return 1;
            }
        });
        long j3 = 0;
        for (C1296a aVar : arrayList) {
            j3 += aVar.f59490b;
            if (j3 > j2) {
                File file = new File(aVar.f59491c);
                file.getName();
                try {
                    a(file);
                } catch (Exception unused) {
                }
            }
        }
        return j3;
    }

    private static void a(int i2, File file) {
        File[] listFiles;
        File[] listFiles2;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.exists() && file2.isDirectory() && (listFiles2 = file2.listFiles()) != null && listFiles2.length != 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = ((long) (i2 * 24 * 3600)) * 1000;
                    for (File file3 : listFiles2) {
                        if (file3.isFile()) {
                            file3.getName();
                            try {
                                if (currentTimeMillis - file3.lastModified() > j2) {
                                    a(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
    }
}
