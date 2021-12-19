package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class au implements b {

    /* renamed from: a  reason: collision with root package name */
    private final ak f131418a;

    /* renamed from: b  reason: collision with root package name */
    private final int f131419b;

    static {
        Covode.recordClassIndex(86096);
    }

    au(ak akVar, int i2) {
        this.f131418a = akVar;
        this.f131419b = i2;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        ak akVar = this.f131418a;
        int i2 = this.f131419b;
        akVar.T = i2;
        akVar.a(i2);
        akVar.K = "";
        akVar.b();
        IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).updateFeedEvent();
        return z.f158842a;
    }
}
