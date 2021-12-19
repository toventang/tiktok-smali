package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ca;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.en;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class b implements IHostContextDepend {
    static {
        Covode.recordClassIndex(63703);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getSkinName() {
        return "white";
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getSkinType() {
        return "white";
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final int getAppId() {
        return d.n;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getChannel() {
        return d.s;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getAppName() {
        return d.b();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final long getVersionCode() {
        return d.e();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getVersionName() {
        return d.f();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final boolean isTeenMode() {
        return in.d();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final Application getApplication() {
        Context a2 = d.a();
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.Application");
        return (Application) a2;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getDeviceId() {
        String deviceId = DeviceRegisterManager.getDeviceId();
        l.b(deviceId, "");
        return deviceId;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getLanguage() {
        String locale = en.a().toString();
        l.b(locale, "");
        return locale;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getPackageName() {
        String packageName = d.a().getPackageName();
        l.b(packageName, "");
        return packageName;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getUpdateVersion() {
        return String.valueOf(d.d());
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final boolean isDebuggable() {
        if (l.a((Object) d.s, (Object) "local_test")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final Context getApplicationContext() {
        Context applicationContext = getApplication().getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        l.a((Object) applicationContext, "");
        return applicationContext;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getBoeChannel() {
        Object service = ServiceManager.get().getService(LocalTestApi.class);
        l.b(service, "");
        String boeLane = ((LocalTestApi) service).getBoeLane();
        l.b(boeLane, "");
        return boeLane;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getCurrentTelcomCarrier() {
        ca l2;
        com.ss.android.ugc.aweme.account.b.a();
        IAccountService iAccountService = com.ss.android.ugc.aweme.account.b.f62864a;
        if (iAccountService == null || (l2 = iAccountService.l()) == null) {
            return null;
        }
        return l2.getCurrentTelecomCarrier();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getPPEChannel() {
        String pPELane = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getPPELane();
        l.b(pPELane, "");
        return pPELane;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final boolean isBoeEnable() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final boolean isPPEEnable() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enablePpe();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final List<com.bytedance.ies.xbridge.base.runtime.a.b> getSettings(List<com.bytedance.ies.xbridge.base.runtime.a.a> list) {
        Object obj;
        Object a2;
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : list) {
            String str = t.f35781a;
            if (str.hashCode() == 3322092 && str.equals("live")) {
                arrayList2.add(t.f35782b);
            } else {
                arrayList.add(t.f35782b);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!arrayList2.isEmpty()) {
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            Map<String, Object> a3 = s.k().a(arrayList2);
            l.b(a3, "");
            linkedHashMap.putAll(a3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!arrayList.isEmpty()) {
            Map<String, Object> settings = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getSettings(arrayList);
            l.b(settings, "");
            linkedHashMap2.putAll(settings);
        }
        ArrayList arrayList3 = new ArrayList();
        for (T t2 : list) {
            if (l.a((Object) t2.f35781a, (Object) "live")) {
                obj = linkedHashMap.get(t2.f35782b);
            } else {
                obj = linkedHashMap2.get(t2.f35782b);
            }
            if (!(obj == null || (a2 = a(t2.f35783c, obj)) == null)) {
                arrayList3.add(new com.bytedance.ies.xbridge.base.runtime.a.b(t2.f35782b, a2));
            }
        }
        return arrayList3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:72|73|74|75|76|(2:80|(1:88)(1:89))(3:90|93|(1:95)(1:96))) */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x00ea */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object a(com.bytedance.ies.xbridge.base.runtime.a.c r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.i18n.xbridge.b.a.b.a(com.bytedance.ies.xbridge.base.runtime.a.c, java.lang.Object):java.lang.Object");
    }
}
