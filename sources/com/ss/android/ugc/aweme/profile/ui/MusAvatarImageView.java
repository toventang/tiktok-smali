package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.f.a;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;

public class MusAvatarImageView extends CircleImageView {
    static {
        Covode.recordClassIndex(75429);
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CircleImageView, com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.base.ui.AnimatedImageView
    public final void a() {
        super.a();
        ((a) getHierarchy()).c(R.color.f159928l);
    }

    public MusAvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
