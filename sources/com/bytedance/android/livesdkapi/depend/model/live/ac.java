package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.covode.number.Covode;

public final class ac implements b<LiveCoreSDKData.PullData> {
    static {
        Covode.recordClassIndex(13696);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ LiveCoreSDKData.PullData a(f fVar) {
        return b(fVar);
    }

    public static LiveCoreSDKData.PullData b(f fVar) {
        LiveCoreSDKData.PullData pullData = new LiveCoreSDKData.PullData();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return pullData;
            } else if (b2 == 1) {
                pullData.streamData = fVar.d();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                pullData.options = aa.b(fVar);
            }
        }
    }
}
