package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.language.b;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import h.f.b.l;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class IAVSettingServiceImpl implements IAVSettingService {
    private final ISettingService settingService = SettingServiceImpl.v();

    static {
        Covode.recordClassIndex(79455);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public final String getAppLanguage() {
        return this.settingService.h();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public final String getAppLogRegion() {
        return this.settingService.n();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public final Locale getCountryLocale() {
        return this.settingService.q();
    }

    public final List<b> getI18nItems() {
        return this.settingService.i();
    }

    public final Map<String, b> getLocaleMap() {
        return this.settingService.j();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public final String getRegion() {
        return this.settingService.m();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public final String getSysLanguage() {
        return this.settingService.k();
    }

    public final String getSysRegion() {
        return this.settingService.l();
    }

    public final void installCommonParams() {
        this.settingService.r();
    }

    public final boolean isIndonesiaByMcc() {
        return this.settingService.o();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public final boolean isKorean() {
        return this.settingService.p();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public final boolean getSaveAtPost() {
        return SettingsManager.a().a("disable_save_at_post", false);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public final b getCurrentI18nItem(Context context) {
        l.d(context, "");
        return this.settingService.a(context);
    }

    public final String getLanguage(Locale locale) {
        l.d(locale, "");
        return this.settingService.a(locale);
    }

    public final Locale getLocale(String str) {
        l.d(str, "");
        return this.settingService.a(str);
    }

    public final boolean isArabicLang(Context context) {
        l.d(context, "");
        return this.settingService.b(context);
    }

    public static IAVSettingService createIAVSettingServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(9688);
        Object a2 = com.ss.android.ugc.b.a(IAVSettingService.class, z);
        if (a2 != null) {
            IAVSettingService iAVSettingService = (IAVSettingService) a2;
            MethodCollector.o(9688);
            return iAVSettingService;
        }
        if (com.ss.android.ugc.b.dt == null) {
            synchronized (IAVSettingService.class) {
                try {
                    if (com.ss.android.ugc.b.dt == null) {
                        com.ss.android.ugc.b.dt = new IAVSettingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9688);
                    throw th;
                }
            }
        }
        IAVSettingServiceImpl iAVSettingServiceImpl = (IAVSettingServiceImpl) com.ss.android.ugc.b.dt;
        MethodCollector.o(9688);
        return iAVSettingServiceImpl;
    }

    public final void switchLocale(String str, String str2, Context context) {
        l.d(str, "");
        l.d(str2, "");
        l.d(context, "");
        this.settingService.a(str, str2, context);
    }
}
