package com.ss.android.token;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.a.a.b.j;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.a.d;
import com.bytedance.sdk.a.a.d.n;
import com.bytedance.sdk.a.a.e;
import com.bytedance.sdk.a.g.m;
import com.bytedance.sdk.a.i.a;
import com.bytedance.sdk.a.o.h;
import com.ss.android.token.AuthTokenMultiProcessSharedProvider;
import com.ss.android.token.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.zhiliaoapp.musically.R;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class f implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static f f61019a;

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f61020f;

    /* renamed from: j  reason: collision with root package name */
    static volatile boolean f61021j;
    private volatile boolean A;
    private volatile boolean B;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f61022b;

    /* renamed from: c  reason: collision with root package name */
    volatile String f61023c;

    /* renamed from: d  reason: collision with root package name */
    public b f61024d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f61025e;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f61026g;

    /* renamed from: h  reason: collision with root package name */
    protected e f61027h;

    /* renamed from: i  reason: collision with root package name */
    protected d f61028i;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f61029k = true;

    /* renamed from: l  reason: collision with root package name */
    public volatile JSONObject f61030l;

    /* renamed from: m  reason: collision with root package name */
    public AuthTokenMultiProcessSharedProvider.b f61031m;
    private volatile boolean n;
    private volatile boolean o;
    private volatile String p;
    private PrivateKey q;
    private Context r;
    private final int s = 1000;
    private final int t = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    private volatile int u;
    private j v;
    private final long w = 86400000;
    private final long x = 10000;
    private volatile boolean y = true;
    private volatile boolean z;

    static {
        Covode.recordClassIndex(37591);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        return this.y && g.a(str, this.f61024d.f61009b);
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private void b() {
        d("");
        this.n = false;
        AuthTokenMultiProcessSharedProvider.b bVar = this.f61031m;
        if (bVar != null) {
            bVar.a().a("X-Tt-Token", "").a();
        }
    }

    private static boolean d() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean c2 = c();
        com.ss.android.ugc.aweme.lancet.j.f107226e = c2;
        return c2;
    }

    public final String a() {
        if (f61021j) {
            return this.p;
        }
        return this.f61031m.a("X-Tt-Token", "");
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str) {
        b.a aVar;
        if (str == null || (aVar = this.f61024d.f61013f) == null) {
            return false;
        }
        return aVar.a();
    }

    public static String a(Object obj) {
        String obj2 = obj.toString();
        if (TextUtils.isEmpty(obj2)) {
            return "";
        }
        if (obj2.length() > 10) {
            return obj2.substring(0, 9) + "***" + obj2.substring(obj2.length() - 5);
        }
        return obj2;
    }

    private void d(String str) {
        this.p = str;
        com.ss.android.d.a("TokenFactory", "setToken token " + a((Object) str) + "    " + Log.getStackTraceString(new Exception()));
    }

    private void b(boolean z2) {
        if (f61021j && !this.f61022b) {
            this.f61022b = true;
            this.z = true;
            if (!d()) {
                this.u++;
                this.f61025e.sendEmptyMessageDelayed(1000, Math.min(((long) this.u) * 10000, this.f61024d.f61012e));
                this.f61022b = false;
                return;
            }
            d dVar = this.f61028i;
            if (dVar == null || !dVar.b()) {
                this.f61025e.sendEmptyMessageDelayed(1000, this.f61024d.f61012e);
                this.f61022b = false;
                return;
            }
            this.u = 0;
            final String a2 = a(z2, false);
            if (!TextUtils.isEmpty(a2)) {
                AnonymousClass1 r0 = new j() {
                    /* class com.ss.android.token.f.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37592);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                    @Override // com.bytedance.sdk.a.c
                    public final /* synthetic */ void e(n nVar) {
                        try {
                            f.this.f61022b = false;
                            f.this.f61025e.sendEmptyMessageDelayed(1000, f.this.f61024d.f61012e);
                            if (f.this.f61026g) {
                                f.this.f61026g = false;
                                if (f.this.f61031m != null) {
                                    f.this.f61031m.a().a("first_beat").a();
                                }
                            }
                        } catch (Exception e2) {
                            e.a(e2);
                        }
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[Catch:{ Exception -> 0x00b8 }] */
                    @Override // com.bytedance.sdk.a.c
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.n r6, int r7) {
                        /*
                        // Method dump skipped, instructions count: 189
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.token.f.AnonymousClass1.a(com.bytedance.sdk.a.a.a.b, int):void");
                    }
                };
                this.v = r0;
                a(a2, r0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> c(String str) {
        String str2;
        f fVar = f61019a;
        if (fVar == null || !fVar.a(str) || f61019a.b(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        boolean z2 = true;
        if (f61021j) {
            if (!TextUtils.isEmpty(f61019a.p)) {
                hashMap.put("X-Tt-Token", f61019a.a());
            }
            if (str.contains("passport")) {
                this.A = true;
            } else {
                if (!this.f61028i.b()) {
                    this.A = true;
                }
                this.B = true;
            }
            if (!TextUtils.isEmpty(f61019a.f61023c) && com.ss.android.account.f.a().d()) {
                hashMap.put("multi_login", "1");
                hashMap.put("x-tt-multi-sids", f61019a.f61023c);
            }
        } else {
            f fVar2 = f61019a;
            String str3 = "";
            if (fVar2 != null) {
                str2 = fVar2.f61031m.a("X-Tt-Token", str3);
            } else {
                str2 = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("X-Tt-Token", str2);
            }
            if (com.ss.android.account.f.a().d()) {
                if (f61021j) {
                    str3 = this.f61023c;
                } else {
                    AuthTokenMultiProcessSharedProvider.b bVar = this.f61031m;
                    if (bVar != null) {
                        str3 = bVar.a("x-tt-multi-sids", str3);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    hashMap.put("multi_login", "1");
                    hashMap.put("x-tt-multi-sids", str3);
                }
            }
        }
        hashMap.put("sdk-version", "2");
        hashMap.put("passport-sdk-version", "19");
        f fVar3 = f61019a;
        if (!f61021j || fVar3.o || !fVar3.n || (!"change.token".equals(fVar3.p) && !TextUtils.isEmpty(fVar3.p))) {
            z2 = false;
        } else {
            fVar3.o = true;
        }
        if (z2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("urlpath", e.a(str));
                a.a("x_tt_token_lost", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message.what == 1000) {
            this.f61025e.removeMessages(1000);
            b(false);
        } else if (message.what == 2000 && f61021j) {
            com.ss.android.account.f.a();
            d dVar = this.f61028i;
            if (dVar != null && dVar.b()) {
                if (!this.z) {
                    e.a("token_beat_not_poll", this.r.getString(R.string.coz), (JSONObject) null);
                } else if (this.f61029k) {
                    com.bytedance.sdk.a.b.a().b(true, null);
                }
            }
            if (!this.f61029k) {
                e.a("token_beat_not_config", this.r.getString(R.string.asf), this.f61030l);
                com.bytedance.sdk.a.b.a().b(false, "token beat request error");
            }
            if (!this.A || !this.B) {
                String string = this.r.getString(R.string.fhe);
                e.a("sdk-version-not-add", string, (JSONObject) null);
                com.bytedance.sdk.a.b.a().a(false, string);
                return;
            }
            com.bytedance.sdk.a.b.a().a(true, null);
        }
    }

    public final void a(Collection<String> collection) {
        b bVar = this.f61024d;
        if (bVar != null && collection != null && collection.size() > 0) {
            bVar.f61009b.addAll(collection);
        }
    }

    public final void a(boolean z2) {
        this.y = z2;
        if (!this.y && f61021j) {
            b();
        }
    }

    private void a(String str, j jVar) {
        m.a(this.r, str, jVar).d();
    }

    public final String a(boolean z2, boolean z3) {
        String str;
        String str2;
        h hVar = new h(this.f61024d.f61008a + "/passport/token/beat/v2/");
        if (z2) {
            str = "boot";
        } else {
            str = "polling";
        }
        if (z3) {
            str = "wap_login";
        }
        hVar.a("scene", str);
        if (this.f61026g) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        hVar.a("first_beat", str2);
        return hVar.toString();
    }

    public f(Context context, b bVar) {
        this.f61024d = bVar;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.r = applicationContext;
        String str = bVar.f61010c;
        str = TextUtils.isEmpty(str) ? "token_shared_preference" : str;
        Application application = (Application) this.r;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new com.ss.android.a());
        }
        f61021j = g.a(this.r);
        this.f61031m = AuthTokenMultiProcessSharedProvider.a(this.r, str, f61021j);
        this.f61025e = new WeakHandler(Looper.getMainLooper(), this);
        this.f61027h = com.bytedance.sdk.a.f.d.a(this.r);
        this.f61028i = com.bytedance.sdk.a.f.e.a(this.r);
        if (f61021j) {
            if (!TextUtils.isEmpty(bVar.f61008a)) {
                d(this.f61031m.a("X-Tt-Token", ""));
                this.n = !TextUtils.isEmpty(this.p);
                this.f61023c = this.f61031m.a("x-tt-multi-sids", "");
                this.f61026g = this.f61031m.a("first_beat");
                final String str2 = c.b.a("/passport/account/info/v2/") + "cache";
                String a2 = com.bytedance.sdk.a.o.b.a().a(str2);
                if (!com.bytedance.sdk.a.f.e.a(this.r).b() && TextUtils.isEmpty(a2)) {
                    com.bytedance.sdk.a.f.d.a(com.ss.android.account.f.a().b()).a("normal", new com.bytedance.sdk.a.a.b.d() {
                        /* class com.ss.android.token.f.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(37593);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                        @Override // com.bytedance.sdk.a.c
                        public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.f fVar) {
                            com.bytedance.sdk.a.a.d.f fVar2 = fVar;
                            if (fVar2.f43082j != null && fVar2.f43082j.f43463a > 0) {
                                a.b("syn_login_status_error", null);
                            }
                            com.bytedance.sdk.a.o.b.a().a(str2, null, "whatever", 86400000 + System.currentTimeMillis());
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                        @Override // com.bytedance.sdk.a.c
                        public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.f fVar, int i2) {
                            com.bytedance.sdk.a.o.b.a().a(str2, null, "whatever", System.currentTimeMillis() + 86400000);
                        }
                    });
                }
                b(true);
                this.f61025e.sendEmptyMessageDelayed(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 60000);
            } else {
                throw new IllegalStateException("not set beat host");
            }
        }
        f61020f = true;
    }

    public final void a(String str, List<c> list, boolean z2) {
        d dVar;
        e.a(str, list, z2);
        if (f61021j && (dVar = this.f61028i) != null && dVar.b()) {
            b();
            d dVar2 = this.f61028i;
            if (dVar2 != null) {
                dVar2.b(true);
            }
            e eVar = this.f61027h;
            if (eVar != null) {
                eVar.a("sdk_expired_logout", (Map) null, (com.bytedance.sdk.a.a.a.a<com.bytedance.sdk.a.a.a.c>) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, String str2, String str3) {
        String str4;
        MethodCollector.i(12585);
        boolean z2 = true;
        if (this.f61024d.f61011d) {
            String str5 = "";
            if (this.q == null) {
                try {
                    this.q = a.a(a.f61005a);
                } catch (Exception e2) {
                    e.a(e2);
                    str5 = e2.getMessage();
                }
            }
            if (this.q != null) {
                int length = str.length();
                byte[] bArr = new byte[(length / 2)];
                for (int i2 = 0; i2 < length; i2 += 2) {
                    bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
                }
                byte[] a2 = a.a(bArr, this.q);
                String str6 = null;
                if (a2 != null) {
                    str6 = new String(a2);
                }
                if (str6 != null && str6.length() > 100) {
                    str6 = str6.substring(0, 100);
                }
                if (str2 == null || str2.length() <= 100) {
                    str4 = str2;
                } else {
                    str4 = str2.substring(0, 100);
                }
                if (str6 == null || str2 == null || !str6.equals(str4)) {
                    e.a("compare", str, str2, str5);
                    b();
                    MethodCollector.o(12585);
                    return;
                }
                d(str2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("token", a((Object) str2));
                    jSONObject.put("logid", str3);
                    a.a("tt_token_change", jSONObject);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                this.f61031m.a().a("X-Tt-Token", str2).a();
                if ("change.token".equals(this.p) || TextUtils.isEmpty(this.p)) {
                    z2 = false;
                }
                this.n = z2;
                MethodCollector.o(12585);
                return;
            }
            e.a("privateKey", str, str2, str5);
            b();
            MethodCollector.o(12585);
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            d(str2);
            this.f61031m.a().a("X-Tt-Token", str2).a();
            if ("change.token".equals(this.p) || TextUtils.isEmpty(this.p)) {
                z2 = false;
            }
            this.n = z2;
        }
        MethodCollector.o(12585);
    }
}
