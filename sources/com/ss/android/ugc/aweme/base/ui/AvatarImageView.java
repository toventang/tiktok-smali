package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;

public class AvatarImageView extends CircleImageView {
    static {
        Covode.recordClassIndex(42051);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CircleImageView, com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.base.ui.AnimatedImageView
    public void a() {
        super.a();
        ((a) getHierarchy()).a(2131232324, q.b.f47442h);
    }

    public AvatarImageView(Context context) {
        super(context);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
