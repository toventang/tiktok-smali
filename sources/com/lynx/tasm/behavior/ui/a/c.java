package com.lynx.tasm.behavior.ui.a;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public abstract class c extends Drawable {

    /* renamed from: g  reason: collision with root package name */
    public Path f56106g;

    static {
        Covode.recordClassIndex(35051);
    }

    public abstract void a(int i2, int i3);

    public void a(Bitmap.Config config) {
    }

    public abstract boolean a();

    public abstract int b();

    public abstract int c();

    public abstract void d();

    public abstract void e();

    public int getOpacity() {
        return -2;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
