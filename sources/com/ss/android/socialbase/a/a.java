package com.ss.android.socialbase.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.framwork.core.sdkmonitor.k;
import com.ss.android.socialbase.downloader.f.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a implements b {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f60256b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f60257c;

    /* renamed from: a  reason: collision with root package name */
    public b f60258a;

    /* renamed from: d  reason: collision with root package name */
    private String f60259d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f60260e = "";

    /* renamed from: f  reason: collision with root package name */
    private long f60261f;

    static {
        Covode.recordClassIndex(37212);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(11287);
        if (f60256b == null) {
            synchronized (a.class) {
                try {
                    if (f60256b == null) {
                        f60256b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11287);
                    throw th;
                }
            }
        }
        a aVar = f60256b;
        MethodCollector.o(11287);
        return aVar;
    }

    @Override // com.ss.android.socialbase.downloader.f.b
    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        MethodCollector.i(11290);
        try {
            if (!f60257c) {
                synchronized (a.class) {
                    try {
                        if (!f60257c) {
                            b bVar = this.f60258a;
                            if (bVar == null) {
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("config is null");
                                MethodCollector.o(11290);
                                throw illegalArgumentException;
                            } else if (bVar.a() == null) {
                                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("context is null");
                                MethodCollector.o(11290);
                                throw illegalArgumentException2;
                            } else if (!TextUtils.isEmpty(this.f60258a.b())) {
                                try {
                                    this.f60259d = this.f60258a.c();
                                    this.f60261f = this.f60258a.e();
                                    this.f60260e = this.f60258a.b();
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("device_id", this.f60258a.c());
                                    jSONObject4.put("host_aid", this.f60258a.b());
                                    jSONObject4.put("channel", this.f60258a.d());
                                    jSONObject4.put("app_version", this.f60258a.f());
                                    jSONObject4.put("update_version_code", String.valueOf(this.f60258a.e()));
                                    jSONObject4.put("package_name", this.f60258a.g());
                                    jSONObject4.put("oversea", "1");
                                    String[] h2 = this.f60258a.h();
                                    if (h2 == null || h2.length <= 0) {
                                        SDKMonitorUtils.a("2993", Arrays.asList(c.f60263a));
                                        SDKMonitorUtils.b("2993", Arrays.asList(c.f60264b));
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        ArrayList arrayList2 = new ArrayList();
                                        for (String str2 : h2) {
                                            arrayList.add("https://" + str2 + "/monitor/appmonitor/v2/settings");
                                            arrayList2.add("https://" + str2 + "/monitor/collect/");
                                        }
                                        SDKMonitorUtils.a("2993", arrayList);
                                        SDKMonitorUtils.b("2993", arrayList2);
                                    }
                                    SDKMonitorUtils.a(this.f60258a.a(), "2993", jSONObject4, new k.a() {
                                        /* class com.ss.android.socialbase.a.a.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(37213);
                                        }

                                        @Override // com.bytedance.framwork.core.sdkmonitor.k.a
                                        public final String a() {
                                            return null;
                                        }

                                        @Override // com.bytedance.framwork.core.sdkmonitor.k.a
                                        public final Map<String, String> b() {
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("host_aid", String.valueOf(a.this.f60258a.b()));
                                            hashMap.put("oversea", "1");
                                            return hashMap;
                                        }
                                    });
                                    f60257c = true;
                                } catch (Throwable unused) {
                                }
                            } else {
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("aid " + this.f60258a.b() + " is invalid");
                                MethodCollector.o(11290);
                                throw illegalArgumentException3;
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(11290);
                        throw th;
                    }
                }
            }
            if (jSONObject != null) {
                try {
                    if (TextUtils.isEmpty(jSONObject.optString("app_id"))) {
                        jSONObject.put("app_id", this.f60260e);
                    }
                    if (TextUtils.isEmpty(jSONObject.optString("device_id"))) {
                        jSONObject.put("device_id", this.f60259d);
                        jSONObject.put("device_id_postfix", com.ss.android.socialbase.downloader.f.a.a(this.f60259d));
                    }
                    if (jSONObject.optInt("update_version") == 0) {
                        jSONObject.put("update_version", this.f60261f);
                    }
                } catch (Throwable unused2) {
                }
            }
            SDKMonitorUtils.a("2993").a(str, jSONObject, jSONObject2, jSONObject3);
            MethodCollector.o(11290);
        } catch (Throwable unused3) {
            MethodCollector.o(11290);
        }
    }
}
