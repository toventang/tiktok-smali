package com.bytedance.android.monitorV2.webview.c.b;

import com.bytedance.android.monitorV2.d.b;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.android.monitorV2.webview.c.a.a;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

public final class c extends com.bytedance.android.monitorV2.webview.c.a.c {

    /* renamed from: a  reason: collision with root package name */
    public long f24179a;

    /* renamed from: b  reason: collision with root package name */
    public long f24180b;

    /* renamed from: c  reason: collision with root package name */
    public long f24181c;

    /* renamed from: d  reason: collision with root package name */
    public long f24182d;

    /* renamed from: g  reason: collision with root package name */
    public long f24183g;

    /* renamed from: h  reason: collision with root package name */
    public long f24184h;

    /* renamed from: i  reason: collision with root package name */
    public long f24185i;

    /* renamed from: j  reason: collision with root package name */
    public long f24186j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f24187k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f24188l;

    /* renamed from: m  reason: collision with root package name */
    public JSONObject f24189m = new JSONObject();
    public Set<String> n = new HashSet();
    public b o;
    private a p = new a("performance") {
        /* class com.bytedance.android.monitorV2.webview.c.b.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(14241);
        }

        @Override // com.bytedance.android.monitorV2.webview.c.a.a
        public final void b() {
            this.f24165c = false;
        }

        @Override // com.bytedance.android.monitorV2.a.a
        public final void a(JSONObject jSONObject) {
            f.a(jSONObject, "page_start", c.this.f24179a);
            f.a(jSONObject, "page_finish", c.this.f24180b);
            f.a(jSONObject, "page_progress_100", c.this.f24181c);
            f.a(jSONObject, "show_start", c.this.f24184h);
            f.a(jSONObject, "show_end", c.this.f24185i);
            if (c.this.f24187k) {
                f.a(jSONObject, "init_time", c.this.f24186j);
            }
            f.a(jSONObject, "inject_js_time", c.this.f24183g);
            f.a(jSONObject, "event_counts", c.this.f24189m);
            f.a(jSONObject, "load_start", c.this.f24170e.f24177m);
            f.a(jSONObject, "is_first_page_started", Boolean.valueOf(c.this.f24188l));
        }

        {
            this.f24165c = true;
        }
    };

    static {
        Covode.recordClassIndex(14240);
    }

    @Override // com.bytedance.android.monitorV2.webview.c.a.c, com.bytedance.android.monitorV2.a.g
    public final /* bridge */ /* synthetic */ com.bytedance.android.monitorV2.a.b e() {
        return this.p;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final com.bytedance.android.monitorV2.a.f f() {
        return this.o;
    }

    @Override // com.bytedance.android.monitorV2.webview.c.a.c
    public final a j() {
        return this.p;
    }

    public c(b bVar, String str) {
        super(bVar, str, bVar.f23904c);
    }
}
