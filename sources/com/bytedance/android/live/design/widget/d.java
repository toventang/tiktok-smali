package com.bytedance.android.live.design.widget;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import com.bytedance.android.live.design.a.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final View f9595a;

    static {
        Covode.recordClassIndex(4865);
    }

    public d(View view) {
        this.f9595a = view;
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        if (!this.f9595a.isInEditMode() && (charSequence instanceof String)) {
            return a.a((String) charSequence);
        }
        return charSequence;
    }
}
