package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import com.bytedance.covode.number.Covode;

public final class j implements l {
    static {
        Covode.recordClassIndex(84860);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.l
    public final PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofFloat(new h(property, path), 0.0f, 1.0f);
    }
}
