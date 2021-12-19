package com.ss.android.ugc.aweme.miniapp_api;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;

public final class a {
    static {
        Covode.recordClassIndex(70192);
    }

    public static void a(Activity activity) {
        Uri data;
        String queryParameter;
        if (activity.getIntent() != null && activity.getIntent().getData() != null && (queryParameter = (data = activity.getIntent().getData()).getQueryParameter("from")) != null && queryParameter.contains("com.tt.miniapp") && "1".equals(data.getQueryParameter("isNeedRTLAnim")) && gb.a(activity)) {
            activity.overridePendingTransition(0, R.anim.dv);
        }
    }
}
