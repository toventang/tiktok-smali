package com.ss.android.ugc.aweme.editSticker.f;

import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.method.KeyListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class d {
    static {
        Covode.recordClassIndex(55414);
    }

    public static final void a(EditText editText) {
        if (editText != null) {
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            editText.setCursorVisible(true);
        }
    }

    public static final int a(EditText editText, int i2) {
        int paddingLeft;
        int i3;
        if (editText == null) {
            return i2;
        }
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            paddingLeft = i2 - editText.getPaddingLeft();
            i3 = editText.getPaddingRight();
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            paddingLeft = ((i2 - editText.getPaddingLeft()) - editText.getPaddingRight()) - marginLayoutParams.leftMargin;
            i3 = marginLayoutParams.rightMargin;
        }
        return paddingLeft - i3;
    }

    private static final int b(EditText editText, int i2) {
        if (editText == null) {
            return 0;
        }
        try {
            if (editText.getLayout() == null) {
                return new StaticLayout(editText.getText(), editText.getPaint(), i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
            }
            Layout layout = editText.getLayout();
            l.b(layout, "");
            return layout.getLineCount();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static final void a(EditText editText, boolean z) {
        if (editText != null) {
            if (!z) {
                if (editText.getKeyListener() != null) {
                    editText.setTag(-1043131756, editText.getKeyListener());
                }
                editText.setKeyListener(null);
                return;
            }
            Object tag = editText.getTag(-1043131756);
            if (tag instanceof KeyListener) {
                editText.setKeyListener((KeyListener) tag);
            }
        }
    }

    public static final void a(EditText editText, int i2, int i3, Integer num) {
        Editable text;
        int a2;
        if (editText != null && (text = editText.getText()) != null && text.length() != 0) {
            if (num != null) {
                a2 = num.intValue();
            } else {
                a2 = a(editText, editText.getMaxWidth());
            }
            if (b(editText, a2) > i2 || editText.getText().length() > i3) {
                String obj = editText.getText().toString();
                int i4 = i2 * 50;
                if (obj.length() >= i4) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    obj = obj.substring(0, i4);
                    l.b(obj, "");
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String substring = obj.substring(0, obj.length() - 1);
                l.b(substring, "");
                int length = substring.length() - 1;
                while (length >= 0 && Character.isHighSurrogate(substring.charAt(length))) {
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    substring = substring.substring(0, length);
                    l.b(substring, "");
                    length--;
                }
                editText.setText(substring);
                editText.setSelection(editText.getText().length());
            }
        }
    }
}
