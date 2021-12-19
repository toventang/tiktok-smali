package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.h.u;
import androidx.core.widget.j;
import com.bytedance.covode.number.Covode;

public class AppCompatImageView extends ImageView implements u, j {

    /* renamed from: a  reason: collision with root package name */
    private final e f1375a;

    /* renamed from: b  reason: collision with root package name */
    private final j f1376b;

    static {
        Covode.recordClassIndex(401);
    }

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1375a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1375a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportImageTintList() {
        j jVar = this.f1376b;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public PorterDuff.Mode getSupportImageTintMode() {
        j jVar = this.f1376b;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1375a;
        if (eVar != null) {
            eVar.d();
        }
        j jVar = this.f1376b;
        if (jVar != null) {
            jVar.d();
        }
    }

    public boolean hasOverlappingRendering() {
        if (!this.f1376b.a() || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public void setImageResource(int i2) {
        j jVar = this.f1376b;
        if (jVar != null) {
            jVar.a(i2);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1375a;
        if (eVar != null) {
            eVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1375a;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportImageTintList(ColorStateList colorStateList) {
        j jVar = this.f1376b;
        if (jVar != null) {
            jVar.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        j jVar = this.f1376b;
        if (jVar != null) {
            jVar.a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1375a;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1375a;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        j jVar = this.f1376b;
        if (jVar != null) {
            jVar.d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        j jVar = this.f1376b;
        if (jVar != null) {
            jVar.d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        j jVar = this.f1376b;
        if (jVar != null) {
            jVar.d();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i2) {
        super(ai.a(context), attributeSet, i2);
        e eVar = new e(this);
        this.f1375a = eVar;
        eVar.a(attributeSet, i2);
        j jVar = new j(this);
        this.f1376b = jVar;
        jVar.a(attributeSet, i2);
    }
}
