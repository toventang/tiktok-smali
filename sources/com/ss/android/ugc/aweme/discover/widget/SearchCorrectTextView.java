package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.f.a.b;

public class SearchCorrectTextView extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    private String f82820a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f82821b = "";

    /* renamed from: c  reason: collision with root package name */
    private int f82822c = -1;

    /* renamed from: e  reason: collision with root package name */
    private boolean f82823e;

    static {
        Covode.recordClassIndex(51618);
    }

    private void a() {
        if (getLayout().getEllipsisCount(getLineCount() - 1) > 0) {
            CharSequence ellipsize = TextUtils.ellipsize(this.f82821b, getPaint(), (float) ((int) (((float) getMeasuredWidth()) - getPaint().measureText(this.f82820a))), TextUtils.TruncateAt.END);
            a(a.a(this.f82820a, new Object[]{String.valueOf(ellipsize)}), String.valueOf(ellipsize));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f82823e = true;
        try {
            a();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public SearchCorrectTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    private void a(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (this.f82822c != -1) {
            int indexOf = str.indexOf(str2);
            int length = str2.length() + indexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f82822c), indexOf, length, 33);
            spannableStringBuilder.setSpan(new b(42, true), indexOf, length, 33);
        }
        setText(spannableStringBuilder);
    }

    public final void a(int i2, String str, int i3) {
        this.f82820a = getResources().getString(i2);
        this.f82821b = str;
        this.f82822c = i3;
        a(getResources().getString(i2, String.valueOf(str)), str);
        if (this.f82823e) {
            a();
        }
    }
}
