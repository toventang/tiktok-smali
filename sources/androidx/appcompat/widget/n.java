package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.appcompat.a.a.a;
import androidx.core.widget.i;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class n extends RadioButton implements i {

    /* renamed from: a  reason: collision with root package name */
    private final g f1655a;

    /* renamed from: b  reason: collision with root package name */
    private final s f1656b;

    static {
        Covode.recordClassIndex(504);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        g gVar = this.f1655a;
        if (gVar != null) {
            return gVar.a(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        g gVar = this.f1655a;
        if (gVar != null) {
            return gVar.f1624a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g gVar = this.f1655a;
        if (gVar != null) {
            return gVar.f1625b;
        }
        return null;
    }

    @Override // androidx.core.widget.i
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g gVar = this.f1655a;
        if (gVar != null) {
            gVar.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.i
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g gVar = this.f1655a;
        if (gVar != null) {
            gVar.a(mode);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(a.b(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g gVar = this.f1655a;
        if (gVar != null) {
            gVar.a();
        }
    }

    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a8o);
    }

    public n(Context context, AttributeSet attributeSet, int i2) {
        super(ai.a(context), attributeSet, i2);
        g gVar = new g(this);
        this.f1655a = gVar;
        gVar.a(attributeSet, i2);
        s sVar = new s(this);
        this.f1656b = sVar;
        sVar.a(attributeSet, i2);
    }
}
