package com.ss.android.ugc.aweme.miniapp_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.plugin.a.a;
import com.bytedance.ies.ugc.aweme.plugin.a.c;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.Arrays;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(70211);
    }

    /* access modifiers changed from: package-private */
    public static class a implements com.bytedance.ies.ugc.aweme.plugin.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f109666a;

        static {
            Covode.recordClassIndex(70212);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
        public final void a(String str, int i2) {
        }

        public a(Runnable runnable) {
            this.f109666a = runnable;
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
        public final void a(String str, boolean z) {
            IPluginService d2 = AabPluginServiceImpl.d();
            if (d2 != null) {
                d2.c();
                d2.c().a(d.a());
                Runnable runnable = this.f109666a;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static boolean a(boolean z, Runnable runnable) {
        if (AabPluginServiceImpl.d() == null) {
            return false;
        }
        if (!z) {
            return a("com.ss.android.ugc.i18n.miniapp", Arrays.asList("com.ss.android.ugc.aweme.rn_kit"), false, runnable);
        }
        return a("com.ss.android.ugc.i18n.miniapp_so", Arrays.asList("com.ss.android.ugc.aweme.rn_kit", "com.ss.android.ugc.i18n.miniapp"), false, runnable);
    }

    public static boolean a(String str, List<String> list, boolean z, Runnable runnable) {
        IPluginService d2 = AabPluginServiceImpl.d();
        if (d2 == null || !d2.b()) {
            return false;
        }
        c.a aVar = new c.a();
        aVar.f35089a = str;
        aVar.f35091c = z;
        aVar.f35092d = new a(runnable);
        a.C0790a aVar2 = new a.C0790a();
        aVar2.f35065a = true;
        aVar2.f35066b = true;
        aVar2.f35067c = true;
        aVar2.f35068d = true;
        aVar2.f35069e = false;
        aVar2.f35072h = list;
        aVar.f35094f = aVar2.a();
        d2.a(aVar.a());
        return true;
    }
}
