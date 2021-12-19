package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class bu implements b<GiftOperation> {
    static {
        Covode.recordClassIndex(11352);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ GiftOperation a(f fVar) {
        return b(fVar);
    }

    public static GiftOperation b(f fVar) {
        GiftOperation giftOperation = new GiftOperation();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        giftOperation.leftImage = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case 2:
                        giftOperation.rightImage = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case 3:
                        giftOperation.title = fVar.d();
                        break;
                    case 4:
                        giftOperation.titleColor = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        giftOperation.titleSize = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        giftOperation.schemeUrl = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        giftOperation.eventName = fVar.d();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return giftOperation;
            }
        }
    }
}
