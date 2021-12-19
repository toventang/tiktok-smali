package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.experiment.cx;
import com.ss.android.ugc.aweme.feed.experiment.j;
import com.ss.android.ugc.aweme.i18n.language.i18n.b;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.g.a.a.b;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;

public final class FeedRequestParamPreloadTask implements w {
    static {
        Covode.recordClassIndex(68971);
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

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
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
    public final void a(Context context) {
        l.d(context, "");
        if (cx.c()) {
            SettingsManager.a().a("network_monitor_config", b.class, j.f93070a);
            a.g().b();
            DeviceRegisterManager.getSSIDs(new LinkedHashMap());
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            l.b(createIMainServicebyMonsterPlugin, "");
            createIMainServicebyMonsterPlugin.isLimitAdTrackingEnabled();
            if (TextUtils.isEmpty(com.ss.android.ugc.aweme.lancet.j.f107223b) || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107223b = com.bytedance.common.utility.l.e(context);
            }
            l.b(b.a.f99809a, "");
            com.ss.android.ugc.aweme.i18n.language.i18n.b.a(com.ss.android.ugc.aweme.i18n.language.a.a());
        }
    }
}
