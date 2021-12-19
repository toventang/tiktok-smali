package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mix.api.b;
import com.ss.android.ugc.aweme.port.in.ah;

public final class IAVMixFeedServiceImpl$showAddToMixInPublishPage$1 implements b {
    final /* synthetic */ ah $result;

    static {
        Covode.recordClassIndex(79452);
    }

    IAVMixFeedServiceImpl$showAddToMixInPublishPage$1(ah ahVar) {
        this.$result = ahVar;
    }

    @Override // com.ss.android.ugc.aweme.mix.api.b
    public final void chooseMixResult(String str, String str2) {
        this.$result.a(str, str2);
    }
}
