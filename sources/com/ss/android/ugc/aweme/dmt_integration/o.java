package com.ss.android.ugc.aweme.dmt_integration;

import androidx.fragment.app.e;
import com.bef.effectsdk.BuildConfig;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.e.a;
import com.ss.android.ugc.aweme.effect.h;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.internal.f;
import h.f.b.l;
import java.util.List;

public final class o implements f {
    static {
        Covode.recordClassIndex(51694);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.f
    public final String b() {
        l.b(BuildConfig.VERSION_NAME, "");
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.f
    public final String a() {
        g.a();
        l.b("142710f02c3a11e8b42429f14557854a", "");
        return "142710f02c3a11e8b42429f14557854a";
    }

    @Override // com.ss.android.ugc.aweme.port.internal.f
    public final int c() {
        IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        Integer editEffectAutoDownloadSize = iESSettingsProxy.getEditEffectAutoDownloadSize();
        l.b(editEffectAutoDownloadSize, "");
        return editEffectAutoDownloadSize.intValue();
    }

    @Override // com.ss.android.ugc.aweme.port.internal.f
    public final List<String> d() {
        IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        List<String> filterColors = iESSettingsProxy.getFilterColors();
        l.b(filterColors, "");
        return filterColors;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.f
    public final a a(e eVar) {
        l.d(eVar, "");
        return new h(eVar);
    }
}
