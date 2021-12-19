package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class cj implements b<ShortTouchItem> {
    static {
        Covode.recordClassIndex(11368);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ShortTouchItem a(f fVar) {
        return b(fVar);
    }

    public static ShortTouchItem b(f fVar) {
        ShortTouchItem shortTouchItem = new ShortTouchItem();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        shortTouchItem.schema = fVar.d();
                        break;
                    case 2:
                        shortTouchItem.width = fVar.f();
                        break;
                    case 3:
                        shortTouchItem.height = fVar.f();
                        break;
                    case 4:
                        shortTouchItem.topMargin = fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        shortTouchItem.leftMargin = fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        shortTouchItem.fcSecond = fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        shortTouchItem.name = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        shortTouchItem.previewSetting = ck.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return shortTouchItem;
            }
        }
    }
}
