package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class g extends Drawable implements Drawable.Callback, e, f {

    /* renamed from: a  reason: collision with root package name */
    static final PorterDuff.Mode f2442a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    i f2443b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f2444c;

    /* renamed from: d  reason: collision with root package name */
    private int f2445d;

    /* renamed from: e  reason: collision with root package name */
    private PorterDuff.Mode f2446e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2447f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2448g;

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    @Override // androidx.core.graphics.drawable.f
    public final Drawable a() {
        return this.f2444c;
    }

    private i c() {
        return new i(this.f2443b);
    }

    public Drawable getCurrent() {
        return this.f2444c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2444c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2444c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2444c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2444c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2444c.getOpacity();
    }

    public int[] getState() {
        return this.f2444c.getState();
    }

    public Region getTransparentRegion() {
        return this.f2444c.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return this.f2444c.isAutoMirrored();
    }

    public void jumpToCurrentState() {
        this.f2444c.jumpToCurrentState();
    }

    static {
        Covode.recordClassIndex(793);
    }

    public int getChangingConfigurations() {
        int i2;
        int changingConfigurations = super.getChangingConfigurations();
        i iVar = this.f2443b;
        if (iVar != null) {
            i2 = iVar.getChangingConfigurations();
        } else {
            i2 = 0;
        }
        return changingConfigurations | i2 | this.f2444c.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        i iVar = this.f2443b;
        if (iVar == null || iVar.f2451b == null) {
            return null;
        }
        this.f2443b.f2450a = getChangingConfigurations();
        return this.f2443b;
    }

    public boolean isStateful() {
        i iVar;
        ColorStateList colorStateList;
        if ((!b() || (iVar = this.f2443b) == null || (colorStateList = iVar.f2452c) == null || !colorStateList.isStateful()) && !this.f2444c.isStateful()) {
            return false;
        }
        return true;
    }

    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f2448g && super.mutate() == this) {
            this.f2443b = c();
            Drawable drawable = this.f2444c;
            if (drawable != null) {
                drawable.mutate();
            }
            i iVar = this.f2443b;
            if (iVar != null) {
                Drawable drawable2 = this.f2444c;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                iVar.f2451b = constantState;
            }
            this.f2448g = true;
        }
        return this;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f2444c.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        return this.f2444c.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2444c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        return this.f2444c.setLevel(i2);
    }

    public void setAlpha(int i2) {
        this.f2444c.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        this.f2444c.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i2) {
        this.f2444c.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2444c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2444c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2444c.setFilterBitmap(z);
    }

    @Override // androidx.core.graphics.drawable.e
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    g(Drawable drawable) {
        this.f2443b = c();
        a(drawable);
    }

    @Override // androidx.core.graphics.drawable.e
    public void setTintList(ColorStateList colorStateList) {
        this.f2443b.f2452c = colorStateList;
        a(getState());
    }

    @Override // androidx.core.graphics.drawable.e
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2443b.f2453d = mode;
        a(getState());
    }

    public boolean setState(int[] iArr) {
        boolean state = this.f2444c.setState(iArr);
        if (a(iArr) || state) {
            return true;
        }
        return false;
    }

    private boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        ColorStateList colorStateList = this.f2443b.f2452c;
        PorterDuff.Mode mode = this.f2443b.f2453d;
        if (colorStateList == null || mode == null) {
            this.f2447f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2447f && colorForState == this.f2445d && mode == this.f2446e)) {
                setColorFilter(colorForState, mode);
                this.f2445d = colorForState;
                this.f2446e = mode;
                this.f2447f = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.f
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f2444c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2444c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            i iVar = this.f2443b;
            if (iVar != null) {
                iVar.f2451b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    g(i iVar, Resources resources) {
        this.f2443b = iVar;
        if (iVar != null && iVar.f2451b != null) {
            a(this.f2443b.f2451b.newDrawable(resources));
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f2444c.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }
}
