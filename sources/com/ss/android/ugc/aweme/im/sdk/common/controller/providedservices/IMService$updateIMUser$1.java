package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.a;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.UserStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.am;

/* access modifiers changed from: package-private */
public final class IMService$updateIMUser$1 extends k implements m<am, d<? super z>, Object> {
    final /* synthetic */ IMUser $user;
    int label;
    final /* synthetic */ IMService this$0;

    static {
        Covode.recordClassIndex(65502);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IMService$updateIMUser$1(IMService iMService, IMUser iMUser, d dVar) {
        super(2, dVar);
        this.this$0 = iMService;
        this.$user = iMUser;
    }

    @Override // h.c.b.a.a
    public final d<z> create(Object obj, d<?> dVar) {
        l.d(dVar, "");
        return new IMService$updateIMUser$1(this.this$0, this.$user, dVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // h.f.a.m
    public final Object invoke(am amVar, d<? super z> dVar) {
        return ((IMService$updateIMUser$1) create(amVar, dVar)).invokeSuspend(z.f158842a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        UserStruct userStruct;
        if (this.label == 0) {
            r.a(obj);
            if (this.$user.getAvatarThumb() == null) {
                User user = null;
                try {
                    userStruct = a.f102469a.queryUser(this.$user.getUid(), this.$user.getSecUid()).get();
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.im.service.m.a.a(e2);
                    userStruct = null;
                }
                if (userStruct != null) {
                    user = userStruct.getUser();
                }
                if (user != null) {
                    User user2 = userStruct.getUser();
                    l.b(user2, "");
                    user2.setFollowStatus(this.$user.getFollowStatus());
                    IMUser fromUser = IMUser.fromUser(userStruct.getUser());
                    this.this$0.updateContactName(fromUser);
                    g.a(fromUser);
                }
            } else {
                this.this$0.updateContactName(this.$user);
                g.a(this.$user);
            }
            return z.f158842a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
