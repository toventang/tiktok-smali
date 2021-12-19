package com.ss.android.ugc.aweme.settingsrequest;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import f.a.v;
import f.a.w;

final /* synthetic */ class g implements w {

    /* renamed from: a  reason: collision with root package name */
    private final f f123225a;

    /* renamed from: b  reason: collision with root package name */
    private final IESSettingsProxy f123226b;

    static {
        Covode.recordClassIndex(80928);
    }

    g(f fVar, IESSettingsProxy iESSettingsProxy) {
        this.f123225a = fVar;
        this.f123226b = iESSettingsProxy;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        f fVar = this.f123225a;
        IESSettingsProxy iESSettingsProxy = this.f123226b;
        fVar.c(iESSettingsProxy);
        vVar.a(iESSettingsProxy);
        vVar.a();
    }
}
