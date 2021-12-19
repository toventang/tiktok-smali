package com.bytedance.liko.leakdetector.strategy;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f40105a;

    /* renamed from: b  reason: collision with root package name */
    public static final HandlerThread f40106b = new HandlerThread("MemoryPeakThread");

    /* renamed from: c  reason: collision with root package name */
    public static Handler f40107c;

    /* renamed from: d  reason: collision with root package name */
    public static Context f40108d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile boolean f40109e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f40110f;

    /* renamed from: g  reason: collision with root package name */
    static final List<String> f40111g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public static final a f40112h = new a();

    /* renamed from: i  reason: collision with root package name */
    private static final List<String> f40113i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private static final List<String> f40114j = new ArrayList();

    private a() {
    }

    static {
        Covode.recordClassIndex(24720);
    }

    static File b() {
        File file;
        Context context = f40108d;
        if (context == null) {
            l.a("context");
        }
        if (d.f107195c == null || !d.f107197e) {
            file = context.getFilesDir();
            d.f107195c = file;
        } else {
            file = d.f107195c;
        }
        return new File(file, "leakcanary");
    }

    static File a() {
        File externalFilesDir;
        Context context = f40108d;
        if (context == null) {
            l.a("context");
        }
        if (!TextUtils.isEmpty("liko")) {
            externalFilesDir = context.getExternalFilesDir("liko");
        } else if (d.f107196d == null || !d.f107197e) {
            externalFilesDir = context.getExternalFilesDir("liko");
            d.f107196d = externalFilesDir;
        } else {
            externalFilesDir = d.f107196d;
        }
        StringBuilder sb = new StringBuilder("leakcanary-");
        Context context2 = f40108d;
        if (context2 == null) {
            l.a("context");
        }
        return new File(externalFilesDir, sb.append(context2.getPackageName()).toString());
    }

    static boolean a(File file) {
        if ((file.mkdirs() || file.exists()) && file.canWrite()) {
            return true;
        }
        return false;
    }

    public static boolean b(File file) {
        MethodCollector.i(4621);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(4621);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(4621);
        return delete;
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f40138a;

        static {
            Covode.recordClassIndex(24723);
        }

        public final void handleMessage(Message message) {
            File file;
            boolean z = false;
            if (a.f40110f || com.bytedance.liko.leakdetector.a.b.a() <= com.bytedance.liko.b.d.f40077d) {
                Handler handler = a.f40107c;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(0, com.bytedance.liko.b.d.f40076c);
                    return;
                }
                return;
            }
            if ("local_test".equals(MemoryConfig.getMemoryConfig().channel)) {
                b bVar = b.f40137a;
                l.c(bVar, "");
                ArrayList arrayList = new ArrayList();
                File[] listFiles = a.a().listFiles(bVar);
                if (listFiles != null) {
                    n.a((Collection) arrayList, (Object[]) listFiles);
                }
                File[] listFiles2 = a.b().listFiles(bVar);
                if (listFiles2 != null) {
                    n.a((Collection) arrayList, (Object[]) listFiles2);
                }
                int size = arrayList.size() - 7;
                if (size > 0) {
                    l.c("Removing " + size + " heap dumps", "");
                    n.a((List) arrayList, (Comparator) C0981a.f40115a);
                    int i2 = 0;
                    do {
                        String absolutePath = ((File) arrayList.get(i2)).getAbsolutePath();
                        if (a.b((File) arrayList.get(i2))) {
                            a.f40111g.add(absolutePath);
                        } else {
                            l.c("Could not delete old hprof file " + ((File) arrayList.get(i2)).getPath(), "");
                        }
                        i2++;
                    } while (i2 < size);
                }
                File a2 = a.a();
                if (!a.a(a2)) {
                    if (Build.VERSION.SDK_INT >= 23 && !a.f40105a) {
                        Context context = a.f40108d;
                        if (context == null) {
                            l.a("context");
                        }
                        if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                            z = true;
                        }
                        a.f40105a = z;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        l.c("WRITE_EXTERNAL_STORAGE permission not granted, ignoring", "");
                    } else {
                        String externalStorageState = Environment.getExternalStorageState();
                        if (true ^ l.a((Object) "mounted", (Object) externalStorageState)) {
                            l.c("External storage not mounted, state: ".concat(String.valueOf(externalStorageState)), "");
                        } else {
                            l.c("Could not create heap dump directory in external storage: [" + a2.getAbsolutePath() + ']', "");
                        }
                    }
                    a2 = a.b();
                    if (!a.a(a2)) {
                        l.c("Could not create heap dump directory in app storage: [" + a2.getAbsolutePath() + ']', "");
                        return;
                    }
                }
                file = new File(a2, new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS'.hprof'", Locale.US).format(new Date()));
            } else {
                boolean z2 = MemoryConfig.getMemoryConfig().oversea;
                Context context2 = a.f40108d;
                if (context2 == null) {
                    l.a("context");
                }
                file = com.bytedance.liko.leakdetector.a.a.a(z2, context2);
                if (file == null) {
                    return;
                }
            }
            try {
                Context context3 = a.f40108d;
                if (context3 == null) {
                    l.a("context");
                }
                com.bytedance.liko.leakdetector.a.c.a(context3, file.getAbsolutePath());
                Npth.dumpHprof(file.getAbsolutePath());
                l.c("Npth dump heap", "");
            } catch (Exception unused) {
                l.c("Could not dump heap", "");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar, Looper looper) {
            super(looper);
            this.f40138a = aVar;
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a$a  reason: collision with other inner class name */
    static final class C0981a<T> implements Comparator<File> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0981a f40115a = new C0981a();

        static {
            Covode.recordClassIndex(24721);
        }

        C0981a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
        }
    }

    static final class b implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40137a = new b();

        static {
            Covode.recordClassIndex(24722);
        }

        b() {
        }

        public final boolean accept(File file, String str) {
            l.a((Object) str, "");
            return p.c(str, ".hprof", false);
        }
    }
}
