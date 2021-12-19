package com.ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.service.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public interface j extends b<i> {
    static {
        Covode.recordClassIndex(76189);
    }

    void a(int i2, g gVar);

    void a(User user, g gVar, boolean z);

    public static final class a {
        static {
            Covode.recordClassIndex(76190);
        }

        public static /* synthetic */ void a(j jVar, g gVar, int i2) {
            if ((i2 & 2) != 0) {
                gVar = g.NORMAL;
            }
            jVar.a(0, gVar);
        }

        public static /* synthetic */ void a(j jVar, User user, g gVar, boolean z, int i2) {
            if ((i2 & 2) != 0) {
                gVar = g.NORMAL;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            jVar.a(user, gVar, z);
        }
    }
}
