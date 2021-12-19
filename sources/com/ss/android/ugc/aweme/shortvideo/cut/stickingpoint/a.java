package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i;

public interface a {
    static {
        Covode.recordClassIndex(82699);
    }

    void a(Context context, int i2, String str, i iVar);

    void a(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener);
}
