package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.shortvideo.util.f;

public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$1 implements bb.a {
    final /* synthetic */ Activity $context;
    final /* synthetic */ Intent $intent;

    static {
        Covode.recordClassIndex(79874);
    }

    public final void onCancel() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.bb.a
    public final void onSuccess() {
        f.a(this.$context, this.$intent);
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$1(Activity activity, Intent intent) {
        this.$context = activity;
        this.$intent = intent;
    }
}
