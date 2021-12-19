package com.ss.android.ugc.aweme.bullet;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.plugin.a.a;
import com.bytedance.ies.ugc.aweme.plugin.a.c;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import h.f.b.l;

public final class f implements com.bytedance.ies.bullet.c.c.f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f69290a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f69291b;

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f69292c = l.a((Object) com.ss.android.ugc.aweme.net.a.a(), (Object) "arm64-v8a");

    /* renamed from: d  reason: collision with root package name */
    private static final IPluginService f69293d = AabPluginServiceImpl.d();

    public static final class a implements com.bytedance.ies.ugc.aweme.plugin.c.a {
        static {
            Covode.recordClassIndex(42724);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
        public final void a(String str, int i2) {
            l.d(str, "");
        }

        a() {
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
        public final void a(String str, boolean z) {
            l.d(str, "");
            f.c();
        }
    }

    private f() {
    }

    static {
        Covode.recordClassIndex(42723);
    }

    public static boolean c() {
        IPluginService iPluginService = f69293d;
        if (iPluginService != null) {
            iPluginService.c().a(d.a());
            try {
                if (!f69292c) {
                    iPluginService.a("com.ss.android.ugc.aweme.rn_kit", "gnustl_shared");
                    iPluginService.a("com.ss.android.ugc.aweme.rn_kit", "icu_common");
                }
                iPluginService.a("com.ss.android.ugc.aweme.rn_kit", "jsc");
                iPluginService.a("com.ss.android.ugc.aweme.rn_kit", "reactnativejni");
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.c.c.f
    public final void a() {
        c.a aVar = new c.a();
        aVar.f35089a = "com.ss.android.ugc.aweme.rn_kit";
        aVar.f35091c = true;
        a.C0790a aVar2 = new a.C0790a();
        aVar2.f35065a = false;
        aVar.f35094f = aVar2.a();
        aVar.f35092d = new a();
        c a2 = aVar.a();
        IPluginService iPluginService = f69293d;
        if (iPluginService != null) {
            iPluginService.a(a2);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.f
    public final boolean b() {
        IPluginService iPluginService = f69293d;
        if (iPluginService == null) {
            return false;
        }
        if (!iPluginService.b()) {
            return true;
        }
        if (iPluginService.a("com.ss.android.ugc.aweme.rn_kit")) {
            if (!f69291b) {
                f69291b = c();
            }
            if (f69291b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.c.c.f
    public final boolean a(b bVar) {
        l.d(bVar, "");
        l.c(bVar, "");
        return false;
    }
}
