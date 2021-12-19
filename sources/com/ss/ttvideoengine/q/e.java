package com.ss.ttvideoengine.q;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.strategy.ILogCallback;
import com.bytedance.vcloud.strategy.IStrategyEventListener;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.kakao.usermgmt.StringSet;
import com.ss.ttvideoengine.h.t;
import com.ss.ttvideoengine.q.d;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public b f153185a;

    /* renamed from: b  reason: collision with root package name */
    public String f153186b;

    /* renamed from: c  reason: collision with root package name */
    public String f153187c;

    /* renamed from: d  reason: collision with root package name */
    public String f153188d;

    /* renamed from: e  reason: collision with root package name */
    public String f153189e;

    /* renamed from: f  reason: collision with root package name */
    public String f153190f;

    /* renamed from: g  reason: collision with root package name */
    public String f153191g;

    /* renamed from: h  reason: collision with root package name */
    public String f153192h;

    /* renamed from: i  reason: collision with root package name */
    public String f153193i;

    /* renamed from: j  reason: collision with root package name */
    public String f153194j;

    /* renamed from: k  reason: collision with root package name */
    public long f153195k;

    /* renamed from: l  reason: collision with root package name */
    public long f153196l;

    /* renamed from: m  reason: collision with root package name */
    public Context f153197m;
    public int n = 5;
    public int o;
    public boolean p;
    public d q = new d();
    private StrategyCenter r;
    private boolean s;
    private boolean t;
    private Map<Integer, Integer> u = new ConcurrentHashMap(5);

    static {
        Covode.recordClassIndex(101761);
    }

    public static e a() {
        return c.f153200a;
    }

    public final boolean c() {
        if (!this.t) {
            return true;
        }
        return false;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final e f153200a = new e();

        static {
            Covode.recordClassIndex(101765);
        }
    }

    public final boolean d() {
        return b().isRunning();
    }

    public final StrategyCenter b() {
        if (this.r == null) {
            this.r = new StrategyCenter(new b());
        }
        return this.r;
    }

    public static class a implements ILogCallback {
        static {
            Covode.recordClassIndex(101763);
        }

        @Override // com.bytedance.vcloud.strategy.ILogCallback
        public final void log(String str) {
            j.a("StrategyHelper", str);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements IStrategyEventListener {
        static {
            Covode.recordClassIndex(101764);
        }

        b() {
        }

        @Override // com.bytedance.vcloud.strategy.IStrategyEventListener
        public final void onEventLog(String str, String str2) {
            j.b("StrategyHelper", "eventName: " + str + ", logInfo: " + str2);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    t.instance.addEventV2(true, new JSONObject(str2), str);
                } catch (JSONException unused) {
                }
            }
        }

        @Override // com.bytedance.vcloud.strategy.IStrategyEventListener
        public final void onEvent(String str, int i2, int i3, String str2) {
            Map map;
            MethodCollector.i(13563);
            j.a("StrategyHelper", "videoID = " + str + ", key = " + i2 + ", value = " + i3 + ", info = " + str2);
            d dVar = e.this.q;
            if (i2 == 2000) {
                synchronized (dVar) {
                    try {
                        if (!dVar.f153181a.containsKey(str)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("pause", new d.a());
                            hashMap.put("resume", new d.a());
                            dVar.f153181a.put(str, hashMap);
                        }
                        map = (Map) dVar.f153181a.get(str);
                    } finally {
                        MethodCollector.o(13563);
                    }
                }
                if (i3 == 1) {
                    ((d.a) map.get("pause")).a();
                    MethodCollector.o(13563);
                    return;
                }
                if (i3 == 2) {
                    ((d.a) map.get("resume")).a();
                }
            } else if (i2 == 2001 && !TextUtils.isEmpty(str2)) {
                synchronized (dVar) {
                    try {
                        dVar.f153182b.put(StringSet.name, str2);
                    } finally {
                        MethodCollector.o(13563);
                    }
                }
            } else {
                MethodCollector.o(13563);
            }
        }
    }

    public final boolean a(int i2) {
        if (i2 != -1) {
            boolean z = true;
            this.t = true;
            if (b().iPlayerVersion() != i2) {
                z = false;
            }
            this.p = z;
        }
        return this.p;
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    jSONObject.put(key, value);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static Map<String, Integer> a(String str) {
        String[] split;
        if (str == null || str.length() < 2) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(",")) {
            try {
                String[] split2 = str2.split(":");
                if (split2.length == 2) {
                    hashMap.put(split2[0], Integer.valueOf(Integer.parseInt(split2[1])));
                }
            } catch (NumberFormatException unused) {
            }
        }
        return hashMap;
    }

    public static Map<String, String> b(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                    map.put(next, string);
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public final void a(int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            j.a("StrategyHelper", "[preload] Algorithm json ".concat(String.valueOf(str)));
            return;
        }
        switch (i2) {
            case 31001:
                this.f153186b = str;
                break;
            case 31002:
                this.f153187c = str;
                break;
            case 31003:
                this.f153188d = str;
                break;
            case 31004:
                this.f153189e = str;
                break;
            case 31005:
                this.f153190f = str;
                break;
            case 31006:
                this.f153191g = str;
                break;
            case 31007:
                this.f153192h = str;
                break;
            case 31008:
                this.f153193i = str;
                break;
            case 31009:
                this.f153194j = str;
                break;
        }
        if (b().isLoadLibrarySucceed()) {
            b().setAlgorithmJson(i2, str);
        }
    }

    public final void a(String str, Map map) {
        if (!this.s && b().isLoadLibrarySucceed()) {
            b().setAppInfo(str);
            this.s = true;
        }
        if (map != null && map.containsKey("appid")) {
            this.o = i.a(map.get("appid"));
        }
    }

    public static String a(String str, String str2, String[] strArr) {
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("urls", strArr);
            hashMap2.put("file_hash", str2);
            arrayList.add(hashMap2);
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            hashMap.put("vid", str);
            hashMap.put("infos", arrayList);
            return new JSONObject(hashMap).toString();
        } catch (Throwable th) {
            j.e("StrategyHelper", th.toString());
            return null;
        }
    }

    public final Map<String, Integer> a(com.ss.ttvideoengine.j.e eVar, int i2, Map<String, String> map, com.ss.ttvideoengine.n.c.b bVar) {
        String selectBitrate = b().selectBitrate(eVar.m(), i2, a(map), bVar);
        if (!TextUtils.isEmpty(selectBitrate)) {
            return a(selectBitrate);
        }
        j.b("StrategyHelper", "[GearStrategy]StrategyHelper.selectResolution result invalid retString=".concat(String.valueOf(selectBitrate)));
        return null;
    }
}
