package com.ss.android.account;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.o.d;
import com.ss.android.e;
import com.ss.android.token.g;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static volatile e f58194a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile com.ss.android.f f58195b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile d f58196c;

    /* renamed from: d  reason: collision with root package name */
    public static Handler f58197d = new a(Looper.getMainLooper());

    public static e a() {
        if (f58194a != null) {
            return f58194a;
        }
        throw new IllegalStateException("not init TTAccount config");
    }

    static {
        Covode.recordClassIndex(36172);
    }

    static class a extends Handler {
        static {
            Covode.recordClassIndex(36175);
        }

        public a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i2;
            if (message.what == 2001 && !com.ss.android.token.f.f61020f) {
                boolean a2 = g.a(f.f58194a.b());
                JSONObject jSONObject = new JSONObject();
                if (a2) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                try {
                    jSONObject.put("is_main_process", i2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.bytedance.sdk.a.i.a.b("never_call_token_init", jSONObject);
            }
        }
    }
}
