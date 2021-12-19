package com.bytedance.push.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

final class c {

    /* renamed from: a  reason: collision with root package name */
    static volatile AtomicBoolean f42171a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static long f42172b;

    /* renamed from: c  reason: collision with root package name */
    private static WeakHandler.IHandler f42173c = new WeakHandler.IHandler() {
        /* class com.bytedance.push.g.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25771);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            if (message != null && message.what == 2) {
                e.a(new Runnable() {
                    /* class com.bytedance.push.g.c.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(25772);
                    }

                    public final void run() {
                        c.a(201, System.currentTimeMillis() - c.f42172b);
                    }
                });
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static Handler f42174d;

    static {
        Covode.recordClassIndex(25770);
    }

    static Handler a() {
        if (f42174d == null) {
            f42174d = new WeakHandler(Looper.getMainLooper(), f42173c);
        }
        return f42174d;
    }

    public static void a(int i2, long j2) {
        String str;
        if (i2 != 201) {
            str = "init success";
        } else {
            str = "not invoke start() method/not invoke start() when 30s passed";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("delta", j2);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        f.a("push_monitor_applog_timeout", jSONObject, jSONObject2, null);
        if (i2 == 0) {
            i2 = 0;
        }
        a.a("1002", i2, str, null);
    }
}
