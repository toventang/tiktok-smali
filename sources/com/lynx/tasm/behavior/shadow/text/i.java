package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.c;

public class i extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final c f56006a;

    static {
        Covode.recordClassIndex(35001);
    }

    public i(c cVar) {
        this.f56006a = cVar;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f56006a.f56147d, this.f56006a.f56145b, this.f56006a.f56146c, this.f56006a.f56144a);
    }
}
