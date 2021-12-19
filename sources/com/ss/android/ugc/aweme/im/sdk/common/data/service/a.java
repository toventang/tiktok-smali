package com.ss.android.ugc.aweme.im.sdk.common.data.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.IIMAdapterService;
import com.ss.android.ugc.aweme.im.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;

/* access modifiers changed from: package-private */
public abstract class a implements IIMAdapterService {
    static {
        Covode.recordClassIndex(65634);
    }

    a() {
    }

    @Override // com.ss.android.ugc.aweme.im.IIMAdapterService
    public void a(User user) {
        IMService.createIIMServicebyMonsterPlugin(false).updateIMUserFollowStatus(c.a(user));
    }
}
