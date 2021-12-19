package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.graphics.Bitmap;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseCoverActivity f132528a;

    static {
        Covode.recordClassIndex(86744);
    }

    d(ChooseCoverActivity chooseCoverActivity) {
        this.f132528a = chooseCoverActivity;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f132528a.f132507h.setImageBitmap((Bitmap) obj);
    }
}
