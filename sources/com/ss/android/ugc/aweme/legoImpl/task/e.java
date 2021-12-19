package com.ss.android.ugc.aweme.legoImpl.task;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f108030a = new e();

    static {
        Covode.recordClassIndex(69270);
    }

    private e() {
    }

    @Override // b.g
    public final Object then(i iVar) {
        a.a("TokenSdkTask finished, start to fetch IM token");
        IMService.createIIMServicebyMonsterPlugin(false).ensureIMState();
        return null;
    }
}
