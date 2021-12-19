package com.bytedance.android.livesdk.ab;

import android.text.TextUtils;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.network.model.b;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C0283a f13423f = new C0283a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f13424a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f13425b = new JSONObject();

    /* renamed from: c  reason: collision with root package name */
    public boolean f13426c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13427d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13428e;

    /* renamed from: g  reason: collision with root package name */
    private int f13429g = -1;

    /* renamed from: h  reason: collision with root package name */
    private String f13430h = "";

    /* renamed from: i  reason: collision with root package name */
    private String f13431i = "LiveBusinessLog";

    /* renamed from: j  reason: collision with root package name */
    private final String f13432j;

    static {
        Covode.recordClassIndex(7466);
    }

    /* renamed from: com.bytedance.android.livesdk.ab.a$a  reason: collision with other inner class name */
    public static final class C0283a {
        static {
            Covode.recordClassIndex(7467);
        }

        private C0283a() {
        }

        public /* synthetic */ C0283a(byte b2) {
            this();
        }

        public static a a(String str) {
            l.d(str, "");
            return new a(str).a(-1);
        }

        public static a b(String str) {
            l.d(str, "");
            return new a(str).a(0);
        }

        public static a c(String str) {
            l.d(str, "");
            return new a(str).a(1);
        }
    }

    public final void a() {
        if (this.f13425b.length() > 0 || this.f13426c) {
            this.f13425b.put("page", this.f13430h);
            b();
            this.f13424a.put("slardar", true);
        }
        com.bytedance.android.live.core.c.a.a(3, this.f13431i, this.f13424a.toString());
    }

    public final a a(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (p.a((CharSequence) entry.getKey()) && p.a((CharSequence) entry.getValue())) {
                    this.f13424a.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return this;
    }

    private final void b() {
        String str;
        String str2;
        if (this.f13427d || h.m.p.c(this.f13432j, "_all", false)) {
            if (h.m.p.c(this.f13432j, "_error", false)) {
                str2 = h.m.p.f(this.f13432j, "_", "all");
            } else if (!h.m.p.c(this.f13432j, "_all", false)) {
                str2 = this.f13432j + "_all";
            } else {
                str2 = this.f13432j;
            }
            c.a(str2, this.f13429g, this.f13425b);
        }
        if (this.f13428e || h.m.p.c(this.f13432j, "_error", false)) {
            if (this.f13429g != 0) {
                if (h.m.p.c(this.f13432j, "_all", false)) {
                    str = h.m.p.f(this.f13432j, "_", "error");
                } else if (!h.m.p.c(this.f13432j, "_error", false)) {
                    str = this.f13432j + "_error";
                } else {
                    str = this.f13432j;
                }
                c.a(str, this.f13429g, this.f13425b);
            } else {
                com.bytedance.android.live.core.c.a.a(6, this.f13431i, "slardar error log should not be reported with success status");
            }
        }
        if (!this.f13427d && !this.f13428e && !h.m.p.c(this.f13432j, "_all", false) && !h.m.p.c(this.f13432j, "_error", false)) {
            com.bytedance.android.live.core.c.a.a(6, this.f13431i, "slardar log's service name " + this.f13432j + " must end with _all or _error, please call all() or error() method before submit");
        }
    }

    public final a a(int i2) {
        this.f13429g = i2;
        if (i2 != -1) {
            this.f13424a.put("status", i2);
        }
        return this;
    }

    public final a b(String str) {
        l.d(str, "");
        this.f13430h = str;
        this.f13424a.put("page", str);
        return this;
    }

    public final a a(String str) {
        l.d(str, "");
        if (!TextUtils.isEmpty(str)) {
            this.f13431i = str;
        }
        return this;
    }

    public a(String str) {
        l.d(str, "");
        this.f13432j = str;
        JSONObject jSONObject = new JSONObject();
        this.f13424a = jSONObject;
        jSONObject.put("log_name", str);
    }

    public final a a(Throwable th) {
        l.d(th, "");
        if (th instanceof b) {
            b bVar = (b) th;
            return a("url", bVar.getUrl()).a("error_code", Integer.valueOf(bVar.getErrorCode())).a("error_msg", bVar.getErrorMsg()).a("error_alert", bVar.getAlert()).a("error_prompt", bVar.getPrompt());
        } else if (th instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
            return a("error_code", Integer.valueOf(aVar.getErrorCode())).a("error_msg", aVar.getErrorMsg()).a("error_alert", aVar.getAlert()).a("error_prompt", aVar.getPrompt());
        } else if (th instanceof com.bytedance.android.live.a.a.a.c) {
            return a("error_code", (Integer) 1).a("error_msg", th.getMessage());
        } else {
            com.bytedance.android.live.core.c.a.a("LiveBroadcastBusinessLog", th);
            return a("error_code", (Integer) 1).a("error_msg", th.getMessage());
        }
    }

    public final a b(String str, Boolean bool) {
        boolean z;
        l.d(str, "");
        JSONObject jSONObject = this.f13424a;
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        jSONObject.put(str, z);
        JSONObject jSONObject2 = this.f13425b;
        if (bool != null) {
            z2 = bool.booleanValue();
        }
        jSONObject2.put(str, z2);
        return this;
    }

    public final a a(String str, Boolean bool) {
        boolean z;
        l.d(str, "");
        JSONObject jSONObject = this.f13424a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        jSONObject.put(str, z);
        return this;
    }

    public final a b(String str, Integer num) {
        int i2;
        l.d(str, "");
        JSONObject jSONObject = this.f13424a;
        int i3 = 0;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        jSONObject.put(str, i2);
        JSONObject jSONObject2 = this.f13425b;
        if (num != null) {
            i3 = num.intValue();
        }
        jSONObject2.put(str, i3);
        return this;
    }

    public final a a(String str, Float f2) {
        l.d(str, "");
        if (f2 == null || Float.isNaN(f2.floatValue()) || Float.isInfinite(f2.floatValue())) {
            this.f13424a.put(str, Float.valueOf(0.0f));
        } else {
            this.f13424a.put(str, f2);
        }
        return this;
    }

    public final a b(String str, Long l2) {
        long j2;
        l.d(str, "");
        JSONObject jSONObject = this.f13424a;
        long j3 = 0;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        jSONObject.put(str, j2);
        JSONObject jSONObject2 = this.f13425b;
        if (l2 != null) {
            j3 = l2.longValue();
        }
        jSONObject2.put(str, j3);
        return this;
    }

    public final a a(String str, Integer num) {
        int i2;
        l.d(str, "");
        JSONObject jSONObject = this.f13424a;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        jSONObject.put(str, i2);
        return this;
    }

    public final a a(String str, Long l2) {
        long j2;
        l.d(str, "");
        JSONObject jSONObject = this.f13424a;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        jSONObject.put(str, j2);
        return this;
    }

    public final a b(String str, String str2) {
        String str3;
        l.d(str, "");
        JSONObject jSONObject = this.f13424a;
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        jSONObject.put(str, str3);
        JSONObject jSONObject2 = this.f13425b;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put(str, str2);
        return this;
    }

    public final a a(String str, String str2) {
        l.d(str, "");
        JSONObject jSONObject = this.f13424a;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put(str, str2);
        return this;
    }
}
