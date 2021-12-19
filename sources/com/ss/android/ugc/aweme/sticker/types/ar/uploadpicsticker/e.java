package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e implements v {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f135998a;

    static {
        Covode.recordClassIndex(88851);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a() {
    }

    public e(Activity activity) {
        this.f135998a = activity;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a(int i2, int i3, Intent intent) {
        l.d(intent, "");
        Activity activity = this.f135998a;
        if (activity != null) {
            activity.setResult(-1, intent);
            this.f135998a.finish();
            this.f135998a.overridePendingTransition(0, R.anim.x);
        }
    }
}
