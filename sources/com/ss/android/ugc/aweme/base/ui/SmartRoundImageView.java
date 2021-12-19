package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.facebook.drawee.f.e;
import com.ss.android.ugc.aweme.lancet.k;

public class SmartRoundImageView extends SmartImageView {
    static {
        Covode.recordClassIndex(42066);
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    public final void a() {
        super.a();
        e eVar = new e();
        eVar.a(n.b(getContext(), 2.0f));
        ((a) getHierarchy()).a(eVar);
        ((a) getHierarchy()).a(q.b.f47442h);
    }

    public SmartRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
