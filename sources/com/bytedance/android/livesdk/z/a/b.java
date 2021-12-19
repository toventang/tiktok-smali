package com.bytedance.android.livesdk.z.a;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f22926a;

    static {
        Covode.recordClassIndex(13545);
    }

    b(a aVar) {
        this.f22926a = aVar;
    }

    public final void onClick(View view) {
        this.f22926a.dismissAllowingStateLoss();
    }
}
