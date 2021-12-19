package com.bytedance.apm.block;

import com.bytedance.apm.q.g;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class f {

    /* renamed from: b  reason: collision with root package name */
    private static volatile f f24659b;

    /* renamed from: a  reason: collision with root package name */
    public int f24660a;

    static {
        Covode.recordClassIndex(14498);
    }

    private f() {
    }

    public static f a() {
        if (f24659b == null) {
            synchronized (f.class) {
                if (f24659b == null) {
                    f24659b = new f();
                }
            }
        }
        return f24659b;
    }

    public static int a(JSONObject jSONObject) {
        int a2 = g.a(jSONObject, "performance_modules", "smooth", "block_monitor_mode");
        if (a2 == 11) {
            return 2;
        }
        if (a2 == 101) {
            return 3;
        }
        if (a2 != 1001) {
            return 1;
        }
        return 0;
    }
}
