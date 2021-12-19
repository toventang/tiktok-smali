package com.ss.android.ugc.aweme.ftc.m;

import android.app.Application;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final int f98800a;

    static {
        Covode.recordClassIndex(62821);
    }

    public a(int i2) {
        this.f98800a = i2;
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        l.d(charSequence, "");
        l.d(spanned, "");
        int length = this.f98800a - (spanned.length() - (i5 - i4));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                Application application = i.f115645a;
                l.b(application, "");
                String string = application.getResources().getString(R.string.fl5, Integer.valueOf(this.f98800a));
                l.b(string, "");
                new com.ss.android.ugc.aweme.tux.a.i.a(i.f115645a).a(string).a();
            }
            return "";
        } else if (length >= i3 - i2) {
            return null;
        } else {
            int i6 = length + i2;
            Application application2 = i.f115645a;
            l.b(application2, "");
            String string2 = application2.getResources().getString(R.string.fl5, Integer.valueOf(this.f98800a));
            l.b(string2, "");
            if (!Character.isHighSurrogate(charSequence.charAt(i6 - 1)) || i6 - 1 != i2) {
                new com.ss.android.ugc.aweme.tux.a.i.a(i.f115645a).a(string2).a();
                return charSequence.subSequence(i2, i6);
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(i.f115645a).a(string2).a();
            return "";
        }
    }
}
