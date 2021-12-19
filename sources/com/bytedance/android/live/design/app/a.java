package com.bytedance.android.live.design.app;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveDialog f9386a;

    static {
        Covode.recordClassIndex(4779);
    }

    a(LiveDialog liveDialog) {
        this.f9386a = liveDialog;
    }

    public final void onClick(View view) {
        this.f9386a.cancel();
    }
}
