package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class SocialTouchableEditText extends AppCompatEditText {

    /* renamed from: a  reason: collision with root package name */
    private boolean f127767a;

    static {
        Covode.recordClassIndex(83742);
    }

    public final boolean getMCanTouchMoved() {
        return this.f127767a;
    }

    public final void setMCanTouchMoved(boolean z) {
        this.f127767a = z;
    }

    public final void setMode(boolean z) {
        this.f127767a = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f127767a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialTouchableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }
}
