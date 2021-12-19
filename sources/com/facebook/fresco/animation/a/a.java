package com.facebook.fresco.animation.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public interface a extends d {
    static {
        Covode.recordClassIndex(28822);
    }

    void a(int i2);

    void a(ColorFilter colorFilter);

    void a(Rect rect);

    boolean a(Drawable drawable, Canvas canvas, int i2);

    int b();

    boolean b(int i2);

    int c();

    void d();
}
