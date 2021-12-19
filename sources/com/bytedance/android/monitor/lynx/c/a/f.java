package com.bytedance.android.monitor.lynx.c.a;

import com.bytedance.android.monitor.b.b;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class f extends b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f23645e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f23646b = "lynx_error";

    /* renamed from: c  reason: collision with root package name */
    public int f23647c;

    /* renamed from: d  reason: collision with root package name */
    public String f23648d;

    static {
        Covode.recordClassIndex(14018);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14019);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public f() {
        super("nativeError");
    }

    @Override // com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        d.a(jSONObject, "scene", this.f23646b);
        d.a(jSONObject, "error_code", this.f23647c);
        d.a(jSONObject, "error_msg", this.f23648d);
    }
}
