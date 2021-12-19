package com.bytedance.android.livesdkapi;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import f.a.d.f;

final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final o f23201a;

    static {
        Covode.recordClassIndex(13752);
    }

    g(o oVar) {
        this.f23201a = oVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        o oVar = this.f23201a;
        SettingsManager.INSTANCE.saveSettingsValue(oVar);
        e.f13997a.storeString("setting_key", oVar.toString());
    }
}
