package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bf;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class ac {

    /* renamed from: a  reason: collision with root package name */
    static final b f52768a = new b("AssetPackStorage");

    /* renamed from: c  reason: collision with root package name */
    private static final long f52769c = TimeUnit.DAYS.toMillis(14);

    /* renamed from: d  reason: collision with root package name */
    private static final long f52770d = TimeUnit.DAYS.toMillis(28);

    /* renamed from: b  reason: collision with root package name */
    final cg f52771b;

    /* renamed from: e  reason: collision with root package name */
    private final Context f52772e;

    static {
        Covode.recordClassIndex(32668);
    }

    ac(Context context, cg cgVar) {
        this.f52772e = context;
        this.f52771b = cgVar;
    }

    private final File a(String str, int i2) {
        return new File(a(str), String.valueOf(i2));
    }

    static void a(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long b2 = b(file);
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals(String.valueOf(b2)) && !file2.getName().equals("stale.tmp")) {
                    c(file2);
                }
            }
        }
    }

    static long b(File file) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException unused) {
            f52768a.c("Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    static boolean c(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                z &= c(file2);
            }
        } else {
            z = true;
        }
        return d(file) && true == z;
    }

    private final File d() {
        return new File(c(), "_tmp");
    }

    private final File h(String str, int i2, long j2) {
        return new File(new File(new File(d(), str), String.valueOf(i2)), String.valueOf(j2));
    }

    /* access modifiers changed from: package-private */
    public final File a(String str) {
        return new File(c(), str);
    }

    /* access modifiers changed from: package-private */
    public final File a(String str, int i2, long j2) {
        return new File(a(str, i2), String.valueOf(j2));
    }

    /* access modifiers changed from: package-private */
    public final File a(String str, int i2, long j2, String str2) {
        return new File(new File(new File(h(str, i2, j2), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    public final int b(String str) {
        return (int) b(a(str));
    }

    /* access modifiers changed from: package-private */
    public final File b(String str, int i2, long j2) {
        return new File(a(str, i2, j2), "_metadata");
    }

    /* access modifiers changed from: package-private */
    public final File b(String str, int i2, long j2, String str2) {
        return new File(new File(new File(h(str, i2, j2), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    public final List<File> b() {
        ArrayList arrayList = new ArrayList();
        try {
            if (c().exists()) {
                if (c().listFiles() != null) {
                    File[] listFiles = c().listFiles();
                    for (File file : listFiles) {
                        if (!file.getCanonicalPath().equals(d().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e2) {
            f52768a.b("Could not process directory while scanning installed packs. %s", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final long c(String str) {
        return b(a(str, b(str)));
    }

    /* access modifiers changed from: package-private */
    public final File c() {
        return new File(a(this.f52772e), "assetpacks");
    }

    /* access modifiers changed from: package-private */
    public final File c(String str, int i2, long j2) {
        return new File(h(str, i2, j2), "_packs");
    }

    /* access modifiers changed from: package-private */
    public final File c(String str, int i2, long j2, String str2) {
        return new File(e(str, i2, j2, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    public final File d(String str, int i2, long j2) {
        return new File(c(str, i2, j2), "merge.tmp");
    }

    /* access modifiers changed from: package-private */
    public final File d(String str, int i2, long j2, String str2) {
        return new File(e(str, i2, j2, str2), "checkpoint_ext.dat");
    }

    /* access modifiers changed from: package-private */
    public final int e(String str, int i2, long j2) {
        MethodCollector.i(9600);
        File d2 = d(str, i2, j2);
        if (!d2.exists()) {
            MethodCollector.o(9600);
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(d2);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("numberOfMerges"));
                    MethodCollector.o(9600);
                    return parseInt;
                } catch (NumberFormatException e2) {
                    au auVar = new au("Merge checkpoint file corrupt.", e2);
                    MethodCollector.o(9600);
                    throw auVar;
                }
            } else {
                au auVar2 = new au("Merge checkpoint file corrupt.");
                MethodCollector.o(9600);
                throw auVar2;
            }
        } catch (Throwable th) {
            bf.a(th, th);
        }
        MethodCollector.o(9600);
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final File e(String str, int i2, long j2, String str2) {
        return new File(f(str, i2, j2), str2);
    }

    /* access modifiers changed from: package-private */
    public final File f(String str, int i2, long j2) {
        return new File(new File(h(str, i2, j2), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    public final void g(String str, int i2, long j2) {
        if (h(str, i2, j2).exists()) {
            c(h(str, i2, j2));
        }
    }

    private static boolean d(File file) {
        MethodCollector.i(6116);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6116);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6116);
        return delete;
    }

    private static File a(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0 A[Catch:{ IOException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1 A[Catch:{ IOException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x000f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.b> a() {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.ac.a():java.util.Map");
    }
}
