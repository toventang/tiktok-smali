package com.ss.android.ugc.aweme.views;

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
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.model.AdLabel;
import com.ss.android.ugc.aweme.feed.model.AnchorsExtras;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public class MentionTextView extends c {

    /* renamed from: a  reason: collision with root package name */
    private f f144476a;

    /* renamed from: b  reason: collision with root package name */
    private int f144477b;

    /* renamed from: c  reason: collision with root package name */
    private float f144478c;

    /* renamed from: e  reason: collision with root package name */
    private int f144479e;

    /* renamed from: f  reason: collision with root package name */
    private SpannableString f144480f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f144481g;

    /* renamed from: h  reason: collision with root package name */
    public int f144482h;

    /* renamed from: i  reason: collision with root package name */
    float f144483i;

    public interface d {
        static {
            Covode.recordClassIndex(94582);
        }

        boolean a(TextExtraStruct textExtraStruct);
    }

    public interface e {
        static {
            Covode.recordClassIndex(94583);
        }
    }

    public interface f {
        static {
            Covode.recordClassIndex(94584);
        }

        void a(TextExtraStruct textExtraStruct);
    }

    static {
        Covode.recordClassIndex(94578);
    }

    public int getSpanColor() {
        return this.f144479e;
    }

    public float getSpanSize() {
        return this.f144478c;
    }

    public int getSpanStyle() {
        return this.f144477b;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public CharSequence getText() {
        return super.getText();
    }

    private void a() {
        this.f144481g = false;
        this.f144477b = 0;
        this.f144478c = getTextSize();
        this.f144479e = getCurrentTextColor();
        setHighlightColor(0);
    }

    /* access modifiers changed from: package-private */
    public class a extends c {

        /* renamed from: d  reason: collision with root package name */
        private f f144485d;

        /* renamed from: e  reason: collision with root package name */
        private TextExtraStruct f144486e;

        /* renamed from: f  reason: collision with root package name */
        private int f144487f;

        /* renamed from: g  reason: collision with root package name */
        private e f144488g;

        static {
            Covode.recordClassIndex(94579);
        }

        @Override // com.ss.android.ugc.aweme.views.MentionTextView.c
        public final void a(boolean z) {
            super.a(z);
        }

        public final void onClick(View view) {
            f fVar;
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (fVar = this.f144485d) != null) {
                fVar.a(this.f144486e);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i2 = MentionTextView.this.f144482h;
            if (i2 == 0 && (i2 = this.f144487f) == 0) {
                i2 = textPaint.linkColor;
            }
            if (this.f144494b) {
                i2 = MentionTextView.a(i2);
            }
            textPaint.setColor(i2);
            textPaint.setUnderlineText(MentionTextView.this.f144481g);
        }

        a(f fVar, TextExtraStruct textExtraStruct, int i2, e eVar) {
            super();
            TextPaint paint;
            int i3;
            this.f144485d = fVar;
            this.f144486e = textExtraStruct;
            this.f144487f = i2;
            if (MentionTextView.this.f144482h != 0) {
                paint = MentionTextView.this.getPaint();
                i3 = MentionTextView.this.f144482h;
            } else {
                paint = MentionTextView.this.getPaint();
                i3 = this.f144487f;
                if (i3 == 0) {
                    i3 = MentionTextView.this.getPaint().linkColor;
                }
            }
            paint.setColor(i3);
            this.f144488g = eVar;
        }
    }

    public void setOnSpanClickListener(f fVar) {
        this.f144476a = fVar;
    }

    public void setShowUnderline(boolean z) {
        this.f144481g = z;
    }

    public void setSpanColor(int i2) {
        this.f144482h = i2;
    }

    public void setSpanSize(float f2) {
        this.f144478c = f2;
    }

    public void setSpanStyle(int i2) {
        this.f144477b = i2;
    }

    public abstract class c extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        public boolean f144494b;

        static {
            Covode.recordClassIndex(94581);
        }

        public c() {
        }

        public void a(boolean z) {
            this.f144494b = z;
            MentionTextView.this.invalidate();
        }
    }

    public MentionTextView(Context context) {
        super(context);
        a();
    }

    public void setMaxSize(int i2) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
    }

    /* access modifiers changed from: package-private */
    public class b extends c {

        /* renamed from: d  reason: collision with root package name */
        private f f144490d;

        /* renamed from: e  reason: collision with root package name */
        private TextExtraStruct f144491e;

        /* renamed from: f  reason: collision with root package name */
        private int f144492f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f144493g;

        static {
            Covode.recordClassIndex(94580);
        }

        public final void onClick(View view) {
            f fVar;
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (fVar = this.f144490d) != null) {
                fVar.a(this.f144491e);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i2 = this.f144492f;
            if (i2 == 0) {
                i2 = textPaint.linkColor;
            }
            if (this.f144494b) {
                i2 = MentionTextView.a(i2);
            }
            textPaint.setColor(i2);
            textPaint.setUnderlineText(MentionTextView.this.f144481g);
            textPaint.setFakeBoldText(this.f144493g);
        }

        b(f fVar, TextExtraStruct textExtraStruct, int i2) {
            super();
            this.f144490d = fVar;
            this.f144491e = textExtraStruct;
            this.f144492f = i2;
            this.f144493g = textExtraStruct.isBoldText();
        }
    }

    public static int a(int i2) {
        return Color.argb(Math.round(((float) Color.alpha(i2)) * 0.75f), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    @Override // com.ss.android.ugc.aweme.views.c
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (com.ss.android.ugc.aweme.feed.v.a.a() && getLineHeight() * getLineCount() > getHeight()) {
            if (motionEvent.getAction() == 0) {
                this.f144483i = motionEvent.getY();
            } else if (motionEvent.getAction() == 2) {
                float y = this.f144483i - motionEvent.getY();
                if (y > 0.0f) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else if (y < 0.0f) {
                    if (getScrollY() == 0) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                this.f144483i = motionEvent.getY();
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdHashTag(Aweme aweme) {
        boolean z;
        AdLabel adLabel;
        AdLabel adLabel2;
        Integer adLabelPosition;
        AdLabel adLabel3;
        Integer adLabelPosition2;
        l.d(aweme, "");
        String str = null;
        if (TextUtils.isEmpty(aweme.getAnchorsExtras())) {
            str = "";
        } else {
            AnchorsExtras anchorsExtras = (AnchorsExtras) dg.a().a(aweme.getAnchorsExtras(), AnchorsExtras.class);
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
        if (this.f144480f != null && !TextUtils.isEmpty(str)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f144480f);
            l.d(aweme, "");
            l.d(aweme, "");
            if (TextUtils.isEmpty(aweme.getAnchorsExtras())) {
                adLabelPosition2 = 1;
            } else {
                AnchorsExtras anchorsExtras2 = (AnchorsExtras) dg.a().a(aweme.getAnchorsExtras(), AnchorsExtras.class);
                if (!(anchorsExtras2 == null || (adLabel3 = anchorsExtras2.getAdLabel()) == null)) {
                    adLabelPosition2 = adLabel3.getAdLabelPosition();
                }
                spannableStringBuilder.append((CharSequence) str);
                a(spannableStringBuilder, this.f144480f.length() + 1, this.f144480f.length() + str.length());
                setText(spannableStringBuilder);
            }
            if (adLabelPosition2 != null && adLabelPosition2.intValue() == 1) {
                spannableStringBuilder.insert(0, (CharSequence) str);
                a(spannableStringBuilder, 0, str.length());
                setText(spannableStringBuilder);
            }
            spannableStringBuilder.append((CharSequence) str);
            a(spannableStringBuilder, this.f144480f.length() + 1, this.f144480f.length() + str.length());
            setText(spannableStringBuilder);
        }
    }

    public final void a(List<TextExtraStruct> list, d dVar) {
        a(list, dVar, (d) null);
    }

    public MentionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i2, int i3) {
        try {
            super.onMeasure(i2, i3);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
    }

    public final void a(CharSequence charSequence, String str) {
        SpannableStringBuilder spannableStringBuilder;
        if (!s.a() || (!TextUtils.equals("ko", str) && !TextUtils.equals("ja", str) && !TextUtils.equals("zh-Hant", str))) {
            setText(charSequence);
            return;
        }
        int a2 = n.a((double) s.b());
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        spannableStringBuilder.setSpan(new j(a2), 0, charSequence.length(), 33);
        setLineSpacing(0.0f, 1.0f);
        setText(spannableStringBuilder);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        spannableStringBuilder.setSpan(new StyleSpan(1), i2, i3, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), i2, i3, 33);
    }

    public final void a(int i2, int i3, Object obj) {
        int length;
        SpannableString spannableString = this.f144480f;
        if (spannableString != null && i2 <= (length = spannableString.length()) && i3 <= length && i2 <= i3) {
            this.f144480f.setSpan(obj, i2, i3, 33);
            setText(this.f144480f);
        }
    }

    public final void a(List<TextExtraStruct> list, d dVar, d dVar2) {
        int start;
        int end;
        SpannableString spannableString = new SpannableString(getText());
        if (list == null || list.isEmpty() || TextUtils.isEmpty(spannableString.toString())) {
            this.f144480f = spannableString;
            return;
        }
        int length = spannableString.length();
        for (TextExtraStruct textExtraStruct : list) {
            if ((dVar == null || !dVar.a(textExtraStruct)) && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
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
                    } else if (textExtraStruct.getType() != 4 && (dVar2 == null || !dVar2.a(textExtraStruct))) {
                        if (textExtraStruct.getType() == 65282) {
                            spannableString.setSpan(new b(this.f144476a, textExtraStruct, textExtraStruct.getColor()), start, end, 33);
                        } else if (textExtraStruct.getType() == 5) {
                            spannableString.setSpan(new b(this.f144476a, textExtraStruct, textExtraStruct.getColor()), start, end, 33);
                        } else if (textExtraStruct.getType() == 65285) {
                            Object customSpan = textExtraStruct.getCustomSpan();
                            int i2 = start + 1;
                            if (i2 > end) {
                                i2 = end;
                            }
                            spannableString.setSpan(customSpan, start, i2, 33);
                            spannableString.setSpan(new StyleSpan(this.f144477b), start, end, 33);
                            if (customSpan instanceof e) {
                                spannableString.setSpan(new a(this.f144476a, textExtraStruct, this.f144479e, (e) customSpan), start, end, 33);
                            }
                        } else {
                            if (textExtraStruct.getType() == 2) {
                                this.f144479e = androidx.core.content.b.c(getContext(), R.color.bx);
                            } else if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1 || textExtraStruct.getType() == 5) {
                                this.f144479e = androidx.core.content.b.c(getContext(), R.color.ba);
                            } else if (textExtraStruct.getType() == 3) {
                                this.f144479e = androidx.core.content.b.c(getContext(), R.color.bx);
                            }
                            spannableString.setSpan(new a(this.f144476a, textExtraStruct, this.f144479e, null), start, end, 33);
                            spannableString.setSpan(new com.bytedance.tux.f.a.b(12, true), start, end, 33);
                            if (textExtraStruct.getType() == 3) {
                                spannableString.setSpan(new StyleSpan(1), start, end, 33);
                            } else {
                                spannableString.setSpan(new StyleSpan(this.f144477b), start, end, 33);
                            }
                            spannableString.setSpan(new AbsoluteSizeSpan((int) this.f144478c), start, end, 33);
                        }
                    }
                }
            }
        }
        this.f144480f = spannableString;
        setText(spannableString);
    }
}
