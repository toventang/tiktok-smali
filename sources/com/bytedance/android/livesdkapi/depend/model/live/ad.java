package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.covode.number.Covode;

public final class ad implements b<LiveCoreSDKData.Quality> {
    static {
        Covode.recordClassIndex(13697);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ LiveCoreSDKData.Quality a(f fVar) {
        return b(fVar);
    }

    public static LiveCoreSDKData.Quality b(f fVar) {
        LiveCoreSDKData.Quality quality = new LiveCoreSDKData.Quality();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return quality;
            } else if (b2 == 1) {
                quality.name = fVar.d();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                quality.sdkKey = fVar.d();
            }
        }
    }
}
