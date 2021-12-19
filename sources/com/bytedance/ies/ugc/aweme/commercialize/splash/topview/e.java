package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import android.content.SharedPreferences;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.b.a;
import com.google.gson.f;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import f.a.b.b;
import f.a.z;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class e {

    /* renamed from: c  reason: collision with root package name */
    private static final long f34876c = TimeUnit.DAYS.toMillis(3);

    /* renamed from: d  reason: collision with root package name */
    private static final long f34877d = TimeUnit.DAYS.toMillis(14);

    /* renamed from: g  reason: collision with root package name */
    private static boolean f34878g = false;

    /* renamed from: a  reason: collision with root package name */
    public f f34879a = new f();

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f34880b = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "awesome_splash", 0);

    /* renamed from: e  reason: collision with root package name */
    private volatile Map<String, Aweme> f34881e;

    /* renamed from: f  reason: collision with root package name */
    private long f34882f;

    /* access modifiers changed from: package-private */
    public final void c() {
        i.b(new f(this), i.f4824a);
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        SharedPreferences sharedPreferences = this.f34880b;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("awesome_splash_filter_enable", false);
        }
        return false;
    }

    static {
        Covode.recordClassIndex(20924);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        SharedPreferences sharedPreferences = this.f34880b;
        if (sharedPreferences != null && sharedPreferences.getBoolean("awesome_splash_preload_json", false)) {
            a();
        }
    }

    e() {
        com.bytedance.ies.ugc.appcontext.f.g().b(new z<Boolean>() {
            /* class com.bytedance.ies.ugc.aweme.commercialize.splash.topview.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(20926);
            }

            @Override // f.a.z
            public final void onComplete() {
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
            }

            @Override // f.a.z
            public final void onSubscribe(b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.z
            public final /* synthetic */ void onNext(Boolean bool) {
                if (bool.booleanValue() && com.bytedance.ies.abmock.b.a().a(true, "awesome_splash_del_when_background_enabled", false)) {
                    e.this.c();
                }
            }
        });
    }

    public final Map<String, Aweme> a() {
        MethodCollector.i(7900);
        if (this.f34881e == null) {
            synchronized (e.class) {
                try {
                    if (this.f34881e == null) {
                        this.f34881e = g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7900);
                    throw th;
                }
            }
        }
        Map<String, Aweme> map = this.f34881e;
        MethodCollector.o(7900);
        return map;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object f() {
        SharedPreferences sharedPreferences;
        if (this.f34882f == 0 && (sharedPreferences = this.f34880b) != null) {
            this.f34882f = sharedPreferences.getLong("awesome_splash_last_clean_time", 0);
        }
        long j2 = this.f34882f;
        if (j2 == 0 || System.currentTimeMillis() - j2 >= f34876c) {
            SharedPreferences sharedPreferences2 = this.f34880b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("awesome_splash_last_clean_time", System.currentTimeMillis()).apply();
            }
            d(com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.d());
            d(com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.c());
        }
        boolean z = false;
        if (a() == null || a().size() == 0) {
            d();
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : a().keySet()) {
            Aweme aweme = a().get(str);
            if (aweme != null) {
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.H(aweme)) {
                    aweme.getAid();
                    if (f(aweme.getAid())) {
                        a(aweme.getAid(), com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.d());
                        a(aweme.getAid(), com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.c());
                    }
                } else {
                    hashMap.put(str, aweme);
                }
            }
            z = true;
        }
        if (!z) {
            return null;
        }
        a().clear();
        a().putAll(hashMap);
        d();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r7.length() >= 3) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090 A[Catch:{ Exception -> 0x0120, OutOfMemoryError -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091 A[Catch:{ Exception -> 0x0120, OutOfMemoryError -> 0x00bc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme> g() {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.e.g():java.util.Map");
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        String[] list;
        MethodCollector.i(6180);
        String b2 = com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.b();
        File file = new File(b2 + "awemeJson/");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(b2 + "awemeJson/awemes.json");
        try {
            if ((a() == null || a().size() == 0) && com.bytedance.ies.abmock.b.a().a(true, "clear_splash_data_optimize_enable_new", false)) {
                if (file2.exists()) {
                    a(file2);
                }
                MethodCollector.o(6180);
                return;
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(this.f34879a.b(a(), new a<Map<String, Aweme>>() {
                /* class com.bytedance.ies.ugc.aweme.commercialize.splash.topview.e.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(20927);
                }
            }.type));
            bufferedWriter.close();
            if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34794j && !TextUtils.isEmpty(com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.c())) {
                String str = com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.c() + "awemeJson/";
                File file3 = new File(str + "awemes.json");
                if (file3.exists()) {
                    a(file3);
                }
                File file4 = new File(str);
                if (file4.exists()) {
                    a(file4);
                }
                File file5 = new File(com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.c());
                if (file5.isDirectory() && (list = file5.list()) != null && list.length == 0) {
                    a(file5);
                }
            }
            MethodCollector.o(6180);
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (OutOfMemoryError e3) {
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "AwesomeSplash OutOfMemoryError:" + e3.toString());
            com.ss.android.ugc.aweme.framework.a.a.a(e3);
            e3.printStackTrace();
        }
    }

    public final Aweme a(String str) {
        Aweme aweme = a().get(str);
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.H(aweme)) {
            return null;
        }
        return aweme;
    }

    public static void b(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.exists() && file.isFile()) {
                    file.getName();
                    a(file);
                }
            }
        }
    }

    private static String c(String str) {
        MethodCollector.i(8207);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        String sb2 = sb.toString();
        MethodCollector.o(8207);
        return sb2;
    }

    private void d(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.exists() && file.isFile() && System.currentTimeMillis() - file.lastModified() >= f34877d && !e(file.getName())) {
                    file.getName();
                    a(file);
                }
            }
        }
    }

    private boolean e(String str) {
        for (Map.Entry<String, Aweme> entry : a().entrySet()) {
            Aweme value = entry.getValue();
            if (value != null && TextUtils.equals(value.getAid(), str)) {
                return true;
            }
        }
        return false;
    }

    private boolean f(String str) {
        for (String str2 : a().keySet()) {
            Aweme aweme = a().get(str2);
            if (!(aweme == null || !TextUtils.equals(str, aweme.getAid()) || com.ss.android.ugc.aweme.commercialize.e.a.b.H(aweme))) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(File file) {
        MethodCollector.i(8134);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(8134);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(8134);
        return delete;
    }

    private static void a(String str, String str2) {
        File file = new File(str2 + str);
        if (file.exists() && file.isFile()) {
            a(file);
        }
    }
}
