package com.bytedance.im.core.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private String f37647a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f37648b;

    static {
        Covode.recordClassIndex(22642);
    }

    public static i a() {
        return new i();
    }

    public final void b() {
        if (d.a().b().aD) {
            f.a(this.f37647a, this.f37648b);
        } else {
            e.b(this.f37647a, this.f37648b);
        }
    }

    public final void c() {
        if (d.a().b().aD) {
            f.a(this.f37647a, this.f37648b);
        } else {
            e.c(this.f37647a, this.f37648b);
        }
    }

    public final void d() {
        if (d.a().b().aD) {
            f.a(this.f37647a, this.f37648b, true);
        } else {
            e.d(this.f37647a, this.f37648b);
        }
    }

    public final i a(String str) {
        this.f37647a = str;
        a("params_for_special", "imsdk");
        a("sdk_version", "5.1.3.8-rc.2.7-bugfix");
        a("sdk_type", "Android");
        a("im_appid", Integer.valueOf(d.a().f37562b.h()));
        return this;
    }

    public final i a(String str, Object obj) {
        if (this.f37648b == null) {
            this.f37648b = new JSONObject();
        }
        try {
            this.f37648b.put(str, obj);
        } catch (Exception unused) {
        }
        return this;
    }
}
