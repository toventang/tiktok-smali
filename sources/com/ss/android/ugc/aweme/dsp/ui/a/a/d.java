package com.ss.android.ugc.aweme.dsp.ui.a.a;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.dj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public TuxTextView f83955a;

    /* renamed from: b  reason: collision with root package name */
    private dj f83956b;

    static {
        Covode.recordClassIndex(52371);
    }

    public final dj getIconData() {
        return this.f83956b;
    }

    public final TuxTextView getMTextView() {
        TuxTextView tuxTextView = this.f83955a;
        if (tuxTextView == null) {
            l.a("mTextView");
        }
        return tuxTextView;
    }

    public final void setIconData(dj djVar) {
        l.d(djVar, "");
        this.f83956b = djVar;
    }

    public final void setMTextView(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f83955a = tuxTextView;
    }

    public final void setTextSize(float f2) {
        TuxTextView tuxTextView = this.f83955a;
        if (tuxTextView == null) {
            l.a("mTextView");
        }
        tuxTextView.setTextSize(1, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(dj djVar) {
        super(djVar.f82871g, null, 0);
        l.d(djVar, "");
        MethodCollector.i(1299);
        this.f83956b = djVar;
        setOrientation(0);
        Context context = getContext();
        l.b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        this.f83955a = tuxTextView;
        tuxTextView.setTuxFont(32);
        TuxTextView tuxTextView2 = this.f83955a;
        if (tuxTextView2 == null) {
            l.a("mTextView");
        }
        tuxTextView2.setGravity(17);
        TuxTextView tuxTextView3 = this.f83955a;
        if (tuxTextView3 == null) {
            l.a("mTextView");
        }
        tuxTextView3.setPadding(n.a(12.0d), 0, n.a(12.0d), 0);
        TuxTextView tuxTextView4 = this.f83955a;
        if (tuxTextView4 == null) {
            l.a("mTextView");
        }
        tuxTextView4.setLines(1);
        TuxTextView tuxTextView5 = this.f83955a;
        if (tuxTextView5 == null) {
            l.a("mTextView");
        }
        tuxTextView5.setTextColor(b.c(getContext(), R.color.f159928l));
        TuxTextView tuxTextView6 = this.f83955a;
        if (tuxTextView6 == null) {
            l.a("mTextView");
        }
        tuxTextView6.setAlpha(0.6f);
        TuxTextView tuxTextView7 = this.f83955a;
        if (tuxTextView7 == null) {
            l.a("mTextView");
        }
        tuxTextView7.setMinWidth(n.a(53.0d));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, n.a(58.0d));
        layoutParams.gravity = 17;
        TuxTextView tuxTextView8 = this.f83955a;
        if (tuxTextView8 == null) {
            l.a("mTextView");
        }
        tuxTextView8.setLayoutParams(layoutParams);
        TuxTextView tuxTextView9 = this.f83955a;
        if (tuxTextView9 == null) {
            l.a("mTextView");
        }
        tuxTextView9.setId(16908308);
        TuxTextView tuxTextView10 = this.f83955a;
        if (tuxTextView10 == null) {
            l.a("mTextView");
        }
        addView(tuxTextView10);
        TuxTextView tuxTextView11 = this.f83955a;
        if (tuxTextView11 == null) {
            l.a("mTextView");
        }
        tuxTextView11.setText(this.f83956b.f82873i);
        MethodCollector.o(1299);
    }
}
