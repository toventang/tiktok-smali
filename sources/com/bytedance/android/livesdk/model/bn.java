package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class bn implements b<FansClubData.UserBadge> {
    static {
        Covode.recordClassIndex(11345);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ FansClubData.UserBadge a(f fVar) {
        return b(fVar);
    }

    public static FansClubData.UserBadge b(f fVar) {
        FansClubData.UserBadge userBadge = new FansClubData.UserBadge();
        userBadge.icons = new HashMap();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return userBadge;
            } else if (b2 == 1) {
                long a3 = fVar.a();
                Integer num = null;
                ImageModel imageModel = null;
                while (true) {
                    int b3 = fVar.b();
                    if (b3 == -1) {
                        break;
                    } else if (b3 == 1) {
                        num = Integer.valueOf(fVar.e());
                    } else if (b3 == 2) {
                        imageModel = com.bytedance.android.live.base.model.f.b(fVar);
                    }
                }
                fVar.a(a3);
                if (num == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (imageModel != null) {
                    userBadge.icons.put(num, imageModel);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                userBadge.title = fVar.d();
            }
        }
    }
}
