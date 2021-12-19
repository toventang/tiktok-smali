package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.GraphRequest;
import com.facebook.m;
import com.ss.android.ugc.aweme.bf.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f48631a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static Long f48632b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f48633c = p.class.getCanonicalName();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentLinkedQueue<a> f48634d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, JSONObject> f48635e = new ConcurrentHashMap();

    public interface a {
        static {
            Covode.recordClassIndex(29340);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(29337);
    }

    public static void a() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f48634d;
            if (!concurrentLinkedQueue.isEmpty()) {
                final a poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new Runnable() {
                        /* class com.facebook.internal.p.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(29339);
                        }

                        public final void run() {
                            if (!com.facebook.internal.a.b.a.a(this)) {
                                try {
                                    poll.a();
                                } catch (Throwable th) {
                                    com.facebook.internal.a.b.a.a(th, this);
                                }
                            }
                        }
                    });
                }
            } else {
                return;
            }
        }
    }

    static JSONObject a(String str) {
        JSONObject b2 = b(str);
        if (b2 == null) {
            return null;
        }
        ae.a();
        Context context = m.f48921g;
        d.a(context, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(com.a.a("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str}), b2.toString()).apply();
        return a(str, b2);
    }

    public static JSONObject b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", "9.0.0");
        bundle.putString("fields", "gatekeepers");
        GraphRequest a2 = GraphRequest.a(com.a.a("%s/%s", new Object[]{str, "mobile_sdk_gk"}));
        a2.n = true;
        a2.f46548j = bundle;
        return GraphRequest.a(a2).f49017b;
    }

    private static Map<String, Boolean> c(String str) {
        a((a) null);
        if (str != null) {
            Map<String, JSONObject> map = f48635e;
            if (map.containsKey(str)) {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    return new HashMap();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                return hashMap;
            }
        }
        return new HashMap();
    }

    static synchronized void a(a aVar) {
        synchronized (p.class) {
            MethodCollector.i(944);
            if (aVar != null) {
                f48634d.add(aVar);
            }
            Long l2 = f48632b;
            if (l2 == null || System.currentTimeMillis() - l2.longValue() >= 3600000) {
                ae.a();
                final Context context = m.f48921g;
                ae.a();
                final String str = m.f48915a;
                final String a2 = com.a.a("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str});
                if (context == null) {
                    MethodCollector.o(944);
                    return;
                }
                String string = d.a(context, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(a2, null);
                if (!ad.a(string)) {
                    try {
                        a(str, new JSONObject(string));
                    } catch (JSONException e2) {
                        ad.a("FacebookSDK", (Exception) e2);
                    }
                }
                Executor c2 = m.c();
                if (c2 == null) {
                    MethodCollector.o(944);
                } else if (!f48631a.compareAndSet(false, true)) {
                    MethodCollector.o(944);
                } else {
                    c2.execute(new Runnable() {
                        /* class com.facebook.internal.p.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(29338);
                        }

                        public final void run() {
                            if (!com.facebook.internal.a.b.a.a(this)) {
                                try {
                                    JSONObject b2 = p.b(str);
                                    if (b2 != null) {
                                        p.a(str, b2);
                                        d.a(context, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(a2, b2.toString()).apply();
                                        p.f48632b = Long.valueOf(System.currentTimeMillis());
                                    }
                                    p.a();
                                    p.f48631a.set(false);
                                } catch (Throwable th) {
                                    com.facebook.internal.a.b.a.a(th, this);
                                }
                            }
                        }
                    });
                    MethodCollector.o(944);
                }
            } else {
                a();
                MethodCollector.o(944);
            }
        }
    }

    protected static synchronized JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (p.class) {
            MethodCollector.i(1126);
            Map<String, JSONObject> map = f48635e;
            if (map.containsKey(str)) {
                jSONObject2 = map.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i2);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException e2) {
                        ad.a("FacebookSDK", (Exception) e2);
                    }
                }
            }
            f48635e.put(str, jSONObject2);
            MethodCollector.o(1126);
        }
        return jSONObject2;
    }

    public static boolean a(String str, String str2, boolean z) {
        Boolean bool;
        Map<String, Boolean> c2 = c(str2);
        if (c2.containsKey(str) && (bool = c2.get(str)) != null) {
            return bool.booleanValue();
        }
        return z;
    }
}
