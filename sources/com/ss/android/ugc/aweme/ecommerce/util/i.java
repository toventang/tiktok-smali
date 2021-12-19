package com.ss.android.ugc.aweme.ecommerce.util;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public class i implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f87577a;

    /* renamed from: b  reason: collision with root package name */
    private final int f87578b;

    /* renamed from: c  reason: collision with root package name */
    private final String f87579c;

    /* renamed from: d  reason: collision with root package name */
    private final int f87580d;

    static {
        Covode.recordClassIndex(55047);
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        l.d(charSequence, "");
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        l.d(charSequence, "");
    }

    public void afterTextChanged(Editable editable) {
        l.d(editable, "");
        if (this.f87578b > 0) {
            String obj = editable.toString();
            int selectionStart = this.f87577a.getSelectionStart();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
            int i2 = 0;
            String substring = obj.substring(0, selectionStart);
            l.b(substring, "");
            int length = p.a(substring, this.f87579c, "").length();
            StringBuilder sb = new StringBuilder();
            int length2 = obj.length();
            int i3 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                char charAt = obj.charAt(i4);
                if (charAt != this.f87579c.charAt(0)) {
                    sb.append(charAt);
                    if ((sb.length() - i3) % this.f87578b == 0) {
                        sb.append(this.f87579c);
                        i3++;
                    }
                }
            }
            int lastIndexOf = sb.lastIndexOf(this.f87579c);
            if (lastIndexOf >= 0 && lastIndexOf == sb.length() - 1) {
                sb.deleteCharAt(lastIndexOf);
            }
            String sb2 = sb.toString();
            if (sb2.length() > this.f87580d) {
                l.b(sb2, "");
                int i5 = this.f87580d;
                Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
                sb2 = sb2.substring(0, i5);
                l.b(sb2, "");
            } else {
                l.b(sb2, "");
            }
            int i6 = this.f87578b;
            int i7 = ((length / i6) * (i6 + 1)) + (length % i6);
            if (i7 % (i6 + 1) == 0) {
                i7--;
            }
            int length3 = sb2.length();
            if (i7 >= 0) {
                i2 = i7;
            }
            if (i2 <= length3) {
                length3 = i2;
            }
            if (!l.a((Object) sb2, (Object) obj)) {
                this.f87577a.setText(sb2);
            }
            this.f87577a.setSelection(length3);
        }
    }

    public i(EditText editText, int i2, String str, int i3) {
        int i4;
        l.d(editText, "");
        l.d(str, "");
        this.f87577a = editText;
        this.f87578b = i2;
        this.f87579c = str;
        int i5 = (i3 / i2) + i3;
        if (i3 % i2 > 0) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        this.f87580d = i5 - i4;
    }
}
