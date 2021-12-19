package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.util.f;
import com.ss.android.ugc.tools.utils.q;

public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$2 implements bb.a {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;

    static {
        Covode.recordClassIndex(79875);
    }

    public final void onCancel() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.bb.a
    public final void onSuccess() {
        Context context = this.$context;
        Intent intent = this.$intent;
        if (intent == null || context == null || f.b(intent)) {
            q.d("unable to start activity,isAppBackground " + c.C1870c.f80046a.a());
        } else if (context instanceof Activity) {
            f.a((Activity) context, intent);
        } else {
            f.a(intent);
            intent.setClass(context, VideoRecordPermissionActivity.class);
            f.a(context, intent);
        }
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$2(Context context, Intent intent) {
        this.$context = context;
        this.$intent = intent;
    }
}
