package com.ss.android.ad.splash.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.ss.android.ad.splash.core.f;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.core.k;
import com.ss.android.ad.splash.core.l;
import com.ss.android.ad.splash.f.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f58264a = true;

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f58265e;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f58266b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f58267c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f58268d;

    private a() {
    }

    static {
        Covode.recordClassIndex(36201);
    }

    private boolean c() {
        if (!this.f58266b || !f58264a) {
            return false;
        }
        return true;
    }

    public static a a() {
        MethodCollector.i(4093);
        if (f58265e == null) {
            synchronized (a.class) {
                try {
                    if (f58265e == null) {
                        f58265e = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4093);
                    throw th;
                }
            }
        }
        a aVar = f58265e;
        MethodCollector.o(4093);
        return aVar;
    }

    public static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (h.b() == null) {
                return jSONObject;
            }
            String c2 = h.b().c();
            jSONObject.put("device_id", h.j());
            jSONObject.put("app_version", "2.0.7-rc.6");
            jSONObject.put("channel", c2);
            jSONObject.put("update_version_code", h.f58572a);
            jSONObject.put("package_name", h.r.getPackageName());
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static boolean d() {
        boolean z;
        f b2 = h.b();
        if (b2 == null) {
            return false;
        }
        String c2 = b2.c();
        String j2 = h.j();
        String a2 = b2.a();
        if (TextUtils.isEmpty(c2) || TextUtils.isEmpty(j2) || TextUtils.isEmpty(a2)) {
            z = false;
        } else {
            z = true;
        }
        Context applicationContext = h.r.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
            if (applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return z;
        }
        if (applicationContext == null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putOpt("log_extra", k.a().f58667l);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
                jSONObject.putOpt("is_ad_event", "1");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            h.a(84378473382L, "splash_ad", "context_npe", jSONObject);
            return false;
        }
        return z;
    }

    public final synchronized void a(final l lVar) {
        MethodCollector.i(4194);
        if (!c()) {
            MethodCollector.o(4194);
        } else if (h.b() == null || h.f58579h == null) {
            a(lVar, false);
            MethodCollector.o(4194);
        } else if (!d()) {
            this.f58267c = false;
            a(lVar, false);
            MethodCollector.o(4194);
        } else if (this.f58267c) {
            a(lVar, true);
            MethodCollector.o(4194);
        } else if (this.f58268d <= 5) {
            com.ss.android.ad.splash.core.h.a a2 = com.ss.android.ad.splash.core.h.a.a();
            AnonymousClass1 r2 = new Runnable() {
                /* class com.ss.android.ad.splash.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36202);
                }

                public final void run() {
                    try {
                        if (!a.this.f58267c) {
                            h.aq.a("1385", a.b());
                        }
                        a.this.f58267c = true;
                        a.this.f58268d = 0;
                        a.a(lVar, true);
                    } catch (Throwable th) {
                        if ((th instanceof ClassNotFoundException) || (th instanceof NoClassDefFoundError)) {
                            com.ss.android.ad.splash.f.a.a(0, " no sdk monitor ");
                            a.f58264a = false;
                        }
                        a.this.f58267c = false;
                        a.a(lVar, false);
                        a.this.f58268d++;
                        th.getMessage();
                        g.a();
                    }
                }
            };
            if (a2.f58596a == null) {
                l.a a3 = com.ss.android.ugc.aweme.cw.l.a(o.FIXED);
                a3.f79174c = 2;
                a2.f58596a = com.ss.android.ugc.aweme.cw.g.a(a3.a());
            }
            a2.f58596a.submit(r2);
            MethodCollector.o(4194);
        } else {
            a(lVar, false);
            MethodCollector.o(4194);
        }
    }

    public static void a(com.ss.android.ad.splash.core.l lVar, boolean z) {
        if (lVar != null) {
            if (z) {
                lVar.a();
            } else {
                lVar.b();
            }
        }
    }

    public final void a(Exception exc, String str) {
        if (c()) {
            try {
                String message = exc.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, message);
                    a("service_ad_exception", (JSONObject) null, jSONObject);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(final String str, final JSONObject jSONObject) {
        if (c()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.ss.android.ad.splash.b.a.AnonymousClass2 */

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f58272b = 0;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ JSONObject f58274d;

                static {
                    Covode.recordClassIndex(36203);
                }

                public final void run() {
                    a.this.a(str, this.f58272b, jSONObject, this.f58274d);
                }

                {
                    this.f58274d = null;
                }
            }, 5000);
        }
    }

    public final void a(final String str, int i2, final JSONObject jSONObject) {
        if (c()) {
            if (!this.f58267c) {
                a(new com.ss.android.ad.splash.core.l() {
                    /* class com.ss.android.ad.splash.b.a.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(36205);
                    }

                    @Override // com.ss.android.ad.splash.core.l
                    public final void b() {
                    }

                    @Override // com.ss.android.ad.splash.core.l
                    public final void a() {
                        SDKMonitorUtils.a("1385").a(str, 1, jSONObject);
                    }
                });
            } else {
                SDKMonitorUtils.a("1385").a(str, i2, jSONObject);
            }
        }
    }

    public final void a(final String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (c()) {
            if (!this.f58267c) {
                a(new com.ss.android.ad.splash.core.l() {
                    /* class com.ss.android.ad.splash.b.a.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(36206);
                    }

                    @Override // com.ss.android.ad.splash.core.l
                    public final void b() {
                    }

                    @Override // com.ss.android.ad.splash.core.l
                    public final void a() {
                        SDKMonitorUtils.a("1385").a(str, jSONObject, jSONObject2);
                    }
                });
            } else {
                SDKMonitorUtils.a("1385").a(str, jSONObject, jSONObject2);
            }
        }
    }

    public final void a(final String str, int i2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (c()) {
            if (!this.f58267c) {
                a(new com.ss.android.ad.splash.core.l() {
                    /* class com.ss.android.ad.splash.b.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(36204);
                    }

                    @Override // com.ss.android.ad.splash.core.l
                    public final void b() {
                    }

                    @Override // com.ss.android.ad.splash.core.l
                    public final void a() {
                        SDKMonitorUtils.a("1385").a(str, 1, jSONObject, jSONObject2);
                    }
                });
            } else {
                SDKMonitorUtils.a("1385").a(str, i2, jSONObject, jSONObject2);
            }
        }
    }
}
