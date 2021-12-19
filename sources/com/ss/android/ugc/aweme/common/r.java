package com.ss.android.ugc.aweme.common;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.c.a;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import h.p;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f76481a;

    static {
        Covode.recordClassIndex(47232);
    }

    public static void a(String str, JSONObject jSONObject) {
        try {
            a.a(str, jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, Map<String, String> map) {
        try {
            q.a(str, map);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, p<Object, String>... pVarArr) {
        String obj;
        int length = pVarArr.length;
        HashMap hashMap = new HashMap(length);
        for (p<Object, String> pVar : pVarArr) {
            String second = pVar.getSecond();
            if (second != null) {
                Object first = pVar.getFirst();
                if (first == null) {
                    obj = "";
                } else {
                    obj = first.toString();
                }
                hashMap.put(second, obj);
            }
        }
        a(str, hashMap);
    }

    public static ExecutorService a() {
        MethodCollector.i(8303);
        if (f76481a == null) {
            synchronized (r.class) {
                try {
                    if (f76481a == null) {
                        l.a a2 = l.a(o.SERIAL);
                        a2.f79173b = "EventUpload";
                        f76481a = g.a(a2.a());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8303);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f76481a;
        MethodCollector.o(8303);
        return executorService;
    }

    public static void onEventV3(String str) {
        try {
            a.a(str, new JSONObject());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void onEvent(MobClick mobClick) {
        if (!TextUtils.isEmpty(mobClick.getExtValueStr())) {
            a(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), Long.parseLong(mobClick.getExtValueStr()), mobClick.getExtJson());
        } else {
            a(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), mobClick.getExtValueLong(), mobClick.getExtJson());
        }
        mobClick.recycle();
    }

    public static void a(String str, Bundle bundle) {
        try {
            a.a(str, bundle);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void b(String str, JSONObject jSONObject) {
        try {
            a.a(str, jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, String str2, long j2) {
        try {
            q.a(d.a(), str, str2, j2, 0);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2, String str3, long j2) {
        try {
            q.a(d.a(), str, str2, Long.parseLong(str3), j2);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        try {
            q.a(d.a(), str, str2, Long.parseLong(str3), Long.parseLong(str4));
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2, String str3, long j2, JSONObject jSONObject) {
        try {
            q.a(d.a(), str, str2, Long.parseLong(str3), j2, jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        try {
            q.a(d.a(), str, str2, Long.parseLong(str3), Long.parseLong(str4), jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2, String str3, String str4, long j2, JSONObject jSONObject) {
        try {
            q.a(d.a(), str, str2, str3, Long.parseLong(str4), j2, jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
