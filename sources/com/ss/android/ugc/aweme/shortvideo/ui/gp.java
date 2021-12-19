package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.b;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f;
import h.f.a.a;
import h.f.b.l;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gp implements a {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordPermissionActivity f131826a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f131827b;

    static {
        Covode.recordClassIndex(86369);
    }

    gp(VideoRecordPermissionActivity videoRecordPermissionActivity, String[] strArr) {
        this.f131826a = videoRecordPermissionActivity;
        this.f131827b = strArr;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f131826a;
        String[] b2 = f.b(this.f131827b);
        l.d(b2, "");
        l.d(videoRecordPermissionActivity, "");
        r.a("permission_rationale_page_action_close", b.a(b2, videoRecordPermissionActivity, (Boolean) null));
        videoRecordPermissionActivity.finish();
        return z.f158842a;
    }
}
