package androidx.emoji.widget;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji.a.a;
import com.bytedance.covode.number.Covode;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class e implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f2831a;

    /* renamed from: b  reason: collision with root package name */
    private a.d f2832b;

    static {
        Covode.recordClassIndex(1000);
    }

    static class a extends a.d {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<TextView> f2833a;

        static {
            Covode.recordClassIndex(1001);
        }

        @Override // androidx.emoji.a.a.d
        public final void a() {
            super.a();
            TextView textView = this.f2833a.get();
            if (textView != null && textView.isAttachedToWindow()) {
                CharSequence a2 = androidx.emoji.a.a.a().a(textView.getText());
                int selectionStart = Selection.getSelectionStart(a2);
                int selectionEnd = Selection.getSelectionEnd(a2);
                textView.setText(a2);
                if (a2 instanceof Spannable) {
                    e.a((Spannable) a2, selectionStart, selectionEnd);
                }
            }
        }

        a(TextView textView) {
            this.f2833a = new WeakReference(textView);
        }
    }

    e(TextView textView) {
        this.f2831a = textView;
    }

    static void a(Spannable spannable, int i2, int i3) {
        if (i2 >= 0) {
            if (i3 >= 0) {
                Selection.setSelection(spannable, i2, i3);
            } else {
                Selection.setSelection(spannable, i2);
            }
        } else if (i3 >= 0) {
            Selection.setSelection(spannable, i3);
        }
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        if (this.f2831a.isInEditMode()) {
            return charSequence;
        }
        int c2 = androidx.emoji.a.a.a().c();
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 3) {
                    return charSequence;
                }
            } else if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == this.f2831a.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i2 == 0 && i3 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return androidx.emoji.a.a.a().a(charSequence, charSequence.length());
            }
        }
        androidx.emoji.a.a a2 = androidx.emoji.a.a.a();
        if (this.f2832b == null) {
            this.f2832b = new a(this.f2831a);
        }
        a2.a(this.f2832b);
        return charSequence;
    }
}
