package com.ss.android.ugc.navi;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import h.f.b.l;

public class GeckoLottieView extends LottieAnimationView {
    static {
        Covode.recordClassIndex(97950);
    }

    public GeckoLottieView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    private /* synthetic */ GeckoLottieView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GeckoLottieView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
