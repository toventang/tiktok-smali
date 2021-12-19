package com.ss.android.ugc.aweme.compliance.business.setting.a;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(47717);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.a.a$a  reason: collision with other inner class name */
    public static class C1773a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        private int f77170a;

        /* renamed from: b  reason: collision with root package name */
        private View.OnClickListener f77171b;

        static {
            Covode.recordClassIndex(47718);
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f77171b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f77170a);
            textPaint.setFakeBoldText(true);
            textPaint.setUnderlineText(false);
        }

        public C1773a(int i2, View.OnClickListener onClickListener) {
            this.f77170a = i2;
            this.f77171b = onClickListener;
        }
    }
}
