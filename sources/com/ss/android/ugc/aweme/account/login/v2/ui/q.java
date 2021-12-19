package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.views.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f65100a = new q();

    private q() {
    }

    static {
        Covode.recordClassIndex(40012);
    }

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f65101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f65102b;

        static {
            Covode.recordClassIndex(40013);
        }

        public final void onClick(View view) {
            l.d(view, "");
            this.f65101a.onClick(view);
        }

        @Override // com.ss.android.ugc.aweme.account.views.c
        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setFakeBoldText(true);
            super.updateDrawState(textPaint);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View.OnClickListener onClickListener, int i2, int i3, int i4) {
            super(i3, i4);
            this.f65101a = onClickListener;
            this.f65102b = i2;
        }
    }

    public static void a(TextView textView, View.OnClickListener onClickListener, int i2, int i3) {
        l.d(textView, "");
        l.d(onClickListener, "");
        Context context = textView.getContext();
        String string = context.getString(i3);
        l.b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i2, string));
        int c2 = b.c(context, R.color.bh);
        a aVar = new a(onClickListener, c2, c2, c2);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        l.b(spannableStringBuilder2, "");
        int a2 = p.a((CharSequence) spannableStringBuilder2, string, 0, false, 6);
        spannableStringBuilder.setSpan(aVar, a2, string.length() + a2, 34);
        textView.setHighlightColor(b.c(context, R.color.c9));
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(com.ss.android.ugc.aweme.account.views.a.a());
    }
}
