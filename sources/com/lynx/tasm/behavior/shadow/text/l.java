package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.text.n;
import com.lynx.tasm.utils.b;

public final class l {
    static {
        Covode.recordClassIndex(35004);
    }

    public static TextPaint a(j jVar, k kVar) {
        return a(kVar, b(jVar, kVar));
    }

    public static Typeface b(j jVar, k kVar) {
        String str = kVar.q;
        if (!TextUtils.isEmpty(str)) {
            return r.a(jVar, str, kVar.a());
        }
        return null;
    }

    public static TextPaint a(k kVar, Typeface typeface) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(kVar.n);
        String str = kVar.q;
        if (!TextUtils.isEmpty(str)) {
            if (typeface != null) {
                textPaint.setTypeface(typeface);
            } else {
                throw new n.a(str);
            }
        } else if (b.a()) {
            textPaint.setTypeface(b.b());
        }
        if (kVar.f56013g == 1) {
            textPaint.setFakeBoldText(true);
        }
        if (kVar.f56018l != 1.0E21f && Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(kVar.f56018l / textPaint.getTextSize());
        }
        if ((kVar.s & 1) != 0) {
            textPaint.setUnderlineText(true);
        }
        if ((kVar.s & 2) != 0) {
            textPaint.setStrikeThruText(true);
        }
        if (kVar.r != null) {
            textPaint.setShadowLayer(kVar.r.f56147d, kVar.r.f56145b, kVar.r.f56146c, kVar.r.f56144a);
        }
        return textPaint;
    }
}
