package com.ss.android.ugc.aweme.tools.draft.l;

import android.content.Context;
import android.graphics.Color;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.h;
import com.ss.android.ugc.aweme.df.l;
import com.ss.android.ugc.aweme.feed.model.AdLabel;
import com.ss.android.ugc.aweme.feed.model.AnchorsExtras;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class d extends b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f139824a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f139825b;

    /* renamed from: c  reason: collision with root package name */
    private e f139826c;

    /* renamed from: e  reason: collision with root package name */
    private int f139827e = 0;

    /* renamed from: f  reason: collision with root package name */
    private float f139828f = getTextSize();

    /* renamed from: g  reason: collision with root package name */
    private int f139829g = getCurrentTextColor();

    /* renamed from: h  reason: collision with root package name */
    private SpannableString f139830h;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.l.d$d  reason: collision with other inner class name */
    public interface AbstractC3693d {
        static {
            Covode.recordClassIndex(91397);
        }
    }

    public interface e {
        static {
            Covode.recordClassIndex(91398);
        }
    }

    static {
        Covode.recordClassIndex(91393);
    }

    public int getSpanColor() {
        return this.f139829g;
    }

    public float getSpanSize() {
        return this.f139828f;
    }

    public int getSpanStyle() {
        return this.f139827e;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public CharSequence getText() {
        return super.getText();
    }

    class a extends c {

        /* renamed from: d  reason: collision with root package name */
        private e f139832d;

        /* renamed from: e  reason: collision with root package name */
        private TextExtraStruct f139833e;

        /* renamed from: f  reason: collision with root package name */
        private int f139834f;

        /* renamed from: g  reason: collision with root package name */
        private AbstractC3693d f139835g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f139836h;

        static {
            Covode.recordClassIndex(91394);
        }

        @Override // com.ss.android.ugc.aweme.tools.draft.l.d.c
        public final void a(boolean z) {
            super.a(z);
        }

        public final void onClick(View view) {
            l.a(view, 1200);
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i2 = d.this.f139825b;
            if (i2 == 0 && (i2 = this.f139834f) == 0) {
                i2 = textPaint.linkColor;
            }
            if (this.f139842b) {
                i2 = d.a(i2);
            }
            if (this.f139836h) {
                textPaint.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            }
            textPaint.setColor(i2);
            textPaint.setUnderlineText(d.this.f139824a);
        }

        a(d dVar, e eVar, TextExtraStruct textExtraStruct, int i2) {
            this(eVar, textExtraStruct, i2, true, null);
        }

        a(e eVar, TextExtraStruct textExtraStruct, int i2, boolean z, AbstractC3693d dVar) {
            super();
            TextPaint paint;
            int i3;
            this.f139832d = eVar;
            this.f139833e = textExtraStruct;
            this.f139834f = i2;
            this.f139836h = z;
            if (d.this.f139825b != 0) {
                paint = d.this.getPaint();
                i3 = d.this.f139825b;
            } else {
                paint = d.this.getPaint();
                i3 = this.f139834f;
                if (i3 == 0) {
                    i3 = d.this.getPaint().linkColor;
                }
            }
            paint.setColor(i3);
            this.f139835g = dVar;
        }
    }

    public void setOnSpanClickListener(e eVar) {
        this.f139826c = eVar;
    }

    public void setShowUnderline(boolean z) {
        this.f139824a = z;
    }

    public void setSpanColor(int i2) {
        this.f139825b = i2;
    }

    public void setSpanSize(float f2) {
        this.f139828f = f2;
    }

    public void setSpanStyle(int i2) {
        this.f139827e = i2;
    }

    class b extends c {

        /* renamed from: d  reason: collision with root package name */
        private e f139838d;

        /* renamed from: e  reason: collision with root package name */
        private TextExtraStruct f139839e;

        /* renamed from: f  reason: collision with root package name */
        private int f139840f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f139841g;

        static {
            Covode.recordClassIndex(91395);
        }

        public final void onClick(View view) {
            l.a(view, 1200);
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i2 = this.f139840f;
            if (i2 == 0) {
                i2 = textPaint.linkColor;
            }
            if (this.f139842b) {
                i2 = d.a(i2);
            }
            textPaint.setColor(i2);
            textPaint.setUnderlineText(d.this.f139824a);
            textPaint.setFakeBoldText(this.f139841g);
        }

        b(e eVar, TextExtraStruct textExtraStruct, int i2) {
            super();
            this.f139838d = eVar;
            this.f139839e = textExtraStruct;
            this.f139840f = i2;
            this.f139841g = textExtraStruct.isBoldText();
        }
    }

    public abstract class c extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        public boolean f139842b;

        static {
            Covode.recordClassIndex(91396);
        }

        public c() {
        }

        public void a(boolean z) {
            this.f139842b = z;
            d.this.invalidate();
        }
    }

    public void setMaxSize(int i2) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
    }

    public static int a(int i2) {
        return Color.argb(Math.round(((float) Color.alpha(i2)) * 0.75f), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public void setAdHashTag(Aweme aweme) {
        boolean z;
        AdLabel adLabel;
        AdLabel adLabel2;
        Integer adLabelPosition;
        AdLabel adLabel3;
        Integer adLabelPosition2;
        h.f.b.l.d(aweme, "");
        String str = null;
        if (TextUtils.isEmpty(aweme.getAnchorsExtras())) {
            str = "";
        } else {
            AnchorsExtras anchorsExtras = (AnchorsExtras) h.a().a(aweme.getAnchorsExtras(), AnchorsExtras.class);
            if (anchorsExtras == null || (adLabel2 = anchorsExtras.getAdLabel()) == null || (adLabelPosition = adLabel2.getAdLabelPosition()) == null || adLabelPosition.intValue() != 1) {
                z = false;
            } else {
                z = true;
            }
            if (!(anchorsExtras == null || (adLabel = anchorsExtras.getAdLabel()) == null)) {
                str = adLabel.getAdLabelName();
            }
            if (!TextUtils.isEmpty(str)) {
                String str2 = str + ' ';
                if (!z || str2 == null) {
                    str = " ".concat(String.valueOf(str));
                } else {
                    str = str2;
                }
            }
        }
        if (this.f139830h != null && !TextUtils.isEmpty(str)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f139830h);
            h.f.b.l.d(aweme, "");
            h.f.b.l.d(aweme, "");
            if (TextUtils.isEmpty(aweme.getAnchorsExtras())) {
                adLabelPosition2 = 1;
            } else {
                AnchorsExtras anchorsExtras2 = (AnchorsExtras) h.a().a(aweme.getAnchorsExtras(), AnchorsExtras.class);
                if (!(anchorsExtras2 == null || (adLabel3 = anchorsExtras2.getAdLabel()) == null)) {
                    adLabelPosition2 = adLabel3.getAdLabelPosition();
                }
                spannableStringBuilder.append((CharSequence) str);
                a(spannableStringBuilder, this.f139830h.length() + 1, this.f139830h.length() + str.length());
                setText(spannableStringBuilder);
            }
            if (adLabelPosition2 != null && adLabelPosition2.intValue() == 1) {
                spannableStringBuilder.insert(0, (CharSequence) str);
                a(spannableStringBuilder, 0, str.length());
                setText(spannableStringBuilder);
            }
            spannableStringBuilder.append((CharSequence) str);
            a(spannableStringBuilder, this.f139830h.length() + 1, this.f139830h.length() + str.length());
            setText(spannableStringBuilder);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i2, int i3) {
        try {
            super.onMeasure(i2, i3);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.df.e.a(e2);
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHighlightColor(0);
    }

    public final void a(List<TextExtraStruct> list, boolean z) {
        int start;
        int end;
        SpannableString spannableString = new SpannableString(getText());
        if (list == null || list.isEmpty() || TextUtils.isEmpty(spannableString.toString())) {
            this.f139830h = spannableString;
            return;
        }
        int length = spannableString.length();
        for (TextExtraStruct textExtraStruct : list) {
            if (textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
                if (textExtraStruct.getStart() < 0) {
                    start = 0;
                } else {
                    start = textExtraStruct.getStart();
                }
                if (textExtraStruct.getEnd() > length) {
                    end = length;
                } else {
                    end = textExtraStruct.getEnd();
                }
                if (end > start) {
                    if (textExtraStruct.getType() == 65281) {
                        spannableString.setSpan(textExtraStruct.getCustomSpan(), start, end, 33);
                    } else if (textExtraStruct.getType() != 4) {
                        if (textExtraStruct.getType() == 65282) {
                            spannableString.setSpan(new b(this.f139826c, textExtraStruct, textExtraStruct.getColor()), start, end, 33);
                        } else if (textExtraStruct.getType() == 5) {
                            spannableString.setSpan(new b(this.f139826c, textExtraStruct, textExtraStruct.getColor()), start, end, 33);
                        } else if (textExtraStruct.getType() == 65285) {
                            Object customSpan = textExtraStruct.getCustomSpan();
                            int i2 = start + 1;
                            if (i2 > end) {
                                i2 = end;
                            }
                            spannableString.setSpan(customSpan, start, i2, 33);
                            spannableString.setSpan(new StyleSpan(this.f139827e), start, end, 33);
                            if (customSpan instanceof AbstractC3693d) {
                                spannableString.setSpan(new a(this.f139826c, textExtraStruct, this.f139829g, z, (AbstractC3693d) customSpan), start, end, 33);
                            }
                        } else {
                            if (textExtraStruct.getType() == 2) {
                                this.f139829g = androidx.core.content.b.c(getContext(), R.color.bx);
                            } else if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1) {
                                this.f139829g = androidx.core.content.b.c(getContext(), R.color.ba);
                            } else if (textExtraStruct.getType() == 3) {
                                this.f139829g = androidx.core.content.b.c(getContext(), R.color.bx);
                            }
                            spannableString.setSpan(new a(this, this.f139826c, textExtraStruct, this.f139829g), start, end, 33);
                            if (textExtraStruct.getType() == 3) {
                                spannableString.setSpan(new StyleSpan(1), start, end, 33);
                            } else {
                                spannableString.setSpan(new StyleSpan(this.f139827e), start, end, 33);
                            }
                            spannableString.setSpan(new AbsoluteSizeSpan((int) this.f139828f), start, end, 33);
                        }
                    }
                }
            }
        }
        this.f139830h = spannableString;
        setText(spannableString);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        spannableStringBuilder.setSpan(new StyleSpan(1), i2, i3, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), i2, i3, 33);
    }

    public final void a(int i2, int i3, Object obj) {
        int length;
        SpannableString spannableString = this.f139830h;
        if (spannableString != null && i2 <= (length = spannableString.length()) && i3 <= length && i2 <= i3) {
            this.f139830h.setSpan(obj, i2, i3, 33);
            setText(this.f139830h, TextView.BufferType.SPANNABLE);
        }
    }
}
