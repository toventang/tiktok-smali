package com.bytedance.y;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.y.e;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f46174a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f46175b;

    /* renamed from: c  reason: collision with root package name */
    public int f46176c = 86400;

    /* renamed from: d  reason: collision with root package name */
    int f46177d;

    /* renamed from: e  reason: collision with root package name */
    public long f46178e;

    /* renamed from: f  reason: collision with root package name */
    public long f46179f;

    /* renamed from: g  reason: collision with root package name */
    public e f46180g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f46181h;

    /* renamed from: i  reason: collision with root package name */
    private int f46182i = 10;

    /* renamed from: j  reason: collision with root package name */
    private long f46183j;

    /* renamed from: k  reason: collision with root package name */
    private final int f46184k = 5;

    static {
        Covode.recordClassIndex(28233);
    }

    public final b a(int i2) {
        if (i2 <= 0) {
            d.b("Fetcher", "set fetch interval fail. interval = ".concat(String.valueOf(i2)));
            return this;
        }
        this.f46176c = i2;
        return this;
    }

    public final b a(long j2) {
        if (j2 < 1) {
            d.b("Fetcher", "set config version fail. version = ".concat(String.valueOf(j2)));
            return this;
        }
        this.f46183j = j2;
        return this;
    }

    public b(Context context, c cVar) {
        this.f46181h = context;
        this.f46174a = cVar;
    }

    public final void b(final String str, final String str2) {
        d.a("Fetcher", "retry fetch, count = " + this.f46179f);
        if (this.f46177d > this.f46182i) {
            d.a("Fetcher", "fetch fail, module = " + str + ", retry times = " + this.f46177d);
            c cVar = this.f46174a;
            if (cVar != null) {
                cVar.a(-999, "fetch fail. try times = " + this.f46177d + ", max = " + this.f46182i);
            }
            this.f46177d = 0;
            return;
        }
        new Timer().schedule(new TimerTask() {
            /* class com.bytedance.y.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(28235);
            }

            public final void run() {
                b.this.a(str, str2);
            }
        }, 5000);
    }

    public final void a(final String str, final String str2) {
        String str3;
        long j2 = this.f46179f;
        if (j2 >= Long.MAX_VALUE) {
            this.f46179f = 1;
        } else {
            this.f46179f = j2 + 1;
        }
        d.a("Fetcher", "start to fetch, module = " + str + ", fetch count = " + this.f46179f);
        if (this.f46180g == null) {
            c cVar = this.f46174a;
            if (cVar != null) {
                cVar.a(-996, "netClient is null");
                return;
            }
            return;
        }
        String str4 = a.f46171h;
        if (TextUtils.isEmpty(str4)) {
            d.b("ConfigEnv", "region is null");
            str3 = null;
        } else {
            str3 = a.f46170g;
            if (str4.equals(a.f46165b)) {
                str3 = a.f46168e;
            } else if (str4.equals(a.f46166c)) {
                str3 = a.f46169f;
            } else if (str4.equals(a.f46164a)) {
                str3 = a.f46170g;
            }
        }
        if (TextUtils.isEmpty(str3)) {
            d.b("Fetcher", "get host is null");
            c cVar2 = this.f46174a;
            if (cVar2 != null) {
                cVar2.a(-998, "host is null");
                return;
            }
            return;
        }
        this.f46177d++;
        HashMap hashMap = new HashMap();
        hashMap.put("caller_name", "VideoCloud");
        hashMap.put("device_platform", "android");
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("config_version", new StringBuilder().append(this.f46183j).toString());
        if (!hashMap.containsKey("device_brand")) {
            hashMap.put("device_brand", Build.BRAND);
        }
        if (!hashMap.containsKey("device_type")) {
            hashMap.put("device_type", Build.MODEL.toLowerCase());
        }
        if (!TextUtils.isEmpty(str) && !str.equals("all")) {
            hashMap.put("module", str);
        }
        if (this.f46175b) {
            hashMap.put("debug", "1");
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("config_key", str2);
        }
        if (a.a() != null) {
            hashMap.putAll(a.a());
        }
        if (a.b() != null) {
            hashMap.putAll(a.b());
        }
        d.a("Fetcher", "param = " + hashMap.toString());
        this.f46180g.a("https://" + str3 + a.f46167d, hashMap, new e.a() {
            /* class com.bytedance.y.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28234);
            }

            @Override // com.bytedance.y.e.a
            public final void a(JSONObject jSONObject, Error error) {
                if (error != null) {
                    b.this.b(str, str2);
                } else if (jSONObject == null) {
                    d.b("Fetcher", "response is null or empty");
                    b.this.b(str, str2);
                } else {
                    b.this.f46178e = System.currentTimeMillis();
                    if (b.this.f46175b) {
                        d.a("Fetcher", "fetch suc, fetch count = " + b.this.f46179f + ", response = " + jSONObject.toString());
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (b.this.f46174a != null) {
                        b.this.f46174a.a(jSONObject.optInt("code"), jSONObject.optString("msg"), optJSONObject, str, str2);
                    }
                }
            }
        });
    }
}
