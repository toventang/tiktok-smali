package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseCoverActivity f132527a;

    static {
        Covode.recordClassIndex(86743);
    }

    c(ChooseCoverActivity chooseCoverActivity) {
        this.f132527a = chooseCoverActivity;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f132527a.f132507h.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }
}
