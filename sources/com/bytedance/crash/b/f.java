package com.bytedance.crash.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.b.e;
import com.bytedance.crash.runtime.b;
import com.bytedance.crash.util.n;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    final d f27468a = new d();

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, String> f27469b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, String> f27470c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, Long> f27471d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, Float> f27472e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public HashMap<String, String> f27473f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    e.a f27474g = new e.a() {
        /* class com.bytedance.crash.b.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16151);
        }

        @Override // com.bytedance.crash.b.e.a
        public final void a(String str, String str2) {
            f.this.f27469b.put(str, str2);
        }

        @Override // com.bytedance.crash.b.e.a
        public final void a(String str, float f2) {
            f.this.f27472e.put(str, Float.valueOf(f2));
        }
    };

    /* renamed from: h  reason: collision with root package name */
    final int[] f27475h = {0, 0, 0};

    /* renamed from: i  reason: collision with root package name */
    String f27476i = "unknown";

    /* renamed from: j  reason: collision with root package name */
    String f27477j = "unknown";

    /* renamed from: k  reason: collision with root package name */
    String f27478k = "unknown";

    /* renamed from: l  reason: collision with root package name */
    private List<Pattern> f27479l;

    static {
        Covode.recordClassIndex(16150);
    }

    f() {
    }

    public final void a(String str) {
        this.f27474g.a("anr_reason", str);
    }

    public final void b(String str) {
        this.f27474g.a("anr_tag", str);
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        this.f27468a.f27461g = str;
    }

    /* access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.f27469b.entrySet()) {
            n.a(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.f27470c.entrySet()) {
            n.a(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.f27473f.entrySet()) {
            n.a(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(JSONObject jSONObject) {
        for (Map.Entry<String, Long> entry : this.f27471d.entrySet()) {
            n.a(jSONObject, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Float> entry2 : this.f27472e.entrySet()) {
            n.a(jSONObject, entry2.getKey(), entry2.getValue());
        }
    }

    private boolean d(String str) {
        String str2;
        if (this.f27479l == null) {
            JSONArray a2 = n.a(b.a(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
            if (a2 != null) {
                this.f27479l = new LinkedList();
                str2 = a2.optString(0);
                for (int i2 = 1; i2 < a2.length(); i2++) {
                    try {
                        this.f27479l.add(Pattern.compile(a2.optString(i2)));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                str2 = "npth_inner_default";
            }
            if (this.f27479l == null) {
                LinkedList linkedList = new LinkedList();
                this.f27479l = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.f27479l.add(Pattern.compile("^default_npth_thread$"));
                this.f27479l.add(Pattern.compile("^RenderThread$"));
                this.f27479l.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
            this.f27474g.a("max_utm_thread_version", str2);
        }
        for (Pattern pattern : this.f27479l) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public final void a(String str, String str2, int i2, int i3, int i4, long j2, long j3, long j4) {
        if (!d(str2)) {
            int[] iArr = this.f27475h;
            if (i2 > iArr[0]) {
                iArr[0] = i2;
                this.f27476i = str2;
            }
            if (i3 > iArr[1]) {
                iArr[1] = i3;
                this.f27477j = str2;
            }
            int i5 = i2 + i3;
            if (i5 > iArr[2]) {
                iArr[2] = i5;
                this.f27478k = str2;
            }
        }
        this.f27468a.a(str2, Integer.valueOf(str).intValue(), i2 + i3, i4, j2, j3, j4);
    }
}
