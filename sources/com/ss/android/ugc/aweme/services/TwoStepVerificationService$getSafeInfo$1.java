package com.ss.android.ugc.aweme.services;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.twostep.x;
import com.ss.android.ugc.aweme.utils.ai;
import h.f.b.l;
import h.m.p;

final class TwoStepVerificationService$getSafeInfo$1<TTaskResult, TContinuationResult> implements g {
    public static final TwoStepVerificationService$getSafeInfo$1 INSTANCE = new TwoStepVerificationService$getSafeInfo$1();

    static {
        Covode.recordClassIndex(79572);
    }

    TwoStepVerificationService$getSafeInfo$1() {
    }

    @Override // b.g
    public final i<Boolean> then(i<x> iVar) {
        x.a data;
        boolean z = false;
        if (!ai.a(iVar)) {
            return i.a((Object) false);
        }
        l.b(iVar, "");
        x d2 = iVar.d();
        if (!p.a("success", d2.getMessage(), true) || (data = d2.getData()) == null || data.getNew_notice() == null) {
            return i.a((Object) false);
        }
        if (d2.getData().getNew_notice().intValue() > 0) {
            z = true;
        }
        return i.a(Boolean.valueOf(z));
    }
}
