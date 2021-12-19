package com.bytedance.globalpayment.iap.common.ability.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;

final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f30330a;

    /* renamed from: b  reason: collision with root package name */
    private final d f30331b;

    /* renamed from: c  reason: collision with root package name */
    private final IapChannelUserData f30332c;

    static {
        Covode.recordClassIndex(17588);
    }

    m(e eVar, d dVar, IapChannelUserData iapChannelUserData) {
        this.f30330a = eVar;
        this.f30331b = dVar;
        this.f30332c = iapChannelUserData;
    }

    public final void run() {
        this.f30330a.c();
    }
}
