package com.bytedance.android.livesdk.container.i;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public abstract class a<V extends View> implements b<V> {

    /* renamed from: a  reason: collision with root package name */
    public static final C0340a f16797a = new C0340a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f16798b;

    static {
        Covode.recordClassIndex(9319);
    }

    /* renamed from: com.bytedance.android.livesdk.container.i.a$a  reason: collision with other inner class name */
    public static final class C0340a {
        static {
            Covode.recordClassIndex(9320);
        }

        private C0340a() {
        }

        public /* synthetic */ C0340a(byte b2) {
            this();
        }
    }

    public a(String str) {
        l.d(str, "");
        this.f16798b = str;
    }

    public final void b(String str) {
        l.d(str, "");
        a((View) null, "gblhb_schema_error", a(this.f16798b, str, -101, null, null, 24));
    }

    public final void c(String str) {
        l.d(str, "");
        a((View) null, "gblhb_schema_error", a(this.f16798b, str, -102, null, null, 24));
    }

    public final void a(String str) {
        l.d(str, "");
        a((View) null, "gblhb_start_parse_url", a(this.f16798b, str, 0, null, null, 28));
    }

    public final void a(V v, String str) {
        a(v, "gblhb_schema_error", a(this.f16798b, str, -201, null, null, 24));
    }

    public final void a(V v, String str, String str2) {
        a(v, "gblhb_container_start_load", a(this.f16798b, str, 0, null, str2, 12));
    }

    public final void a(V v, String str, int i2, String str2) {
        a(v, "gblhb_container_load_error", a(this.f16798b, str, i2, str2, null, 16));
    }

    public final void a(V v, String str, String str2, boolean z) {
        JSONObject a2 = a(this.f16798b, str, 0, null, str2, 12);
        if (z) {
            a2.put("is_first_load", 1);
        }
        a(v, "gblhb_container_finish_load", a2);
    }

    private static /* synthetic */ JSONObject a(String str, String str2, int i2, String str3, String str4, int i3) {
        boolean z;
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            str3 = null;
        }
        if ((i3 & 16) != 0) {
            str4 = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("live_container_type", str);
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            jSONObject.put("schema", str2);
        } else if (!(str4 == null || str4.length() == 0)) {
            jSONObject.put("schema", str4);
        }
        if (i2 != 0) {
            jSONObject.put("error_code", i2);
        }
        if (!(str3 == null || str3.length() == 0)) {
            jSONObject.put("error_msg", str3);
        }
        return jSONObject;
    }
}
