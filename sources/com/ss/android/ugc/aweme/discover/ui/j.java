package com.ss.android.ugc.aweme.discover.ui;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements SearchIntermediateView.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f82598a;

    static {
        Covode.recordClassIndex(51424);
    }

    j(b bVar) {
        this.f82598a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView.b
    public final void a(MotionEvent motionEvent) {
        b bVar = this.f82598a;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && bVar.p != null && bVar.p.canDismissKeyboardOnActionDown()) {
            KeyboardUtils.c(bVar.f82355b);
            bVar.f82355b.setCursorVisible(false);
        }
    }
}
