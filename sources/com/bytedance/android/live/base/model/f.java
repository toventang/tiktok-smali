package com.bytedance.android.live.base.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class f implements b<ImageModel> {
    static {
        Covode.recordClassIndex(3599);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ImageModel a(com.bytedance.android.e.a.a.f fVar) {
        return b(fVar);
    }

    public static ImageModel b(com.bytedance.android.e.a.a.f fVar) {
        ImageModel imageModel = new ImageModel();
        imageModel.mUrls = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        imageModel.mUrls.add(fVar.d());
                        break;
                    case 2:
                        imageModel.mUri = fVar.d();
                        break;
                    case 3:
                        imageModel.height = (int) g.b(fVar);
                        break;
                    case 4:
                        imageModel.width = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        imageModel.avgColor = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        imageModel.imageType = fVar.e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        imageModel.schema = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        imageModel.content = e.b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        imageModel.isAnimated = g.a(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return imageModel;
            }
        }
    }
}
