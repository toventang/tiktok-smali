package com.ss.android.ugc.aweme.services.video;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.util.f;
import com.ss.android.ugc.tools.utils.q;

public final class VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1 implements bb.a {
    final /* synthetic */ boolean $clearOld;
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $isBack2Main;
    final /* synthetic */ boolean $recreateSupport;

    static {
        Covode.recordClassIndex(79872);
    }

    public final void onCancel() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.bb.a
    public final void onSuccess() {
        Context context = this.$context;
        Intent intent = this.$intent;
        boolean z = this.$recreateSupport;
        boolean z2 = this.$clearOld;
        boolean z3 = this.$isBack2Main;
        q.a("notifyToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport" + z + ",clearOld:" + z2);
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        IAVPublishService publishService = AVExternalServiceImpl.a().publishService();
        if (!publishService.isParallelPublishEnabled()) {
            cr.a();
            if (!cr.a(context)) {
                return;
            }
        } else if (!publishService.isPublishable()) {
            return;
        }
        if (!c.a() || !z || !com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.c.a(intent).a(context)) {
            intent.setClass(context, VideoRecordPermissionActivity.class);
        } else {
            f.c(context, intent);
            if (z2 && f.b(context, intent)) {
                return;
            }
        }
        f.a(context, intent);
    }

    VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        this.$context = context;
        this.$intent = intent;
        this.$recreateSupport = z;
        this.$clearOld = z2;
        this.$isBack2Main = z3;
    }
}
