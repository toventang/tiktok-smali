package com.ss.android.ugc.aweme.miniapp.utils;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.miniapp.d.a;
import com.ss.android.ugc.aweme.miniapp_api.c;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.Arrays;
import java.util.List;

public class MiniAppInitTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private ae f109662a;

    static {
        Covode.recordClassIndex(70189);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return this.f109662a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public MiniAppInitTask(ae aeVar) {
        this.f109662a = aeVar;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            IPluginService d2 = AabPluginServiceImpl.d();
            boolean z = false;
            if (d2 != null && d2.b() && d2.a("com.ss.android.ugc.i18n.miniapp") && d2.a("com.ss.android.ugc.aweme.rn_kit")) {
                z = true;
            }
            if (!z) {
                c.a("com.ss.android.ugc.i18n.miniapp", Arrays.asList("com.ss.android.ugc.aweme.rn_kit"), true, null);
            }
            IMiniAppService a2 = c.a.f109704a.a();
            if (a2 != null && a.a()) {
                a2.initMiniApp(null);
            }
        }
    }
}
