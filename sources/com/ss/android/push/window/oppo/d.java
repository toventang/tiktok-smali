package com.ss.android.push.window.oppo;

import android.content.Context;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import org.json.JSONArray;
import org.json.JSONObject;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static d f60084c;

    /* renamed from: a  reason: collision with root package name */
    Context f60085a;

    /* renamed from: b  reason: collision with root package name */
    b<Integer, a> f60086b = new b<>(2);

    static {
        Covode.recordClassIndex(37125);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f60087a;

        /* renamed from: b  reason: collision with root package name */
        public int f60088b;

        /* renamed from: c  reason: collision with root package name */
        public String f60089c;

        /* renamed from: d  reason: collision with root package name */
        public int f60090d;

        /* renamed from: e  reason: collision with root package name */
        public String f60091e;

        static {
            Covode.recordClassIndex(37126);
        }

        public final String toString() {
            return "MessageObj{id=" + this.f60087a + ", type=" + this.f60088b + ", obj='" + this.f60089c + '\'' + ", from=" + this.f60090d + ", extra='" + this.f60091e + '\'' + '}';
        }
    }

    private void a() {
        try {
            String a2 = c.f60068a.a(this.f60085a, "pop_window_message_cache_list", "");
            if (!m.a(a2)) {
                JSONArray jSONArray = new JSONArray(a2);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    a aVar = new a();
                    if (optJSONObject != null) {
                        try {
                            aVar.f60087a = optJSONObject.optInt("id");
                            aVar.f60088b = optJSONObject.optInt(StringSet.type);
                            aVar.f60089c = optJSONObject.optString("obj");
                            aVar.f60090d = optJSONObject.optInt("from");
                            aVar.f60091e = optJSONObject.optString("extra");
                        } catch (Throwable unused) {
                        }
                    }
                    this.f60086b.a(Integer.valueOf(aVar.f60087a), aVar);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private d(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f60085a = applicationContext;
        this.f60086b = new b<>(c.a(context).f60077j);
        a();
    }

    public static d a(Context context) {
        MethodCollector.i(6626);
        if (f60084c == null) {
            synchronized (d.class) {
                try {
                    if (f60084c == null) {
                        f60084c = new d(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6626);
                    throw th;
                }
            }
        }
        d dVar = f60084c;
        MethodCollector.o(6626);
        return dVar;
    }
}
