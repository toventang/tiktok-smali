package com.bytedance.crash.j;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.i;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.d;
import com.bytedance.crash.runtime.n;
import com.bytedance.crash.util.b;
import com.bytedance.crash.util.u;
import com.bytedance.crash.util.v;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Runnable f27611a = new Runnable() {
        /* class com.bytedance.crash.j.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16211);
        }

        public final void run() {
            if (a.f27612b > 0) {
                a.f27612b--;
                v.a("try fetchApmConfig");
                if (b.b(m.f27724a)) {
                    try {
                        IConfigManager d2 = a.d();
                        if (d2 != null) {
                            JSONObject jSONObject = new JSONObject(d2.queryConfig());
                            a.f27612b = 0;
                            com.bytedance.crash.runtime.b.a(a.a(d.a(m.a()), jSONObject), true);
                            v.a("success fetchApmConfig");
                        }
                    } catch (JSONException unused) {
                    } catch (Throwable unused2) {
                        a.f27612b = 0;
                    }
                } else {
                    m.a();
                    if (m.f27710a) {
                        a.f27612b = 0;
                    }
                }
            }
            if (a.f27612b <= 0) {
                return;
            }
            if (b.b(m.f27724a)) {
                n.b().a(a.f27611a, 15000);
            } else {
                n.b().a(a.f27611a, 60000);
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static int f27612b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f27613c = false;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f27614d = false;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f27615e = true;

    /* renamed from: f  reason: collision with root package name */
    private static IConfigManager f27616f = null;

    public static void a() {
        f27612b = 40;
        n.b().a(f27611a);
    }

    static {
        Covode.recordClassIndex(16210);
    }

    public static boolean c() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        AnonymousClass2 r2 = new Runnable() {
            /* class com.bytedance.crash.j.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(16212);
            }

            public final void run() {
                byte[] b2 = a.b();
                if (b2 != null && b2.length > 0) {
                    try {
                        a.f27613c = new JSONObject(new String(b2)).optBoolean("should_upload");
                    } catch (Throwable unused) {
                    }
                    countDownLatch.countDown();
                }
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            try {
                new Thread(r2).start();
            } catch (Throwable unused) {
            }
            try {
                countDownLatch.await(3000, TimeUnit.MILLISECONDS);
            } catch (Throwable unused2) {
            }
        } else {
            r2.run();
        }
        return f27613c;
    }

    public static IConfigManager d() {
        if (f27615e && f27616f == null) {
            try {
                f27616f = (IConfigManager) c.a(IConfigManager.class);
            } catch (Throwable unused) {
                f27615e = false;
            }
            IConfigManager iConfigManager = f27616f;
            if (iConfigManager != null) {
                iConfigManager.registerConfigListener(new com.bytedance.services.slardar.config.a() {
                    /* class com.bytedance.crash.j.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(16213);
                    }

                    @Override // com.bytedance.services.slardar.config.a
                    public final void a(JSONObject jSONObject, boolean z) {
                    }

                    @Override // com.bytedance.services.slardar.config.a
                    public final void d() {
                        a.f27614d = true;
                    }
                });
            }
        }
        if (!f27615e || !f27614d) {
            return null;
        }
        return f27616f;
    }

    public static byte[] b() {
        try {
            String uploadCheckCoreDumpUrl = m.f27730g.getUploadCheckCoreDumpUrl();
            m.a();
            return f.a(uploadCheckCoreDumpUrl, d.a(m.a().f27905a.getCommonParams(), "aid", "4444", "crash", "1", "os", "Android", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0", "device_id", m.b().a()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(Object obj) {
        byte[] b2;
        if (m.a(com.bytedance.crash.entity.c.c(obj)) && u.b(m.f27724a) && (b2 = b(obj)) != null) {
            try {
                com.bytedance.crash.runtime.b.a(a(com.bytedance.crash.entity.c.c(obj), new JSONObject(new String(b2)).optJSONObject("ret")), true);
                v.a("success fetchAidConfig net");
            } catch (Throwable unused) {
            }
        }
    }

    private static byte[] b(Object obj) {
        JSONObject jSONObject;
        try {
            String apmConfigUrl = m.f27730g.getApmConfigUrl();
            Iterator<i> it = com.bytedance.crash.entity.c.f27559a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jSONObject = null;
                    break;
                }
                i next = it.next();
                if (next != null && next.a(obj)) {
                    jSONObject = next.a();
                    break;
                }
            }
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    hashMap.put(next2, jSONObject.opt(next2));
                }
            }
            return f.a(apmConfigUrl, d.a(hashMap, "aid", "4444", "crash", "npth", "os", "Android", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0", "device_id", m.b().a()));
        } catch (Throwable unused) {
            return null;
        }
    }

    static JSONArray a(String str, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(str, jSONObject);
            jSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}
