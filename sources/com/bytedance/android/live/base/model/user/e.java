package com.bytedance.android.live.base.model.user;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class e implements b<FollowInfo> {
    static {
        Covode.recordClassIndex(3637);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ FollowInfo a(f fVar) {
        return b(fVar);
    }

    public static FollowInfo b(f fVar) {
        FollowInfo followInfo = new FollowInfo();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return followInfo;
            } else if (b2 == 1) {
                followInfo.followingCount = fVar.f();
            } else if (b2 == 2) {
                followInfo.followerCount = fVar.f();
            } else if (b2 == 3) {
                followInfo.followStatus = fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                followInfo.pushStatus = fVar.f();
            }
        }
    }
}
