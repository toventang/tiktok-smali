package com.ss.android.ugc.aweme.notification.e.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.bean.m;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.p;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Long f113350a;

    /* renamed from: b  reason: collision with root package name */
    public static Long f113351b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f113352c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static Long f113353d;

    private b() {
    }

    static {
        Covode.recordClassIndex(72907);
    }

    public static void a() {
        f113353d = Long.valueOf(System.currentTimeMillis());
    }

    public static void c() {
        f113350a = Long.valueOf(System.currentTimeMillis());
    }

    public static void d() {
        f113351b = Long.valueOf(System.currentTimeMillis());
    }

    public static void b() {
        Long l2 = f113353d;
        if (l2 != null) {
            a("notice_filter_data", System.currentTimeMillis() - l2.longValue(), (Integer) null);
        }
        f113353d = null;
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f113354a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f113355b;

        static {
            Covode.recordClassIndex(72908);
        }

        public a(m mVar, String str) {
            this.f113354a = mVar;
            this.f113355b = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.LinkedHashMap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            HashMap<Integer, Integer> hashMap = this.f113354a.f112699c;
            if (hashMap == null || hashMap.isEmpty()) {
                str = "is empty";
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                    if (entry.getValue().intValue() > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                str = n.a(ag.e(linkedHashMap), ", ", "{", "}", 0, (CharSequence) null, C2901a.f113356a, 24);
            }
            b.a(this.f113355b, "Get notificationIndicator\r\nmergeMap " + str + "\r\ngroup = " + this.f113354a.f112697a + "\r\ncount = " + this.f113354a.f112698b);
            return z.f158842a;
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a.b$a$a  reason: collision with other inner class name */
        static final class C2901a extends h.f.b.m implements h.f.a.b<p<? extends Integer, ? extends Integer>, CharSequence> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2901a f113356a = new C2901a();

            static {
                Covode.recordClassIndex(72909);
            }

            C2901a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ CharSequence invoke(p<? extends Integer, ? extends Integer> pVar) {
                p<? extends Integer, ? extends Integer> pVar2 = pVar;
                l.d(pVar2, "");
                return "group(" + pVar2.getFirst() + ")=" + pVar2.getSecond();
            }
        }
    }

    public static void a(int i2) {
        Long l2 = f113350a;
        if (l2 != null) {
            a("notice_list_total", System.currentTimeMillis() - l2.longValue(), Integer.valueOf(i2));
        }
        f113350a = null;
    }

    public static final void a(String str, String str2) {
        com.ss.android.ugc.aweme.framework.a.a.a(4, str, str2);
    }

    private static void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        com.bytedance.apm.b.a(str, (JSONObject) null, (JSONObject) null, jSONObject);
    }

    public static void a(int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("notice_group", i2);
        jSONObject.put("notice_request_id", str);
        jSONObject.put("notice_error_reason", str2);
        a("notice_monitor_list_abnormal", jSONObject);
    }

    public static void a(String str, long j2, Integer num) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("notice_duration_type", str);
        jSONObject.put("notice_duration", j2);
        if (num != null) {
            jSONObject.put("notice_group", num.intValue());
        }
        a("notice_monitor_list_duration", jSONObject);
    }
}
