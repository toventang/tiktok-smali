package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.g.b;
import com.zhiliaoapp.musically.R;

public final class ad implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final int f102362a = 6000;

    /* renamed from: b  reason: collision with root package name */
    private final View f102363b;

    static {
        Covode.recordClassIndex(65522);
    }

    public ad(View view) {
        this.f102363b = view;
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        int length = this.f102362a - (spanned.length() - (i5 - i4));
        if (length <= 0) {
            new b(this.f102363b).a(d.a().getResources().getString(R.string.cfv)).b();
            return "";
        } else if (length >= i3 - i2) {
            return null;
        } else {
            int i6 = length + i2;
            if (!Character.isHighSurrogate(charSequence.charAt(i6 - 1)) || i6 - 1 != i2) {
                return charSequence.subSequence(i2, i6);
            }
            new b(this.f102363b).a(d.a().getResources().getString(R.string.cfv)).b();
            return "";
        }
    }
}
