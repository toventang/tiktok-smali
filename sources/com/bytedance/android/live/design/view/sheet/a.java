package com.bytedance.android.live.design.view.sheet;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveBaseSheetDialog f9544a;

    static {
        Covode.recordClassIndex(4842);
    }

    a(LiveBaseSheetDialog liveBaseSheetDialog) {
        this.f9544a = liveBaseSheetDialog;
    }

    public final void onClick(View view) {
        this.f9544a.cancel();
    }
}
