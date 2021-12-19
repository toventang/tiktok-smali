package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.ss.android.ugc.aweme.lancet.k;

public class SmartAvatarImageView extends SmartCircleImageView {
    static {
        Covode.recordClassIndex(42065);
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, com.bytedance.lighten.loader.SmartCircleImageView
    public final void a() {
        super.a();
        ((a) getHierarchy()).a(2131232324, q.b.f47442h);
    }

    public SmartAvatarImageView(Context context) {
        super(context);
    }

    public SmartAvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
