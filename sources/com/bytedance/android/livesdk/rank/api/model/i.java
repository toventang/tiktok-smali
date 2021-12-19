package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class i implements b<CurrentRankListResponse> {
    static {
        Covode.recordClassIndex(12179);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ CurrentRankListResponse a(f fVar) {
        CurrentRankListResponse currentRankListResponse = new CurrentRankListResponse();
        currentRankListResponse.ranks = new ArrayList();
        currentRankListResponse.seats = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        currentRankListResponse.ranks.add(j.b(fVar));
                        break;
                    case 2:
                        currentRankListResponse.seats.add(j.b(fVar));
                        break;
                    case 3:
                        currentRankListResponse.selfInfo = j.b(fVar);
                        break;
                    case 4:
                        currentRankListResponse.hasMore = g.a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        currentRankListResponse.musicWave = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        currentRankListResponse.total = g.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return currentRankListResponse;
            }
        }
    }
}
