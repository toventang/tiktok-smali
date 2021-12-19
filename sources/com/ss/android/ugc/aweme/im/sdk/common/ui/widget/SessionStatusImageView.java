package com.ss.android.ugc.aweme.im.sdk.common.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;

public class SessionStatusImageView extends AutoRTLImageView {
    static {
        Covode.recordClassIndex(65683);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    @Override // com.ss.android.ugc.aweme.views.AutoRTLImageView, androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        int i2;
        if (drawable == null) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        setVisibility(i2);
        super.setImageDrawable(drawable);
    }

    public SessionStatusImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
