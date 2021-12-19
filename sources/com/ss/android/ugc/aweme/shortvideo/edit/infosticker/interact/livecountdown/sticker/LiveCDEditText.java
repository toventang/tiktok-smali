package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.AVEditText;

public final class LiveCDEditText extends AVEditText {

    /* renamed from: a  reason: collision with root package name */
    private boolean f127464a;

    static {
        Covode.recordClassIndex(83572);
    }

    public final void setMode(boolean z) {
        this.f127464a = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f127464a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public LiveCDEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
