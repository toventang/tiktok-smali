package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class aa implements b<LiveCoreSDKData.Options> {
    static {
        Covode.recordClassIndex(13694);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ LiveCoreSDKData.Options a(f fVar) {
        return b(fVar);
    }

    public static LiveCoreSDKData.Options b(f fVar) {
        LiveCoreSDKData.Options options = new LiveCoreSDKData.Options();
        options.qualityList = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return options;
            } else if (b2 == 1) {
                options.defaultQuality = ad.b(fVar);
            } else if (b2 == 2) {
                options.qualityList.add(ad.b(fVar));
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                options.defaultPreviewQuality = ad.b(fVar);
            }
        }
    }
}
