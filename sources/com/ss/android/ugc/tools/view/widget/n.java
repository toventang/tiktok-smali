package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.ss.android.ugc.tools.view.widget.c.a;
import com.ss.android.ugc.tools.view.widget.c.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.v;
import java.util.Locale;
import java.util.Objects;

public final class n extends b {

    /* renamed from: a  reason: collision with root package name */
    public StyleTextView f150454a;

    /* renamed from: b  reason: collision with root package name */
    public StyleTextView f150455b;

    static {
        Covode.recordClassIndex(98935);
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a, com.ss.android.ugc.tools.view.widget.c.b
    public final int a() {
        return R.layout.b4e;
    }

    public final StyleTextView getStickerTitleText() {
        StyleTextView styleTextView = this.f150454a;
        if (styleTextView == null) {
            l.a("stickerTitleText");
        }
        return styleTextView;
    }

    public final StyleTextView getStickerUseNumberText() {
        StyleTextView styleTextView = this.f150455b;
        if (styleTextView == null) {
            l.a("stickerUseNumberText");
        }
        return styleTextView;
    }

    public static class a extends a.C4052a {

        /* renamed from: a  reason: collision with root package name */
        public int f150456a = 2131230946;

        /* renamed from: b  reason: collision with root package name */
        public int f150457b = 2131230948;

        /* renamed from: c  reason: collision with root package name */
        public int f150458c = R.color.go;

        static {
            Covode.recordClassIndex(98936);
        }

        /* renamed from: a */
        public final n b() {
            return new n(this.v, this.f150394d, this.f150395e, this.f150397g, this.f150398h, this.f150399i, this.f150400j, this.f150401k, this.f150402l, this.f150458c, this.n, this.o, this.q, this.r, this.s, this.t, c(), this.f150456a, this.f150457b, this.p, this.u);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            l.d(context, "");
        }
    }

    public final void setStickerTitleText(StyleTextView styleTextView) {
        l.d(styleTextView, "");
        this.f150454a = styleTextView;
    }

    public final void setStickerUseNumberText(StyleTextView styleTextView) {
        l.d(styleTextView, "");
        this.f150455b = styleTextView;
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        StyleTextView styleTextView = this.f150454a;
        if (styleTextView == null) {
            l.a("stickerTitleText");
        }
        styleTextView.setText(charSequence);
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a, com.ss.android.ugc.tools.view.widget.c.b
    public final View a(Context context) {
        l.d(context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        StyleTextView styleTextView = new StyleTextView(context);
        styleTextView.setLayoutParams(layoutParams);
        styleTextView.setGravity(8388611);
        return styleTextView;
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public final View c(Context context) {
        MethodCollector.i(8714);
        l.d(context, "");
        FrameLayout frameLayout = new FrameLayout(context);
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.b4e, frameLayout, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        View findViewById = a2.findViewById(R.id.dvr);
        l.b(findViewById, "");
        this.f150454a = (StyleTextView) findViewById;
        View findViewById2 = a2.findViewById(R.id.dvs);
        l.b(findViewById2, "");
        this.f150455b = (StyleTextView) findViewById2;
        l.b(a2, "");
        a2.setLayoutParams(layoutParams);
        frameLayout.addView(a2);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        MethodCollector.o(8714);
        return frameLayout;
    }

    public final void a(String str) {
        l.d(str, "");
        StyleTextView styleTextView = this.f150454a;
        if (styleTextView == null) {
            l.a("stickerTitleText");
        }
        CharSequence text = styleTextView.getText();
        SpannableString spannableString = new SpannableString(text);
        String obj = text.toString();
        Locale locale = Locale.ROOT;
        l.b(locale, "");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = obj.toLowerCase(locale);
        l.b(lowerCase, "");
        Locale locale2 = Locale.ROOT;
        l.b(locale2, "");
        String lowerCase2 = str.toLowerCase(locale2);
        l.b(lowerCase2, "");
        spannableString.setSpan(new StyleSpan(0), 0, text.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#BFFFFFFF")), 0, text.length(), 33);
        if (p.e((CharSequence) lowerCase, (CharSequence) lowerCase2) || p.e((CharSequence) new h.m.l("\\s+").replace(lowerCase, ""), (CharSequence) lowerCase2)) {
            h.p<Integer, Integer> a2 = a(text.toString(), str);
            int intValue = a2.component1().intValue();
            int intValue2 = a2.component2().intValue();
            if (intValue <= str.length() + intValue + intValue2) {
                int length = text.length();
                if (intValue >= 0 && length >= intValue) {
                    int length2 = text.length();
                    int length3 = str.length() + intValue + intValue2;
                    if (length3 >= 0 && length2 >= length3) {
                        spannableString.setSpan(new StyleSpan(1), intValue, str.length() + intValue + intValue2, 33);
                        spannableString.setSpan(new ForegroundColorSpan(-1), intValue, str.length() + intValue + intValue2, 33);
                    }
                }
            }
            StyleTextView styleTextView2 = this.f150454a;
            if (styleTextView2 == null) {
                l.a("stickerTitleText");
            }
            styleTextView2.setText(spannableString);
        }
    }

    private static h.p<Integer, Integer> a(String str, String str2) {
        int i2;
        l.d(str, "");
        l.d(str2, "");
        int length = str.length();
        int i3 = 0;
        while (i3 < length && str2.length() + i3 <= str.length()) {
            int length2 = str2.length();
            int i4 = 0;
            for (int i5 = 0; i5 < length2; i5++) {
                while (true) {
                    i2 = i3 + i5 + i4;
                    if (i2 < str.length() && Character.isSpaceChar(str.charAt(i2)) && !Character.isSpaceChar(str2.charAt(i5))) {
                        i4++;
                    }
                }
                if (i2 >= str.length() || !h.m.a.a(str.charAt(i2), str2.charAt(i5), true)) {
                    i3++;
                }
            }
            return v.a(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return v.a(-1, -1);
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public final void a(LinearLayout linearLayout, boolean z) {
        int i2;
        l.d(linearLayout, "");
        if (z) {
            i2 = -1;
        } else {
            i2 = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
    }

    public final void a(boolean z, String str) {
        l.d(str, "");
        if (z) {
            StyleTextView styleTextView = this.f150454a;
            if (styleTextView == null) {
                l.a("stickerTitleText");
            }
            SpannableString spannableString = new SpannableString(new SpannableString(styleTextView.getText()));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FE2C55")), 0, spannableString.length(), 33);
            StyleTextView styleTextView2 = this.f150454a;
            if (styleTextView2 == null) {
                l.a("stickerTitleText");
            }
            styleTextView2.setText(spannableString);
            return;
        }
        a(str);
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public final void a(View view, FrameLayout frameLayout, int i2, int i3, boolean z) {
        l.d(view, "");
        l.d(frameLayout, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(view.getLayoutParams());
        layoutParams2.gravity = 17;
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Context context, boolean z, int i2, int i3, int i4, int i5, boolean z2, int i6, int i7, int i8, boolean z3, boolean z4, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z5, boolean z6) {
        super(context, z, i2, i3, i4, i5, z2, i6, i7, i8, z3, z4, i9, i10, i11, i12, i13, i14, i15, z5, z6);
        l.d(context, "");
    }
}
