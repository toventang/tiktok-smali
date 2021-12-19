package com.ss.android.ugc.aweme.ad.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class DescTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66173a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f66174b;

    /* renamed from: c  reason: collision with root package name */
    private int f66175c;

    /* renamed from: e  reason: collision with root package name */
    private String f66176e;

    static {
        Covode.recordClassIndex(40681);
    }

    public DescTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40682);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getMoreString() {
        return this.f66176e;
    }

    private final int getDotWidth() {
        return (int) getPaint().measureText(this.f66174b);
    }

    private final com.bytedance.ies.dmt.ui.common.a getImageSpan() {
        com.bytedance.ies.dmt.ui.common.a aVar = new com.bytedance.ies.dmt.ui.common.a(getContext(), this.f66175c);
        aVar.f33344a = (int) n.b(getContext(), 4.0f);
        return aVar;
    }

    private final int getSpanWidth() {
        Drawable drawable = getImageSpan().getDrawable();
        l.b(drawable, "");
        double ceil = Math.ceil((double) drawable.getIntrinsicWidth());
        double b2 = (double) n.b(getContext(), 4.0f);
        Double.isNaN(b2);
        return (int) (ceil + b2);
    }

    public final void setMoreString(String str) {
        l.d(str, "");
        this.f66176e = str;
        invalidate();
    }

    public final void setViewLineHeight(int i2) {
        int fontMetricsInt;
        if (i2 >= 0 && i2 != (fontMetricsInt = getPaint().getFontMetricsInt(null))) {
            setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
        }
    }

    private final SpannableString a(String str) {
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        String sb2 = sb.append(p.d((CharSequence) str).toString()).append(' ').toString();
        SpannableString spannableString = new SpannableString(sb2);
        spannableString.setSpan(getImageSpan(), sb2.length() - 1, sb2.length(), 33);
        return spannableString;
    }

    private final String a(String str, int i2) {
        int i3 = i2;
        TextPaint paint = getPaint();
        if (i3 < 0) {
            i3 = 0;
        }
        StaticLayout staticLayout = new StaticLayout(str, paint, i3, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        int lineStart = staticLayout.getLineStart(getMaxLines() - 1);
        int lineEnd = staticLayout.getLineEnd(getMaxLines() - 1);
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(lineStart, lineEnd);
        l.b(substring, "");
        return substring;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        SpannableString a2;
        int size = View.MeasureSpec.getSize(i2);
        String obj = getText().toString();
        TextPaint paint = getPaint();
        if (size < 0) {
            i4 = 0;
        } else {
            i4 = size;
        }
        if (new StaticLayout(obj, paint, i4, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding()).getLineCount() < getMaxLines()) {
            a2 = a(getText().toString());
        } else {
            if (((float) size) > ((float) getSpanWidth()) + getPaint().measureText(a(getText().toString(), size))) {
                a2 = a(getText().toString());
            } else {
                StringBuilder sb = new StringBuilder();
                String obj2 = getText().toString();
                TextPaint paint2 = getPaint();
                if (size < 0) {
                    i5 = 0;
                } else {
                    i5 = size;
                }
                int lineStart = new StaticLayout(obj2, paint2, i5, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding()).getLineStart(getMaxLines() - 1);
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.String");
                String substring = obj2.substring(0, lineStart);
                l.b(substring, "");
                StringBuilder append = sb.append(substring);
                String obj3 = getText().toString();
                int dotWidth = (size - getDotWidth()) - getSpanWidth();
                String a3 = a(obj3, size);
                TextPaint paint3 = getPaint();
                if (dotWidth <= 0) {
                    dotWidth = 0;
                }
                StaticLayout staticLayout = new StaticLayout(a3, paint3, dotWidth, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
                int lineStart2 = staticLayout.getLineStart(0);
                int lineEnd = staticLayout.getLineEnd(0);
                StringBuilder sb2 = new StringBuilder();
                String a4 = a(obj3, size);
                Objects.requireNonNull(a4, "null cannot be cast to non-null type java.lang.String");
                String substring2 = a4.substring(lineStart2, lineEnd);
                l.b(substring2, "");
                a2 = a(append.append(sb2.append(substring2).append(this.f66174b).toString()).toString());
            }
        }
        setText(a2);
        super.onMeasure(i2, i3);
    }

    private /* synthetic */ DescTextView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DescTextView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f66174b = "...";
        this.f66175c = 2131231867;
        this.f66176e = "";
        setViewLineHeight((int) n.b(context, 20.0f));
    }
}
