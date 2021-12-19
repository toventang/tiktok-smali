package com.ss.android.ugc.aweme.notice.api.e;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.b;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.m.a;
import org.json.JSONObject;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    static boolean f112767a = true;

    /* renamed from: b  reason: collision with root package name */
    static long f112768b;

    /* renamed from: c  reason: collision with root package name */
    public static final x f112769c = new x();

    private x() {
    }

    static {
        Covode.recordClassIndex(72475);
    }

    private static void a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("message");
                int i2 = jSONObject2.getInt("code");
                boolean z = jSONObject2.getBoolean("is_connecting");
                jSONObject.put("error_msg", string);
                jSONObject.put("error_code", i2);
                jSONObject.put("is_connecting", z);
            } catch (Exception unused) {
                jSONObject.put("error_msg", str);
            }
        }
    }

    static void a(int i2, SocketState socketState) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("total_duration", SystemClock.uptimeMillis() - f112768b);
            jSONObject.put("connection_type", socketState.f27267a);
            jSONObject.put("connection_state", socketState.f27268b);
            jSONObject.put("channel_id", socketState.f27270d);
            jSONObject.put("channel_type", socketState.f27271e);
            jSONObject.put("error", socketState.f27272f);
            a(socketState.f27272f, jSONObject);
            b.a("aweme_long_connection_error_rate_v2", i2, jSONObject);
            a.b("WsConnectionReportManager", "reportConnect status: ".concat(String.valueOf(i2)));
        } catch (Exception unused) {
        }
    }
}
