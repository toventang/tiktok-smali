package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import com.bytedance.covode.number.Covode;

public final class k implements l {
    static {
        Covode.recordClassIndex(84861);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.l
    public final PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
