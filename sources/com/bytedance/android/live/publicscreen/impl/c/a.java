package com.bytedance.android.live.publicscreen.impl.c;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.impl.c.d;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a implements d {

    /* renamed from: b  reason: collision with root package name */
    private int f12233b;

    static {
        Covode.recordClassIndex(6739);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.c.d
    public final int a() {
        return d.a.f12247b;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.c.d
    public final Spannable b() {
        String valueOf = String.valueOf(this.f12233b);
        if (this.f12233b >= 99) {
            valueOf = valueOf + "+";
        }
        SpannableString spannableString = new SpannableString("");
        spannableString.setSpan(new ForegroundColorSpan(y.b((int) R.color.yj)), 1, valueOf.length() + 1, 33);
        return spannableString;
    }

    public a(int i2) {
        this.f12233b = i2;
    }
}
