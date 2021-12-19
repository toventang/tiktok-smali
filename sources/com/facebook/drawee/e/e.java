package com.facebook.drawee.e;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public class e {
    static {
        Covode.recordClassIndex(28766);
    }

    public static int a(int i2, int i3) {
        if (i3 == 255) {
            return i2;
        }
        if (i3 == 0) {
            return i2 & 16777215;
        }
        return (i2 & 16777215) | ((((i2 >>> 24) * (i3 + (i3 >> 7))) >> 8) << 24);
    }

    public static void a(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static void a(Drawable drawable, d dVar) {
        if (drawable != null && dVar != null) {
            dVar.a(drawable);
        }
    }

    public static void a(Drawable drawable, Drawable.Callback callback, s sVar) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof r) {
                ((r) drawable).setTransformCallback(sVar);
            }
        }
    }
}
