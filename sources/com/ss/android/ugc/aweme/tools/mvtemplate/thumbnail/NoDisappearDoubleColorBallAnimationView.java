package com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DoubleColorBallAnimationView;
import h.f.b.l;

public final class NoDisappearDoubleColorBallAnimationView extends DoubleColorBallAnimationView {
    static {
        Covode.recordClassIndex(92016);
    }

    public NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            a();
        }
    }

    private /* synthetic */ NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
