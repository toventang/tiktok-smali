package com.ss.android.ad.splash.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ad.splash.b.a;
import com.ss.android.ad.splash.f.d;
import com.ss.android.ad.splash.f.g;
import com.ss.android.ad.splash.f.l;
import com.ss.android.ugc.aweme.cs.e;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class m {

    /* renamed from: b  reason: collision with root package name */
    private static volatile m f58668b;

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, String> f58669a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(36364);
    }

    private m() {
    }

    public static m a() {
        MethodCollector.i(2525);
        if (f58668b == null) {
            synchronized (m.class) {
                try {
                    if (f58668b == null) {
                        f58668b = new m();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2525);
                    throw th;
                }
            }
        }
        m mVar = f58668b;
        MethodCollector.o(2525);
        return mVar;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (h.K) {
            if (Math.abs(System.currentTimeMillis() - v.a().f58720b.getLong("clear_local_cache_time", 0)) >= Math.min(h.J, 3600000L)) {
                h.f58579h.execute(new Runnable() {
                    /* class com.ss.android.ad.splash.core.m.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(36365);
                    }

                    public final void run() {
                        String e2 = h.e();
                        if (!l.a(e2)) {
                            m.a(e2);
                        }
                        if (h.a().f58911c) {
                            String f2 = h.f();
                            if (!TextUtils.isEmpty(f2) && !f2.equals(e2)) {
                                m.a(f2);
                            }
                        }
                        String str = h.I;
                        if (!TextUtils.isEmpty(str)) {
                            m.a(str);
                        }
                        try {
                            JSONArray jSONArray = new JSONArray(v.a().g());
                            JSONArray jSONArray2 = new JSONArray();
                            long currentTimeMillis = System.currentTimeMillis();
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("local_url");
                                    long optLong = optJSONObject.optLong("local_data_expire_time");
                                    if (!l.a(optString)) {
                                        File file = new File(optString);
                                        if (file.exists()) {
                                            if (currentTimeMillis <= optLong) {
                                                jSONArray2.put(optJSONObject);
                                            } else {
                                                m.a(file);
                                                g.b("file " + optString + " is expired, delete it ");
                                            }
                                        }
                                    }
                                }
                            }
                            v.a().f(jSONArray2.toString()).h();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        v a2 = v.a();
                        a2.u().putLong("clear_local_cache_time", System.currentTimeMillis());
                        a2.h();
                    }
                });
            }
        }
    }

    public final void c() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.f58669a;
        if (!(concurrentHashMap == null || concurrentHashMap.isEmpty())) {
            for (Map.Entry<String, String> entry : this.f58669a.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    File file = new File(key);
                    if (file.exists() && !v.a().e(value)) {
                        a(file);
                    }
                }
            }
            this.f58669a.clear();
        }
    }

    static void a(String str) {
        File[] listFiles;
        try {
            File file = new File(str);
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                if (listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        long j2 = h.J;
                        if (file2 != null) {
                            if (j2 > 0) {
                                if (System.currentTimeMillis() - file2.lastModified() <= j2) {
                                }
                            }
                            if (file2.exists()) {
                                a(file2);
                            }
                        }
                        g.b("file " + str + " is expired, delete it");
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    static boolean a(File file) {
        MethodCollector.i(2536);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(2536);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2536);
        return delete;
    }

    public static void a(String str, boolean z) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_splash_cache_size", d.a(new File(str)) / 1024);
            if (z) {
                str2 = "service_ad_extra_res_disk_cache_size_in_mb";
            } else {
                str2 = "service_ad_res_disk_cache_size_in_mb";
            }
            a.a().a(str2, jSONObject, (JSONObject) null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
