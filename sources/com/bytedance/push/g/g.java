package com.bytedance.push.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.third.f;
import com.ss.android.message.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static Handler f42177a = new WeakHandler(Looper.getMainLooper(), f42179c);

    /* renamed from: b  reason: collision with root package name */
    static final Map<Integer, Boolean> f42178b = new ConcurrentHashMap(2);

    /* renamed from: c  reason: collision with root package name */
    private static WeakHandler.IHandler f42179c = new WeakHandler.IHandler() {
        /* class com.bytedance.push.g.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25777);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            if (message != null && message.what == 1001) {
                String str = f.a(a.f59817a).d(((Integer) message.obj).intValue()) + " register timeout";
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", 108);
                    jSONObject.put("pushType", message.obj);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                f.a("push_monitor_register_result", jSONObject, null, null);
                a.a("1004", 108, str, jSONObject);
            }
        }
    };

    static {
        Covode.recordClassIndex(25776);
    }

    static void a(int i2) {
        f42177a.removeMessages(1001, Integer.valueOf(i2));
    }

    static void a(int i2, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", i2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (i2 == 0) {
            i2 = 0;
        }
        a.a("1005", i2, str, jSONObject);
        f.a("outer_switch_upload_result", jSONObject2, null, jSONObject);
    }

    static void a(int i2, JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", i2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (i2 == 0) {
            i2 = 0;
        }
        a.a("1003", i2, str, jSONObject);
        f.a("push_monitor_update_sender", jSONObject2, null, jSONObject);
    }
}
