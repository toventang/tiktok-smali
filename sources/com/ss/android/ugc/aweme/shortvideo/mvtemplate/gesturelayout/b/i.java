package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f129290a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final l f129291b;

    private i() {
    }

    static {
        Covode.recordClassIndex(84859);
        if (Build.VERSION.SDK_INT >= 21) {
            f129291b = new k();
        } else {
            f129291b = new j();
        }
    }

    public static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return f129291b.a(property, path);
    }
}
