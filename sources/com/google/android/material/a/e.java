package com.google.android.material.a;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;

public final class e extends Property<Drawable, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<Drawable, Integer> f52133a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap<Drawable, Integer> f52134b = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(32414);
    }

    private e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ Integer get(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        return Integer.valueOf(drawable.getAlpha());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ void set(Drawable drawable, Integer num) {
        int i2 = Build.VERSION.SDK_INT;
        drawable.setAlpha(num.intValue());
    }
}
