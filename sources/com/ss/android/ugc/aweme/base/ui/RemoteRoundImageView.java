package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.facebook.drawee.f.e;
import com.ss.android.ugc.aweme.lancet.k;

public class RemoteRoundImageView extends AnimatedImageView {
    static {
        Covode.recordClassIndex(42059);
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.base.ui.AnimatedImageView
    public final void a() {
        super.a();
        e eVar = new e();
        eVar.a(n.b(getContext(), 2.0f));
        ((a) getHierarchy()).a(eVar);
        ((a) getHierarchy()).a(q.b.f47442h);
    }

    public RemoteRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
