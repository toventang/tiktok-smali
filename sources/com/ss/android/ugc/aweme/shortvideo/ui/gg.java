package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.b;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.d;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f;
import h.f.a.a;
import h.f.b.l;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gg implements a {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordPermissionActivity f131814a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f131815b;

    /* renamed from: c  reason: collision with root package name */
    private final d f131816c;

    static {
        Covode.recordClassIndex(86360);
    }

    gg(VideoRecordPermissionActivity videoRecordPermissionActivity, String[] strArr, d dVar) {
        this.f131814a = videoRecordPermissionActivity;
        this.f131815b = strArr;
        this.f131816c = dVar;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f131814a;
        String[] strArr = this.f131815b;
        d dVar = this.f131816c;
        if (f.a(videoRecordPermissionActivity, strArr)) {
            videoRecordPermissionActivity.a(strArr, dVar);
        } else {
            String[] b2 = f.b(strArr);
            l.d(b2, "");
            l.d(videoRecordPermissionActivity, "");
            r.a("permission_rationale_page_action_setting", b.a(b2, videoRecordPermissionActivity, (Boolean) null));
            c.D.c().d(videoRecordPermissionActivity);
            videoRecordPermissionActivity.finish();
        }
        return z.f158842a;
    }
}
