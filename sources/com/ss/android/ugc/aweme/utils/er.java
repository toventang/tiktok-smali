package com.ss.android.ugc.aweme.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.c.e;
import com.ss.android.ugc.aweme.launcher.service.crashsdk.a;
import com.ss.android.ugc.aweme.settings.u;

public final class er extends e {
    static {
        Covode.recordClassIndex(93492);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "LooperProtectEnhancePlugin";
    }

    @Override // com.bytedance.platform.godzilla.c.e
    public final boolean c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.a.h
    public final boolean a(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        u.b bVar;
        if (!(th == null || (stackTrace = th.getStackTrace()) == null || (bVar = (u.b) SettingsManager.a().a("looper_protect_enhance", u.b.class, u.f123134a)) == null || bVar.f123141a == null || bVar.f123141a.isEmpty())) {
            for (u.a aVar : bVar.f123141a) {
                if (!TextUtils.isEmpty(aVar.f123135a) && !TextUtils.isEmpty(aVar.f123136b) && !TextUtils.isEmpty(aVar.f123137c) && !TextUtils.isEmpty(aVar.f123138d)) {
                    if ((aVar.f123139e == null || aVar.f123139e.contains(Build.MANUFACTURER + " " + Build.MODEL)) && ((aVar.f123140f == null || aVar.f123140f.contains(Integer.valueOf(Build.VERSION.SDK_INT))) && th.getClass().getName().equals(aVar.f123135a) && th.getMessage() != null && th.getMessage().contains(aVar.f123136b))) {
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            if (aVar.f123137c.equals(stackTraceElement.getClassName()) && aVar.f123138d.equals(stackTraceElement.getMethodName())) {
                                a.f107292a.a(new LooperProtectEnhanceThrowable("LOOPER_PROTECT_ENHANCE_SUCCESS", th), "LOOPER_PROTECT_ENHANCE_SUCCESS");
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }
}
