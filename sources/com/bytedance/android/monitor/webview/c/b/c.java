package com.bytedance.android.monitor.webview.c.b;

import android.text.TextUtils;
import com.bytedance.android.monitor.b.f;
import com.bytedance.android.monitor.d.b;
import com.bytedance.android.monitor.l.d;
import com.bytedance.android.monitor.webview.c.a.a;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

public final class c extends com.bytedance.android.monitor.webview.c.a.c {

    /* renamed from: a  reason: collision with root package name */
    public long f23716a;

    /* renamed from: b  reason: collision with root package name */
    public long f23717b;

    /* renamed from: c  reason: collision with root package name */
    public long f23718c;

    /* renamed from: d  reason: collision with root package name */
    public long f23719d;

    /* renamed from: g  reason: collision with root package name */
    public long f23720g;

    /* renamed from: h  reason: collision with root package name */
    public long f23721h;

    /* renamed from: i  reason: collision with root package name */
    public long f23722i;

    /* renamed from: j  reason: collision with root package name */
    public long f23723j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f23724k;

    /* renamed from: l  reason: collision with root package name */
    public JSONObject f23725l = new JSONObject();

    /* renamed from: m  reason: collision with root package name */
    public Set<String> f23726m = new HashSet();
    public b n;
    private a o = new a("performance") {
        /* class com.bytedance.android.monitor.webview.c.b.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(14062);
        }

        @Override // com.bytedance.android.monitor.webview.c.a.a
        public final void b() {
            this.f23702c = false;
        }

        @Override // com.bytedance.android.monitor.b.a
        public final void a(JSONObject jSONObject) {
            d.a(jSONObject, "page_start", c.this.f23716a);
            d.a(jSONObject, "page_finish", c.this.f23717b);
            d.a(jSONObject, "page_progress_100", c.this.f23718c);
            d.a(jSONObject, "show_start", c.this.f23721h);
            d.a(jSONObject, "show_end", c.this.f23722i);
            if (c.this.f23724k) {
                d.a(jSONObject, "init_time", c.this.f23723j);
            }
            d.a(jSONObject, "inject_js_time", c.this.f23720g);
            d.a(jSONObject, "event_counts", c.this.f23725l);
            d.a(jSONObject, "load_start", c.this.f23707e.n);
        }

        {
            this.f23702c = true;
        }
    };

    static {
        Covode.recordClassIndex(14061);
    }

    @Override // com.bytedance.android.monitor.b.g, com.bytedance.android.monitor.webview.c.a.c
    public final /* bridge */ /* synthetic */ com.bytedance.android.monitor.b.b e() {
        return this.o;
    }

    @Override // com.bytedance.android.monitor.b.g
    public final f f() {
        return this.n;
    }

    @Override // com.bytedance.android.monitor.webview.c.a.c
    public final a k() {
        return this.o;
    }

    public final void n() {
        this.f23722i = System.currentTimeMillis();
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            d.a(this.f23725l, str, d.a(this.f23725l, str) + 1);
            this.f23726m.add(str);
            com.bytedance.android.monitor.h.b.a("WebPerfReportData", "addCount: ".concat(String.valueOf(str)));
        }
    }

    public c(b bVar, String str) {
        super(bVar, str, bVar.f23492c);
    }
}
