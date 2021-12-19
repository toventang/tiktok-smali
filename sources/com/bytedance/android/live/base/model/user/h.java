package com.bytedance.android.live.base.model.user;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;

public final class h implements b<User.a> {
    static {
        Covode.recordClassIndex(3640);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ User.a a(f fVar) {
        return b(fVar);
    }

    public static User.a b(f fVar) {
        User.a aVar = new User.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f7448a = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                aVar.f7449b = fVar.f();
            }
        }
    }
}
