package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.trusted.a;
import h.f.a.b;
import h.f.b.m;
import h.z;

final class LoginMethodService$fetchLoginHistoryState$1 extends m implements b<a, z> {
    final /* synthetic */ b $callback;
    final /* synthetic */ LoginMethodService this$0;

    static {
        Covode.recordClassIndex(79512);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginMethodService$fetchLoginHistoryState$1(LoginMethodService loginMethodService, b bVar) {
        super(1);
        this.this$0 = loginMethodService;
        this.$callback = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* bridge */ /* synthetic */ z invoke(a aVar) {
        invoke(aVar);
        return z.f158842a;
    }

    public final void invoke(a aVar) {
        int i2;
        a.C1426a aVar2;
        if (aVar == null || (aVar2 = aVar.f63690b) == null) {
            i2 = -1;
        } else {
            i2 = aVar2.f63691a;
        }
        String curSecUserId = this.this$0.getCurSecUserId();
        if (!(curSecUserId == null || i2 == -1 || i2 == 0)) {
            boolean z = true;
            if (i2 != 1) {
                z = false;
            }
            com.ss.android.ugc.aweme.user.a.a(curSecUserId, z);
        }
        b bVar = this.$callback;
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i2));
        }
    }
}
