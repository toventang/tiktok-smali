package com.ss.android.ugc.aweme.download.component_api.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.download.component_api.a;

public final class c {
    static {
        Covode.recordClassIndex(51803);
    }

    public static void a(Context context, a aVar) {
        if (context != null && aVar != null) {
            int i2 = aVar.f83077b;
            if (aVar.C != null) {
                Downloader.getInstance(context).removeMainThreadListener(i2, aVar.C);
            }
            if (aVar.D != null) {
                Downloader.getInstance(context).removeSubThreadListener(i2, aVar.D);
            }
            if (aVar.E != null) {
                Downloader.getInstance(context).removeNotificationListener(i2, aVar.E);
            }
        }
    }
}
