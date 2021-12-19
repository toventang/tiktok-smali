package com.ss.android.ugc.aweme.base.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class s extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public boolean f68408a;

    /* renamed from: b  reason: collision with root package name */
    public final int f68409b;

    /* renamed from: c  reason: collision with root package name */
    public final int f68410c;

    static {
        Covode.recordClassIndex(42114);
    }

    public void updateDrawState(TextPaint textPaint) {
        int i2;
        l.d(textPaint, "");
        super.updateDrawState(textPaint);
        if (this.f68408a) {
            i2 = this.f68410c;
        } else {
            i2 = this.f68409b;
        }
        textPaint.setColor(i2);
        textPaint.setUnderlineText(false);
    }

    public s(int i2, int i3) {
        this.f68409b = i2;
        this.f68410c = i3;
    }
}
