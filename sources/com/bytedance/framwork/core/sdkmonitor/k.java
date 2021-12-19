package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.framwork.core.b.a.b;
import com.bytedance.framwork.core.b.c.c;
import com.bytedance.framwork.core.b.c.e;
import com.bytedance.framwork.core.b.d;
import com.bytedance.framwork.core.b.d.a;
import com.bytedance.framwork.core.sdkmonitor.j;
import com.bytedance.services.apm.api.IHttpService;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class k implements b, c, com.bytedance.framwork.core.b.d.b {
    private volatile int A;
    private volatile JSONObject B;
    private volatile List<String> C;
    private volatile List<Pattern> D;
    private volatile int E = 1;
    private volatile long F;
    private volatile boolean G;
    private volatile long H;

    /* renamed from: a  reason: collision with root package name */
    Context f29548a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f29549b;

    /* renamed from: c  reason: collision with root package name */
    public d f29550c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.framwork.core.b.b f29551d;

    /* renamed from: e  reason: collision with root package name */
    volatile long f29552e;

    /* renamed from: f  reason: collision with root package name */
    volatile JSONObject f29553f;

    /* renamed from: g  reason: collision with root package name */
    volatile IHttpService f29554g;

    /* renamed from: h  reason: collision with root package name */
    volatile int f29555h;

    /* renamed from: i  reason: collision with root package name */
    volatile int f29556i;

    /* renamed from: j  reason: collision with root package name */
    volatile List<String> f29557j;

    /* renamed from: k  reason: collision with root package name */
    volatile List<Pattern> f29558k;

    /* renamed from: l  reason: collision with root package name */
    a f29559l;

    /* renamed from: m  reason: collision with root package name */
    public Map<String, String> f29560m;
    public List<String> n = new LinkedList();
    public volatile boolean o;
    public volatile boolean p = true;
    public volatile boolean q;
    public volatile boolean r;
    List<String> s = new LinkedList();
    public b t;
    String u;
    boolean v;
    private volatile long w;
    private volatile int x;
    private volatile int y;
    private volatile int z;

    public interface a {
        static {
            Covode.recordClassIndex(17207);
        }

        String a();

        Map<String, String> b();
    }

    static {
        Covode.recordClassIndex(17199);
    }

    @Override // com.bytedance.framwork.core.b.a.b
    public final List<String> c() {
        return this.s;
    }

    @Override // com.bytedance.framwork.core.b.a.b
    public final JSONObject d() {
        return this.f29549b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0079, code lost:
        r6.clear();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(org.json.JSONObject r10) {
        /*
        // Method dump skipped, instructions count: 560
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.k.a(org.json.JSONObject):void");
    }

    @Override // com.bytedance.framwork.core.b.d.b
    public final void a(long j2) {
        if (this.w > 0) {
            j();
        }
    }

    public final void a(boolean z2) {
        this.f29550c.f29442a = z2;
    }

    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (!this.r) {
                this.t.a(new l(str, i2, jSONObject, null, null, jSONObject2, System.currentTimeMillis()));
            } else {
                b(str, i2, jSONObject, (JSONObject) null, (JSONObject) null, jSONObject2, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        a(str, 0, jSONObject, jSONObject2);
    }

    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            if (!this.r) {
                this.t.a(new l(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis()));
            } else {
                b(str, 0, (JSONObject) null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(final long j2, final long j3, final String str, final String str2, final String str3, final int i2, final JSONObject jSONObject) {
        try {
            if (!this.r) {
                this.t.a(new a("api_all", j2, j3, str, str2, str3, i2, jSONObject));
            } else {
                a.C0627a.f29455a.a(new Runnable() {
                    /* class com.bytedance.framwork.core.sdkmonitor.k.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(17204);
                    }

                    public final void run() {
                        k kVar = k.this;
                        long j2 = j2;
                        long j3 = j3;
                        String str = str;
                        String str2 = str2;
                        String str3 = str3;
                        int i2 = i2;
                        JSONObject jSONObject = jSONObject;
                        if (!kVar.b(str) && j.b(kVar.f29548a)) {
                            JSONObject a2 = kVar.a("api_all", j2, j3, str, str2, str3, i2);
                            k.a(a2, jSONObject);
                            if ((a2 != null && k.a(str, kVar.f29557j, kVar.f29558k)) || kVar.f29556i != 0) {
                                try {
                                    a2.put("hit_rules", 1);
                                    kVar.f29550c.a("api_all", "api_all", a2);
                                } catch (JSONException unused) {
                                }
                            }
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j2) {
        if (jSONObject4 == null) {
            try {
                jSONObject4 = new JSONObject();
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObject4.put("log_type", "service_monitor");
        jSONObject4.put("service", str);
        jSONObject4.put("status", i2);
        jSONObject4.put("network_type", k());
        jSONObject4.put("value", jSONObject);
        if (jSONObject2 != null) {
            jSONObject4.put("category", jSONObject2);
        }
        if (jSONObject3 != null) {
            jSONObject4.put("metric", jSONObject3);
        }
        if (jSONObject4.isNull("timestamp")) {
            jSONObject4.put("timestamp", j2);
        }
        if (!TextUtils.isEmpty(l())) {
            jSONObject4.put("session_id", l());
        }
        if (this.f29550c != null && c(str)) {
            this.f29550c.a("service_monitor", "service_monitor", jSONObject4);
        }
    }

    @Override // com.bytedance.framwork.core.b.a.b
    public final int b() {
        if (this.y <= 0) {
            return 100;
        }
        return this.y;
    }

    @Override // com.bytedance.framwork.core.b.a.b
    public final int e() {
        if (this.z <= 0) {
            return 4;
        }
        return this.z;
    }

    @Override // com.bytedance.framwork.core.b.a.b
    public final int f() {
        if (this.A <= 0) {
            return 15;
        }
        return this.A;
    }

    @Override // com.bytedance.framwork.core.b.a.b
    public final boolean g() {
        if (this.o) {
            return this.o;
        }
        return this.G;
    }

    public final int k() {
        return com.bytedance.framwork.core.b.e.c.b(this.f29548a).getValue();
    }

    /* access modifiers changed from: package-private */
    public final String l() {
        a aVar = this.f29559l;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    private boolean m() {
        if ((System.currentTimeMillis() - this.f29552e) / 1000 > this.w) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.framwork.core.b.a.b
    public final int a() {
        if (this.x <= 0) {
            return 120;
        }
        return this.x;
    }

    public final IHttpService h() {
        if (this.f29554g == null) {
            this.f29554g = (IHttpService) com.bytedance.news.common.service.manager.c.a(IHttpService.class);
        }
        return this.f29554g;
    }

    /* access modifiers changed from: package-private */
    public final SharedPreferences i() {
        return com.ss.android.ugc.aweme.bf.d.a(this.f29548a, "monitor_config" + this.u + i.a(this.f29548a), 0);
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        MethodCollector.i(13811);
        if (this.w < 600) {
            this.w = 600;
        }
        if (m() && j.b(this.f29548a)) {
            synchronized (k.class) {
                try {
                    this.f29552e = System.currentTimeMillis();
                } finally {
                    MethodCollector.o(13811);
                }
            }
            try {
                a.C0627a.f29455a.a(new Runnable() {
                    /* class com.bytedance.framwork.core.sdkmonitor.k.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(17202);
                    }

                    public final void run() {
                        byte[] bArr;
                        try {
                            if (k.this.f29560m != null) {
                                for (String str : k.this.n) {
                                    String sb = k.this.a(str).append("&encrypt=close").toString();
                                    try {
                                        if (k.this.h() != null) {
                                            bArr = k.this.h().doGet(sb, null).f44102c;
                                        } else {
                                            boolean z = k.this.p;
                                            if (!TextUtils.isDigitsOnly(sb)) {
                                                bArr = j.a(sb, null, null, null, "GET", false, z).f44102c;
                                            } else {
                                                return;
                                            }
                                        }
                                        if (bArr != null) {
                                            k kVar = k.this;
                                            JSONObject jSONObject = new JSONObject(new String(bArr));
                                            if (jSONObject.length() > 0) {
                                                try {
                                                    kVar.a(jSONObject.getJSONObject("ret"));
                                                    SharedPreferences.Editor edit = kVar.i().edit();
                                                    edit.putLong("monitor_configure_refresh_time", System.currentTimeMillis());
                                                    edit.putInt("monitor_config_update", 1);
                                                    edit.putString("monitor_net_config", jSONObject.getJSONObject("ret").toString());
                                                    edit.apply();
                                                    if (!kVar.r) {
                                                        kVar.r = true;
                                                        kVar.t.a(kVar);
                                                        return;
                                                    }
                                                    return;
                                                } catch (Throwable unused) {
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        } catch (Throwable unused3) {
                            if (!k.this.r) {
                                k.this.r = true;
                                k.this.t.a(k.this);
                            }
                        }
                    }
                });
                MethodCollector.o(13811);
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(long j2) {
        this.f29551d.c(j2);
    }

    private boolean c(String str) {
        if (this.B == null || TextUtils.isEmpty(str) || this.B.opt(str) == null) {
            return false;
        }
        return true;
    }

    protected k(String str) {
        this.u = str;
        this.r = false;
        this.t = new b();
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str) {
        return a(str, this.C, this.D);
    }

    public final StringBuilder a(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isDigitsOnly(str) && this.f29560m != null) {
            if (!str.contains("?")) {
                sb.append("?");
            }
            a(sb, "sdk_version", "400");
            Map<String, String> map = this.f29560m;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        a(sb, String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                    }
                }
            }
        }
        return sb;
    }

    private static String a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.framwork.core.b.c.c
    public final e a(String str, byte[] bArr) {
        byte[] bArr2;
        Map<String, String> map;
        e eVar = new e();
        try {
            String sb = a(str).toString();
            new HashMap();
            if (h() != null) {
                HashMap hashMap = new HashMap();
                byte[] a2 = j.a(bArr, hashMap);
                if (this.p) {
                    byte[] a3 = EncryptorUtil.a(a2, a2.length);
                    if (a3 != null) {
                        sb = sb + "&tt_data=a";
                        hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
                    }
                    com.bytedance.services.apm.api.c doPost = h().doPost(sb, a3, hashMap);
                    bArr2 = doPost.f44102c;
                    map = doPost.f44101b;
                } else {
                    com.bytedance.services.apm.api.c doPost2 = h().doPost(sb, a2, hashMap);
                    bArr2 = doPost2.f44102c;
                    map = doPost2.f44101b;
                }
            } else {
                com.bytedance.services.apm.api.c a4 = j.a(sb, bArr, j.a.GZIP, "application/json; charset=utf-8", this.p);
                bArr2 = a4.f44102c;
                map = a4.f44101b;
            }
            String str2 = null;
            if (map != null && !map.isEmpty()) {
                str2 = map.get("ran");
            }
            eVar.f29440a = 200;
            JSONObject jSONObject = new JSONObject(new String(bArr2));
            try {
                String optString = jSONObject.optString("data");
                if (!optString.isEmpty()) {
                    String a5 = com.bytedance.framwork.core.b.e.a.a(optString.getBytes(), str2);
                    if (!TextUtils.isEmpty(a5)) {
                        jSONObject = new JSONObject(a5);
                    } else {
                        jSONObject.put("message", "success");
                    }
                }
                eVar.f29441b = jSONObject;
            } catch (Throwable unused) {
            }
            eVar.f29441b = jSONObject;
            return eVar;
        } catch (Throwable th) {
            if (th instanceof d) {
                eVar.f29440a = th.getStatusCode();
            } else {
                eVar.f29440a = -1;
            }
            return eVar;
        }
    }

    public final void a(String str, int i2, JSONObject jSONObject) {
        a(str, i2, (JSONObject) null, jSONObject);
    }

    private static StringBuilder a(StringBuilder sb, String str, String str2) {
        if (sb.charAt(sb.length() - 1) != '?') {
            sb.append("&");
        }
        sb.append(a(str, "UTF-8")).append('=').append(a(str2, "UTF-8"));
        return sb;
    }

    static boolean a(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!g.a(list)) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!g.a(list2)) {
                for (Pattern pattern : list2) {
                    if (pattern.matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void b(final String str, final int i2, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, final long j2) {
        a.C0627a.f29455a.a(new Runnable() {
            /* class com.bytedance.framwork.core.sdkmonitor.k.AnonymousClass7 */

            static {
                Covode.recordClassIndex(17206);
            }

            public final void run() {
                k.this.a(str, i2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j2);
            }
        });
    }

    public final void b(final long j2, final long j3, final String str, final String str2, final String str3, final int i2, final JSONObject jSONObject) {
        try {
            if (!this.r) {
                this.t.a(new a("api_all", j2, j3, str, str2, str3, i2, jSONObject));
            } else {
                a.C0627a.f29455a.a(new Runnable() {
                    /* class com.bytedance.framwork.core.sdkmonitor.k.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(17205);
                    }

                    public final void run() {
                        k kVar = k.this;
                        long j2 = j2;
                        long j3 = j3;
                        String str = str;
                        String str2 = str2;
                        String str3 = str3;
                        int i2 = i2;
                        JSONObject jSONObject = jSONObject;
                        if (kVar.f29555h != 1 && !kVar.b(str)) {
                            JSONObject a2 = kVar.a("api_error", j2, j3, str, str2, str3, i2);
                            k.a(a2, jSONObject);
                            if (a2 != null && a2.length() > 0 && kVar.f29550c != null) {
                                kVar.f29550c.a("api_error", "api_error", a2);
                            }
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final JSONObject a(String str, long j2, long j3, String str2, String str3, String str4, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", str);
            jSONObject.put("duration", j2);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", Uri.parse(str2));
            }
            if (j3 > 0) {
                jSONObject.put("timestamp", j3);
            }
            jSONObject.put("status", i2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("ip", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("trace_code", str4);
            } else {
                jSONObject.put("trace_code", "");
            }
            jSONObject.put("network_type", j.a(this.f29548a).getValue());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
