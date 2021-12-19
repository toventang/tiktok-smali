package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public EdgeEffect f2636a;

    static {
        Covode.recordClassIndex(902);
    }

    public final boolean a() {
        this.f2636a.onRelease();
        return this.f2636a.isFinished();
    }

    public d(Context context) {
        this.f2636a = new EdgeEffect(context);
    }

    public final boolean a(float f2) {
        this.f2636a.onPull(f2);
        return true;
    }

    public final boolean a(Canvas canvas) {
        return this.f2636a.draw(canvas);
    }

    public final void a(int i2, int i3) {
        this.f2636a.setSize(i2, i3);
    }

    public static void a(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f2, f3);
        } else {
            edgeEffect.onPull(f2);
        }
    }
}
