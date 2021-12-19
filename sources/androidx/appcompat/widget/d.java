package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.a.a.a;
import androidx.core.h.u;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class d extends AutoCompleteTextView implements u {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1613a = {16843126};

    /* renamed from: b  reason: collision with root package name */
    private final e f1614b;

    /* renamed from: c  reason: collision with root package name */
    private final s f1615c;

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1614b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1614b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(489);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1614b;
        if (eVar != null) {
            eVar.d();
        }
        s sVar = this.f1615c;
        if (sVar != null) {
            sVar.a();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.a(this, callback));
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1614b;
        if (eVar != null) {
            eVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1614b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return i.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1614b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1614b;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(a.b(getContext(), i2));
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        s sVar = this.f1615c;
        if (sVar != null) {
            sVar.a(context, i2);
        }
    }

    public d(Context context, AttributeSet attributeSet, byte b2) {
        super(ai.a(context), attributeSet, R.attr.ir);
        al a2 = al.a(getContext(), attributeSet, f1613a, R.attr.ir, 0);
        if (a2.f(0)) {
            setDropDownBackgroundDrawable(a2.a(0));
        }
        a2.f1549a.recycle();
        e eVar = new e(this);
        this.f1614b = eVar;
        eVar.a(attributeSet, R.attr.ir);
        s sVar = new s(this);
        this.f1615c = sVar;
        sVar.a(attributeSet, R.attr.ir);
        sVar.a();
    }
}
