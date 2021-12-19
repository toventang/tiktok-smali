package com.ss.android.ugc.aweme.report;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final View.OnClickListener f120577a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f120578b;

    static {
        Covode.recordClassIndex(78510);
    }

    public final void onClick(View view) {
        l.d(view, "");
        this.f120577a.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        l.d(textPaint, "");
        textPaint.setColor(b.c(this.f120578b, R.color.f159928l));
    }

    public a(View.OnClickListener onClickListener, Context context) {
        l.d(onClickListener, "");
        l.d(context, "");
        this.f120577a = onClickListener;
        this.f120578b = context;
    }
}
