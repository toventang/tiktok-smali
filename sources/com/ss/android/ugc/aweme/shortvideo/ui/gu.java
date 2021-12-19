package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.b;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.d;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gu implements v.a {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordPermissionActivity f131834a;

    /* renamed from: b  reason: collision with root package name */
    private final d f131835b;

    static {
        Covode.recordClassIndex(86374);
    }

    gu(VideoRecordPermissionActivity videoRecordPermissionActivity, d dVar) {
        this.f131834a = videoRecordPermissionActivity;
        this.f131835b = dVar;
    }

    @Override // com.ss.android.ugc.aweme.port.in.v.a
    public final void a(String[] strArr, int[] iArr) {
        String[] strArr2;
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f131834a;
        d dVar = this.f131835b;
        b.a(strArr, iArr, videoRecordPermissionActivity);
        if (f.a(iArr)) {
            videoRecordPermissionActivity.f131241a.a(new go(videoRecordPermissionActivity));
            return;
        }
        dVar.b();
        if (dVar.f131864a) {
            strArr2 = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
        } else {
            strArr2 = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        if (f.a(dVar.f131868e, strArr2)) {
            TuxTextView tuxTextView = dVar.f131865b;
            if (tuxTextView != null) {
                tuxTextView.setText(dVar.getContext().getString(R.string.g_l));
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = dVar.f131865b;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(dVar.getContext().getString(R.string.g_n));
        }
    }
}
