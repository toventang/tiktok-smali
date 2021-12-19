package com.bytedance.android.livesdk;

import android.text.TextUtils;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.IMonitor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class z implements IMonitor {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Object> f22919a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final long f22920b = LiveMessageTimeoutSetting.INSTANCE.getHttpFetchMonitorTimeout();

    static {
        Covode.recordClassIndex(13543);
    }

    public static void a(int i2, int i3) {
        int i4 = i2 + i3;
        if (i4 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("api_call_success_count", Integer.valueOf(i2));
            hashMap.put("api_call_error_count", Integer.valueOf(i3));
            double d2 = (double) i2;
            Double.isNaN(d2);
            double d3 = (double) i4;
            Double.isNaN(d3);
            hashMap.put("api_call_success_ration", Double.valueOf((d2 * 1.0d) / d3));
            c.a("ttlive_fetch_message_success_ratio", 0, hashMap);
        }
    }

    public static void a(long j2, long j3) {
        if (j3 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("api_call_delay_count", Long.valueOf(j3));
            hashMap.put("api_call_delay_all", Long.valueOf(j2));
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = (double) j3;
            Double.isNaN(d3);
            hashMap.put("api_delay_average", Double.valueOf((d2 * 1.0d) / d3));
            c.a("ttlive_fetch_message_delay_average", 0, hashMap);
        }
    }

    private static void a(String str, Map<String, Object> map) {
        map.put("event_name", str.toUpperCase(Locale.getDefault()));
        i.b().c("ttlive_msg", map);
    }

    public static void a(Throwable th, String str) {
        HashMap hashMap = new HashMap();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        hashMap.put("status_code", -10001);
        hashMap.put("error_type", "ParseError");
        hashMap.put("error_code", "1");
        hashMap.put("method_name", str);
        hashMap.put("error_msg", th.getMessage());
        hashMap.put("stack_trace", stringWriter.toString());
        c.a(d.b("ttlive_fetch_message"), 1, hashMap);
        a(d.b("ttlive_fetch_message"), hashMap);
    }

    public static void a(String str, String str2, long j2) {
        Map<String, ?> map = f22919a;
        map.put("event_name", str);
        map.put("method", str2);
        map.put("msg_id", Long.valueOf(j2));
        i.b().b("ttlive_msg", map);
    }

    public static void a(long j2, long j3, long j4) {
        long j5 = f22920b;
        if (j5 > 0 && j2 >= j5) {
            HashMap hashMap = new HashMap();
            hashMap.put("api_call_start_time", Long.valueOf(j3));
            hashMap.put("api_call_time_stamp", Long.valueOf(j4));
            hashMap.put("api_delay", Long.valueOf(j2));
            a.a(4, "LiveMessageMonitor", e.a.f9628b.b(hashMap));
            c.a("ttlive_fetch_message_time_out", 0, hashMap);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        com.bytedance.android.livesdkapi.session.d.a(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void a(int i2, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", "0");
        hashMap.put("status_code", Integer.valueOf(i2));
        hashMap.put("error_type", str);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("stack_trace", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("error_msg", str2);
        }
        c.a(d.b("ttlive_fetch_message"), 1, hashMap);
        a(d.b("ttlive_fetch_message"), hashMap);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorLatency(String str, long j2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            if (j2 > 0) {
                com.bytedance.android.livesdkapi.session.d.a(jSONObject2, "latency", j2);
                com.bytedance.android.livesdkapi.session.d.a(jSONObject3, "latency", j2);
            }
            com.bytedance.android.livesdkapi.session.d.a(jSONObject3, "event_module", "live_message");
            com.bytedance.android.livesdkapi.session.d.a(jSONObject3, "event_type", "bussiness_api_call");
            com.bytedance.android.livesdkapi.session.d.a(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
