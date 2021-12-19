package com.ss.android.ugc.aweme.challenge.f;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69949a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(43136);
    }

    public static b a(TextView textView, CharSequence charSequence) {
        l.d(textView, "");
        l.d(charSequence, "");
        if (textView.getWidth() <= 0) {
            return new b();
        }
        DmtTextView dmtTextView = new DmtTextView(textView.getContext());
        dmtTextView.setTextSize(0, textView.getTextSize());
        dmtTextView.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        dmtTextView.setTypeface(textView.getTypeface());
        dmtTextView.setIncludeFontPadding(textView.getIncludeFontPadding());
        dmtTextView.setText(charSequence);
        dmtTextView.measure(View.MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return new b(Integer.valueOf(dmtTextView.getMeasuredWidth()), Integer.valueOf(dmtTextView.getMeasuredHeight()), Integer.valueOf(dmtTextView.getLineCount()));
    }
}
