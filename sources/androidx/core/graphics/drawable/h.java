package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public final class h extends g {

    /* renamed from: d  reason: collision with root package name */
    private static Method f2449d;

    static {
        Covode.recordClassIndex(794);
    }

    public final Rect getDirtyBounds() {
        return this.f2444c.getDirtyBounds();
    }

    private static void c() {
        if (f2449d == null) {
            try {
                f2449d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.drawable.g
    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2444c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public final boolean isProjected() {
        Method method;
        if (!(this.f2444c == null || (method = f2449d) == null)) {
            try {
                return ((Boolean) method.invoke(this.f2444c, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    h(Drawable drawable) {
        super(drawable);
        c();
    }

    public final void getOutline(Outline outline) {
        this.f2444c.getOutline(outline);
    }

    @Override // androidx.core.graphics.drawable.g
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.g, androidx.core.graphics.drawable.e
    public final void setTint(int i2) {
        if (b()) {
            super.setTint(i2);
        } else {
            this.f2444c.setTint(i2);
        }
    }

    @Override // androidx.core.graphics.drawable.g, androidx.core.graphics.drawable.e
    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            super.setTintList(colorStateList);
        } else {
            this.f2444c.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.g, androidx.core.graphics.drawable.e
    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            super.setTintMode(mode);
        } else {
            this.f2444c.setTintMode(mode);
        }
    }

    public final void setHotspot(float f2, float f3) {
        this.f2444c.setHotspot(f2, f3);
    }

    h(i iVar, Resources resources) {
        super(iVar, resources);
        c();
    }

    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f2444c.setHotspotBounds(i2, i3, i4, i5);
    }
}
