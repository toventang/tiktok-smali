package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ab implements b<LiveCoreSDKData> {
    static {
        Covode.recordClassIndex(13695);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ LiveCoreSDKData a(f fVar) {
        return b(fVar);
    }

    public static LiveCoreSDKData b(f fVar) {
        LiveCoreSDKData liveCoreSDKData = new LiveCoreSDKData();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return liveCoreSDKData;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                liveCoreSDKData.pullData = ac.b(fVar);
            }
        }
    }
}
