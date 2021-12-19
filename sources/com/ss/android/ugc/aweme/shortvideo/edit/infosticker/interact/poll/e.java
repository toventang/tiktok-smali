package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.graphics.Paint;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import h.f.b.l;
import h.j.g;
import h.m.p;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static int f127522a = 200;

    /* renamed from: b  reason: collision with root package name */
    public static int f127523b;

    /* renamed from: c  reason: collision with root package name */
    public static int f127524c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static int f127525d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static int f127526e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static int f127527f;

    static {
        Covode.recordClassIndex(83609);
    }

    public static final void b(EditText editText) {
        if (editText != null) {
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            KeyboardUtils.b(editText, i.f115645a);
            editText.setSelection(editText.getText().length());
        }
    }

    public static final int a(EditText editText) {
        if (editText == null) {
            return 0;
        }
        try {
            String obj = editText.getText().toString();
            Editable text = editText.getText();
            l.b(text, "");
            if (p.c(text, " ")) {
                obj = p.a(obj, new g(0, obj.length() - 2)) + '-';
            }
            return new StaticLayout(obj, editText.getPaint(), editText.getMaxWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static final void a(EditText editText, double d2) {
        if (editText != null) {
            if (!TextUtils.isEmpty(editText.getText().toString()) || editText.getHint() == null) {
                editText.setGravity(17);
                a(editText, en.a(d2, i.f115645a), en.a(d2, i.f115645a));
                return;
            }
            Paint paint = new Paint();
            paint.setTextSize(editText.getTextSize());
            paint.setTypeface(editText.getTypeface());
            int measureText = (int) ((((float) editText.getLayoutParams().width) - paint.measureText(editText.getHint().toString())) / 2.0f);
            if (measureText < 0) {
                a(editText, 0, 0);
                editText.setGravity(8388659);
                return;
            }
            a(editText, measureText, 0);
            editText.setGravity(8388627);
        }
    }

    public static final void a(EditText editText, int i2) {
        Editable text;
        if (editText != null && (text = editText.getText()) != null && text.length() != 0 && a(editText) > i2) {
            String obj = editText.getText().toString();
            int i3 = i2 * 50;
            if (obj.length() >= i3) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                obj = obj.substring(0, i3);
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

    private static void a(EditText editText, int i2, int i3) {
        if (editText != null) {
            int i4 = Build.VERSION.SDK_INT;
            editText.setPaddingRelative(i2, 0, i3, 0);
        }
    }
}
