package com.ss.android.ugc.aweme.commercialize.views;

import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer;
import h.f.b.l;

public final class AdBottomSheetContainer$behavior$1 extends BottomSheetBehavior<FrameLayout> {
    final /* synthetic */ AdBottomSheetContainer r;

    static {
        Covode.recordClassIndex(46763);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    AdBottomSheetContainer$behavior$1(AdBottomSheetContainer adBottomSheetContainer) {
        this.r = adBottomSheetContainer;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int] */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, int i2) {
        AdBottomSheetContainer.b callback;
        FrameLayout frameLayout2 = frameLayout;
        l.d(coordinatorLayout, "");
        l.d(frameLayout2, "");
        if (this.f52334j == 3 && (callback = this.r.getCallback()) != null) {
            callback.a();
        }
        return super.a(coordinatorLayout, frameLayout2, i2);
    }
}
