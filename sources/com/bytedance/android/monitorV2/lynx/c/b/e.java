package com.bytedance.android.monitorV2.lynx.c.b;

import com.bytedance.android.monitorV2.a.b;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class e extends b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f24118e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f24119b = "lynx_error";

    /* renamed from: c  reason: collision with root package name */
    public int f24120c;

    /* renamed from: d  reason: collision with root package name */
    public String f24121d;

    static {
        Covode.recordClassIndex(14201);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14202);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public e() {
        super("nativeError");
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        f.a(jSONObject, "scene", this.f24119b);
        f.a(jSONObject, "error_code", this.f24120c);
        f.a(jSONObject, "error_msg", this.f24121d);
    }
}
