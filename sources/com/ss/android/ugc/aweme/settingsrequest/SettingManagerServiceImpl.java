package com.ss.android.ugc.aweme.settingsrequest;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.request_combine.request.a.e;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.setting.by;
import com.ss.android.ugc.aweme.settingsrequest.api.g;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class SettingManagerServiceImpl implements ISettingManagerService {
    static {
        Covode.recordClassIndex(80883);
    }

    @Override // com.ss.android.ugc.aweme.setting.ISettingManagerService
    public final void a() {
        f.e().a(new g()).a();
    }

    public static ISettingManagerService b() {
        MethodCollector.i(10351);
        Object a2 = b.a(ISettingManagerService.class, false);
        if (a2 != null) {
            ISettingManagerService iSettingManagerService = (ISettingManagerService) a2;
            MethodCollector.o(10351);
            return iSettingManagerService;
        }
        if (b.dS == null) {
            synchronized (ISettingManagerService.class) {
                try {
                    if (b.dS == null) {
                        b.dS = new SettingManagerServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10351);
                    throw th;
                }
            }
        }
        SettingManagerServiceImpl settingManagerServiceImpl = (SettingManagerServiceImpl) b.dS;
        MethodCollector.o(10351);
        return settingManagerServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.setting.ISettingManagerService
    public final void a(Context context) {
        l.d(context, "");
        by.f122128a.a(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.ISettingManagerService
    public final void a(int i2) {
        f.e().a(new e(i2)).a();
    }
}
