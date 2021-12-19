package com.ss.android.ugc.aweme.settingsrequest.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SaveConfigType;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.u;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.o;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.legoImp.task.y;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import f.a.d.f;
import f.a.d.k;
import h.a.ag;
import h.a.i;
import h.f.b.l;
import h.v;
import h.w;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class g implements r {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f123170a = new f.a.b.a();

    static {
        Covode.recordClassIndex(80897);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.P0;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f123172a = new b();

        static {
            Covode.recordClassIndex(80899);
        }

        b() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            f fVar = (f) obj;
            l.d(fVar, "");
            return fVar.f123169b instanceof o;
        }
    }

    static final class c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f123173a = new c();

        static {
            Covode.recordClassIndex(80900);
        }

        c() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            f fVar = (f) obj;
            l.d(fVar, "");
            String str = fVar.f123168a;
            com.google.gson.l lVar = fVar.f123169b;
            Objects.requireNonNull(lVar, "null cannot be cast to non-null type com.google.gson.JsonObject");
            return new e(str, (o) lVar);
        }
    }

    static final class a<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f123171a = new a();

        static {
            Covode.recordClassIndex(80898);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            T t;
            String str;
            ISettingsRequestService i2;
            u uVar = (u) obj;
            l.d(uVar, "");
            List<com.bytedance.retrofit2.client.b> list = uVar.f42629a.f42476d;
            l.b(list, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                l.b(t2, "");
                String str2 = t2.f42471a;
                l.b(str2, "");
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                l.b(lowerCase, "");
                if (l.a((Object) lowerCase, (Object) "x-tt-logid")) {
                    break;
                }
            }
            T t3 = t;
            if (!(t3 == null || (str = t3.f42472b) == null || (i2 = SettingsRequestServiceImpl.i()) == null)) {
                i2.a(ag.b(v.a("commonLogId", str)));
            }
            com.bytedance.retrofit2.client.c cVar = uVar.f42629a;
            l.b(cVar, "");
            String str3 = cVar.f42473a;
            l.b(str3, "");
            T t4 = uVar.f42630b;
            l.b(t4, "");
            return new f(str3, t4);
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f123175a = new e();

        static {
            Covode.recordClassIndex(80902);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.ss.android.ugc.aweme.framework.a.a.a("FetchABTestCommonRequest failed, is_combine = false, throwable = ".concat(String.valueOf(th)));
            com.ss.android.ugc.aweme.common.r.a("libra_api_status", new com.ss.android.ugc.aweme.app.f.d().a("status", "0").a("error", String.valueOf(th.getMessage())).a("count", 0).f66730a);
            com.ss.android.ugc.aweme.common.r.a("config_fetch_success", new com.ss.android.ugc.aweme.app.f.d().a("status", "0").a("source", "1").f66730a);
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f123174a = new d();

        static {
            Covode.recordClassIndex(80901);
        }

        d() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.List */
        /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: java.util.List */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String oVar;
            com.google.gson.r d2;
            com.google.gson.r d3;
            com.google.gson.l c2;
            com.google.gson.l c3;
            com.google.gson.l c4;
            com.google.gson.l c5;
            com.google.gson.l c6;
            e eVar = (e) obj;
            o oVar2 = eVar.f123167b;
            String str = eVar.f123166a;
            o f2 = oVar2.f("data");
            int i2 = 0;
            String str2 = "";
            if (f2 != null) {
                l.c(f2, str2);
                com.bytedance.ies.abmock.datacenter.b.a.f31804c.clear();
                if (com.bytedance.ies.abmock.datacenter.b.a.f31803b.isEmpty()) {
                    com.bytedance.ies.abmock.datacenter.b.a.f31803b.add("uid_precise_exp_comment");
                    com.bytedance.ies.abmock.datacenter.b.a.f31803b.add("uid_precise_exp_share");
                    com.bytedance.ies.abmock.datacenter.b.a.f31803b.add("verify_proaccount_precise_exp");
                }
                Iterator<Map.Entry<String, ConfigItem>> it = com.bytedance.ies.abmock.f.f31847b.entrySet().iterator();
                while (true) {
                    boolean z = true;
                    int i3 = 1;
                    if (it.hasNext()) {
                        Map.Entry<String, ConfigItem> next = it.next();
                        String key = next.getKey();
                        SaveConfigType.ConfigType configType = next.getValue().type;
                        if (configType != null) {
                            switch (com.bytedance.ies.abmock.datacenter.b.b.f31806a[configType.ordinal()]) {
                                case 1:
                                    l.a((Object) key, str2);
                                    try {
                                        com.bytedance.ies.abmock.datacenter.b.a.a(f2, key);
                                        o f3 = f2.f(key);
                                        if (f3 == null || (d2 = f3.d("val")) == null) {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.c(key);
                                        } else if (d2.f54900a instanceof Number) {
                                            com.bytedance.ies.abmock.datacenter.c.a aVar = com.bytedance.ies.abmock.datacenter.c.a.f31807a;
                                            if (d2.g() == 0) {
                                                z = false;
                                            }
                                            aVar.b(key, z);
                                            continue;
                                        } else {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(key, d2.h());
                                        }
                                    } catch (Throwable th) {
                                        com.bytedance.c.a.a.a.b.a("PreciseExposureManager " + th + "  , key: " + key);
                                    }
                                    break;
                                case 2:
                                    l.a((Object) key, str2);
                                    try {
                                        com.bytedance.ies.abmock.datacenter.b.a.a(f2, key);
                                        o f4 = f2.f(key);
                                        if (f4 == null || (d3 = f4.d("val")) == null) {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.c(key);
                                        } else if (d3.f54900a instanceof Boolean) {
                                            com.bytedance.ies.abmock.datacenter.c.a aVar2 = com.bytedance.ies.abmock.datacenter.c.a.f31807a;
                                            if (!d3.h()) {
                                                i3 = 0;
                                            }
                                            aVar2.b(key, i3);
                                            continue;
                                        } else {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(key, d3.g());
                                        }
                                    } catch (Throwable th2) {
                                        com.bytedance.c.a.a.a.b.a("PreciseExposureManager " + th2 + "  , key: " + key);
                                    }
                                    break;
                                case 3:
                                    l.a((Object) key, str2);
                                    try {
                                        com.bytedance.ies.abmock.datacenter.b.a.a(f2, key);
                                        o f5 = f2.f(key);
                                        if (f5 == null || (c2 = f5.c("val")) == null) {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.c(key);
                                        } else {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(key, c2.f());
                                            continue;
                                        }
                                    } catch (Throwable th3) {
                                        com.bytedance.c.a.a.a.b.a("PreciseExposureManager " + th3 + "  , key: " + key);
                                    }
                                    break;
                                case 4:
                                    l.a((Object) key, str2);
                                    try {
                                        com.bytedance.ies.abmock.datacenter.b.a.a(f2, key);
                                        o f6 = f2.f(key);
                                        if (f6 == null || (c3 = f6.c("val")) == null) {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.c(key);
                                        } else {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(key, c3.d());
                                            continue;
                                        }
                                    } catch (Throwable th4) {
                                        com.bytedance.c.a.a.a.b.a("PreciseExposureManager " + th4 + "  , key: " + key);
                                    }
                                    break;
                                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                    l.a((Object) key, str2);
                                    try {
                                        com.bytedance.ies.abmock.datacenter.b.a.a(f2, key);
                                        o f7 = f2.f(key);
                                        if (f7 == null || (c4 = f7.c("val")) == null) {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.c(key);
                                        } else {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(key, c4.e());
                                            continue;
                                        }
                                    } catch (Throwable th5) {
                                        com.bytedance.c.a.a.a.b.a("PreciseExposureManager " + th5 + "  , key: " + key);
                                    }
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                    l.a((Object) key, str2);
                                    try {
                                        com.bytedance.ies.abmock.datacenter.b.a.a(f2, key);
                                        o f8 = f2.f(key);
                                        if (f8 != null && (c5 = f8.c("val")) != null) {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(key, c5.c());
                                            continue;
                                        } else if (f2.b(key)) {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(key, (String) null);
                                        } else {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.c(key);
                                        }
                                    } catch (Throwable th6) {
                                        com.bytedance.c.a.a.a.b.a("PreciseExposureManager " + th6 + "  , key: " + key);
                                    }
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                    l.a((Object) key, str2);
                                    try {
                                        com.bytedance.ies.abmock.datacenter.b.a.a(f2, key);
                                        o f9 = f2.f(key);
                                        if (f9 != null && (c6 = f9.c("val")) != null) {
                                            com.bytedance.ies.abmock.datacenter.c.a aVar3 = com.bytedance.ies.abmock.datacenter.c.a.f31807a;
                                            l.a((Object) aVar3, str2);
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(key, (String[]) aVar3.a().a(c6, (Class) String[].class));
                                            continue;
                                        } else if (f2.b(key)) {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(key, (String[]) null);
                                        } else {
                                            com.bytedance.ies.abmock.datacenter.c.a.f31807a.c(key);
                                        }
                                    } catch (Throwable th7) {
                                        com.bytedance.c.a.a.a.b.a("PreciseExposureManager " + th7 + "  , key: " + key);
                                    }
                                    break;
                                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                    l.a((Object) key, str2);
                                    com.bytedance.ies.abmock.datacenter.b.a.b(f2, key);
                                    continue;
                            }
                        }
                        l.a((Object) key, str2);
                        com.bytedance.ies.abmock.datacenter.b.a.b(f2, key);
                    } else {
                        String[] stringArray = com.bytedance.ies.abmock.datacenter.b.a.f31802a.getStringArray("__exposed_vids", new String[0]);
                        l.a((Object) stringArray, str2);
                        List k2 = i.k(stringArray);
                        Iterator it2 = k2.iterator();
                        boolean z2 = false;
                        while (it2.hasNext()) {
                            if (!com.bytedance.ies.abmock.datacenter.b.a.f31804c.containsKey(it2.next())) {
                                it2.remove();
                                z2 = true;
                            }
                        }
                        String a2 = com.bytedance.ies.abmock.datacenter.b.a.a();
                        String[] stringArray2 = com.bytedance.ies.abmock.datacenter.b.a.f31802a.getStringArray("{__exposed_vids_for_current_user}_{" + a2 + '}', new String[0]);
                        l.a((Object) stringArray2, str2);
                        List k3 = i.k(stringArray2);
                        Iterator it3 = k3.iterator();
                        while (it3.hasNext()) {
                            if (!com.bytedance.ies.abmock.datacenter.b.a.f31804c.containsKey(it3.next())) {
                                it3.remove();
                                z2 = true;
                            }
                        }
                        if (z2) {
                            Keva keva = com.bytedance.ies.abmock.datacenter.b.a.f31802a;
                            Object[] array = k2.toArray(new String[0]);
                            if (array != null) {
                                keva.storeStringArray("__exposed_vids", (String[]) array);
                                Keva keva2 = com.bytedance.ies.abmock.datacenter.b.a.f31802a;
                                String str3 = "{__exposed_vids_for_current_user}_{" + a2 + '}';
                                Object[] array2 = k3.toArray(new String[0]);
                                if (array2 != null) {
                                    keva2.storeStringArray(str3, (String[]) array2);
                                    com.bytedance.ies.abmock.datacenter.b.a.b();
                                } else {
                                    throw new w("null cannot be cast to non-null type");
                                }
                            } else {
                                throw new w("null cannot be cast to non-null type");
                            }
                        }
                        com.bytedance.ies.abmock.datacenter.b.a.b();
                        com.bytedance.ies.abmock.datacenter.c.d.a(f2);
                        com.bytedance.ies.abmock.datacenter.e.a().b();
                        SettingsRequestServiceImpl.i().a(str);
                    }
                }
            }
            com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("status", "1");
            if (!(f2 == null || (oVar = f2.toString()) == null)) {
                str2 = oVar;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("result", str2);
            if (f2 != null) {
                i2 = f2.f54898a.size();
            }
            com.ss.android.ugc.aweme.common.r.a("libra_api_status", a4.a("count", i2).f66730a);
            com.ss.android.ugc.aweme.common.r.a("config_fetch_success", new com.ss.android.ugc.aweme.app.f.d().a("status", "1").a("source", "1").f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        String serverDeviceId = AppLog.getServerDeviceId();
        int a2 = com.ss.android.ugc.aweme.base.utils.k.a(com.bytedance.ies.ugc.appcontext.d.a());
        String a3 = y.a();
        com.bytedance.ies.abmock.datacenter.b.a.b();
        this.f123170a.a(((SettingApi) RetrofitFactory.a().a("https://libra-va.tiktokv.com").a(SettingApi.class)).queryABTestCommon("1233", serverDeviceId, com.bytedance.ies.ugc.appcontext.d.h(), 1, a3, a2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).c(a.f123171a).a(b.f123172a).c(c.f123173a).a(d.f123174a, e.f123175a));
    }
}
