package com.ss.android.ugc.aweme.shortvideo.edit;

import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ah implements u {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishEditActivity f126737a;

    static {
        Covode.recordClassIndex(83144);
    }

    ah(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f126737a = vEVideoPublishEditActivity;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        VEVideoPublishEditActivity vEVideoPublishEditActivity = this.f126737a;
        vEVideoPublishEditActivity.x = (View) obj;
        vEVideoPublishEditActivity.cu_();
    }
}
