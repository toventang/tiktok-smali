package androidx.emoji.widget;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji.a.a;
import com.bytedance.covode.number.Covode;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class h implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public int f2838a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public int f2839b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f2840c;

    /* renamed from: d  reason: collision with root package name */
    private a.d f2841d;

    static {
        Covode.recordClassIndex(1006);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    static class a extends a.d {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<EditText> f2842a;

        static {
            Covode.recordClassIndex(1007);
        }

        @Override // androidx.emoji.a.a.d
        public final void a() {
            super.a();
            EditText editText = this.f2842a.get();
            if (editText != null && editText.isAttachedToWindow()) {
                Editable editableText = editText.getEditableText();
                int selectionStart = Selection.getSelectionStart(editableText);
                int selectionEnd = Selection.getSelectionEnd(editableText);
                androidx.emoji.a.a.a().a(editableText);
                e.a(editableText, selectionStart, selectionEnd);
            }
        }

        a(EditText editText) {
            this.f2842a = new WeakReference(editText);
        }
    }

    h(EditText editText) {
        this.f2840c = editText;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (!this.f2840c.isInEditMode() && i3 <= i4 && (charSequence instanceof Spannable)) {
            int c2 = androidx.emoji.a.a.a().c();
            if (c2 != 0) {
                if (c2 == 1) {
                    androidx.emoji.a.a.a().a(charSequence, i2, i2 + i4, this.f2838a, this.f2839b);
                    return;
                } else if (c2 != 3) {
                    return;
                }
            }
            androidx.emoji.a.a a2 = androidx.emoji.a.a.a();
            if (this.f2841d == null) {
                this.f2841d = new a(this.f2840c);
            }
            a2.a(this.f2841d);
        }
    }
}
