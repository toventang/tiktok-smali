package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ci implements b<RoomStats> {
    static {
        Covode.recordClassIndex(11367);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ RoomStats a(f fVar) {
        return b(fVar);
    }

    public static RoomStats b(f fVar) {
        RoomStats roomStats = new RoomStats();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return roomStats;
            } else if (b2 == 1) {
                roomStats.id = fVar.f();
            } else if (b2 == 2) {
                roomStats.idStr = fVar.d();
            } else if (b2 == 3) {
                roomStats.ticket = fVar.f();
            } else if (b2 == 5) {
                roomStats.totalUser = (int) fVar.f();
            } else if (b2 == 6) {
                roomStats.giftUVCount = (int) fVar.f();
            } else if (b2 == 7) {
                roomStats.followCount = (int) fVar.f();
            } else if (b2 == 9) {
                roomStats.watermelon = (int) fVar.f();
            } else if (b2 == 11) {
                roomStats.enterCount = (int) fVar.f();
            } else if (b2 == 16) {
                roomStats.replayViewers = (int) fVar.f();
            } else if (b2 != 17) {
                g.c(fVar);
            } else {
                roomStats.shareCount = (int) fVar.f();
            }
        }
    }
}
