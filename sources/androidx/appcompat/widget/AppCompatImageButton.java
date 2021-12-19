package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.h.u;
import androidx.core.widget.j;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class AppCompatImageButton extends ImageButton implements u, j {

    /* renamed from: a  reason: collision with root package name */
    private final e f1373a;

    /* renamed from: b  reason: collision with root package name */
    private final j f1374b;

    static {
        Covode.recordClassIndex(400);
    }

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1373a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1373a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportImageTintList() {
        j jVar = this.f1374b;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public PorterDuff.Mode getSupportImageTintMode() {
        j jVar = this.f1374b;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1373a;
        if (eVar != null) {
            eVar.d();
        }
        j jVar = this.f1374b;
        if (jVar != null) {
            jVar.d();
        }
    }

    public boolean hasOverlappingRendering() {
        if (!this.f1374b.a() || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setImageResource(int i2) {
        this.f1374b.a(i2);
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1373a;
        if (eVar != null) {
            eVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1373a;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportImageTintList(ColorStateList colorStateList) {
        j jVar = this.f1374b;
        if (jVar != null) {
            jVar.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        j jVar = this.f1374b;
        if (jVar != null) {
            jVar.a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1373a;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1373a;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        j jVar = this.f1374b;
        if (jVar != null) {
            jVar.d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        j jVar = this.f1374b;
        if (jVar != null) {
            jVar.d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        j jVar = this.f1374b;
        if (jVar != null) {
            jVar.d();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.wn);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(ai.a(context), attributeSet, i2);
        e eVar = new e(this);
        this.f1373a = eVar;
        eVar.a(attributeSet, i2);
        j jVar = new j(this);
        this.f1374b = jVar;
        jVar.a(attributeSet, i2);
    }
}
