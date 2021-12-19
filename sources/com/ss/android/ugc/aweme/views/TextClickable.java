package com.ss.android.ugc.aweme.views;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextClickable {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f144565a = Pattern.compile("(#|＃)([0-9\\uff10-\\uff19_a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc]*[a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc][0-9\\uff10-\\uff19_a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc]*)");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f144566f = Pattern.compile("@([\\u4e00-\\u9fa5\\w\\.]{1,19}[\\u4e00-\\u9fa5\\w])");

    /* renamed from: b  reason: collision with root package name */
    public int f144567b = 2;

    /* renamed from: c  reason: collision with root package name */
    public a f144568c;

    /* renamed from: d  reason: collision with root package name */
    public Pattern f144569d = f144565a;

    /* renamed from: e  reason: collision with root package name */
    public Typeface f144570e;

    /* renamed from: g  reason: collision with root package name */
    private int f144571g = 1;

    /* renamed from: h  reason: collision with root package name */
    private Pattern f144572h = f144566f;

    public interface a {
        static {
            Covode.recordClassIndex(94608);
        }

        void a(TextPaint textPaint);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(94605);
    }

    /* access modifiers changed from: package-private */
    public static class CustomTypefaceSpan extends TypefaceSpan {

        /* renamed from: a  reason: collision with root package name */
        private final Typeface f144575a;

        static {
            Covode.recordClassIndex(94607);
        }

        public void updateDrawState(TextPaint textPaint) {
            a(textPaint, this.f144575a);
        }

        public void updateMeasureState(TextPaint textPaint) {
            a(textPaint, this.f144575a);
        }

        CustomTypefaceSpan(String str, Typeface typeface) {
            super(str);
            this.f144575a = typeface;
        }

        private static void a(Paint paint, Typeface typeface) {
            int style;
            Typeface typeface2 = paint.getTypeface();
            if (typeface2 == null) {
                style = 0;
            } else {
                style = typeface2.getStyle();
            }
            int style2 = style & (typeface.getStyle() ^ -1);
            if ((style2 & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style2 & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        private String f144577b;

        /* renamed from: c  reason: collision with root package name */
        private int f144578c;

        static {
            Covode.recordClassIndex(94609);
        }

        public final void onClick(View view) {
            if (TextClickable.this.f144568c != null) {
                TextClickable.this.f144568c.a(this.f144577b);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            if (TextClickable.this.f144568c != null) {
                TextClickable.this.f144568c.a(textPaint);
            }
        }

        private b(String str, int i2) {
            this.f144577b = str;
            this.f144578c = i2;
        }

        /* synthetic */ b(TextClickable textClickable, String str, int i2, byte b2) {
            this(str, i2);
        }
    }

    public final boolean a(Spannable spannable) {
        String obj = spannable.toString();
        Matcher matcher = this.f144569d.matcher(obj);
        Matcher matcher2 = this.f144572h.matcher(obj);
        boolean z = false;
        while (matcher2.find()) {
            spannable.setSpan(new b(this, matcher2.group(this.f144571g), 1, (byte) 0), matcher2.start(), matcher2.end(), 33);
            a(spannable, matcher2.start(), matcher2.end());
            z = true;
        }
        while (matcher.find()) {
            spannable.setSpan(new b(this, matcher.group(this.f144567b), 0, (byte) 0), matcher.start(), matcher.end(), 33);
            a(spannable, matcher.start(), matcher.end());
            z = true;
        }
        return z;
    }

    private void a(Spannable spannable, int i2, int i3) {
        if (this.f144570e != null) {
            spannable.setSpan(new CustomTypefaceSpan("", this.f144570e), i2, i3, 0);
        }
    }
}
