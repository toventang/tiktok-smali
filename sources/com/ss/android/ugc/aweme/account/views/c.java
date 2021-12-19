package com.ss.android.ugc.aweme.account.views;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.bytedance.covode.number.Covode;

public abstract class c extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private int f65523a;

    /* renamed from: b  reason: collision with root package name */
    private int f65524b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f65525d;

    static {
        Covode.recordClassIndex(40301);
    }

    public void updateDrawState(TextPaint textPaint) {
        int i2;
        super.updateDrawState(textPaint);
        if (this.f65525d) {
            i2 = this.f65524b;
        } else {
            i2 = this.f65523a;
        }
        textPaint.setColor(i2);
        textPaint.setUnderlineText(false);
    }

    public c(int i2, int i3) {
        this.f65523a = i2;
        this.f65524b = i3;
    }
}
