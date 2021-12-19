package com.bytedance.crash.runtime.c;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.d;
import com.bytedance.crash.runtime.n;
import com.bytedance.crash.runtime.q;
import java.util.Map;
import org.json.JSONArray;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private static b f27903b;

    static {
        Covode.recordClassIndex(16329);
    }

    public static void a() {
        n.b().a(b(), 100);
    }

    private static b b() {
        if (f27903b == null) {
            f27903b = new b(n.b().f27964d);
        }
        return f27903b;
    }

    public final void run() {
        Map<String, Object> map;
        n.b().f27964d.removeCallbacks(this);
        try {
            map = m.a().b();
            if (map != null) {
                try {
                    if (d.a(map)) {
                        a(this.f27900a);
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
        } catch (Throwable unused2) {
            map = null;
        }
        q.a().a(map, new JSONArray());
    }

    private b(Handler handler) {
        super(handler, 30000);
    }
}
