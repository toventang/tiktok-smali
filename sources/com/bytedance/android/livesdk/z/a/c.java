package com.bytedance.android.livesdk.z.a;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f22927a;

    static {
        Covode.recordClassIndex(13546);
    }

    c(a aVar) {
        this.f22927a = aVar;
    }

    public final void onClick(View view) {
        this.f22927a.dismissAllowingStateLoss();
    }
}
