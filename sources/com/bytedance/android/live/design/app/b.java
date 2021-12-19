package com.bytedance.android.live.design.app;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveDialog f9391a;

    static {
        Covode.recordClassIndex(4783);
    }

    b(LiveDialog liveDialog) {
        this.f9391a = liveDialog;
    }

    public final void onClick(View view) {
        this.f9391a.cancel();
    }
}
