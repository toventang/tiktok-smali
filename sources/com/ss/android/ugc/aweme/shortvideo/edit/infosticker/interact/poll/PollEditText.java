package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;

public class PollEditText extends DmtEditText {

    /* renamed from: a  reason: collision with root package name */
    public long f127477a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f127478b;

    static {
        Covode.recordClassIndex(83585);
    }

    public void setMode(boolean z) {
        this.f127478b = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f127478b) {
            return super.onTouchEvent(motionEvent);
        }
        this.f127477a = System.currentTimeMillis();
        return false;
    }

    public PollEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
