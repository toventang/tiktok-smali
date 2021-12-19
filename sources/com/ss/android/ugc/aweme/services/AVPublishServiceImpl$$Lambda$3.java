package com.ss.android.ugc.aweme.services;

import android.widget.PopupWindow;
import androidx.fragment.app.e;
import androidx.lifecycle.l;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class AVPublishServiceImpl$$Lambda$3 implements PopupWindow.OnDismissListener {
    private final e arg$1;
    private final l arg$2;

    static {
        Covode.recordClassIndex(79390);
    }

    AVPublishServiceImpl$$Lambda$3(e eVar, l lVar) {
        this.arg$1 = eVar;
        this.arg$2 = lVar;
    }

    public final void onDismiss() {
        this.arg$1.getLifecycle().b(this.arg$2);
    }
}
