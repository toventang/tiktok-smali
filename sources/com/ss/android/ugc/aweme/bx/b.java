package com.ss.android.ugc.aweme.bx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.sticker.q;
import h.f.b.l;

public final class b implements q {
    static {
        Covode.recordClassIndex(42917);
    }

    @Override // com.ss.android.ugc.aweme.sticker.q
    public final Intent a(Activity activity, Intent intent) {
        l.d(activity, "");
        l.d(intent, "");
        intent.setClass(activity, VECutVideoActivity.class);
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.sticker.q
    public final Intent a(Activity activity, Bundle bundle, int i2) {
        l.d(activity, "");
        l.d(bundle, "");
        Intent intent = new Intent(activity, MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i2);
        intent.putExtra("key_start_activity_request_code", i2);
        return intent;
    }
}
