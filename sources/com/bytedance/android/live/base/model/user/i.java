package com.bytedance.android.live.base.model.user;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class i implements b<User.b> {
    static {
        Covode.recordClassIndex(3641);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ User.b a(f fVar) {
        return b(fVar);
    }

    public static User.b b(f fVar) {
        User.b bVar = new User.b();
        bVar.f7450a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                bVar.f7450a.add(Long.valueOf(g.b(fVar)));
            }
        }
    }
}
