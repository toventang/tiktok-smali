package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.trusted.a;
import com.ss.android.ugc.aweme.account.login.trusted.h;
import com.ss.android.ugc.aweme.account.login.trusted.i;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public final class LoginMethodService$updateLoginHistoryState$1 extends m implements b<a, z> {
    final /* synthetic */ b $callback;
    final /* synthetic */ int $targetState;
    final /* synthetic */ LoginMethodService this$0;

    static {
        Covode.recordClassIndex(79513);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginMethodService$updateLoginHistoryState$1(LoginMethodService loginMethodService, int i2, b bVar) {
        super(1);
        this.this$0 = loginMethodService;
        this.$targetState = i2;
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
        String curSecUserId;
        a.C1426a aVar2;
        if (aVar == null || (aVar2 = aVar.f63690b) == null) {
            i2 = -1;
        } else {
            i2 = aVar2.f63691a;
        }
        boolean z = false;
        if (i2 == this.$targetState && (curSecUserId = this.this$0.getCurSecUserId()) != null) {
            if (i2 == 1) {
                z = true;
            }
            com.ss.android.ugc.aweme.user.a.a(curSecUserId, z);
            if (!z) {
                List<h> b2 = i.b();
                Iterator<T> it = b2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (l.a((Object) next.f63717b, (Object) curSecUserId)) {
                        if (next != null) {
                            b2.remove(next);
                            i.a(b2);
                        }
                    }
                }
            }
        }
        b bVar = this.$callback;
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i2));
        }
    }
}
