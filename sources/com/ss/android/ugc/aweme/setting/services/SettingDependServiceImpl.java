package com.ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import java.util.List;

public final class SettingDependServiceImpl implements ISettingDependService {
    static {
        Covode.recordClassIndex(80511);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final List<String> a() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final List<String> b() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final String c() {
        return b.a().a(true, "login_device_manager_url", "");
    }

    public static ISettingDependService d() {
        MethodCollector.i(8039);
        Object a2 = com.ss.android.ugc.b.a(ISettingDependService.class, false);
        if (a2 != null) {
            ISettingDependService iSettingDependService = (ISettingDependService) a2;
            MethodCollector.o(8039);
            return iSettingDependService;
        }
        if (com.ss.android.ugc.b.dP == null) {
            synchronized (ISettingDependService.class) {
                try {
                    if (com.ss.android.ugc.b.dP == null) {
                        com.ss.android.ugc.b.dP = new SettingDependServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8039);
                    throw th;
                }
            }
        }
        SettingDependServiceImpl settingDependServiceImpl = (SettingDependServiceImpl) com.ss.android.ugc.b.dP;
        MethodCollector.o(8039);
        return settingDependServiceImpl;
    }
}
