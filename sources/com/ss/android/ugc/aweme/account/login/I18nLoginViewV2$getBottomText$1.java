package com.ss.android.ugc.aweme.account.login;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class I18nLoginViewV2$getBottomText$1 extends ForegroundColorSpan {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f63184a;

    static {
        Covode.recordClassIndex(38930);
    }

    public final void updateDrawState(TextPaint textPaint) {
        l.d(textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    I18nLoginViewV2$getBottomText$1(int i2, int i3) {
        super(i3);
        this.f63184a = i2;
    }
}
