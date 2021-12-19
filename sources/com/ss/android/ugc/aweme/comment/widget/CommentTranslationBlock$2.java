package com.ss.android.ugc.aweme.comment.widget;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;

class CommentTranslationBlock$2 extends ForegroundColorSpan {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f73018a;

    static {
        Covode.recordClassIndex(44977);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
        textPaint.setUnderlineText(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommentTranslationBlock$2(b bVar, int i2) {
        super(i2);
        this.f73018a = bVar;
    }
}
