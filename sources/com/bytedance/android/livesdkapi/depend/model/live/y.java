package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;

public final class y implements b<FeedRoomLabel> {
    static {
        Covode.recordClassIndex(13736);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ FeedRoomLabel a(f fVar) {
        return b(fVar);
    }

    public static FeedRoomLabel b(f fVar) {
        FeedRoomLabel feedRoomLabel = new FeedRoomLabel();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return feedRoomLabel;
            } else if (b2 == 1) {
                feedRoomLabel.location = fVar.f();
            } else if (b2 == 2) {
                feedRoomLabel.text = r.b(fVar);
            } else if (b2 == 3) {
                feedRoomLabel.icon = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                feedRoomLabel.logExtra = fVar.d();
            }
        }
    }
}
