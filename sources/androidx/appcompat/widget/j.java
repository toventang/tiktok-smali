package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.appcompat.a.a.a;
import androidx.core.widget.e;
import com.bytedance.covode.number.Covode;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1643a;

    /* renamed from: b  reason: collision with root package name */
    private aj f1644b;

    /* renamed from: c  reason: collision with root package name */
    private aj f1645c;

    /* renamed from: d  reason: collision with root package name */
    private aj f1646d;

    static {
        Covode.recordClassIndex(500);
    }

    /* access modifiers changed from: package-private */
    public final ColorStateList b() {
        aj ajVar = this.f1645c;
        if (ajVar != null) {
            return ajVar.f1544a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final PorterDuff.Mode c() {
        aj ajVar = this.f1645c;
        if (ajVar != null) {
            return ajVar.f1545b;
        }
        return null;
    }

    private boolean e() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 21) {
            if (this.f1644b != null) {
                return true;
            }
            return false;
        } else if (i2 == 21) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        Drawable drawable = this.f1643a.getDrawable();
        if (drawable != null) {
            w.b(drawable);
            if (!e() || !a(drawable)) {
                aj ajVar = this.f1645c;
                if (ajVar != null) {
                    h.a(drawable, ajVar, this.f1643a.getDrawableState());
                    return;
                }
                aj ajVar2 = this.f1644b;
                if (ajVar2 != null) {
                    h.a(drawable, ajVar2, this.f1643a.getDrawableState());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        Drawable background = this.f1643a.getBackground();
        if (Build.VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public j(ImageView imageView) {
        this.f1643a = imageView;
    }

    /* access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (this.f1645c == null) {
            this.f1645c = new aj();
        }
        this.f1645c.f1544a = colorStateList;
        this.f1645c.f1547d = true;
        d();
    }

    private boolean a(Drawable drawable) {
        if (this.f1646d == null) {
            this.f1646d = new aj();
        }
        aj ajVar = this.f1646d;
        ajVar.a();
        ColorStateList a2 = e.a(this.f1643a);
        if (a2 != null) {
            ajVar.f1547d = true;
            ajVar.f1544a = a2;
        }
        PorterDuff.Mode b2 = e.b(this.f1643a);
        if (b2 != null) {
            ajVar.f1546c = true;
            ajVar.f1545b = b2;
        }
        if (!ajVar.f1547d && !ajVar.f1546c) {
            return false;
        }
        h.a(drawable, ajVar, this.f1643a.getDrawableState());
        return true;
    }

    public final void a(int i2) {
        if (i2 != 0) {
            Drawable b2 = a.b(this.f1643a.getContext(), i2);
            if (b2 != null) {
                w.b(b2);
            }
            this.f1643a.setImageDrawable(b2);
        } else {
            this.f1643a.setImageDrawable(null);
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public final void a(PorterDuff.Mode mode) {
        if (this.f1645c == null) {
            this.f1645c = new aj();
        }
        this.f1645c.f1545b = mode;
        this.f1645c.f1546c = true;
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c A[Catch:{ all -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.util.AttributeSet r6, int r7) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a(android.util.AttributeSet, int):void");
    }
}
