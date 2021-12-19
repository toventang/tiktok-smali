package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class bs implements b<GameTag> {
    static {
        Covode.recordClassIndex(11350);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ GameTag a(f fVar) {
        return b(fVar);
    }

    public static GameTag b(f fVar) {
        GameTag gameTag = new GameTag();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return gameTag;
            } else if (b2 == 1) {
                gameTag.id = Long.valueOf(fVar.f());
            } else if (b2 == 2) {
                gameTag.showName = fVar.d();
            } else if (b2 == 3) {
                gameTag.shortName = fVar.d();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                gameTag.fullName = fVar.d();
            }
        }
    }
}
