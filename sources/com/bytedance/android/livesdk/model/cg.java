package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class cg implements b<RoomAuthStatus> {
    static {
        Covode.recordClassIndex(11365);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ RoomAuthStatus a(f fVar) {
        return b(fVar);
    }

    public static RoomAuthStatus b(f fVar) {
        RoomAuthStatus roomAuthStatus = new RoomAuthStatus();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return roomAuthStatus;
            } else if (b2 == 1) {
                roomAuthStatus.enableChat = g.a(fVar);
            } else if (b2 == 2) {
                roomAuthStatus.enableDanmaku = g.a(fVar);
            } else if (b2 == 3) {
                roomAuthStatus.enableGift = g.a(fVar);
            } else if (b2 == 4) {
                roomAuthStatus.enableLuckMoney = g.a(fVar);
            } else if (b2 == 5) {
                roomAuthStatus.enableDigg = g.a(fVar);
            } else if (b2 == 7) {
                roomAuthStatus.enableRoomContributor = g.a(fVar);
            } else if (b2 == 8) {
                roomAuthStatus.enableProps = g.a(fVar);
            } else if (b2 == 12) {
                roomAuthStatus.bannerState = (int) fVar.f();
            } else if (b2 == 15) {
                roomAuthStatus.landscape = (int) fVar.f();
            } else if (b2 == 20) {
                roomAuthStatus.donationSticker = (int) fVar.f();
            } else if (b2 == 100) {
                roomAuthStatus.roomAuthOffReasons = cf.b(fVar);
            } else if (b2 == 17) {
                roomAuthStatus.messageType = (int) fVar.f();
            } else if (b2 == 18) {
                roomAuthStatus.anchorGiftType = (int) fVar.f();
            } else if (b2 == 34) {
                roomAuthStatus.chatSubOnly = g.a(fVar);
            } else if (b2 != 35) {
                switch (b2) {
                    case 25:
                        roomAuthStatus.enableQuestion = g.a(fVar);
                        continue;
                    case 26:
                        roomAuthStatus.enableChatL2 = g.a(fVar);
                        continue;
                    case 27:
                        roomAuthStatus.enableViewers = g.a(fVar);
                        continue;
                    case 28:
                        roomAuthStatus.enableShare = g.a(fVar);
                        continue;
                    case 29:
                        roomAuthStatus.rankingsSwitchStatus = fVar.e();
                        continue;
                    case 30:
                        roomAuthStatus.enablePromote = g.a(fVar);
                        continue;
                    case 31:
                        roomAuthStatus.userCountDisplayState = (int) fVar.f();
                        continue;
                    case 32:
                        roomAuthStatus.rankState = (int) fVar.f();
                        continue;
                    default:
                        g.c(fVar);
                        continue;
                }
            } else {
                roomAuthStatus.anchorRedEnvelopeType = (int) fVar.f();
            }
        }
    }
}
