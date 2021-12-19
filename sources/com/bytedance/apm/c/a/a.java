package com.bytedance.apm.c.a;

import com.bytedance.apm.c;
import com.bytedance.apm.c.b;
import com.bytedance.apm.h.d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class a extends com.bytedance.apm.c.a<b> {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f24705d;

    /* renamed from: c  reason: collision with root package name */
    public b f24706c;

    static {
        Covode.recordClassIndex(14511);
    }

    private a() {
    }

    public static a b() {
        if (f24705d == null) {
            synchronized (a.class) {
                if (f24705d == null) {
                    f24705d = new a();
                }
            }
        }
        return f24705d;
    }

    @Override // com.bytedance.apm.c.a
    public final void e(b bVar) {
        JSONObject a2 = bVar.a();
        boolean a3 = bVar.a(a2);
        if (c.e()) {
            try {
                d.a("logType: " + bVar.b() + ", subType: " + bVar.c() + "data: " + a2, " ,sample: ".concat(String.valueOf(a3)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (a3 || bVar.d()) {
            a(bVar.b(), bVar.c(), a2, a3, false);
            if (this.f24706c != null) {
                bVar.b();
                bVar.c();
            }
        }
    }
}
