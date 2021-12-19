package com.ss.android.ugc.aweme.challenge.ui;

import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.challenge.a;

public final class g extends a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f70142b;

    /* renamed from: c  reason: collision with root package name */
    private TextPaint f70143c;

    /* renamed from: d  reason: collision with root package name */
    private int f70144d;

    /* renamed from: e  reason: collision with root package name */
    private int f70145e = 4;

    /* renamed from: f  reason: collision with root package name */
    private boolean f70146f;

    /* renamed from: g  reason: collision with root package name */
    private String f70147g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f70148h;

    static {
        Covode.recordClassIndex(43252);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0084  */
    @Override // com.ss.android.ugc.aweme.challenge.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableString a(android.text.SpannableString r14) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.g.a(android.text.SpannableString):android.text.SpannableString");
    }

    public g(TextPaint textPaint, int i2, String str) {
        this.f70143c = textPaint;
        this.f70144d = i2;
        this.f70147g = str;
        this.f70146f = true;
        this.f70145e = 2;
    }

    private static int a(TextView textView, int i2, CharSequence charSequence) {
        MethodCollector.i(12461);
        TextView textView2 = new TextView(textView.getContext());
        textView2.setTextSize(0, textView.getTextSize());
        textView2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        textView2.setTypeface(textView.getTypeface());
        textView2.setIncludeFontPadding(textView.getIncludeFontPadding());
        textView2.setText(charSequence);
        textView2.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = textView2.getMeasuredHeight();
        MethodCollector.o(12461);
        return measuredHeight;
    }

    public g(TextView textView, TextPaint textPaint, int i2, String str) {
        this.f70143c = textPaint;
        this.f70144d = i2;
        this.f70147g = str;
        this.f70146f = true;
        this.f70145e = 4;
        this.f70148h = textView;
    }
}
