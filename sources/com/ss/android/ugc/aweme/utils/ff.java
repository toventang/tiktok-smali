package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.l.b;

public final class ff {
    static {
        Covode.recordClassIndex(93514);
    }

    public static boolean a(final Activity activity, boolean z, boolean z2, String str) {
        if (activity == null) {
            return false;
        }
        if (z) {
            AVExternalServiceImpl.a().asyncService(activity, "notification", new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.utils.ff.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(93517);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    asyncAVService.uiService().recordService().startRecord(activity, new RecordConfig.Builder().showStickerPanel(true).build());
                }
            });
            return true;
        } else if (!z2 || TextUtils.isEmpty(str)) {
            return false;
        } else {
            new b().a(str, activity, "notification");
            return true;
        }
    }
}
