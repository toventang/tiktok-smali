package com.ss.android.ugc.aweme.commercialize.depend;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.utils.en;
import h.f.b.l;
import h.o;

public final class q implements IHostContextDepend {
    static {
        Covode.recordClassIndex(45431);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isDebuggable() {
        return false;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isTeenMode() {
        return false;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final int getAppId() {
        return d.n;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getChannel() {
        return d.s;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getAppName() {
        return d.b();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getUserAgent() {
        return RawURLGetter.a("other");
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final long getVersionCode() {
        return d.e();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getVersionName() {
        return d.f();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final Application getApplication() {
        Application a2 = g.a();
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getCurrentTelcomCarrier() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getDeviceId() {
        String deviceId = DeviceRegisterManager.getDeviceId();
        l.b(deviceId, "");
        return deviceId;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getLanguage() {
        String locale = en.a().toString();
        l.b(locale, "");
        return locale;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getPPEChannel() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getPackageName() {
        String packageName = d.a().getPackageName();
        l.b(packageName, "");
        return packageName;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getRegion() {
        String g2 = com.ss.android.ugc.aweme.language.d.g();
        l.b(g2, "");
        return g2;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getSkinName() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getSkinType() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getUpdateVersion() {
        return String.valueOf(d.d());
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isBoeEnable() {
        return a.C2792a.f108997a.f108996a.enableBoe();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isPPEEnable() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final Context getApplicationContext() {
        Context applicationContext = getApplication().getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        l.a((Object) applicationContext, "");
        return applicationContext;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getBoeChannel() {
        LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
        l.b(localTestApi, "");
        String boeLane = localTestApi.getBoeLane();
        l.b(boeLane, "");
        return boeLane;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isMiniAppEnable() {
        c cVar = c.a.f109704a;
        l.b(cVar, "");
        IMiniAppService a2 = cVar.a();
        if (a2 == null || !a2.checkMiniAppEnable(d.a())) {
            return false;
        }
        return true;
    }
}
