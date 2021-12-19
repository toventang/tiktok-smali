package com.bytedance.apm.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.apm.block.f;
import com.bytedance.apm.core.c;
import com.bytedance.apm.core.d;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.h;
import com.bytedance.apm.q.j;
import com.bytedance.apm.q.n;
import com.bytedance.apm.q.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.h;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class g implements b.AbstractC0531b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f24846a;

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f24847b;

    /* renamed from: c  reason: collision with root package name */
    volatile JSONObject f24848c;

    /* renamed from: d  reason: collision with root package name */
    volatile JSONObject f24849d;

    /* renamed from: e  reason: collision with root package name */
    List<String> f24850e = com.bytedance.apm.b.a.f24423a;

    /* renamed from: f  reason: collision with root package name */
    c f24851f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f24852g;

    /* renamed from: h  reason: collision with root package name */
    boolean f24853h;

    /* renamed from: i  reason: collision with root package name */
    long f24854i = -1;

    /* renamed from: j  reason: collision with root package name */
    volatile boolean f24855j;

    /* renamed from: k  reason: collision with root package name */
    boolean f24856k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f24857l;

    /* renamed from: m  reason: collision with root package name */
    List<com.bytedance.services.slardar.config.a> f24858m;
    private volatile JSONObject n;
    private volatile long o = 1200;
    private volatile SharedPreferences p;
    private long q = 60000;
    private long r = -1;

    static {
        Covode.recordClassIndex(14537);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        if (this.n == null || TextUtils.isEmpty(str) || this.n.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f24865a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f24866b = new HashMap();

        static {
            Covode.recordClassIndex(14543);
        }

        private void a() {
            this.f24866b.put("Content-Type", "application/json; charset=utf-8");
        }

        a(String str) {
            this.f24865a = str;
        }

        private void b(Map<String, String> map) {
            map.put("minor_version", "1");
            this.f24865a = v.a(this.f24865a, map);
        }

        /* access modifiers changed from: package-private */
        public final com.bytedance.apm.impl.a a(Map<String, String> map) {
            b(map);
            a();
            return new com.bytedance.apm.impl.a(this.f24865a, this.f24866b);
        }
    }

    private void e() {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.config.g.AnonymousClass2 */

            static {
                Covode.recordClassIndex(14540);
            }

            public final void run() {
                try {
                    Intent intent = new Intent("com.apm.setting.update.action");
                    intent.putExtra("PROCESS_NAME", n.a());
                    com.bytedance.apm.c.f24685a.sendBroadcast(intent);
                } catch (Exception unused) {
                }
            }
        }, 1000);
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (this.f24857l || this.f24856k) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        b();
        return this.p.getString("monitor_net_config", "");
    }

    g() {
    }

    private void f() {
        if (!this.f24846a) {
            this.f24846a = true;
            List<com.bytedance.services.slardar.config.a> list = this.f24858m;
            if (list != null) {
                for (com.bytedance.services.slardar.config.a aVar : list) {
                    try {
                        aVar.d();
                    } catch (Throwable th) {
                        com.bytedance.services.apm.api.a.a(th);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.p == null) {
            synchronized (this) {
                if (this.p == null) {
                    this.p = d.a(com.bytedance.apm.c.f24685a, "monitor_config");
                }
            }
        }
    }

    public final boolean a() {
        String d2 = d();
        if (!TextUtils.isEmpty(d2)) {
            try {
                JSONObject jSONObject = new JSONObject(d2);
                this.f24853h = true;
                if (this.p.getInt("setting_version", 0) == 3) {
                    this.f24854i = this.p.getLong("monitor_configure_refresh_time", 0);
                    com.bytedance.apm.c.a("config_time", new StringBuilder().append(this.f24854i).toString());
                    com.bytedance.b.e.a.a.f26193d = this.f24854i;
                    a(jSONObject);
                    a(jSONObject, true);
                    f();
                    return false;
                }
            } catch (Exception unused) {
                new String[]{"config read error"};
            }
        }
        return true;
    }

    @Override // com.bytedance.apm.p.b.AbstractC0531b
    public final void a(long j2) {
        a(false);
    }

    private void b(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("ret");
            String optString = jSONObject.optString(StringSet.name);
            c(optJSONObject);
            SharedPreferences.Editor edit = this.p.edit();
            edit.putString("monitor_net_config", optJSONObject.toString());
            edit.putInt("setting_version", 3);
            edit.putString("monitor_net_config_name", optString);
            edit.putLong("monitor_configure_refresh_time", this.f24854i);
            edit.commit();
        } catch (Exception unused) {
        }
    }

    static List<String> a(List<String> list) {
        try {
            if (!h.a(list)) {
                ArrayList arrayList = new ArrayList(2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String host = new URL(list.get(i2)).getHost();
                    if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                        arrayList.add("https://" + host + "/monitor/appmonitor/v3/settings");
                    }
                }
                return arrayList;
            }
        } catch (MalformedURLException unused) {
        }
        return Collections.emptyList();
    }

    private boolean b(long j2) {
        long j3 = this.q;
        if (j3 > 60000) {
            if (j2 - this.r > j3) {
                return true;
            }
            return false;
        } else if (j2 - this.f24854i > this.o * 1000) {
            return true;
        } else {
            return false;
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        boolean z;
        if (!com.bytedance.apm.q.g.b(jSONObject)) {
            JSONObject a2 = com.bytedance.apm.q.g.a(jSONObject, "general", "slardar_api_settings");
            if (a2 != null) {
                JSONObject optJSONObject2 = a2.optJSONObject("fetch_setting");
                if (optJSONObject2 != null) {
                    this.o = optJSONObject2.optLong("fetch_setting_interval", 1200);
                }
                if (this.o < 600) {
                    this.o = 600;
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("custom_event_settings");
            if (optJSONObject3 != null) {
                this.f24848c = optJSONObject3.optJSONObject("allow_log_type");
                this.f24849d = optJSONObject3.optJSONObject("allow_metric_type");
                this.n = optJSONObject3.optJSONObject("allow_service_name");
            }
            this.f24852g = jSONObject;
            JSONObject b2 = b("exception_modules");
            if (!(b2 == null || (optJSONObject = b2.optJSONObject("exception")) == null)) {
                if (optJSONObject.optInt("enable_upload") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f24847b = z;
            }
            if (a("apm_cost")) {
                com.bytedance.monitor.collector.h.f41520c = new h.a() {
                    /* class com.bytedance.apm.config.g.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(14541);
                    }

                    @Override // com.bytedance.monitor.collector.h.a
                    public final void a(final long j2) {
                        b.a.f25210a.a(new Runnable() {
                            /* class com.bytedance.apm.config.g.AnonymousClass3.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(14542);
                            }

                            public final void run() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("looper_monitor", j2);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("is_main_process", g.this.f24857l);
                                    com.bytedance.apm.b.a("apm_cost", jSONObject2, jSONObject, (JSONObject) null);
                                } catch (JSONException unused) {
                                }
                            }
                        });
                    }
                };
                com.bytedance.monitor.collector.h.f41521d = true;
            }
        }
    }

    private static void c(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        boolean z6 = true;
        if (optJSONObject != null) {
            com.bytedance.apm.internal.a.a(32, !optJSONObject.optBoolean("enable_salvage_log", true));
        }
        JSONObject a2 = com.bytedance.apm.q.g.a(jSONObject, "performance_modules", "smooth");
        if (a2 != null) {
            if (a2.optInt("block_enable_upload", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.bytedance.apm.internal.a.a(1, z3);
            if (a2.optInt("enable_trace", 0) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            com.bytedance.apm.internal.a.a(2, z4);
            if (a2.optInt("enable_stack_sampling", 0) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            com.bytedance.apm.internal.a.a(64, z5);
            com.bytedance.apm.internal.a.f25047e = a2.optLong("atrace_tag", 0);
            com.bytedance.apm.internal.a.a(f.a(jSONObject) << 29);
        }
        JSONObject a3 = com.bytedance.apm.q.g.a(jSONObject, "performance_modules", "start_trace");
        if (a3 != null) {
            if (a3.optInt("enable_perf_data_collect", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            com.bytedance.apm.internal.a.a(4, z);
            if (a3.optInt("enable_lock_data_collect", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.bytedance.apm.internal.a.a(8, z2);
            if (a3.optInt("enable_long_sleep_data_collect", 0) != 1) {
                z6 = false;
            }
            com.bytedance.apm.internal.a.a(16, z6);
        }
        if (a2 != null || a3 != null) {
            com.bytedance.apm.internal.a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final JSONObject b(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.f24852g) == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    private boolean a(com.bytedance.services.apm.api.c cVar) {
        byte[] bArr;
        if (cVar == null || cVar.f44100a != 200 || (bArr = cVar.f44102c) == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(new String(bArr));
        JSONObject optJSONObject = jSONObject.optJSONObject("ret");
        this.f24853h = false;
        a(optJSONObject);
        a(optJSONObject, false);
        f();
        this.f24854i = System.currentTimeMillis();
        com.bytedance.apm.c.a("config_time", new StringBuilder().append(this.f24854i).toString());
        com.bytedance.b.e.a.a.f26193d = this.f24854i;
        b(jSONObject);
        e();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        c cVar;
        if (!c()) {
            return;
        }
        if ((z || b(System.currentTimeMillis())) && j.a(com.bytedance.apm.c.f24685a) && (cVar = this.f24851f) != null && cVar.a() != null && !this.f24851f.a().isEmpty()) {
            this.r = System.currentTimeMillis();
            for (String str : this.f24850e) {
                try {
                    com.bytedance.apm.impl.a a2 = new a(str).a(this.f24851f.a());
                    if (a(com.bytedance.apm.c.a(a2.f25005a, a2.f25006b))) {
                        this.q = 60000;
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            this.q = Math.min(this.q * 2, 600000L);
        }
    }

    private void a(JSONObject jSONObject, boolean z) {
        List<com.bytedance.services.slardar.config.a> list = this.f24858m;
        if (list != null) {
            for (com.bytedance.services.slardar.config.a aVar : list) {
                try {
                    aVar.a(jSONObject, z);
                } catch (Throwable th) {
                    com.bytedance.services.apm.api.a.a(th);
                }
            }
        }
    }

    private static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.config.g.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
