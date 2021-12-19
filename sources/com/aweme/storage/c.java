package com.aweme.storage;

import android.content.Context;
import android.os.Build;
import b.i;
import com.aweme.storage.a.b;
import com.aweme.storage.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f5954a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f5955b;

    /* renamed from: c  reason: collision with root package name */
    static boolean f5956c;

    /* renamed from: d  reason: collision with root package name */
    public static a f5957d;

    /* renamed from: e  reason: collision with root package name */
    public static g f5958e;

    /* renamed from: f  reason: collision with root package name */
    public static List<i> f5959f;

    /* renamed from: g  reason: collision with root package name */
    public static f f5960g;

    /* renamed from: h  reason: collision with root package name */
    public static h f5961h;

    /* renamed from: i  reason: collision with root package name */
    private static long f5962i;

    static {
        Covode.recordClassIndex(2801);
    }

    private static void a() {
        List<i> list = f5959f;
        if (!(list == null || list.isEmpty())) {
            for (i iVar : f5959f) {
                if (iVar != null) {
                    iVar.a();
                }
            }
        }
    }

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    static boolean b(Context context) {
        h hVar = f5961h;
        if (hVar != null && hVar.f5984g && e.c(context)) {
            return true;
        }
        return false;
    }

    static void d(Context context) {
        if (context != null) {
            final Context a2 = a(context);
            i.b(new Callable<Object>() {
                /* class com.aweme.storage.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(2803);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context = a2;
                    if (context == null) {
                        return null;
                    }
                    d.a(context, "clean_storage_pref", 0).edit().putLong("key_clean_date", System.currentTimeMillis()).commit();
                    c.f5954a = false;
                    return null;
                }
            }, g.a());
        }
    }

    private static File g(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    private static File h(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107193a != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    static void c(Context context) {
        if (b.f5939a) {
            for (com.bytedance.u.a aVar : com.bytedance.u.d.b()) {
                aVar.d();
            }
        }
        g gVar = f5958e;
        if (gVar != null) {
            gVar.a(b(context));
        }
        f(context);
        g gVar2 = f5958e;
        if (gVar2 != null && gVar2.b()) {
            e(context);
        }
    }

    private static long i(Context context) {
        String[] strArr;
        long j2 = 0;
        try {
            String str = context.getApplicationInfo().publicSourceDir;
            if (str != null) {
                File file = new File(str);
                if (file.exists()) {
                    j2 = file.length();
                }
            }
            if (Build.VERSION.SDK_INT >= 21 && (strArr = context.getApplicationInfo().splitPublicSourceDirs) != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    File file2 = new File(str2);
                    if (file2.exists()) {
                        j2 += file2.length();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return j2;
    }

    static void e(Context context) {
        boolean z;
        if (f5960g != null) {
            try {
                k(context);
                a();
                JSONObject jSONObject = new JSONObject();
                long a2 = e.a(g(context).getParent());
                long a3 = e.a(h(context).getParent());
                long j2 = 0;
                File b2 = com.bytedance.u.d.b(context);
                if (b2 != null) {
                    j2 = e.a(b2.getParent());
                }
                jSONObject.put("private_size", a2);
                jSONObject.put("external_size", a3);
                jSONObject.put("sdcard_size", j2);
                jSONObject.put("total_size", a2 + a3);
                jSONObject.put("device_size", e.a(context));
                jSONObject.put("available_size", e.b(context));
                jSONObject.put("apk_size", i(context));
                if (!com.bytedance.u.d.a() || com.bytedance.u.b.a(context) == null || !com.bytedance.u.b.a(context).a()) {
                    z = false;
                } else {
                    z = true;
                }
                jSONObject.put("strategy_enabled", z);
                b.a(context, jSONObject);
                f5960g.a("disk_usage", jSONObject);
                j(context);
            } catch (Exception unused) {
            }
        }
    }

    private static void f(Context context) {
        a aVar;
        Set<String> a2;
        if (!(context == null || g(context) == null || g(context).getParentFile() == null || h(context) == null || h(context).getParentFile() == null || (aVar = f5957d) == null || aVar.f5926b == null || aVar.f5926b.length <= 0)) {
            g gVar = f5958e;
            if (gVar == null) {
                a2 = null;
            } else {
                a2 = gVar.a();
            }
            String[] strArr = aVar.f5926b;
            for (String str : strArr) {
                if (a2 != null && !a2.contains(str)) {
                    File file = new File(str);
                    if ((a(file, g(context).getParentFile()) || a(file, h(context).getParentFile())) && file.exists()) {
                        if (file.isFile()) {
                            a(file);
                        } else {
                            e.b(file);
                        }
                    }
                }
            }
        }
    }

    private static void j(Context context) {
        if (!(context == null || f5960g == null)) {
            ArrayList<File> arrayList = new ArrayList();
            File g2 = g(context);
            if (g2 != null) {
                a(g2.getParentFile(), arrayList);
            }
            File h2 = h(context);
            if (h2 != null) {
                h2 = h2.getParentFile();
                a(h2, arrayList);
            }
            if (arrayList.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    StringBuilder sb = new StringBuilder();
                    for (File file : arrayList) {
                        if (!h2.getName().endsWith(".so")) {
                            sb.append(file.getAbsolutePath() + ":" + ((file.length() / 1024) / 1024) + "#");
                        }
                    }
                    jSONObject.put("files", sb.toString());
                } catch (Exception unused) {
                }
                f5960g.a("large_files_v2", jSONObject);
            }
        }
    }

    private static void k(Context context) {
        f5962i = 0;
        if (f5956c && context != null) {
            ArrayList<d.a> arrayList = new ArrayList();
            File g2 = g(context);
            if (g2 != null) {
                a(g2.getParentFile(), g2.getAbsolutePath() + File.separator + "ptree.txt", d.b.p, arrayList);
            }
            File h2 = h(context);
            if (h2 != null) {
                a(h2.getParentFile(), h2.getAbsolutePath() + File.separator + "etree.txt", d.b.e, arrayList);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                for (d.a aVar : arrayList) {
                    aVar.b();
                    f5962i += aVar.f5969a;
                    String b2 = aVar.b();
                    if (b2 != null) {
                        jSONObject.put(b2.replace("/", "_"), (aVar.f5969a / 1024) / 1024);
                    }
                }
            } catch (Exception unused) {
            }
            f fVar = f5960g;
            if (fVar != null) {
                fVar.b("mark_storage", jSONObject);
            }
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(12169);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(12169);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12169);
        return delete;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.c.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    private static void a(File file, List<File> list) {
        if (!(file == null || !file.exists() || list == null)) {
            if (file.isFile()) {
                long j2 = 50;
                a aVar = f5957d;
                if (aVar != null && aVar.f5932h > 0) {
                    j2 = (long) f5957d.f5932h;
                }
                if (file.length() > j2 * 1024 * 1024) {
                    list.add(file);
                    return;
                }
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    a(file2, list);
                }
            }
        }
    }

    private static boolean a(File file, File file2) {
        if (file2 == null) {
            return false;
        }
        try {
            if (file2.getCanonicalPath() == null) {
                return false;
            }
            while (file != null && file.getCanonicalPath() != null) {
                if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                    return true;
                }
                file = file.getParentFile();
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void a(File file, String str, d.b bVar, List<d.a> list) {
        Throwable th;
        FileNotFoundException e2;
        IOException e3;
        Exception e4;
        MethodCollector.i(12177);
        if (str == null) {
            MethodCollector.o(12177);
            return;
        }
        File file2 = new File(str);
        FileOutputStream fileOutputStream = null;
        d.a a2 = d.a(file, (d.a) null, bVar);
        if (a2 == null) {
            MethodCollector.o(12177);
            return;
        }
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        } else {
            d.a a3 = d.a(str);
            if (a3 == null) {
                MethodCollector.o(12177);
                return;
            }
            d.a(a3, a2, list);
        }
        JSONObject c2 = a2.c();
        try {
            File file3 = new File(str);
            if (!file3.exists()) {
                file3.createNewFile();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
            try {
                fileOutputStream2.write(c2.toString().getBytes());
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                    MethodCollector.o(12177);
                } catch (Exception e6) {
                    e6.printStackTrace();
                    MethodCollector.o(12177);
                }
            } catch (FileNotFoundException e7) {
                e2 = e7;
                fileOutputStream = fileOutputStream2;
                e2.printStackTrace();
                fileOutputStream.close();
                MethodCollector.o(12177);
            } catch (IOException e8) {
                e3 = e8;
                fileOutputStream = fileOutputStream2;
                e3.printStackTrace();
                fileOutputStream.close();
                MethodCollector.o(12177);
            } catch (Exception e9) {
                e4 = e9;
                fileOutputStream = fileOutputStream2;
                try {
                    e4.printStackTrace();
                    fileOutputStream.close();
                    MethodCollector.o(12177);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fileOutputStream.close();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    MethodCollector.o(12177);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                fileOutputStream.close();
                MethodCollector.o(12177);
                throw th;
            }
        } catch (FileNotFoundException e11) {
            e2 = e11;
            e2.printStackTrace();
            fileOutputStream.close();
            MethodCollector.o(12177);
        } catch (IOException e12) {
            e3 = e12;
            e3.printStackTrace();
            fileOutputStream.close();
            MethodCollector.o(12177);
        } catch (Exception e13) {
            e4 = e13;
            e4.printStackTrace();
            fileOutputStream.close();
            MethodCollector.o(12177);
        }
    }
}
