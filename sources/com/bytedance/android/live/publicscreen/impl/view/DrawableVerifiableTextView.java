package com.bytedance.android.live.publicscreen.impl.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.chatroom.ui.NoMoreSpaceTextView;
import com.bytedance.covode.number.Covode;

public class DrawableVerifiableTextView extends NoMoreSpaceTextView {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f12494a;

    static {
        Covode.recordClassIndex(6872);
    }

    public void setVerifiedDrawable(Drawable drawable) {
        this.f12494a = drawable;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f12494a) {
            return true;
        }
        return false;
    }

    public DrawableVerifiableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
