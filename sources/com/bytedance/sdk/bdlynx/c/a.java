package com.bytedance.sdk.bdlynx.c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.a.a.e;
import com.bytedance.sdk.bdlynx.a.f.b;
import com.bytedance.sdk.bdlynx.e.g;
import com.bytedance.sdk.bdlynx.view.f;
import h.f.b.l;
import h.m.p;
import java.io.File;
import org.json.JSONObject;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1058a f43675a = new C1058a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private long f43676b;

    /* renamed from: c  reason: collision with root package name */
    private long f43677c;

    /* renamed from: d  reason: collision with root package name */
    private long f43678d;

    /* renamed from: e  reason: collision with root package name */
    private final String f43679e;

    /* renamed from: f  reason: collision with root package name */
    private String f43680f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.sdk.bdlynx.a.c.a f43681g;

    static {
        Covode.recordClassIndex(26728);
    }

    @Override // com.bytedance.sdk.bdlynx.c.c
    public final void a(f fVar) {
        l.c(fVar, "");
    }

    /* renamed from: com.bytedance.sdk.bdlynx.c.a$a  reason: collision with other inner class name */
    public static final class C1058a {
        static {
            Covode.recordClassIndex(26729);
        }

        private C1058a() {
        }

        public /* synthetic */ C1058a(byte b2) {
            this();
        }

        public static b a(com.bytedance.sdk.bdlynx.a.c.a aVar, String str) {
            boolean z;
            String builder;
            l.c(aVar, "");
            String str2 = aVar.f43659b;
            String str3 = aVar.f43660c;
            String a2 = f.a();
            if (str2.length() == 0 && str3.length() == 0) {
                builder = "bdlynx://";
            } else {
                Uri.Builder builder2 = new Uri.Builder();
                builder2.scheme("bdlynx");
                builder2.authority(str2);
                if (str3.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && str3 != null) {
                    builder2.appendPath(str3);
                }
                if (!(str == null || str.length() == 0)) {
                    String str4 = File.separator;
                    l.a((Object) str4, "");
                    if (p.b(str, str4, false)) {
                        str = str.substring(1);
                        l.a((Object) str, "");
                    }
                    builder2.appendPath(str);
                }
                builder = builder2.toString();
                l.a((Object) builder, "");
            }
            return new a(a2, builder, new com.bytedance.sdk.bdlynx.a.c.a(str2, str3));
        }
    }

    private final long g() {
        return b.b() - this.f43678d;
    }

    @Override // com.bytedance.sdk.bdlynx.c.e
    public final void b() {
        this.f43677c = b.b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_start_load");
        a(this, "bdlynx_lynx_load_time_line_event", jSONObject, null, 12);
    }

    @Override // com.bytedance.sdk.bdlynx.c.e
    public final void f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_page_update");
        a(this, "bdlynx_lynx_load_time_line_event", jSONObject, null, 12);
    }

    @Override // com.bytedance.sdk.bdlynx.c.d
    public final void a() {
        this.f43676b = b.b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_tpl_start");
        a(this, "bdlynx_load_event", jSONObject, null, 12);
    }

    @Override // com.bytedance.sdk.bdlynx.c.e
    public final void c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_runtime_ready");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interval_page_start", g());
        a(this, "bdlynx_lynx_load_time_line_event", jSONObject, jSONObject2, 8);
    }

    @Override // com.bytedance.sdk.bdlynx.c.e
    public final void d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_load_success");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interval_page_start", g());
        a(this, "bdlynx_lynx_load_time_line_event", jSONObject, jSONObject2, 8);
    }

    @Override // com.bytedance.sdk.bdlynx.c.e
    public final void e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_first_screen");
        JSONObject jSONObject2 = new JSONObject();
        if (this.f43678d > 0) {
            jSONObject2.put("interval_page_start", g());
        }
        a(this, "bdlynx_lynx_load_time_line_event", jSONObject, jSONObject2, 8);
        if (this.f43676b > 0) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("trigger", "on_load");
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("interval_load_start", b.b() - this.f43676b);
            a(this, "bdlynx_load_event", jSONObject3, jSONObject4, 8);
        }
    }

    @Override // com.bytedance.sdk.bdlynx.c.b
    public final void a(com.bytedance.sdk.bdlynx.a.c.a aVar) {
        this.f43681g = aVar;
    }

    @Override // com.bytedance.sdk.bdlynx.c.e
    public final void c(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_receive_error");
        if (str != null) {
            jSONObject.put("reason", str);
        }
        a(this, "bdlynx_lynx_load_receive_error_event", jSONObject, null, 12);
    }

    @Override // com.bytedance.sdk.bdlynx.c.e
    public final void b(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_load_fail");
        if (str != null) {
            jSONObject.put("reason", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interval_page_start", g());
        a(this, "bdlynx_lynx_load_fail_event", jSONObject, jSONObject2, 8);
    }

    @Override // com.bytedance.sdk.bdlynx.c.d
    public final void a(g gVar) {
        l.c(gVar, "");
        gVar.f43763e = b.a(this.f43676b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_tpl_result");
        jSONObject.put("result_type", gVar.f43759a);
        jSONObject.put("tpl_provider_name", gVar.f43761c);
        jSONObject.put("hit_cache", String.valueOf(gVar.f43760b));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tpl_size", gVar.f43762d);
        jSONObject2.put("duration", gVar.f43763e);
        a(this, "bdlynx_load_event", jSONObject, jSONObject2, 8);
    }

    @Override // com.bytedance.sdk.bdlynx.c.e
    public final void b(JSONObject jSONObject) {
        int i2;
        int i3;
        int i4;
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("trigger", "on_update_pref_ready");
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("render_page")) {
                i2 = Double.valueOf(jSONObject.getDouble("render_page"));
            } else {
                i2 = 0;
            }
            jSONObject3.put("render_page", i2);
            if (jSONObject.has("diff_same_root")) {
                i3 = Double.valueOf(jSONObject.getDouble("diff_same_root"));
            } else {
                i3 = 0;
            }
            jSONObject3.put("diff_same_root", i3);
            if (jSONObject.has("layout")) {
                i4 = Double.valueOf(jSONObject.getDouble("layout"));
            } else {
                i4 = 0;
            }
            jSONObject3.put("layout", i4);
            a(this, "bdlynx_lynx_load_time_line_event", jSONObject2, jSONObject3, 8);
        }
    }

    @Override // com.bytedance.sdk.bdlynx.c.e
    public final void a(String str) {
        this.f43678d = b.b();
        if (!(!TextUtils.equals(this.f43680f, "bdlynx://") || str == null || str.length() == 0)) {
            this.f43680f = str;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_page_start");
        JSONObject jSONObject2 = new JSONObject();
        long j2 = this.f43677c;
        if (j2 > 0) {
            jSONObject2.put("interval_load_start", this.f43678d - j2);
        }
        a(this, "bdlynx_lynx_load_time_line_event", jSONObject, jSONObject2, 8);
    }

    @Override // com.bytedance.sdk.bdlynx.c.e
    public final void a(JSONObject jSONObject) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("trigger", "on_first_load_pref");
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("tasm_binary_decode")) {
                i2 = Double.valueOf(jSONObject.getDouble("tasm_binary_decode"));
            } else {
                i2 = 0;
            }
            jSONObject3.put("tasm_binary_decode", i2);
            if (jSONObject.has("tasm_end_decode_finish_load_template")) {
                i3 = Double.valueOf(jSONObject.getDouble("tasm_end_decode_finish_load_template"));
            } else {
                i3 = 0;
            }
            jSONObject3.put("tasm_end_decode_finish_load_template", i3);
            if (jSONObject.has("tasm_finish_load_template")) {
                i4 = Double.valueOf(jSONObject.getDouble("tasm_finish_load_template"));
            } else {
                i4 = 0;
            }
            jSONObject3.put("tasm_finish_load_template", i4);
            if (jSONObject.has("diff_root_create")) {
                i5 = Double.valueOf(jSONObject.getDouble("diff_root_create"));
            } else {
                i5 = 0;
            }
            jSONObject3.put("diff_root_create", i5);
            if (jSONObject.has("js_finish_load_core")) {
                i6 = Double.valueOf(jSONObject.getDouble("js_finish_load_core"));
            } else {
                i6 = 0;
            }
            jSONObject3.put("js_finish_load_core", i6);
            if (jSONObject.has("js_finish_load_app")) {
                i7 = Double.valueOf(jSONObject.getDouble("js_finish_load_app"));
            } else {
                i7 = 0;
            }
            jSONObject3.put("js_finish_load_app", i7);
            if (jSONObject.has("js_and_tasm_all_ready")) {
                i8 = Double.valueOf(jSONObject.getDouble("js_and_tasm_all_ready"));
            } else {
                i8 = 0;
            }
            jSONObject3.put("js_and_tasm_all_ready", i8);
            if (jSONObject.has("tti")) {
                i9 = Double.valueOf(jSONObject.getDouble("tti"));
            } else {
                i9 = 0;
            }
            jSONObject3.put("tti", i9);
            if (jSONObject.has("js_runtime_type")) {
                i10 = Double.valueOf(jSONObject.getDouble("js_runtime_type"));
            } else {
                i10 = 0;
            }
            jSONObject3.put("js_runtime_type", i10);
            if (jSONObject.has("corejs_size")) {
                i11 = Double.valueOf(jSONObject.getDouble("corejs_size"));
            } else {
                i11 = 0;
            }
            jSONObject3.put("corejs_size", i11);
            if (jSONObject.has("layout")) {
                i12 = Double.valueOf(jSONObject.getDouble("layout"));
            } else {
                i12 = 0;
            }
            jSONObject3.put("layout", i12);
            if (jSONObject.has("first_page_layout")) {
                i13 = Double.valueOf(jSONObject.getDouble("first_page_layout"));
            } else {
                i13 = 0;
            }
            jSONObject3.put("first_page_layout", i13);
            a(this, "bdlynx_lynx_load_time_line_event", jSONObject2, jSONObject3, 8);
        }
    }

    public a(String str, String str2, com.bytedance.sdk.bdlynx.a.c.a aVar) {
        l.c(str, "");
        this.f43679e = str;
        this.f43680f = str2;
        this.f43681g = aVar;
    }

    private final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2 = this.f43680f;
        com.bytedance.sdk.bdlynx.a.c.a aVar = this.f43681g;
        l.c(str, "");
        if (com.bytedance.sdk.bdlynx.a.a.a.a().a()) {
            com.bytedance.sdk.bdlynx.a.a.f.b(new e.b(str2, str, jSONObject, aVar, jSONObject2, null));
        }
    }

    private static /* synthetic */ void a(a aVar, String str, JSONObject jSONObject, JSONObject jSONObject2, int i2) {
        if ((i2 & 2) != 0) {
            jSONObject = null;
        }
        if ((i2 & 4) != 0) {
            jSONObject2 = null;
        }
        aVar.a(str, jSONObject, jSONObject2);
    }
}
