package androidx.l.a.a;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.a;
import androidx.core.graphics.drawable.e;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public abstract class h extends Drawable implements e {

    /* renamed from: b  reason: collision with root package name */
    Drawable f3404b;

    static {
        Covode.recordClassIndex(1260);
    }

    h() {
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int[] getState() {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3404b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        return drawable.getColorFilter();
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            a.a(drawable, theme);
        }
    }

    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        return super.onLevelChange(i2);
    }

    public void setChangingConfigurations(int i2) {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i2);
        } else {
            super.setChangingConfigurations(i2);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            a.a(drawable, f2, f3);
        }
    }

    public void setColorFilter(int i2, PorterDuff.Mode mode) {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            drawable.setColorFilter(i2, mode);
        } else {
            super.setColorFilter(i2, mode);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Drawable drawable = this.f3404b;
        if (drawable != null) {
            a.a(drawable, i2, i3, i4, i5);
        }
    }
}
