package com.ss.android.ugc.aweme.compliance.protection.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.c;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.b.l;

public final class AntiAddictionServiceImpl implements IAntiAddictionService {
    static {
        Covode.recordClassIndex(48364);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final boolean d() {
        return f.a();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final String e() {
        return f.b();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final String f() {
        String str = f.f77934a;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final al g() {
        return new c();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final String a() {
        b a2 = b.a();
        String str = a2.f77916f;
        a2.f77916f = "";
        return str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final int b() {
        b a2 = b.a();
        boolean z = a2.f77915e;
        a2.f77915e = false;
        return z ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final void c() {
        r.a("addict_alert", new d().f66730a);
    }

    public static IAntiAddictionService h() {
        MethodCollector.i(8607);
        Object a2 = com.ss.android.ugc.b.a(IAntiAddictionService.class, false);
        if (a2 != null) {
            IAntiAddictionService iAntiAddictionService = (IAntiAddictionService) a2;
            MethodCollector.o(8607);
            return iAntiAddictionService;
        }
        if (com.ss.android.ugc.b.aQ == null) {
            synchronized (IAntiAddictionService.class) {
                try {
                    if (com.ss.android.ugc.b.aQ == null) {
                        com.ss.android.ugc.b.aQ = new AntiAddictionServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8607);
                    throw th;
                }
            }
        }
        AntiAddictionServiceImpl antiAddictionServiceImpl = (AntiAddictionServiceImpl) com.ss.android.ugc.b.aQ;
        MethodCollector.o(8607);
        return antiAddictionServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final void a(IESSettingsProxy iESSettingsProxy) {
        l.d(iESSettingsProxy, "");
        b a2 = b.a();
        a2.f77911a = SettingsManager.a().a("anti_addiction_separation", 22);
        a2.f77912b = iESSettingsProxy.getAntiAddictionDayTime().intValue();
        a2.f77913c = iESSettingsProxy.getAntiAddictionNightTime().intValue();
        a2.f77914d = iESSettingsProxy.getAntiAddictionToastTime().intValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final void a(Aweme aweme) {
        String str;
        l.d(aweme, "");
        if (b.a().a(System.currentTimeMillis())) {
            str = "night";
        } else {
            str = "day";
        }
        MobClick value = MobClick.obtain().setEventName("video_play").setLabelName("homepage_hot").setValue(aweme.getAid());
        String str2 = "1";
        com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("is_addicted", str2).a("appear_time", str);
        if (!aweme.getAllowGift()) {
            str2 = "0";
        }
        r.onEvent(value.setJsonObject(a2.a("is_giftable", str2).a()));
    }
}
