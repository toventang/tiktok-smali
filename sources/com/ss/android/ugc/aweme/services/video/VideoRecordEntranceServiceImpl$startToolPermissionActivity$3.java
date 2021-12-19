package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.util.f;
import com.ss.android.ugc.tools.utils.q;

public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$3 implements bb.a {
    final /* synthetic */ boolean $clearOld;
    final /* synthetic */ Activity $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $isBack2Main;
    final /* synthetic */ boolean $recreateSupport;

    static {
        Covode.recordClassIndex(79876);
    }

    public final void onCancel() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.bb.a
    public final void onSuccess() {
        Activity activity = this.$context;
        Intent intent = this.$intent;
        boolean z = this.$recreateSupport;
        boolean z2 = this.$clearOld;
        boolean z3 = this.$isBack2Main;
        if (f.b(intent)) {
            q.d("unable to start activity,isAppBackground " + c.C1870c.f80046a.a());
            return;
        }
        q.a("startToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport" + z + ",clearOld:" + z2);
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        IAVPublishService publishService = AVExternalServiceImpl.a().publishService();
        if (!publishService.isParallelPublishEnabled()) {
            cr.a();
            if (!cr.a(activity)) {
                return;
            }
        } else if (!publishService.isPublishable()) {
            return;
        }
        if (!com.ss.android.ugc.aweme.port.in.c.a() || !z || !com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.c.a(intent).a(activity)) {
            intent.setClass(activity, VideoRecordPermissionActivity.class);
        } else {
            f.c((Context) activity, intent);
            if (z2 && f.b((Context) activity, intent)) {
                return;
            }
        }
        f.a(activity, intent);
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$3(Activity activity, Intent intent, boolean z, boolean z2, boolean z3) {
        this.$context = activity;
        this.$intent = intent;
        this.$recreateSupport = z;
        this.$clearOld = z2;
        this.$isBack2Main = z3;
    }
}
