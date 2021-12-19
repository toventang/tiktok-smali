package com.ss.android.ugc.aweme.poi_api.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.a.a;
import com.bytedance.ies.ugc.aweme.plugin.a.c;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import h.f.b.l;
import h.q;
import h.r;
import java.util.LinkedHashMap;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final IPluginService f115537a = AabPluginServiceImpl.d();

    /* renamed from: b  reason: collision with root package name */
    public static final com.bytedance.ies.ugc.aweme.plugin.c.c f115538b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final com.bytedance.ies.ugc.aweme.plugin.c.b f115539c = b.f115549a;

    /* renamed from: d  reason: collision with root package name */
    public static final c f115540d = new c();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f115541e;

    /* renamed from: f  reason: collision with root package name */
    private static IPoiService f115542f = new PoiServiceEmptyImpl();

    public static final class d implements com.bytedance.ies.ugc.aweme.plugin.c.c {
        static {
            Covode.recordClassIndex(74424);
        }

        d() {
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.c
        public final void a(boolean z) {
            c.a(Boolean.valueOf(z), "install start", null, null, null);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.c
        public final void b(boolean z) {
            c.a(Boolean.valueOf(z), "installing", null, null, null);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.c
        public final void c(boolean z) {
            c.a(Boolean.valueOf(z), "install end", null, null, null);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.c
        public final void a(int i2) {
            if (i2 == -1) {
                c.a(null, "Permission Dialog Result", null, null, "showPermissionDialog: clicked OK");
            } else {
                c.a(null, "Permission Dialog Result", null, null, "showPermissionDialog: clicked cancel");
            }
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.c
        public final void a(boolean z, long j2, long j3) {
            c.a(Boolean.valueOf(z), "downloading", Long.valueOf(j2), Long.valueOf(j3), null);
        }
    }

    private c() {
    }

    static final class b implements com.bytedance.ies.ugc.aweme.plugin.c.b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f115549a = new b();

        static {
            Covode.recordClassIndex(74422);
        }

        b() {
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.b
        public final void a() {
            c.a("RETRY");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.poi_api.service.c$c  reason: collision with other inner class name */
    public static final class C2952c<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f115550a;

        static {
            Covode.recordClassIndex(74423);
        }

        C2952c(Class cls) {
            this.f115550a = cls;
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final /* synthetic */ Object get() {
            Object newInstance = this.f115550a.newInstance();
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi_api.service.IPoiService");
            return newInstance;
        }
    }

    public final void c() {
        d();
        a().f();
    }

    private static boolean d() {
        IPluginService iPluginService = f115537a;
        if (iPluginService == null) {
            return false;
        }
        iPluginService.c().a(com.bytedance.ies.ugc.appcontext.d.a());
        return true;
    }

    static {
        Covode.recordClassIndex(74420);
    }

    public static boolean b() {
        IPluginService iPluginService = f115537a;
        if (iPluginService == null) {
            return false;
        }
        if (!iPluginService.b()) {
            return true;
        }
        if (iPluginService.a("com.ss.android.ugc.aweme.poi")) {
            if (!f115541e) {
                f115541e = d();
            }
            if (f115541e) {
                return true;
            }
        }
        return false;
    }

    public static IPoiService a() {
        Object obj;
        if (!b()) {
            return new PoiServiceEmptyImpl();
        }
        IPoiService iPoiService = (IPoiService) ServiceManager.get().getService(b.f115536a);
        if (iPoiService instanceof PoiServiceEmptyImpl) {
            try {
                obj = q.m223constructorimpl(Class.forName("com.ss.android.ugc.aweme.poi.service.PoiServiceImpl"));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(obj)) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null) {
                ServiceManager.get().bind(b.f115536a, new C2952c(cls)).asSingleton();
            }
            iPoiService = (IPoiService) ServiceManager.get().getService(b.f115536a);
        }
        l.b(iPoiService, "");
        return iPoiService;
    }

    public static final class e implements com.bytedance.ies.ugc.aweme.plugin.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f115551a;

        static {
            Covode.recordClassIndex(74425);
        }

        e(String str) {
            this.f115551a = str;
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
        public final void a(String str, int i2) {
            l.d(str, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("result", "failed");
            linkedHashMap.put("error_code", String.valueOf(i2));
            linkedHashMap.put("request_from", this.f115551a);
            com.ss.android.ugc.aweme.common.r.a("poi_install_result", linkedHashMap);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
        public final void a(String str, boolean z) {
            l.d(str, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("result", "succeed");
            linkedHashMap.put("request_from", this.f115551a);
            com.ss.android.ugc.aweme.common.r.a("poi_install_result", linkedHashMap);
            c.f115540d.c();
            c.a().a("POI_INSTALL_SUCCEED_CALLBACK");
        }
    }

    public static void a(String str) {
        l.d(str, "");
        if (!b() && com.ss.android.ugc.aweme.poi_api.a.a.a().f115530a) {
            c.a aVar = new c.a();
            aVar.f35089a = "com.ss.android.ugc.aweme.poi";
            aVar.f35091c = true;
            aVar.f35093e = f115539c;
            a.C0790a a2 = new a.C0790a().a(1);
            a2.f35065a = false;
            a2.f35074j = f115538b;
            a2.f35071g = com.bytedance.ies.ugc.aweme.plugin.b.b.REPLACE;
            aVar.f35094f = a2.a();
            aVar.f35092d = new e(str);
            f115537a.a(aVar.a());
        }
    }

    public static final class a implements com.bytedance.ies.ugc.aweme.plugin.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f115543a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f115544b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f115545c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f115546d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f115547e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f115548f = true;

        static {
            Covode.recordClassIndex(74421);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
        public final void a(String str, int i2) {
            l.d(str, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("result", "failed");
            linkedHashMap.put("error_code", String.valueOf(i2));
            linkedHashMap.put("request_from", this.f115543a);
            com.ss.android.ugc.aweme.common.r.a("poi_install_result", linkedHashMap);
            this.f115548f = false;
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
        public final void a(String str, boolean z) {
            l.d(str, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("result", "succeed");
            linkedHashMap.put("request_from", this.f115543a);
            com.ss.android.ugc.aweme.common.r.a("poi_install_result", linkedHashMap);
            c.f115540d.c();
            if (this.f115548f) {
                c.a().a().a(this.f115544b, this.f115545c, this.f115546d, this.f115547e);
            }
        }

        public a(String str, Context context, Aweme aweme, String str2, String str3) {
            this.f115543a = str;
            this.f115544b = context;
            this.f115545c = aweme;
            this.f115546d = str2;
            this.f115547e = str3;
        }
    }

    public static void a(Boolean bool, String str, Long l2, Long l3, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bool != null) {
            linkedHashMap.put("is_silent", String.valueOf(bool.booleanValue()));
        }
        linkedHashMap.put("state", str);
        if (l2 != null) {
            linkedHashMap.put("bytes_downloaded", String.valueOf(l2.longValue()));
        }
        if (l3 != null) {
            linkedHashMap.put("total_bytes_to_download", String.valueOf(l3.longValue()));
        }
        if (str2 != null) {
            linkedHashMap.put("permission_dialog_result", str2.toString());
        }
        com.ss.android.ugc.aweme.common.r.a("poi_df_state_change", linkedHashMap);
    }
}
