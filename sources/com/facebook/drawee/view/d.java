package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.f.a;
import com.facebook.drawee.f.c;
import com.facebook.imagepipeline.p.b;

public class d extends c<a> {
    static {
        Covode.recordClassIndex(28815);
    }

    public d(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void inflateHierarchy(Context context, AttributeSet attributeSet) {
        b.a();
        b.a();
        com.facebook.drawee.f.b a2 = c.a(new com.facebook.drawee.f.b(context.getResources()), context, attributeSet);
        b.a();
        setAspectRatio(a2.f47464e);
        setHierarchy(a2.a());
        b.a();
    }

    public d(Context context, a aVar) {
        super(context);
        setHierarchy(aVar);
    }

    public d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        inflateHierarchy(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        inflateHierarchy(context, attributeSet);
    }
}
