package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.h.u;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class AppCompatEditText extends EditText implements u {

    /* renamed from: a  reason: collision with root package name */
    private final e f1371a;

    /* renamed from: b  reason: collision with root package name */
    private final s f1372b;

    static {
        Covode.recordClassIndex(399);
    }

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1371a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1371a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1371a;
        if (eVar != null) {
            eVar.d();
        }
        s sVar = this.f1372b;
        if (sVar != null) {
            sVar.a();
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.a(this, callback));
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1371a;
        if (eVar != null) {
            eVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1371a;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return i.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1371a;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1371a;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sf);
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        s sVar = this.f1372b;
        if (sVar != null) {
            sVar.a(context, i2);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i2) {
        super(ai.a(context), attributeSet, i2);
        e eVar = new e(this);
        this.f1371a = eVar;
        eVar.a(attributeSet, i2);
        s sVar = new s(this);
        this.f1372b = sVar;
        sVar.a(attributeSet, i2);
        sVar.a();
    }
}
