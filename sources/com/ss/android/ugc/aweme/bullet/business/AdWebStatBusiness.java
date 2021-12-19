package com.ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.g;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.f.a.b;
import com.bytedance.ies.bullet.service.f.a.b.d;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.c;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.bullet.module.ad.j;
import com.ss.android.ugc.aweme.bullet.module.base.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import h.a.n;
import h.f.b.ad;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class AdWebStatBusiness extends BulletBusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, String> f69212a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f69213b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.bullet.business.a.a f69214c = new com.ss.android.ugc.aweme.bullet.business.a.a();

    /* renamed from: d  reason: collision with root package name */
    private long f69215d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f69216e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f69217f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f69218g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f69219h;

    public static final class a {
        static {
            Covode.recordClassIndex(42676);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(42675);
    }

    private final String g() {
        String str;
        b bVar = this.f69222k.f69252a;
        if (!(bVar instanceof j)) {
            bVar = null;
        }
        j jVar = (j) bVar;
        if (jVar == null || (str = jVar.b()) == null) {
            str = "";
        }
        if (this.f69219h) {
            TextUtils.isEmpty(str);
        }
        return str;
    }

    private final int i() {
        b bVar = this.f69222k.f69252a;
        if (!(bVar instanceof e)) {
            bVar = null;
        }
        e eVar = (e) bVar;
        if (eVar != null) {
            return eVar.l();
        }
        return 0;
    }

    public final void c() {
        this.f69215d = System.currentTimeMillis();
        this.f69216e = false;
        this.f69217f = false;
        this.f69218g = false;
        com.ss.android.ugc.aweme.bullet.business.a.a aVar = this.f69214c;
        aVar.f69268i = false;
        aVar.f69264e = false;
        aVar.f69265f = false;
        aVar.f69267h = null;
        aVar.f69262c = 0;
        aVar.f69260a = 0;
    }

    public final String d() {
        String str;
        b bVar = this.f69222k.f69252a;
        if (!(bVar instanceof e)) {
            bVar = null;
        }
        e eVar = (e) bVar;
        if (eVar == null || (str = eVar.i()) == null) {
            str = "";
        }
        if (this.f69219h) {
            TextUtils.isEmpty(str);
        }
        return str;
    }

    private final long h() {
        com.bytedance.ies.bullet.service.f.a.b.j jVar;
        Long l2;
        b bVar = this.f69222k.f69252a;
        if (!(bVar instanceof j)) {
            bVar = null;
        }
        j jVar2 = (j) bVar;
        if (jVar2 == null || (jVar = jVar2.Y) == null || (l2 = (Long) jVar.b()) == null) {
            return 0;
        }
        return l2.longValue();
    }

    public final boolean a() {
        b bVar = this.f69222k.f69252a;
        if (bVar != null && (bVar instanceof e)) {
            e eVar = (e) bVar;
            if (!TextUtils.isEmpty(eVar.i()) && eVar.k() == 4 && eVar.l() == 1) {
                try {
                    l.b(b.a.f65586a, "");
                    com.ss.android.ugc.aweme.ad.b.e b2 = com.ss.android.ugc.aweme.ad.b.b.b();
                    if (b2 != null && !b2.b()) {
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean b() {
        String str;
        com.bytedance.ies.bullet.service.f.a.b bVar = this.f69222k.f69252a;
        if (bVar != null && (bVar instanceof e)) {
            e eVar = (e) bVar;
            d<String> dVar = eVar.aL;
            if (dVar != null) {
                str = dVar.b();
            } else {
                str = null;
            }
            Boolean bool = (Boolean) eVar.aK.b();
            if (bool == null || !bool.booleanValue() || TextUtils.isEmpty(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String e() {
        String str;
        d<String> dVar;
        com.bytedance.ies.bullet.service.f.a.b bVar = this.f69222k.f69252a;
        if (!(bVar instanceof e)) {
            bVar = null;
        }
        e eVar = (e) bVar;
        if (eVar == null || (dVar = eVar.aL) == null || (str = dVar.b()) == null) {
            str = "";
        }
        if (this.f69219h) {
            TextUtils.isEmpty(str);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.ies.bullet.service.f.a.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject f() {
        /*
            r5 = this;
            r4 = 0
            java.lang.String r0 = r5.g()     // Catch:{ Exception -> 0x0040 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0040 }
            if (r0 != 0) goto L_0x0015
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0040 }
            java.lang.String r0 = r5.g()     // Catch:{ Exception -> 0x0040 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0040 }
            goto L_0x001a
        L_0x0015:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0040 }
            r3.<init>()     // Catch:{ Exception -> 0x0040 }
        L_0x001a:
            java.lang.String r2 = "log_extra"
            com.ss.android.ugc.aweme.bullet.business.a r0 = r5.f69222k     // Catch:{ Exception -> 0x003d }
            com.bytedance.ies.bullet.service.f.a.b r1 = r0.f69252a     // Catch:{ Exception -> 0x003d }
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.bullet.module.ad.j     // Catch:{ Exception -> 0x003d }
            if (r0 != 0) goto L_0x003b
        L_0x0024:
            com.ss.android.ugc.aweme.bullet.module.ad.j r4 = (com.ss.android.ugc.aweme.bullet.module.ad.j) r4     // Catch:{ Exception -> 0x003d }
            if (r4 == 0) goto L_0x002e
            java.lang.String r1 = r4.c()     // Catch:{ Exception -> 0x003d }
            if (r1 != 0) goto L_0x0030
        L_0x002e:
            java.lang.String r1 = ""
        L_0x0030:
            boolean r0 = r5.f69219h     // Catch:{ Exception -> 0x003d }
            if (r0 == 0) goto L_0x0037
            android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x003d }
        L_0x0037:
            r3.put(r2, r1)     // Catch:{ Exception -> 0x003d }
            goto L_0x0045
        L_0x003b:
            r4 = r1
            goto L_0x0024
        L_0x003d:
            r0 = move-exception
            r4 = r3
            goto L_0x0041
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            r0.printStackTrace()
            r3 = r4
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.f():org.json.JSONObject");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdWebStatBusiness(a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    private final JSONObject b(String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_web_url", i());
            if (!TextUtils.isEmpty(d()) && i() == 1) {
                jSONObject.put("channel_name", d());
                if (AdLandPagePreloadServiceImpl.f() != null) {
                    d();
                    i2 = 2;
                } else {
                    i2 = null;
                }
                jSONObject.put("landing_type", i2);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void a(String str) {
        com.bytedance.ies.bullet.service.f.a.b bVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ((str == null || p.b(str, "bytedance://log_event_v3", false)) && (bVar = this.f69222k.f69252a) != null && (bVar instanceof j)) {
            try {
                Uri parse = Uri.parse(str);
                l.b(parse, "");
                if (!l.a((Object) "log_event_v3", (Object) parse.getHost())) {
                    return;
                }
                if (!this.f69217f) {
                    r.b(parse.getQueryParameter("event"), new JSONObject(parse.getQueryParameter("params")));
                    this.f69217f = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(boolean z) {
        JSONObject jSONObject;
        Activity a2 = this.f69222k.a();
        if (a2 != null) {
            JSONObject f2 = f();
            long currentTimeMillis = System.currentTimeMillis() - this.f69215d;
            this.f69215d = 0;
            if (h() > 0) {
                if (currentTimeMillis > 0 && !this.f69216e) {
                    com.ss.android.ugc.aweme.bullet.business.a.a aVar = this.f69214c;
                    long h2 = h();
                    JSONObject b2 = b(null);
                    if (h2 > 0 && aVar.f69266g != null) {
                        if (f2 == null) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = f2;
                        }
                        try {
                            jSONObject.put("is_ad_event", "1");
                            jSONObject.put("tag", "draw_ad");
                            if (b2 == null) {
                                b2 = new JSONObject();
                            }
                            b2.put("present_url", aVar.f69266g);
                            b2.put("container_type", "bullet");
                            jSONObject.put("ad_extra_data", b2.toString());
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        r.onEvent(MobClick.obtain().setLabelName("stay_page").setEventName("ad_wap_stat").setValue(String.valueOf(h2)).setExtValueLong(currentTimeMillis).setJsonObject(jSONObject));
                    }
                    this.f69216e = true;
                }
                if (z || a2.isFinishing()) {
                    this.f69214c.a(null, h(), f2, b(null));
                }
            }
        }
    }

    public final void a(String str, String str2) {
        com.ss.android.ugc.aweme.bullet.business.a.a aVar = this.f69214c;
        long h2 = h();
        JSONObject f2 = f();
        JSONObject b2 = b(str2);
        aVar.f69265f = true;
        aVar.a(str, h2, f2, b2);
    }

    public final void a(WebView webView, String str) {
        String str2 = null;
        f69212a = null;
        com.ss.android.ugc.aweme.bullet.business.a.a aVar = this.f69214c;
        com.bytedance.ies.bullet.service.f.a.b bVar = this.f69222k.f69252a;
        if (!(bVar instanceof e)) {
            bVar = null;
        }
        e eVar = (e) bVar;
        if (!(webView == null || TextUtils.isEmpty(str) || eVar == null)) {
            if (aVar.f69266g == null) {
                aVar.f69266g = str;
            }
            if (aVar.f69260a == 0) {
                aVar.f69260a = System.currentTimeMillis();
            }
            String i2 = eVar.i();
            String j2 = eVar.j();
            if (eVar.k() == 7) {
                aVar.f69261b = 5;
            } else if (!TextUtils.isEmpty(i2) && eVar.l() == 1 && com.ss.android.ugc.aweme.ad.b.b.a() != null) {
                aVar.f69261b = com.ss.android.ugc.aweme.ad.b.b.a().a(i2, j2);
            }
        }
        com.bytedance.ies.bullet.service.f.a.b bVar2 = this.f69222k.f69252a;
        if (bVar2 != null && (bVar2 instanceof j)) {
            if ((!l.a((Object) str, (Object) "about:blank")) && !this.f69218g) {
                l.b(b.a.f65586a, "");
                c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
                if (a2 != null) {
                    j jVar = (j) bVar2;
                    String i3 = jVar.i();
                    String j3 = jVar.j();
                    int k2 = jVar.k();
                    int i4 = i();
                    String c2 = jVar.c();
                    String b2 = jVar.ao.b();
                    if (TextUtils.isEmpty(b2)) {
                        Long l2 = (Long) jVar.Y.b();
                        if (l2 != null) {
                            b2 = String.valueOf(l2.longValue());
                        } else {
                            b2 = null;
                        }
                    }
                    a2.a(i3, j3, k2, i4, c2, b2);
                }
                this.f69218g = true;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    l.b(b.a.f65586a, "");
                    com.ss.android.ugc.aweme.ad.b.e b3 = com.ss.android.ugc.aweme.ad.b.b.b();
                    if (b3 != null) {
                        str2 = b3.a();
                    }
                    IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                    if (f2 != null) {
                        f2.d(str2);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void b(WebView webView, String str) {
        Long l2;
        com.ss.android.ugc.aweme.bullet.business.a.a aVar = this.f69214c;
        long h2 = h();
        JSONObject f2 = f();
        JSONObject b2 = b(null);
        if (!TextUtils.isEmpty(str) && !aVar.f69263d && !aVar.f69264e) {
            aVar.f69262c = System.currentTimeMillis();
            aVar.f69264e = true;
            aVar.a(str, h2, f2, b2);
        }
        com.bytedance.ies.bullet.service.f.a.b bVar = this.f69222k.f69252a;
        if (bVar != null && (bVar instanceof j) && Build.VERSION.SDK_INT >= 21) {
            j jVar = (j) bVar;
            String jSONObject = jVar.d().toString();
            l.b(jSONObject, "");
            if (webView != null && (l2 = (Long) jVar.Y.b()) != null && l2.longValue() != 0) {
                IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.f();
                if (f3 != null) {
                    f3.f(jSONObject);
                }
                Boolean bool = (Boolean) jVar.aA.b();
                if (bool != null) {
                    bool.booleanValue();
                }
            }
        }
    }

    public final void c(WebView webView, String str) {
        boolean z;
        com.ss.android.ugc.aweme.bullet.business.a.a aVar = this.f69214c;
        long h2 = h();
        JSONObject f2 = f();
        JSONObject b2 = b(null);
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (aVar.f69267h == null) {
                aVar.f69267h = aVar.f69266g;
            }
            if (TextUtils.isEmpty(webView.getOriginalUrl()) || TextUtils.equals(webView.getOriginalUrl(), str) || aVar.f69264e) {
                z = false;
            } else {
                z = true;
            }
            aVar.f69263d = z;
            if (h2 > 0) {
                if (f2 == null) {
                    f2 = new JSONObject();
                }
                try {
                    f2.put("is_ad_event", "1");
                    f2.put("tag", "draw_ad");
                    if (b2 == null) {
                        b2 = new JSONObject();
                    }
                    b2.put("present_url", aVar.f69267h);
                    b2.put("next_url", str);
                    b2.put("container_type", "bullet");
                    f2.put("ad_extra_data", b2.toString());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                r.onEvent(MobClick.obtain().setLabelName("jump_page").setEventName("ad_wap_stat").setValue(String.valueOf(h2)).setJsonObject(f2));
            }
            aVar.f69267h = str;
        }
    }

    public final void a(com.bytedance.ies.bullet.c.e.a.b bVar, List<Pattern> list) {
        List<String> c2;
        l.d(bVar, "");
        com.bytedance.ies.bullet.service.f.a.b bVar2 = this.f69222k.f69252a;
        if (bVar2 != null && (bVar2 instanceof j)) {
            if (list == null) {
                list = new ArrayList<>();
            }
            try {
                l.b(b.a.f65586a, "");
                com.ss.android.ugc.aweme.ad.b.e b2 = com.ss.android.ugc.aweme.ad.b.b.b();
                if (b2 != null && (c2 = b2.c()) != null && !c2.isEmpty() && l.a((Object) ((Boolean) ((j) bVar2).ac.b()), (Object) true)) {
                    for (String str : c2) {
                        Pattern compile = Pattern.compile(str);
                        l.b(compile, "");
                        list.add(compile);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (T t : list) {
                List<String> list2 = g.b.f32252a.a((IResourceLoaderService) e.a.a().a(IResourceLoaderService.class)).f32628i;
                Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                List d2 = ad.d(list2);
                String pattern = t.toString();
                l.b(pattern, "");
                if (!d2.contains(pattern)) {
                    String pattern2 = t.toString();
                    l.b(pattern2, "");
                    d2.add(pattern2);
                }
                arrayList.add(z.f158842a);
            }
        }
    }
}
