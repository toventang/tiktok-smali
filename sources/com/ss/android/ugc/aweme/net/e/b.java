package com.ss.android.ugc.aweme.net.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.logger.a;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Random f112300a = new Random();

    static {
        Covode.recordClassIndex(72164);
    }

    public static boolean a() {
        if (f112300a.nextFloat() < 0.005f) {
            return true;
        }
        return false;
    }

    public static String a(int i2) {
        try {
            return d.a().getResources().getResourceEntryName(i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(final String str, final int i2, final long j2, final Context context) {
        final String name = Thread.currentThread().getName();
        final long currentTimeMillis = System.currentTimeMillis() - a.b.f109011a.f109007h;
        p.a(false).execute(new Runnable() {
            /* class com.ss.android.ugc.aweme.net.e.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72165);
            }

            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action_type", str);
                    jSONObject.put("layout_name", b.a(i2));
                    jSONObject.put("thread_name", name);
                    Context context = context;
                    if (context != null) {
                        jSONObject.put("ctx_name", context.getClass().getSimpleName());
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("duration", j2);
                    jSONObject2.put("app_time", currentTimeMillis);
                    com.bytedance.apm.b.a("view_inflate", jSONObject, jSONObject2, (JSONObject) null);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        });
    }
}
