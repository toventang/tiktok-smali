package com.ss.android.ugc.aweme.shortvideo.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;

final /* synthetic */ class bw implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity f131559a;

    static {
        Covode.recordClassIndex(86164);
    }

    bw(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f131559a = vEVideoPublishPreviewActivity;
    }

    @Override // com.ss.android.ugc.asve.editor.g.b
    public final void a(int i2) {
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f131559a;
        String a2 = vEVideoPublishPreviewActivity.f131177i.a(i2);
        if (TextUtils.isEmpty(a2)) {
            vEVideoPublishPreviewActivity.s.setVisibility(4);
            return;
        }
        vEVideoPublishPreviewActivity.s.setVisibility(0);
        vEVideoPublishPreviewActivity.s.setText(a2);
    }
}
