package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.bu;
import com.bytedance.android.livesdk.model.bv;
import com.bytedance.android.livesdk.model.bx;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class ak implements b<GiftPage> {
    static {
        Covode.recordClassIndex(9944);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ GiftPage a(f fVar) {
        return b(fVar);
    }

    public static GiftPage b(f fVar) {
        GiftPage giftPage = new GiftPage();
        giftPage.gifts = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        giftPage.pageType = fVar.e();
                        break;
                    case 2:
                        giftPage.pageName = fVar.d();
                        break;
                    case 3:
                        giftPage.gifts.add(bx.b(fVar));
                        break;
                    case 4:
                        giftPage.display = g.a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        giftPage.operation = bu.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        giftPage.eventName = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        giftPage.pagePanelBanner = bv.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return giftPage;
            }
        }
    }
}
