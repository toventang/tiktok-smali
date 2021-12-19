package com.ss.android.ad.splash.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.a.a;
import com.ss.android.ad.splash.aa;
import com.ss.android.ad.splash.b;
import com.ss.android.ad.splash.c.c;
import com.ss.android.ad.splash.core.i.a;
import com.ss.android.ad.splash.d.d;
import com.ss.android.ad.splash.e;
import com.ss.android.ad.splash.f;
import com.ss.android.ad.splash.f.n;
import com.ss.android.ad.splash.g;
import com.ss.android.ad.splash.k;
import com.ss.android.ad.splash.m;
import com.ss.android.ad.splash.t;
import com.ss.android.ad.splash.w;
import com.ss.android.ad.splash.x;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public class h {
    static int A;
    public static int B;
    public static int C;
    public static boolean D = true;
    public static volatile boolean E = false;
    public static volatile boolean F = false;
    static volatile String G;
    static volatile String H;
    public static volatile String I;
    static volatile long J = 864000000;
    static volatile boolean K = true;
    public static t L;
    public static int M = 0;
    static int N = 0;
    static int O = 0;
    public static boolean P = false;
    static boolean Q = false;
    public static volatile d R;
    public static int S;
    static boolean T = true;
    public static c U;
    static boolean V = false;
    static volatile Future W;
    public static int X = -1;
    public static boolean Y = true;
    static boolean Z = false;

    /* renamed from: a  reason: collision with root package name */
    public static final String f58572a = "200716";
    static boolean aa = false;
    public static long ab = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    public static long ac = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    public static boolean ad = false;
    public static boolean ae = true;
    static boolean af = false;
    static boolean ag = false;
    static g ah;
    static boolean ai = false;
    public static boolean aj = false;
    public static boolean ak = false;
    static a al;
    public static com.ss.android.ad.splash.d am;
    static com.ss.android.ad.splash.c an;
    static f ao;
    public static int ap = 0;
    public static k aq;
    static boolean ar = false;
    static boolean as = false;
    static w at;
    private static Handler au = new Handler(Looper.getMainLooper());
    private static boolean av = false;

    /* renamed from: b  reason: collision with root package name */
    public static m f58573b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile aa f58574c;

    /* renamed from: d  reason: collision with root package name */
    static w f58575d;

    /* renamed from: e  reason: collision with root package name */
    static x f58576e;

    /* renamed from: f  reason: collision with root package name */
    public static ExecutorService f58577f;

    /* renamed from: g  reason: collision with root package name */
    static ExecutorService f58578g;

    /* renamed from: h  reason: collision with root package name */
    public static ExecutorService f58579h;

    /* renamed from: i  reason: collision with root package name */
    public static ExecutorService f58580i;

    /* renamed from: j  reason: collision with root package name */
    static long f58581j;

    /* renamed from: k  reason: collision with root package name */
    static boolean f58582k = false;

    /* renamed from: l  reason: collision with root package name */
    static ConcurrentHashMap<Long, Integer> f58583l;

    /* renamed from: m  reason: collision with root package name */
    public static volatile boolean f58584m = false;
    static long n;
    static f o;
    static HashMap<String, String> p;
    static b q;
    public static Context r;
    public static boolean s = false;
    static com.ss.android.ad.splash.core.i.b t;
    public static e u;
    public static int v;
    public static int w;
    static boolean x = true;
    public static int y;
    static int z;

    public static ExecutorService d() {
        return f58580i;
    }

    public static w a() {
        if (at == null) {
            at = w.a(null);
        }
        return at;
    }

    public static f b() {
        if (o == null) {
            o = new f();
        }
        return o;
    }

    public static com.ss.android.ad.splash.c c() {
        if (an == null) {
            an = new com.ss.android.ad.splash.c() {
                /* class com.ss.android.ad.splash.core.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36323);
                }
            };
        }
        return an;
    }

    public static a h() {
        if (al == null) {
            al = new a.C1286a();
        }
        return al;
    }

    public static void k() {
        com.ss.android.ad.splash.f.g.b("UDPClient. setIsFirstTimeRequestAd: false");
        T = false;
    }

    public static String e() {
        if (!a().f58911c) {
            return f();
        }
        String str = G;
        if (TextUtils.isEmpty(str)) {
            str = l();
        }
        return a(str);
    }

    public static String f() {
        if (TextUtils.isEmpty(H)) {
            return a(l());
        }
        return a(H);
    }

    public static HashMap<String, String> i() {
        b bVar;
        if (p == null && (bVar = q) != null) {
            p = bVar.a();
        }
        return p;
    }

    public static String j() {
        String str;
        f fVar = o;
        if (fVar != null) {
            str = fVar.d();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return v.a().f58720b.getString("splash_ad_did", "");
        }
        return str;
    }

    private static String l() {
        return b(r).getAbsolutePath() + "/splashCache/";
    }

    public static com.ss.android.ad.splash.core.i.b g() {
        MethodCollector.i(5227);
        if (t == null) {
            synchronized (h.class) {
                try {
                    if (t == null) {
                        t = new com.ss.android.ad.splash.core.i.e(r, new com.ss.android.ad.splash.core.i.h(r));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5227);
                    throw th;
                }
            }
        }
        com.ss.android.ad.splash.core.i.b bVar = t;
        MethodCollector.o(5227);
        return bVar;
    }

    static {
        Covode.recordClassIndex(36322);
    }

    public static void a(int i2) {
        ap = i2 | ap;
    }

    private static String a(String str) {
        if (str.endsWith(File.separator)) {
            return str;
        }
        return str + File.separator;
    }

    private static File b(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    public static void a(long j2) {
        f58583l.remove(Long.valueOf(j2));
    }

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        r = applicationContext;
    }

    public static void a(g gVar) {
        if (o == null) {
            o = new f();
        }
        ah = gVar;
    }

    public static void a(final long j2, final String str, final String str2, final JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            long optLong = jSONObject.optLong("ad_fetch_time", 0);
            if (optLong != 0) {
                try {
                    optJSONObject.putOpt("ad_fetch_time", Long.valueOf(optLong));
                } catch (JSONException unused) {
                    com.ss.android.ad.splash.f.g.a("error in transferring ad fetch time");
                }
            }
            optJSONObject.putOpt("current_time", n.a(System.currentTimeMillis()));
            jSONObject.putOpt("ad_extra_data", optJSONObject);
            jSONObject.put("is_ad_event", "1");
            if (!av) {
                jSONObject.put("category", "event_v1");
            }
        }
        if (av) {
            a.C1283a aVar = new a.C1283a();
            aVar.f58263g = jSONObject;
            aVar.f58260d = j2;
            aVar.f58259c = str2;
            aVar.f58258b = str;
            aVar.f58257a = "event_v3";
            final com.ss.android.ad.splash.a.a a2 = aVar.a();
            if (a().f58914f) {
                f58579h.execute(new Runnable() {
                    /* class com.ss.android.ad.splash.core.h.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(36324);
                    }

                    public final void run() {
                    }
                });
            } else {
                au.post(new Runnable() {
                    /* class com.ss.android.ad.splash.core.h.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(36325);
                    }

                    public final void run() {
                    }
                });
            }
        } else if (a().f58914f) {
            f58579h.execute(new Runnable() {
                /* class com.ss.android.ad.splash.core.h.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(36326);
                }

                public final void run() {
                    if (h.f58573b != null) {
                        h.f58573b.a(str, str2, j2, jSONObject);
                    }
                }
            });
        } else {
            au.post(new Runnable() {
                /* class com.ss.android.ad.splash.core.h.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(36327);
                }

                public final void run() {
                    if (h.f58573b != null) {
                        h.f58573b.a(str, str2, j2, jSONObject);
                    }
                }
            });
        }
    }
}
