package com.ss.ttvideoengine.f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.ap;
import com.ss.ttvideoengine.d.d;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.k.h;
import com.ss.ttvideoengine.k.k;
import com.ss.ttvideoengine.s.c;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Future;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public p f152543a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f152544b;

    /* renamed from: c  reason: collision with root package name */
    public int f152545c;

    /* renamed from: d  reason: collision with root package name */
    public String f152546d = "";

    /* renamed from: e  reason: collision with root package name */
    public a f152547e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap<String, w> f152548f;

    /* renamed from: g  reason: collision with root package name */
    public String f152549g;

    /* renamed from: h  reason: collision with root package name */
    public int f152550h = -1;

    /* renamed from: i  reason: collision with root package name */
    private Handler f152551i;

    /* renamed from: j  reason: collision with root package name */
    private int f152552j;

    /* renamed from: k  reason: collision with root package name */
    private String f152553k;

    /* renamed from: l  reason: collision with root package name */
    private String f152554l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f152555m;
    private k n;
    private int o;
    private boolean p;
    private String q;
    private Future r;
    private String s;
    private long t;
    private Context u;
    private boolean v;
    private boolean w = true;
    private String[] x = {"device_type", "device_id", "ac", "aid", "device_platform", "ab_version", "app_name", "version_code", "os_version", "menifest_version_code", "update_version_code", "user_id", "web_id", "player_version", "barragemask"};
    private String[] y = {"Action", "Version", "video_id", "codec_type", "base64", "url_type", "format_type", "ptoken", "preload", "cdn_type"};

    public interface a {
        static {
            Covode.recordClassIndex(101583);
        }

        void a(int i2, String str);

        void a(p pVar, c cVar);

        void a(c cVar);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(101579);
    }

    private void b() {
        if (this.v && (TextUtils.isEmpty(this.f152546d) || !h.b(this.u))) {
            j.a("VideoInfoFetcher", "get videomodel from DB");
            com.ss.ttvideoengine.s.b.a(new Runnable() {
                /* class com.ss.ttvideoengine.f.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101580);
                }

                public final void run() {
                    d.a a2 = d.a(e.this.f152549g);
                    if (a2 != null && !TextUtils.isEmpty(a2.f152420b)) {
                        try {
                            JSONObject jSONObject = new JSONObject(a2.f152420b);
                            j.a("VideoInfoFetcher", "using videomodel from DB");
                            e.this.a(jSONObject, a2);
                            return;
                        } catch (Exception e2) {
                            j.e("VideoInfoFetcher", e2.toString());
                        }
                    }
                    if (TextUtils.isEmpty(e.this.f152546d)) {
                        e.this.b(new c("kTTVideoErrorDomainFetchingInfo", -9999, "apistring empty and no cache"));
                        return;
                    }
                    e eVar = e.this;
                    eVar.a(eVar.f152546d);
                }
            });
        } else if (TextUtils.isEmpty(this.f152546d)) {
            b(new c("kTTVideoErrorDomainFetchingInfo", -9999, "apistring empty"));
        } else {
            a(this.f152546d);
        }
    }

    public final void a() {
        MethodCollector.i(12485);
        synchronized (this) {
            try {
                this.f152551i.removeCallbacksAndMessages(null);
                a aVar = this.f152547e;
                if (aVar != null) {
                    aVar.a("fetcher cancelled");
                    if (this.f152544b) {
                        MethodCollector.o(12485);
                        return;
                    }
                    this.f152544b = true;
                    Future future = this.r;
                    if (future != null) {
                        future.cancel(true);
                    }
                    this.n.a();
                    MethodCollector.o(12485);
                }
            } finally {
                MethodCollector.o(12485);
            }
        }
    }

    public final void a(Boolean bool) {
        this.f152555m = bool.booleanValue();
    }

    private void c(c cVar) {
        this.f152551i.sendMessage(this.f152551i.obtainMessage(0, cVar));
    }

    public final void a(boolean z) {
        this.v = z;
        if (z) {
            d.a(this.u);
        }
    }

    public final void b(c cVar) {
        j.a("VideoInfoFetcher", "_notifyError ".concat(String.valueOf(cVar)));
        this.f152551i.sendMessage(this.f152551i.obtainMessage(1, cVar));
    }

    static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<e> f152559a;

        static {
            Covode.recordClassIndex(101584);
        }

        public final void handleMessage(Message message) {
            a aVar;
            e eVar = this.f152559a.get();
            if (eVar != null && (aVar = eVar.f152547e) != null) {
                if (eVar.f152544b) {
                    aVar.a("fetcher is cancelled");
                    return;
                }
                int i2 = message.what;
                if (i2 == 0) {
                    aVar.a((c) message.obj);
                } else if (i2 == 1) {
                    aVar.a((p) null, (c) message.obj);
                } else if (i2 == 2) {
                    p pVar = (p) message.obj;
                    eVar.f152543a = pVar;
                    aVar.a(pVar, (c) null);
                } else if (i2 == 3) {
                    aVar.a(message.arg1, (String) message.obj);
                }
            }
        }

        public b(e eVar, Looper looper) {
            super(looper);
            this.f152559a = new WeakReference<>(eVar);
        }
    }

    public final void a(c cVar) {
        MethodCollector.i(12605);
        j.a("VideoInfoFetcher", "_retryIfNeeded error ".concat(String.valueOf(cVar)));
        synchronized (this) {
            try {
                if (!this.f152544b) {
                    if (cVar == null) {
                        cVar = new c("kTTVideoErrorDomainFetchingInfo", -9994);
                    } else if (TextUtils.isEmpty(cVar.f153262c) && cVar.f153260a == -9979) {
                        cVar = new c("kTTVideoErrorDomainFetchingInfo", -9979, cVar.f153261b, cVar.f153263d);
                    } else if (TextUtils.isEmpty(cVar.f153262c)) {
                        cVar = new c("kTTVideoErrorDomainFetchingInfo", -9994, cVar.f153261b, cVar.f153263d);
                    }
                    if (cVar.f153260a == -9969) {
                        if (!(cVar.f153261b / 10000 == 10 || cVar.f153261b == -9970)) {
                            cVar.f153260a = -9990;
                        }
                        cVar.f153263d += ("<apiStr:" + this.f152546d + ">");
                        b(cVar);
                        MethodCollector.o(12605);
                        return;
                    }
                    if (this.f152552j <= 0) {
                        c(cVar);
                        this.f152552j++;
                        b();
                    } else {
                        cVar.f153263d += ("<apiStr:" + this.f152546d + ">");
                        b(cVar);
                    }
                    MethodCollector.o(12605);
                }
            } finally {
                MethodCollector.o(12605);
            }
        }
    }

    public final void a(String str) {
        HashMap hashMap;
        j.a("VideoInfoFetcher", "_beginToFetch url ".concat(String.valueOf(str)));
        this.t = SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty(this.f152554l)) {
            hashMap = new HashMap();
            hashMap.put("Authorization", this.f152554l);
        } else {
            hashMap = null;
        }
        Method[] declaredMethods = this.n.getClass().getDeclaredMethods();
        if (declaredMethods != null && declaredMethods.length > 0) {
            for (Method method : declaredMethods) {
                if (method != null && method.getName() != null && method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                    this.n.a(str, hashMap, new k.a() {
                        /* class com.ss.ttvideoengine.f.e.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(101581);
                        }

                        @Override // com.ss.ttvideoengine.k.k.a
                        public final void a(JSONObject jSONObject, c cVar) {
                            if (jSONObject == null) {
                                if (cVar != null) {
                                    e.this.a(cVar);
                                    return;
                                }
                            } else if (cVar != null) {
                                e.this.f152550h = cVar.f153261b;
                            }
                            e.this.a(jSONObject, (d.a) null);
                        }
                    });
                    return;
                }
            }
        }
        this.n.b(str, hashMap, new k.a() {
            /* class com.ss.ttvideoengine.f.e.AnonymousClass3 */

            static {
                Covode.recordClassIndex(101582);
            }

            @Override // com.ss.ttvideoengine.k.k.a
            public final void a(JSONObject jSONObject, c cVar) {
                if (jSONObject != null || cVar == null) {
                    e.this.a(jSONObject, (d.a) null);
                } else {
                    e.this.a(cVar);
                }
            }
        });
    }

    private void a(int i2, String str) {
        j.a("VideoInfoFetcher", "_notifyException " + i2 + ", excMessage " + str);
        this.f152551i.sendMessage(this.f152551i.obtainMessage(3, i2, 0, str));
    }

    public e(Context context, k kVar) {
        k kVar2 = kVar;
        this.u = context;
        this.f152551i = new b(this, i.a());
        if (kVar2 == null) {
            kVar2 = ap.f152260b != null ? ap.f152260b : kVar2;
            this.p = false;
            this.n = new com.ss.ttvideoengine.k.j();
            this.s = "";
        }
        if (kVar2 != null) {
            this.p = true;
            this.n = kVar2;
            this.s = "";
        }
        this.p = false;
        this.n = new com.ss.ttvideoengine.k.j();
        this.s = "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x024d, code lost:
        if (1 == 0) goto L_0x01c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r12, com.ss.ttvideoengine.d.d.a r13) {
        /*
        // Method dump skipped, instructions count: 697
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.f.e.a(org.json.JSONObject, com.ss.ttvideoengine.d.d$a):void");
    }

    public final void a(String str, String str2, int i2) {
        a(str, str2, i2, null);
    }

    public e(Context context, k kVar, String str) {
        k kVar2 = kVar;
        this.u = context;
        this.f152551i = new b(this, i.a());
        if (kVar2 == null) {
            kVar2 = ap.f152260b != null ? ap.f152260b : kVar2;
            this.p = false;
            this.n = new com.ss.ttvideoengine.k.j();
            this.s = str;
        }
        if (kVar2 != null) {
            this.p = true;
            this.n = kVar2;
            this.s = str;
        }
        this.p = false;
        this.n = new com.ss.ttvideoengine.k.j();
        this.s = str;
    }

    public final void a(String str, String str2, int i2, String str3) {
        j.a("VideoInfoFetcher", "fetchInfo apiString " + str + ", auth " + str2 + ", playversion " + i2 + ", keyseed " + str3);
        this.f152546d = str;
        this.f152554l = str2;
        this.f152552j = 0;
        this.o = i2;
        this.f152553k = str3;
        try {
            this.q = new URL(str).getHost();
        } catch (Throwable unused) {
        }
        b();
    }
}
