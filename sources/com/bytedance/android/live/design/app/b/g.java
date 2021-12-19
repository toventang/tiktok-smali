package com.bytedance.android.live.design.app.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

public final class g extends LiveTextView {

    /* renamed from: a  reason: collision with root package name */
    a f9414a;

    static {
        Covode.recordClassIndex(4792);
    }

    public g(Context context) {
        super(context);
    }

    @Override // com.bytedance.android.live.design.widget.LiveTextView
    public final void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        a aVar = new a(this);
        this.f9414a = aVar;
        aVar.a(attributeSet, i2, 0);
        setGravity(17);
        setLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }
}
