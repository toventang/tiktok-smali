package androidx.appcompat.b.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import com.bytedance.covode.number.Covode;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f1046a;

    static {
        Covode.recordClassIndex(302);
    }

    public int getChangingConfigurations() {
        return this.f1046a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f1046a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1046a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1046a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1046a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1046a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1046a.getOpacity();
    }

    public int[] getState() {
        return this.f1046a.getState();
    }

    public Region getTransparentRegion() {
        return this.f1046a.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return a.a(this.f1046a);
    }

    public boolean isStateful() {
        return this.f1046a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f1046a.jumpToCurrentState();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f1046a.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        return this.f1046a.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f1046a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        return this.f1046a.setLevel(i2);
    }

    public void setAlpha(int i2) {
        this.f1046a.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        a.a(this.f1046a, z);
    }

    public void setChangingConfigurations(int i2) {
        this.f1046a.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1046a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1046a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1046a.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return this.f1046a.setState(iArr);
    }

    public void setTint(int i2) {
        a.a(this.f1046a, i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.a(this.f1046a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.a(this.f1046a, mode);
    }

    public c(Drawable drawable) {
        Drawable drawable2 = this.f1046a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1046a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f2, float f3) {
        a.a(this.f1046a, f2, f3);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f1046a.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        a.a(this.f1046a, i2, i3, i4, i5);
    }
}
