package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class InteractStickerParent extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f130428a = true;

    static {
        Covode.recordClassIndex(85535);
    }

    public final boolean getNeedConsumeEvent() {
        return this.f130428a;
    }

    public final void setNeedConsumeEvent(boolean z) {
        this.f130428a = z;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f130428a) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public InteractStickerParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2844);
        MethodCollector.o(2844);
    }
}
