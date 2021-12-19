package com.bytedance.liko.leakdetector.strategy.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.liko.leakdetector.b;
import com.bytedance.liko.leakdetector.strategy.a.a.b;
import com.bytedance.liko.leakdetector.strategy.a.a.c;
import com.bytedance.liko.leakdetector.strategy.a.a.d;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.tailor.Tailor;
import com.google.gson.f;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0982a f40116a = new C0982a((byte) 0);

    static {
        Covode.recordClassIndex(24724);
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a.a$a  reason: collision with other inner class name */
    public static final class C0982a {
        static {
            Covode.recordClassIndex(24725);
        }

        private C0982a() {
        }

        public /* synthetic */ C0982a(byte b2) {
            this();
        }
    }

    public static final class b extends RequestBody {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediaType f40119a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f40120b;

        static {
            Covode.recordClassIndex(24726);
        }

        @Override // okhttp3.RequestBody
        public final MediaType contentType() {
            return this.f40119a;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return this.f40120b.length();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            h.e.c.a(r9, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
            throw r0;
         */
        @Override // okhttp3.RequestBody
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeTo(k.g r11) {
            /*
                r10 = this;
                java.lang.String r0 = ""
                h.f.b.l.c(r11, r0)
                java.io.File r0 = r10.f40120b     // Catch:{ Exception -> 0x0036 }
                k.aa r9 = k.q.c(r0)     // Catch:{ Exception -> 0x0036 }
                r8 = r9
                k.aa r8 = (k.aa) r8     // Catch:{ all -> 0x002f }
                k.f r7 = new k.f     // Catch:{ all -> 0x002f }
                r7.<init>()     // Catch:{ all -> 0x002f }
                r3 = 2048(0x800, double:1.0118E-320)
                long r1 = r8.read(r7, r3)     // Catch:{ all -> 0x002f }
            L_0x0019:
                r5 = -1
                int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r0 == 0) goto L_0x0027
                r11.write(r7, r1)     // Catch:{ all -> 0x002f }
                long r1 = r8.read(r7, r3)     // Catch:{ all -> 0x002f }
                goto L_0x0019
            L_0x0027:
                r11.flush()     // Catch:{ all -> 0x002f }
                r0 = 0
                h.e.c.a(r9, r0)
                return
            L_0x002f:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0031 }
            L_0x0031:
                r0 = move-exception
                h.e.c.a(r9, r1)
                throw r0
            L_0x0036:
                r0 = move-exception
                r0.printStackTrace()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.strategy.a.a.b.writeTo(k.g):void");
        }

        b(MediaType mediaType, File file) {
            this.f40119a = mediaType;
            this.f40120b = file;
        }
    }

    private static Map<String, String> a() {
        MemoryConfig memoryConfig = MemoryConfig.getMemoryConfig();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aid", String.valueOf(memoryConfig.aid));
        String str = memoryConfig.channel;
        l.a((Object) str, "");
        linkedHashMap.put("channel", str);
        String str2 = memoryConfig.device_id;
        l.a((Object) str2, "");
        linkedHashMap.put("device_id", str2);
        String str3 = memoryConfig.app_version;
        l.a((Object) str3, "");
        linkedHashMap.put("app_version", str3);
        String str4 = memoryConfig.update_versioncode;
        l.a((Object) str4, "");
        linkedHashMap.put("update_version_code", str4);
        String str5 = memoryConfig.update_versioncode;
        l.a((Object) str5, "");
        linkedHashMap.put("current_update_version_code", str5);
        String str6 = memoryConfig.os_version;
        l.a((Object) str6, "");
        linkedHashMap.put("os_version", str6);
        linkedHashMap.put("os_api", String.valueOf(memoryConfig.os_api));
        String str7 = memoryConfig.device_model;
        l.a((Object) str7, "");
        linkedHashMap.put("device_model", str7);
        String str8 = memoryConfig.device_brand;
        l.a((Object) str8, "");
        linkedHashMap.put("device_brand", str8);
        String str9 = memoryConfig.device_manufacturer;
        l.a((Object) str9, "");
        linkedHashMap.put("device_manufacturer", str9);
        String str10 = memoryConfig.packageName;
        l.a((Object) str10, "");
        linkedHashMap.put("process_name", str10);
        String str11 = memoryConfig.versionName;
        l.a((Object) str11, "");
        linkedHashMap.put("version_name", str11);
        linkedHashMap.put("version_code", String.valueOf(memoryConfig.versioncode));
        String str12 = memoryConfig.region;
        l.a((Object) str12, "");
        linkedHashMap.put("region", str12);
        String str13 = memoryConfig.release_build;
        l.a((Object) str13, "");
        linkedHashMap.put("release_build", str13);
        return linkedHashMap;
    }

    public static final class c implements com.bytedance.liko.leakdetector.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f40134a;

        static {
            Covode.recordClassIndex(24727);
        }

        c(File file) {
            this.f40134a = file;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.liko.leakdetector.a
        public final /* synthetic */ void a(String str) {
            l.c("onResponse:".concat(String.valueOf(str)), "");
            if (this.f40134a.exists()) {
                a(this.f40134a);
            }
        }

        @Override // com.bytedance.liko.leakdetector.a
        public final void a(Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
            l.c("onFailure:".concat(String.valueOf(th)), "");
        }

        private static boolean a(File file) {
            MethodCollector.i(4341);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.b(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(4341);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(4341);
            return delete;
        }
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    private static boolean a(Context context) {
        if (context != null) {
            try {
                Object b2 = b(context, "connectivity");
                if (b2 != null) {
                    NetworkInfo a2 = a((ConnectivityManager) b2);
                    if (a2 != null) {
                        if (a2.isAvailable()) {
                            if (1 == a2.getType()) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        throw new w("null cannot be cast to non-null type");
    }

    private static void b(File file) {
        l.c(file, "");
        l.c("shouldUpload:" + d.a().a(), "");
        if (d.a().a()) {
            c(file);
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(9445);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(9445);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(9445);
        return delete;
    }

    private static void c(File file) {
        HttpUrl parse = HttpUrl.parse("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/");
        if (file.exists() && file.length() != 0 && parse != null) {
            com.bytedance.liko.leakdetector.strategy.a.a.a aVar = new com.bytedance.liko.leakdetector.strategy.a.a.a("memory_object_monitor", System.currentTimeMillis());
            b a2 = c.a(a());
            ArrayList arrayList = new ArrayList();
            String name = file.getName();
            MediaType mediaType = MultipartBody.FORM;
            l.a((Object) mediaType, "");
            MultipartBody.Part createFormData = MultipartBody.Part.createFormData("file", name, a(mediaType, file));
            l.a((Object) createFormData, "");
            arrayList.add(createFormData);
            MultipartBody.Part createFormData2 = MultipartBody.Part.createFormData("header", new f().b(a2));
            l.a((Object) createFormData2, "");
            arrayList.add(createFormData2);
            MultipartBody.Part createFormData3 = MultipartBody.Part.createFormData("data", new f().b(aVar));
            l.a((Object) createFormData3, "");
            arrayList.add(createFormData3);
            b.a.a().a("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/", arrayList, new c(file));
        }
    }

    private static RequestBody a(MediaType mediaType, File file) {
        return new b(mediaType, file);
    }

    private static Object b(Context context, String str) {
        Object obj;
        MethodCollector.i(9602);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(9602);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void a(Context context, String str) {
        MethodCollector.i(9259);
        l.c(str, "");
        if (!a(context)) {
            MethodCollector.o(9259);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(9259);
        } else {
            try {
                File file = new File(str);
                if (!file.exists() || !Tailor.isHprofValid(str)) {
                    MethodCollector.o(9259);
                    return;
                }
                String parent = file.getParent();
                String str2 = parent + "/.mini.hprof";
                Tailor.tailorHprof(str, str2);
                File file2 = new File(str2);
                if (file2.exists()) {
                    a(new File(str));
                }
                ArrayList arrayList = new ArrayList(4);
                if (file2.exists()) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(str);
                }
                if (new File(parent + "/.maps").exists()) {
                    arrayList.add(parent + "/.maps");
                    arrayList.add(parent + "/.fds");
                    arrayList.add(parent + "/.threads");
                    arrayList.add(parent + "/.stacks");
                }
                com.bytedance.liko.leakdetector.a.d.a(parent, "dump.xzip", arrayList);
                if (file.exists()) {
                    a(file);
                }
                if (file2.exists()) {
                    a(file2);
                }
                if (TextUtils.isEmpty(parent)) {
                    MethodCollector.o(9259);
                    return;
                }
                File file3 = new File(parent + "/dump.xzip");
                if (!file3.exists()) {
                    MethodCollector.o(9259);
                    return;
                }
                b(file3);
                MethodCollector.o(9259);
            } catch (Exception e2) {
                e2.printStackTrace();
                MethodCollector.o(9259);
            }
        }
    }
}
