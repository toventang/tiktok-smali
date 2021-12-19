package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class bz implements b<Hashtag> {
    static {
        Covode.recordClassIndex(11357);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ Hashtag a(f fVar) {
        return b(fVar);
    }

    public static Hashtag b(f fVar) {
        Hashtag hashtag = new Hashtag();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return hashtag;
            } else if (b2 == 1) {
                hashtag.id = Long.valueOf(fVar.f());
            } else if (b2 == 2) {
                hashtag.title = fVar.d();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                hashtag.image = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
