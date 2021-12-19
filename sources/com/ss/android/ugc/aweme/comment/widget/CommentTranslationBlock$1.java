package com.ss.android.ugc.aweme.comment.widget;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;

class CommentTranslationBlock$1 extends ForegroundColorSpan {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f73017a;

    static {
        Covode.recordClassIndex(44976);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(false);
        textPaint.setUnderlineText(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommentTranslationBlock$1(b bVar, int i2) {
        super(i2);
        this.f73017a = bVar;
    }
}
