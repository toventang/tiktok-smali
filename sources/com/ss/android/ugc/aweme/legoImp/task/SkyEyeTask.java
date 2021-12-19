package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.a;
import com.bytedance.helios.api.config.AbstractSettingsModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.i;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.experiment.dy;
import com.ss.android.ugc.aweme.experiment.eu;
import com.ss.android.ugc.aweme.experiment.go;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;

public final class SkyEyeTask implements w {
    static {
        Covode.recordClassIndex(69125);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class d implements com.ss.android.ugc.aweme.compliance.api.services.termspp.a {
        static {
            Covode.recordClassIndex(69129);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.a
        public final void a(boolean z) {
            com.bytedance.helios.sdk.f.b.a("app_agreement_overseas_scene", !z);
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.compliance.api.services.agegate.c {
        static {
            Covode.recordClassIndex(69130);
        }

        e() {
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.c
        public final void a(boolean z) {
            com.bytedance.helios.sdk.f.b.a("guest_mode_overseas_scene", z);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    public static final class f extends com.bytedance.helios.api.config.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkyEyeTask f107882a;

        static {
            Covode.recordClassIndex(69131);
        }

        @Override // com.bytedance.helios.api.config.b
        public final AbstractSettingsModel c() {
            return com.bytedance.helios.settings.a.a();
        }

        @Override // com.bytedance.helios.api.config.b
        public final String b() {
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                return "";
            }
            return serverDeviceId;
        }

        @Override // com.bytedance.helios.api.config.b
        public final String a() {
            String str = com.bytedance.ttnet.b.b.f44541b;
            if (str == null) {
                return null;
            }
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase();
            l.b(lowerCase, "");
            return lowerCase;
        }

        @Override // com.bytedance.helios.api.config.b
        public final void d() {
            if (!com.ss.android.ugc.aweme.compliance.api.a.k().f()) {
                com.bytedance.helios.sdk.f.b.a("app_agreement_overseas_scene", true);
            }
            if (GuestModeServiceImpl.d().c()) {
                com.bytedance.helios.sdk.f.b.a("guest_mode_overseas_scene", true);
            }
            com.ss.android.ugc.aweme.compliance.api.a.k().a(new d());
            com.ss.android.ugc.aweme.compliance.api.a.h().a(new e());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(SkyEyeTask skyEyeTask) {
            this.f107882a = skyEyeTask;
        }
    }

    static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkyEyeTask f107880a;

        static {
            Covode.recordClassIndex(69127);
        }

        b(SkyEyeTask skyEyeTask) {
            this.f107880a = skyEyeTask;
        }

        @Override // com.bytedance.ies.abmock.i
        public final void a() {
            SkyEyeTask.c().put("operation", "Switch Settings");
        }
    }

    static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final g f107883a = new g();

        static {
            Covode.recordClassIndex(69132);
        }

        g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return new com.google.gson.f().b(com.bytedance.helios.settings.a.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (eu.a() || dy.b()) {
            return ae.BACKGROUND;
        }
        return ae.MAIN;
    }

    public static androidx.c.a<String, Object> c() {
        androidx.c.a<String, Object> aVar = new androidx.c.a<>();
        aVar.put("event_time_stamp", Long.valueOf(System.currentTimeMillis()));
        User c2 = in.c();
        String str = "";
        l.b(c2, str);
        String uid = c2.getUid();
        if (uid == null) {
            uid = str;
        }
        aVar.put("uid", uid);
        aVar.put("region_source", com.bytedance.ttnet.b.b.f44542c);
        String str2 = com.bytedance.ttnet.b.b.f44541b;
        if (str2 != null) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str2.toLowerCase();
            l.b(lowerCase, str);
            if (lowerCase != null) {
                str = lowerCase;
            }
        }
        aVar.put("region_code", str);
        aVar.put("request_location_permission", Integer.valueOf(((ILocationService) ServiceManager.get().getService(ILocationService.class)).getLocationAB()));
        for (Map.Entry<String, Object> entry : com.ss.android.ugc.aweme.poi_api.service.c.a().h().entrySet()) {
            aVar.put(entry.getKey(), entry.getValue());
        }
        return aVar;
    }

    public static final class c implements com.ss.android.ugc.aweme.requestcombine.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkyEyeTask f107881a;

        static {
            Covode.recordClassIndex(69128);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(SkyEyeTask skyEyeTask) {
            this.f107881a = skyEyeTask;
        }

        @Override // com.ss.android.ugc.aweme.requestcombine.b
        public final void a(Map<String, String> map) {
            String str;
            int a2;
            com.bytedance.helios.api.a a3 = a.C0641a.a();
            androidx.c.a<String, Object> c2 = SkyEyeTask.c();
            String str2 = null;
            if (map != null) {
                str = map.get("url");
                if (str != null && (a2 = p.a((CharSequence) str, "?", 0, false, 6)) > 0) {
                    if (str != null) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                        str = str.substring(0, a2);
                        l.b(str, "");
                    } else {
                        str = null;
                    }
                }
            } else {
                str = null;
            }
            c2.put("operation", "Settings Fetch");
            if (map != null) {
                str2 = map.get("x-tt-logid");
            }
            c2.put("logid", str2);
            c2.put("url", str);
            a3.recordRegionEvent(c2);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && context2 == null) {
                context2 = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
        } else {
            context2 = null;
        }
        Application application = (Application) context2;
        if (application != null) {
            com.bytedance.helios.api.a a2 = a.C0641a.a();
            f fVar = new f(this);
            Boolean a3 = s.a();
            l.b(a3, "");
            a2.init(fVar, new com.bytedance.helios.api.config.a(application, com.bytedance.ies.ugc.appcontext.d.s, a3.booleanValue()));
            if (com.ss.android.ugc.aweme.lego.f.a.a(application)) {
                com.bytedance.helios.api.a a4 = a.C0641a.a();
                androidx.c.a<String, Object> c2 = c();
                c2.put("operation", "Initial Region");
                a4.recordRegionEvent(c2);
                com.bytedance.ttnet.b.b.a().addObserver(new a(this));
                SettingsManager.a().a(new b(this));
                SettingRequestExtraInfoImpl.a().a(new c(this));
            }
        }
        if (((Boolean) go.f90155b.getValue()).booleanValue()) {
            b.i.b(g.f107883a, b.i.f4824a);
        }
    }

    static final class a implements Observer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkyEyeTask f107879a;

        static {
            Covode.recordClassIndex(69126);
        }

        a(SkyEyeTask skyEyeTask) {
            this.f107879a = skyEyeTask;
        }

        public final void update(Observable observable, Object obj) {
            String str;
            String obj2;
            if (observable != null && obj != null && (observable instanceof com.bytedance.ttnet.b.b)) {
                HashMap hashMap = (HashMap) obj;
                Object obj3 = hashMap.get("store_region");
                String str2 = "";
                String str3 = null;
                if (obj3 == null || (obj2 = obj3.toString()) == null) {
                    str = null;
                } else {
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.String");
                    str = obj2.toLowerCase();
                    l.b(str, str2);
                }
                Object obj4 = hashMap.get("region_source");
                if (obj4 != null) {
                    str3 = obj4.toString();
                }
                com.bytedance.helios.api.a a2 = a.C0641a.a();
                androidx.c.a<String, Object> c2 = SkyEyeTask.c();
                c2.put("operation", "Switch Region");
                c2.put("region_source", str3);
                if (str != null) {
                    str2 = str;
                }
                c2.put("region_code", str2);
                a2.recordRegionEvent(c2);
            }
        }
    }
}
