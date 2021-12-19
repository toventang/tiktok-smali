package com.ss.android.ugc.aweme.miniapp.abtest;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.m;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;

public final class MiniAppPluginInstallABTask implements w {
    static {
        Covode.recordClassIndex(70162);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 17;
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
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        if (!m.b()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        try {
            int a2 = b.a().a("miniapp_plugin_install_strategy", ClientExpManager.miniapp_plugin_install_strategy());
            if (a2 != 0) {
                if (a2 != 1) {
                    a.a(ae.BOOT_FINISH);
                    return;
                }
                return;
            }
        } catch (Throwable unused) {
        }
        a.a(ae.BOOT_FINISH);
    }
}
