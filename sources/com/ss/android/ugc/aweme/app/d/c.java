package com.ss.android.ugc.aweme.app.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.performance.ICrashEffectIdInfoListener;

final /* synthetic */ class c implements ICrashEffectIdInfoListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f66688a;

    static {
        Covode.recordClassIndex(41056);
    }

    c(b bVar) {
        this.f66688a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICrashEffectIdInfoListener
    public final void setEffectIdInfo(String str, String str2) {
        this.f66688a.f66686a.put(str, str2);
    }
}
