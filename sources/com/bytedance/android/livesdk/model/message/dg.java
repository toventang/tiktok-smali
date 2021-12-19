package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class dg implements b<FlexImageModel> {
    static {
        Covode.recordClassIndex(11595);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ FlexImageModel a(f fVar) {
        return b(fVar);
    }

    public static FlexImageModel b(f fVar) {
        FlexImageModel flexImageModel = new FlexImageModel();
        flexImageModel.mUrls = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return flexImageModel;
            } else if (b2 == 1) {
                flexImageModel.mUrls.add(fVar.d());
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                flexImageModel.mUri = fVar.d();
            }
        }
    }
}
