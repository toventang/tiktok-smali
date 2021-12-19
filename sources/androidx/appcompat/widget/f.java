package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.a.a.a;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;

public class f extends CheckedTextView {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1622a = {16843016};

    /* renamed from: b  reason: collision with root package name */
    private final s f1623b;

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f1623b;
        if (sVar != null) {
            sVar.a();
        }
    }

    static {
        Covode.recordClassIndex(491);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.a(this, callback));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return i.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(a.b(getContext(), i2));
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        s sVar = this.f1623b;
        if (sVar != null) {
            sVar.a(context, i2);
        }
    }

    private f(Context context, AttributeSet attributeSet, byte b2) {
        super(ai.a(context), attributeSet, 16843720);
        s sVar = new s(this);
        this.f1623b = sVar;
        sVar.a(attributeSet, 16843720);
        sVar.a();
        al a2 = al.a(getContext(), attributeSet, f1622a, 16843720, 0);
        setCheckMarkDrawable(a2.a(0));
        a2.f1549a.recycle();
    }
}
