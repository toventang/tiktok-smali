package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.ss.android.ugc.aweme.kids.setting.api.ISettingService;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;
import com.ss.android.ugc.b;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;

public final class SettingServiceImpl implements ISettingService {
    static {
        Covode.recordClassIndex(68298);
    }

    public static ISettingService a() {
        MethodCollector.i(4290);
        Object a2 = b.a(ISettingService.class, false);
        if (a2 != null) {
            ISettingService iSettingService = (ISettingService) a2;
            MethodCollector.o(4290);
            return iSettingService;
        }
        if (b.bY == null) {
            synchronized (ISettingService.class) {
                try {
                    if (b.bY == null) {
                        b.bY = new SettingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4290);
                    throw th;
                }
            }
        }
        SettingServiceImpl settingServiceImpl = (SettingServiceImpl) b.bY;
        MethodCollector.o(4290);
        return settingServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.api.ISettingService
    public final void a(Activity activity) {
        l.d(activity, "");
        Intent intent = new Intent(activity, KidsSettingActivity.class);
        a.a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.api.ISettingService
    public final void a(KidsComplianceSettings kidsComplianceSettings) {
        int i2;
        l.d(kidsComplianceSettings, "");
        l.d(kidsComplianceSettings, "");
        Integer timeLockSelfInMin = kidsComplianceSettings.getTimeLockSelfInMin();
        if (timeLockSelfInMin != null) {
            i2 = timeLockSelfInMin.intValue();
        } else {
            i2 = 0;
        }
        TeenageModeSetting teenageModeSetting = new TeenageModeSetting(i2);
        com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.f106920a = teenageModeSetting;
        com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a(teenageModeSetting);
    }
}
