package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.am;

final class IMService$updateIMUserFollowStatus$1 extends k implements m<am, d<? super z>, Object> {
    final /* synthetic */ IMUser $user;
    int label;
    final /* synthetic */ IMService this$0;

    static {
        Covode.recordClassIndex(65503);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IMService$updateIMUserFollowStatus$1(IMService iMService, IMUser iMUser, d dVar) {
        super(2, dVar);
        this.this$0 = iMService;
        this.$user = iMUser;
    }

    @Override // h.c.b.a.a
    public final d<z> create(Object obj, d<?> dVar) {
        l.d(dVar, "");
        return new IMService$updateIMUserFollowStatus$1(this.this$0, this.$user, dVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // h.f.a.m
    public final Object invoke(am amVar, d<? super z> dVar) {
        return ((IMService$updateIMUserFollowStatus$1) create(amVar, dVar)).invokeSuspend(z.f158842a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        String str;
        IMUser iMUser;
        if (this.label == 0) {
            r.a(obj);
            IMUser iMUser2 = this.$user;
            String str2 = null;
            if (iMUser2 != null) {
                str = iMUser2.getUid();
            } else {
                str = null;
            }
            IMUser iMUser3 = this.$user;
            if (iMUser3 != null) {
                str2 = iMUser3.getSecUid();
            }
            IMUser a2 = g.a(str, str2);
            if (a2 == null || (iMUser = this.$user) == null) {
                a2 = this.$user;
            } else {
                a2.setFollowStatus(iMUser.getFollowStatus());
                a2.setBlock(this.$user.isBlock());
            }
            IMUser iMUser4 = this.$user;
            if (iMUser4 == null || iMUser4.getFollowStatus() != 0) {
                if (a2 != null) {
                    a2.setFollowTime(System.currentTimeMillis() / 1000);
                }
            } else if (a2 != null) {
                a2.setFollowTime(0);
            }
            this.this$0.updateIMUser(a2);
            return z.f158842a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
