package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class bm implements b<FansClubData> {
    static {
        Covode.recordClassIndex(11344);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ FansClubData a(f fVar) {
        return b(fVar);
    }

    public static FansClubData b(f fVar) {
        FansClubData fansClubData = new FansClubData();
        fansClubData.availableGiftIds = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        fansClubData.clubName = fVar.d();
                        break;
                    case 2:
                        fansClubData.level = fVar.e();
                        break;
                    case 3:
                        fansClubData.userFansClubStatus = fVar.e();
                        break;
                    case 4:
                        fansClubData.badge = bn.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        fansClubData.availableGiftIds.add(Long.valueOf(g.b(fVar)));
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        fansClubData.anchorId = g.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return fansClubData;
            }
        }
    }
}
