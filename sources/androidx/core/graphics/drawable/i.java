package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class i extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f2450a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f2451b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f2452c;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f2453d = g.f2442a;

    static {
        Covode.recordClassIndex(795);
    }

    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    public final int getChangingConfigurations() {
        int i2;
        int i3 = this.f2450a;
        Drawable.ConstantState constantState = this.f2451b;
        if (constantState != null) {
            i2 = constantState.getChangingConfigurations();
        } else {
            i2 = 0;
        }
        return i3 | i2;
    }

    i(i iVar) {
        if (iVar != null) {
            this.f2450a = iVar.f2450a;
            this.f2451b = iVar.f2451b;
            this.f2452c = iVar.f2452c;
            this.f2453d = iVar.f2453d;
        }
    }

    public final Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new h(this, resources);
        }
        return new g(this, resources);
    }
}
