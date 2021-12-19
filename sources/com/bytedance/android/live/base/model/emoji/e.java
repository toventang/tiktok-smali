package com.bytedance.android.live.base.model.emoji;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class e implements b<EmoteModel> {
    static {
        Covode.recordClassIndex(3598);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ EmoteModel a(f fVar) {
        return b(fVar);
    }

    public static EmoteModel b(f fVar) {
        EmoteModel emoteModel = new EmoteModel();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return emoteModel;
            } else if (b2 == 1) {
                emoteModel.f7390g = fVar.d();
            } else if (b2 == 2) {
                emoteModel.f7391h = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 == 3) {
                emoteModel.f7392i = fVar.e();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                emoteModel.f7393j = fVar.d();
            }
        }
    }
}
