package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.ui.SocialTouchableEditText;
import com.ss.android.ugc.aweme.tools.c;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;

public abstract class d<T> extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public SocialTouchableEditText f127607a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f127608b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f127609c;

    /* renamed from: d  reason: collision with root package name */
    private T f127610d;

    /* renamed from: e  reason: collision with root package name */
    private int f127611e;

    /* renamed from: f  reason: collision with root package name */
    private int f127612f;

    /* renamed from: g  reason: collision with root package name */
    private int f127613g;

    /* renamed from: h  reason: collision with root package name */
    private int f127614h;

    static {
        Covode.recordClassIndex(83654);
    }

    public abstract SocialTouchableEditText a();

    public abstract TextView b();

    public abstract LinearLayout c();

    public abstract void d();

    public abstract void g();

    public abstract String getContent();

    public abstract int getLayoutResId();

    public final T getCurModel() {
        return this.f127610d;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127615a;

        static {
            Covode.recordClassIndex(83655);
        }

        a(d dVar) {
            this.f127615a = dVar;
        }

        public final void run() {
            this.f127615a.getMEditTextView().requestFocus();
        }
    }

    public final LinearLayout getInputLayout() {
        LinearLayout linearLayout = this.f127609c;
        if (linearLayout == null) {
            l.a("inputLayout");
        }
        return linearLayout;
    }

    public final SocialTouchableEditText getMEditTextView() {
        SocialTouchableEditText socialTouchableEditText = this.f127607a;
        if (socialTouchableEditText == null) {
            l.a("mEditTextView");
        }
        return socialTouchableEditText;
    }

    public final TextView getMIconView() {
        TextView textView = this.f127608b;
        if (textView == null) {
            l.a("mIconView");
        }
        return textView;
    }

    private final int getMaxTextWidth() {
        TextView textView = this.f127608b;
        if (textView == null) {
            l.a("mIconView");
        }
        int paddingLeft = textView.getPaddingLeft();
        TextView textView2 = this.f127608b;
        if (textView2 == null) {
            l.a("mIconView");
        }
        int paddingRight = textView2.getPaddingRight();
        SocialTouchableEditText socialTouchableEditText = this.f127607a;
        if (socialTouchableEditText == null) {
            l.a("mEditTextView");
        }
        int paddingLeft2 = socialTouchableEditText.getPaddingLeft();
        SocialTouchableEditText socialTouchableEditText2 = this.f127607a;
        if (socialTouchableEditText2 == null) {
            l.a("mEditTextView");
        }
        return this.f127611e - (((paddingLeft + paddingRight) + paddingLeft2) + socialTouchableEditText2.getPaddingRight());
    }

    public final void e() {
        LinearLayout linearLayout = this.f127609c;
        if (linearLayout == null) {
            l.a("inputLayout");
        }
        TextView textView = this.f127608b;
        if (textView == null) {
            l.a("mIconView");
        }
        linearLayout.removeView(textView);
        TextView textView2 = this.f127608b;
        if (textView2 == null) {
            l.a("mIconView");
        }
        Context context = getContext();
        l.b(context, "");
        int a2 = (int) r.a(context, 12.0f);
        Context context2 = getContext();
        l.b(context2, "");
        Context context3 = getContext();
        l.b(context3, "");
        Context context4 = getContext();
        l.b(context4, "");
        textView2.setPadding(a2, (int) r.a(context2, 16.0f), (int) r.a(context3, 2.0f), (int) r.a(context4, 14.0f));
        SocialTouchableEditText socialTouchableEditText = this.f127607a;
        if (socialTouchableEditText == null) {
            l.a("mEditTextView");
        }
        Context context5 = getContext();
        l.b(context5, "");
        int a3 = (int) r.a(context5, 8.0f);
        Context context6 = getContext();
        l.b(context6, "");
        int a4 = (int) r.a(context6, 16.0f);
        Context context7 = getContext();
        l.b(context7, "");
        socialTouchableEditText.setPadding(0, a3, a4, (int) r.a(context7, 8.0f));
        if (c.a(getContext())) {
            LinearLayout linearLayout2 = this.f127609c;
            if (linearLayout2 == null) {
                l.a("inputLayout");
            }
            TextView textView3 = this.f127608b;
            if (textView3 == null) {
                l.a("mIconView");
            }
            linearLayout2.addView(textView3, 1);
            return;
        }
        LinearLayout linearLayout3 = this.f127609c;
        if (linearLayout3 == null) {
            l.a("inputLayout");
        }
        TextView textView4 = this.f127608b;
        if (textView4 == null) {
            l.a("mIconView");
        }
        linearLayout3.addView(textView4, 0);
    }

    public final void f() {
        LinearLayout linearLayout = this.f127609c;
        if (linearLayout == null) {
            l.a("inputLayout");
        }
        TextView textView = this.f127608b;
        if (textView == null) {
            l.a("mIconView");
        }
        linearLayout.removeView(textView);
        TextView textView2 = this.f127608b;
        if (textView2 == null) {
            l.a("mIconView");
        }
        Context context = getContext();
        l.b(context, "");
        Context context2 = getContext();
        l.b(context2, "");
        Context context3 = getContext();
        l.b(context3, "");
        Context context4 = getContext();
        l.b(context4, "");
        textView2.setPadding((int) r.a(context, 2.0f), (int) r.a(context2, 16.0f), (int) r.a(context3, 12.0f), (int) r.a(context4, 14.0f));
        SocialTouchableEditText socialTouchableEditText = this.f127607a;
        if (socialTouchableEditText == null) {
            l.a("mEditTextView");
        }
        Context context5 = getContext();
        l.b(context5, "");
        int a2 = (int) r.a(context5, 8.0f);
        Context context6 = getContext();
        l.b(context6, "");
        int a3 = (int) r.a(context6, 0.0f);
        Context context7 = getContext();
        l.b(context7, "");
        socialTouchableEditText.setPadding(16, a2, a3, (int) r.a(context7, 8.0f));
        if (c.a(getContext())) {
            LinearLayout linearLayout2 = this.f127609c;
            if (linearLayout2 == null) {
                l.a("inputLayout");
            }
            TextView textView3 = this.f127608b;
            if (textView3 == null) {
                l.a("mIconView");
            }
            linearLayout2.addView(textView3, 0);
            return;
        }
        LinearLayout linearLayout3 = this.f127609c;
        if (linearLayout3 == null) {
            l.a("inputLayout");
        }
        TextView textView4 = this.f127608b;
        if (textView4 == null) {
            l.a("mIconView");
        }
        linearLayout3.addView(textView4, 1);
    }

    public final void setCurModel(T t) {
        this.f127610d = t;
    }

    public final void setInputLayout(LinearLayout linearLayout) {
        l.d(linearLayout, "");
        this.f127609c = linearLayout;
    }

    public final void setMEditTextView(SocialTouchableEditText socialTouchableEditText) {
        l.d(socialTouchableEditText, "");
        this.f127607a = socialTouchableEditText;
    }

    public final void setMIconView(TextView textView) {
        l.d(textView, "");
        this.f127608b = textView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        this(context, (byte) 0);
        l.d(context, "");
    }

    private final void setTextSize(int i2) {
        if (this.f127612f != i2) {
            this.f127612f = i2;
            SocialTouchableEditText socialTouchableEditText = this.f127607a;
            if (socialTouchableEditText == null) {
                l.a("mEditTextView");
            }
            float f2 = (float) i2;
            socialTouchableEditText.setTextSize(f2);
            TextView textView = this.f127608b;
            if (textView == null) {
                l.a("mIconView");
            }
            textView.setTextSize(f2 * 0.73333335f);
        }
    }

    public final void a(boolean z) {
        String str;
        TextView textView = this.f127608b;
        if (textView == null) {
            l.a("mIconView");
        }
        CharSequence text = textView.getText();
        String str2 = null;
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        SocialTouchableEditText socialTouchableEditText = this.f127607a;
        if (socialTouchableEditText == null) {
            l.a("mEditTextView");
        }
        Editable text2 = socialTouchableEditText.getText();
        if (text2 != null) {
            str2 = text2.toString();
        }
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            g();
            return;
        }
        SocialTouchableEditText socialTouchableEditText2 = this.f127607a;
        if (socialTouchableEditText2 == null) {
            l.a("mEditTextView");
        }
        socialTouchableEditText2.setHint("");
        SocialTouchableEditText socialTouchableEditText3 = this.f127607a;
        if (socialTouchableEditText3 == null) {
            l.a("mEditTextView");
        }
        TextPaint textPaint = new TextPaint(socialTouchableEditText3.getPaint());
        TextView textView2 = this.f127608b;
        if (textView2 == null) {
            l.a("mIconView");
        }
        TextPaint textPaint2 = new TextPaint(textView2.getPaint());
        int maxTextWidth = getMaxTextWidth();
        int i2 = this.f127613g;
        int i3 = this.f127614h;
        if (i2 >= i3) {
            while (true) {
                float a2 = n.a(getContext(), (float) i2);
                textPaint2.setTextSize(a2);
                float measureText = textPaint2.measureText(str);
                textPaint.setTextSize(a2);
                Locale locale = Locale.getDefault();
                l.b(locale, "");
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                String upperCase = str2.toUpperCase(locale);
                l.b(upperCase, "");
                if (measureText + textPaint.measureText(upperCase) >= ((float) maxTextWidth)) {
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                } else {
                    break;
                }
            }
        }
        i2 = this.f127614h;
        setTextSize(i2);
        if (z) {
            SocialTouchableEditText socialTouchableEditText4 = this.f127607a;
            if (socialTouchableEditText4 == null) {
                l.a("mEditTextView");
            }
            socialTouchableEditText4.post(new a(this));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private d(Context context, byte b2) {
        this(context, (char) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context, char c2) {
        super(context, null, 0);
        l.d(context, "");
        this.f127613g = 30;
        this.f127614h = 10;
        LayoutInflater.from(getContext()).inflate(getLayoutResId(), this);
        this.f127611e = n.a(getContext()) - (((int) n.b(getContext(), 8.0f)) * 2);
        this.f127607a = a();
        this.f127608b = b();
        this.f127609c = c();
        setTextSize(this.f127613g);
    }
}
