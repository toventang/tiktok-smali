package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.aweme.storage.a.b;
import com.aweme.storage.a.c;
import com.aweme.storage.a.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.a;
import com.bytedance.geckox.f;
import com.bytedance.geckox.j.b;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.utils.dd;
import com.ss.android.ugc.aweme.utils.gecko.GeckoExperimentsType;
import com.ss.android.ugc.aweme.web.k;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GeckoGlobalInitTask implements w {
    static {
        Covode.recordClassIndex(78620);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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
        return ae.BOOT_FINISH;
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
        int availableStorageFull;
        boolean useGeckoSettings;
        l.d(context, "");
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(new DeviceRegisterManager.a() {
            /* class com.ss.android.ugc.aweme.utils.dc.AnonymousClass4 */

            static {
                Covode.recordClassIndex(93427);
            }

            @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
            public final void a(boolean z) {
                dc.k();
            }

            @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
            public final void a(String str, String str2) {
                dc.k();
            }

            @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
            public final void a(boolean z, boolean z2) {
                dc.k();
            }
        });
        f.a().a(k.f145061a.c(), k.b().getAbsolutePath());
        HashMap hashMap = new HashMap();
        hashMap.put("business_version", dd.f142816a);
        f.a().a(k.f145061a.c(), hashMap);
        a.a().f29706d = (Map) SettingsManager.a().a("geckox_resource_clean_channel_list", Map.class, com.ss.android.sdk.webview.f.f60218a);
        if (b.f5939a) {
            a.a().f29703a = true;
            a.a().f29704b = d.f5944a;
        }
        if (c.f5941a) {
            a.a().f29703a = true;
            a.a().f29704b = com.aweme.storage.a.a.f5934a;
        }
        GeckoExperimentsType geckoExperimentsType = (GeckoExperimentsType) com.bytedance.ies.abmock.b.a().a(true, "gecko_experiments", GeckoExperimentsType.class, com.ss.android.ugc.aweme.utils.gecko.d.f143000a);
        a a2 = a.a();
        int i2 = 200;
        if (geckoExperimentsType == null) {
            availableStorageFull = 200;
        } else {
            availableStorageFull = geckoExperimentsType.getAvailableStorageFull();
        }
        a2.f29707e = availableStorageFull;
        a a3 = a.a();
        if (geckoExperimentsType != null) {
            i2 = geckoExperimentsType.getAvailableStoragePatch();
        }
        a3.f29708f = i2;
        a.a().f29709g = dc.i();
        if (geckoExperimentsType == null) {
            useGeckoSettings = true;
        } else {
            useGeckoSettings = geckoExperimentsType.getUseGeckoSettings();
        }
        dc.f142812a = useGeckoSettings;
        if (useGeckoSettings) {
            f a4 = f.a();
            a4.i();
            if (a4.f29845d != null) {
                a4.j();
                a4.f();
                if (f.f29840i) {
                    a4.f29846e.a(1);
                    long currentTimeMillis = System.currentTimeMillis();
                    a a5 = a.a();
                    l.a((Object) a5, "");
                    com.bytedance.geckox.j.b.f29912d = a5.f29703a;
                    a a6 = a.a();
                    l.a((Object) a6, "");
                    com.bytedance.geckox.j.b.f29913e = a6.f29704b;
                    a a7 = a.a();
                    l.a((Object) a7, "");
                    com.bytedance.geckox.j.b.f29914f = a7.f29705c;
                    a a8 = a.a();
                    l.a((Object) a8, "");
                    com.bytedance.geckox.j.b.f29915g = a8.f29706d;
                    if (com.bytedance.geckox.j.b.f29912d && com.bytedance.geckox.j.b.f29915g != null) {
                        com.bytedance.geckox.j.b.f29916h.a(new b.a(currentTimeMillis), 0, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Please init GeckoGlobalConfig first");
        }
    }
}
