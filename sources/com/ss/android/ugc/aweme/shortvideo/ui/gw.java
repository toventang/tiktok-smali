package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import dmt.av.video.e.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gw implements v.a {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordPermissionActivity f131837a;

    static {
        Covode.recordClassIndex(86376);
    }

    gw(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f131837a = videoRecordPermissionActivity;
    }

    @Override // com.ss.android.ugc.aweme.port.in.v.a
    public final void a(String[] strArr, int[] iArr) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f131837a;
        if (iArr != null) {
            if (!(iArr.length == 0 || strArr == null || strArr.length == 0 || strArr.length != iArr.length)) {
                int length = strArr.length;
                String str = "confirm";
                for (int i2 = 0; i2 < length; i2++) {
                    String str2 = strArr[i2];
                    String str3 = "deny";
                    if (iArr[i2] == 0) {
                        str3 = "confirm";
                    } else {
                        str = str3;
                    }
                    r.a("permission_toast_result", new b().a("permission_type", a.a(str2)).a("permission_result", str3).a("enter_from", "video_shoot_page").f149193a);
                }
                d.a("tools_performance_permission", new b().a("scene", "permission_result").a("status", str).f149193a);
            }
        }
        if (!f.a(iArr)) {
            videoRecordPermissionActivity.f131241a.a(new gn(videoRecordPermissionActivity));
        } else {
            videoRecordPermissionActivity.a(true);
        }
    }
}
