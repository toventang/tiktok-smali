package com.ss.android.ugc.aweme.shortvideo.edit;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ae implements u {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishEditActivity f126734a;

    static {
        Covode.recordClassIndex(83141);
    }

    ae(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f126734a = vEVideoPublishEditActivity;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f126734a.w = ((Boolean) obj).booleanValue();
    }
}
