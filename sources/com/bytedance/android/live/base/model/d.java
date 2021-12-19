package com.bytedance.android.live.base.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.bs;
import com.bytedance.android.livesdk.model.bz;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class d implements b<HashtagResponse> {
    static {
        Covode.recordClassIndex(3590);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ HashtagResponse a(f fVar) {
        HashtagResponse hashtagResponse = new HashtagResponse();
        hashtagResponse.gameTagList = new ArrayList();
        hashtagResponse.hashtags = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return hashtagResponse;
            } else if (b2 == 1) {
                hashtagResponse.hashtags.add(bz.b(fVar));
            } else if (b2 == 2) {
                hashtagResponse.gameTagList.add(bs.b(fVar));
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                hashtagResponse.gameHashTag = bz.b(fVar);
            }
        }
    }
}
