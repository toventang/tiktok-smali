package com.bytedance.y;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: d  reason: collision with root package name */
    private static f f46192d;

    /* renamed from: a  reason: collision with root package name */
    public Context f46193a = null;

    /* renamed from: b  reason: collision with root package name */
    public b f46194b = null;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, g> f46195c;

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantReadWriteLock f46196e = new ReentrantReadWriteLock();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<Object> f46197f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private boolean f46198g = true;

    /* renamed from: h  reason: collision with root package name */
    private long f46199h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f46200i = 600;

    /* renamed from: j  reason: collision with root package name */
    private long f46201j = 0;

    /* renamed from: k  reason: collision with root package name */
    private Timer f46202k = null;

    /* renamed from: l  reason: collision with root package name */
    private TimerTask f46203l = null;

    /* renamed from: m  reason: collision with root package name */
    private final long f46204m = 0;

    static {
        Covode.recordClassIndex(28240);
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            MethodCollector.i(1561);
            if (f46192d == null) {
                f46192d = new f();
            }
            fVar = f46192d;
            MethodCollector.o(1561);
        }
        return fVar;
    }

    private void b() {
        this.f46196e.readLock().lock();
        Iterator<Object> it = this.f46197f.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.f46196e.readLock().unlock();
    }

    private f() {
        HashMap<String, g> hashMap = new HashMap<>();
        this.f46195c = hashMap;
        hashMap.put("vod", new g("vod", 3));
        hashMap.put("mdl", new g("mdl", 3));
        hashMap.put("upload", new g("upload", 3));
        hashMap.put("common", new g("common", 2));
    }

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final void b(String str) {
        b bVar = this.f46194b;
        if (bVar != null) {
            bVar.f46177d = 0;
            bVar.a(str, null);
        }
    }

    public final void c(String str) {
        g gVar = this.f46195c.get(str);
        if (!gVar.a(a(this.f46193a))) {
            return;
        }
        if (this.f46198g) {
            b();
        } else {
            gVar.a();
        }
    }

    public final synchronized void a(long j2) {
        long j3 = j2;
        synchronized (this) {
            MethodCollector.i(1717);
            TimerTask timerTask = this.f46203l;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.f46203l = new TimerTask() {
                /* class com.bytedance.y.f.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(28243);
                }

                public final void run() {
                    f.this.b("all");
                }
            };
            Timer timer = this.f46202k;
            if (timer != null) {
                timer.purge();
            } else {
                this.f46202k = new Timer(true);
            }
            if (j3 * 1000 < 1000) {
                j3 = 86400;
            }
            d.a("Manager", "reset schedule");
            try {
                long j4 = j3 * 1000;
                this.f46202k.schedule(this.f46203l, j4, j4);
                MethodCollector.o(1717);
            } catch (Throwable th) {
                d.b("Manager", "reset schedule fail. " + th.toString());
                MethodCollector.o(1717);
            }
        }
    }

    public final void a(final String str) {
        new Thread(new Runnable() {
            /* class com.bytedance.y.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(28242);
            }

            public final void run() {
                f.this.d(str);
            }
        }).start();
    }

    public final synchronized void d(String str) {
        MethodCollector.i(1712);
        if (this.f46199h < 1) {
            g gVar = this.f46195c.get("common");
            gVar.a(a(this.f46193a));
            boolean z = false;
            try {
                this.f46200i = gVar.b("fetch_interval", 0);
                this.f46201j = gVar.a("config_version");
                this.f46199h = gVar.a("local_cache_expire");
                if (gVar.b("use_local_cache", 1) > 0) {
                    z = true;
                }
                this.f46198g = z;
            } catch (Throwable th) {
                d.b("Manager", th.toString());
            }
            c("vod");
            c("mdl");
            c("upload");
        }
        b bVar = this.f46194b;
        if (bVar != null) {
            bVar.a(this.f46200i);
            this.f46194b.a(this.f46201j);
        }
        long currentTimeMillis = System.currentTimeMillis();
        d.a("Manager", "use cache: " + this.f46198g + ", expire = " + this.f46199h + ", curTimeMs = " + currentTimeMillis);
        if (!this.f46198g || this.f46199h <= currentTimeMillis) {
            b(str);
        }
        a((long) this.f46200i);
        MethodCollector.o(1712);
    }

    public class a implements c {

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<f> f46211b;

        static {
            Covode.recordClassIndex(28244);
        }

        public a(f fVar) {
            this.f46211b = new WeakReference<>(fVar);
        }

        @Override // com.bytedance.y.c
        public final void a(int i2, String str) {
            a(i2, str, null, null, null);
        }

        @Override // com.bytedance.y.c
        public final void a(int i2, String str, JSONObject jSONObject, String str2, String str3) {
            f fVar = this.f46211b.get();
            if (fVar != null) {
                d.a("Manager", "refresh settings: code " + i2 + ", message = " + str);
                if (i2 != 0) {
                    d.b("Manager", "refresh data fail. code = ".concat(String.valueOf(i2)));
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("general_settings");
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("config_version");
                    fVar.f46194b.a(optLong);
                    g gVar = f.this.f46195c.get("common");
                    gVar.a("config_version", optLong);
                    int optInt = optJSONObject.optInt("fetch_interval");
                    if (optInt > 0 && optInt != gVar.b("fetch_interval", -1)) {
                        gVar.a("fetch_interval", optInt);
                        fVar.f46194b.a(optInt);
                        f.this.a((long) optInt);
                    }
                    long optLong2 = optJSONObject.optLong("local_cache_expire");
                    if (optLong2 > 0) {
                        gVar.a("local_cache_expire", System.currentTimeMillis() + (optLong2 * 1000));
                    }
                    boolean optBoolean = optJSONObject.optBoolean("use_local_cache");
                    gVar.a("use_local_cache", optBoolean ? 1 : 0);
                    if (!optBoolean) {
                        f.this.f46195c.get("vod").a();
                        f.this.f46195c.get("mdl").a();
                        f.this.f46195c.get("upload").a();
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("custom_settings");
                if (optJSONObject2 == null) {
                    return;
                }
                if (str2 == null || str2.equals("all")) {
                    f.this.a("vod", str3, optJSONObject2.optJSONObject("vod"));
                    f.this.a("mdl", str3, optJSONObject2.optJSONObject("mdl"));
                    f.this.a("upload", str3, optJSONObject2.optJSONObject("upload"));
                    return;
                }
                f.this.a(str2, str3, optJSONObject2.optJSONObject(str2));
            }
        }
    }

    public final int a(String str, String str2, int i2) {
        return this.f46195c.get(str).b(str2, i2);
    }

    public final void a(String str, String str2, JSONObject jSONObject) {
        boolean z;
        if (jSONObject != null) {
            g gVar = this.f46195c.get(str);
            JSONObject b2 = gVar.b();
            if (b2 == null || !b2.toString().equals(jSONObject.toString())) {
                if (str2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                gVar.a(gVar.f46216e);
                gVar.f46212a.writeLock().lock();
                try {
                    if (gVar.f46213b != null) {
                        if (z) {
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                gVar.f46213b.putOpt(next, jSONObject.opt(next));
                                d.a("Storage", "update json, key = " + next + ", value = " + jSONObject.opt(next));
                            }
                            if ((gVar.f46214c & 2) > 0 && gVar.f46215d != null) {
                                SharedPreferences.Editor edit = gVar.f46215d.edit();
                                edit.putString(gVar.c(), gVar.f46213b.toString());
                                edit.apply();
                            }
                            gVar.f46212a.writeLock().unlock();
                            b();
                        }
                    }
                    gVar.f46213b = jSONObject;
                    SharedPreferences.Editor edit2 = gVar.f46215d.edit();
                    edit2.putString(gVar.c(), gVar.f46213b.toString());
                    edit2.apply();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    d.b("Storage", e2.toString());
                } catch (Throwable th) {
                    gVar.f46212a.writeLock().unlock();
                    throw th;
                }
                gVar.f46212a.writeLock().unlock();
                b();
            }
        }
    }
}
