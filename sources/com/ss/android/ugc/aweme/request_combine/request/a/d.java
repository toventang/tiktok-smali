package com.ss.android.ugc.aweme.request_combine.request.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.setting.cg;
import com.ss.android.ugc.aweme.setting.ch;
import h.f.b.l;
import java.util.List;

public final class d implements r {
    static {
        Covode.recordClassIndex(78562);
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        if (!ch.f122171a.getBoolean("key_has_setting", false)) {
            return aa.NORMAL;
        }
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Boolean disableDelayFetchShareSettingRequest = iESSettingsProxy.getDisableDelayFetchShareSettingRequest();
            l.b(disableDelayFetchShareSettingRequest, "");
            if (disableDelayFetchShareSettingRequest.booleanValue()) {
                return aa.NORMAL;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return aa.IDLE;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        cg.a().b();
    }
}
