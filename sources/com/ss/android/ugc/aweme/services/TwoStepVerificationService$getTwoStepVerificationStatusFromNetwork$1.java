package com.ss.android.ugc.aweme.services;

import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.twostep.a;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.utils.ai;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;

final class TwoStepVerificationService$getTwoStepVerificationStatusFromNetwork$1<TTaskResult, TContinuationResult> implements g {
    final /* synthetic */ TwoStepVerificationService this$0;

    static {
        Covode.recordClassIndex(79573);
    }

    TwoStepVerificationService$getTwoStepVerificationStatusFromNetwork$1(TwoStepVerificationService twoStepVerificationService) {
        this.this$0 = twoStepVerificationService;
    }

    @Override // b.g
    public final i<Boolean> then(i<a> iVar) {
        if (!ai.a(iVar)) {
            if (this.this$0.getResponse().get(cj.b()) != null) {
                this.this$0.getResponse().remove(cj.b());
            }
            return i.a((Object) null);
        }
        l.b(iVar, "");
        a d2 = iVar.d();
        if (!p.a("success", d2.getMessage(), true) || d2.getData() == null) {
            if (this.this$0.getResponse().get(cj.b()) != null) {
                this.this$0.getResponse().remove(cj.b());
            }
            return i.a((Object) null);
        }
        HashMap<String, a> response = this.this$0.getResponse();
        String b2 = cj.b();
        l.b(b2, "");
        l.b(d2, "");
        response.put(b2, d2);
        this.this$0.setTwoStepVerificationResponseToCache(d2);
        return i.a(Boolean.valueOf(!TextUtils.isEmpty(d2.getData().getDefault_verify_way())));
    }
}
