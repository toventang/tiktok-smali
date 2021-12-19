package com.ss.android.ugc.aweme.feed.caption;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.Arrays;

public final class b extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f92745a;

    /* renamed from: b  reason: collision with root package name */
    private final TuxTextView f92746b;

    /* renamed from: c  reason: collision with root package name */
    private final TuxButton f92747c;

    /* renamed from: d  reason: collision with root package name */
    private final TuxTextView f92748d;

    /* renamed from: e  reason: collision with root package name */
    private final TuxTextView f92749e;

    static {
        Covode.recordClassIndex(58824);
    }

    public final TuxButton getBtnDismiss() {
        return this.f92747c;
    }

    public final ImageView getIvClose() {
        return this.f92745a;
    }

    public final TuxTextView getModalTitle() {
        return this.f92749e;
    }

    public final TuxTextView getTvGoSetting() {
        return this.f92748d;
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f92750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f92751b;

        static {
            Covode.recordClassIndex(58825);
        }

        public final void onClick(View view) {
            l.d(view, "");
            this.f92751b.onClick(view);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(androidx.core.content.b.c(this.f92750a.getContext(), R.color.a2));
            textPaint.setUnderlineText(false);
            textPaint.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(d.f33801g));
        }

        a(b bVar, View.OnClickListener onClickListener) {
            this.f92750a = bVar;
            this.f92751b = onClickListener;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(7851);
        View inflate = View.inflate(context, R.layout.rv, this);
        View findViewById = inflate.findViewById(R.id.bve);
        l.b(findViewById, "");
        this.f92745a = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.f0n);
        l.b(findViewById2, "");
        this.f92746b = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.y_);
        l.b(findViewById3, "");
        this.f92747c = (TuxButton) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.f02);
        l.b(findViewById4, "");
        this.f92748d = (TuxTextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.bqw);
        l.b(findViewById5, "");
        this.f92749e = (TuxTextView) findViewById5;
        MethodCollector.o(7851);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    public final void a(View.OnClickListener onClickListener, boolean z) {
        int i2;
        int i3;
        l.d(onClickListener, "");
        TuxTextView tuxTextView = this.f92749e;
        Context context = getContext();
        if (z) {
            i2 = R.string.hco;
        } else {
            i2 = R.string.hcn;
        }
        tuxTextView.setText(context.getString(i2));
        Context context2 = getContext();
        if (z) {
            i3 = R.string.hcw;
        } else {
            i3 = R.string.hcv;
        }
        String string = context2.getString(i3);
        l.b(string, "");
        String string2 = getContext().getString(R.string.hcm);
        l.b(string2, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[]{string2}, 1));
        l.b(a2, "");
        SpannableString spannableString = new SpannableString(a2);
        int a3 = p.a((CharSequence) spannableString, string2, 0, false, 6);
        spannableString.setSpan(new a(this, onClickListener), a3, string2.length() + a3, 33);
        this.f92746b.setHighlightColor(androidx.core.content.b.c(getContext(), R.color.c9));
        this.f92746b.setMovementMethod(LinkMovementMethod.getInstance());
        this.f92746b.setText(spannableString);
    }
}
