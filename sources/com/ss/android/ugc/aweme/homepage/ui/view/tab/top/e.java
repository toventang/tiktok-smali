package com.ss.android.ugc.aweme.homepage.ui.view.tab.top;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.dj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public TuxTextView f99724a;

    /* renamed from: b  reason: collision with root package name */
    public View f99725b;

    /* renamed from: c  reason: collision with root package name */
    public dj f99726c;

    static {
        Covode.recordClassIndex(63564);
    }

    public final void a() {
        View view = this.f99725b;
        if (view == null) {
            l.a("mHotDot");
        } else {
            view.setVisibility(8);
        }
    }

    public final dj getIconData() {
        dj djVar = this.f99726c;
        if (djVar == null) {
            l.a("iconData");
        }
        return djVar;
    }

    public final View getMHotDot() {
        View view = this.f99725b;
        if (view == null) {
            l.a("mHotDot");
        }
        return view;
    }

    public final TuxTextView getMTextView() {
        TuxTextView tuxTextView = this.f99724a;
        if (tuxTextView == null) {
            l.a("mTextView");
        }
        return tuxTextView;
    }

    public final float getTextWidth() {
        TuxTextView tuxTextView = this.f99724a;
        if (tuxTextView == null) {
            l.a("mTextView");
            return 0.0f;
        }
        TextPaint paint = tuxTextView.getPaint();
        if (paint != null) {
            return paint.measureText(getIconData().f82873i);
        }
        return 0.0f;
    }

    public final void setIconData(dj djVar) {
        l.d(djVar, "");
        this.f99726c = djVar;
    }

    public final void setMHotDot(View view) {
        l.d(view, "");
        this.f99725b = view;
    }

    public final void setMTextView(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f99724a = tuxTextView;
    }

    public final void setTextSize(float f2) {
        TuxTextView tuxTextView = this.f99724a;
        if (tuxTextView == null) {
            l.a("mTextView");
        } else {
            tuxTextView.setTextSize(1, f2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(dj djVar) {
        super(djVar.f82871g, null, 0);
        l.d(djVar, "");
        MethodCollector.i(5354);
        setIconData(djVar);
        setOrientation(0);
        Context context = getContext();
        l.b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        this.f99724a = tuxTextView;
        tuxTextView.setTuxFont(32);
        TuxTextView tuxTextView2 = this.f99724a;
        if (tuxTextView2 == null) {
            l.a("mTextView");
        }
        tuxTextView2.setGravity(17);
        TuxTextView tuxTextView3 = this.f99724a;
        if (tuxTextView3 == null) {
            l.a("mTextView");
        }
        tuxTextView3.setPadding(n.a(12.0d), 0, n.a(12.0d), 0);
        TuxTextView tuxTextView4 = this.f99724a;
        if (tuxTextView4 == null) {
            l.a("mTextView");
        }
        tuxTextView4.setLines(1);
        TuxTextView tuxTextView5 = this.f99724a;
        if (tuxTextView5 == null) {
            l.a("mTextView");
        }
        tuxTextView5.setTextColor(b.c(getContext(), R.color.f159928l));
        TuxTextView tuxTextView6 = this.f99724a;
        if (tuxTextView6 == null) {
            l.a("mTextView");
        }
        tuxTextView6.setAlpha(0.6f);
        TuxTextView tuxTextView7 = this.f99724a;
        if (tuxTextView7 == null) {
            l.a("mTextView");
        }
        tuxTextView7.setMinWidth(n.a(53.0d));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, n.a(58.0d));
        layoutParams.gravity = 17;
        TuxTextView tuxTextView8 = this.f99724a;
        if (tuxTextView8 == null) {
            l.a("mTextView");
        }
        tuxTextView8.setLayoutParams(layoutParams);
        TuxTextView tuxTextView9 = this.f99724a;
        if (tuxTextView9 == null) {
            l.a("mTextView");
        }
        tuxTextView9.setId(16908308);
        TuxTextView tuxTextView10 = this.f99724a;
        if (tuxTextView10 == null) {
            l.a("mTextView");
        }
        addView(tuxTextView10);
        View view = new View(getContext());
        this.f99725b = view;
        view.setId(R.id.f8q);
        View view2 = this.f99725b;
        if (view2 == null) {
            l.a("mHotDot");
        }
        view2.setBackgroundResource(R.drawable.a_q);
        View view3 = this.f99725b;
        if (view3 == null) {
            l.a("mHotDot");
        }
        view3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(n.a(8.0d), n.a(8.0d));
        layoutParams2.setMargins(n.a(-12.0d), n.a(-12.0d), 0, 0);
        int i2 = Build.VERSION.SDK_INT;
        layoutParams2.setMarginStart(n.a(-12.0d));
        View view4 = this.f99725b;
        if (view4 == null) {
            l.a("mHotDot");
        }
        view4.setLayoutParams(layoutParams2);
        View view5 = this.f99725b;
        if (view5 == null) {
            l.a("mHotDot");
        }
        addView(view5);
        TuxTextView tuxTextView11 = this.f99724a;
        if (tuxTextView11 == null) {
            l.a("mTextView");
        }
        tuxTextView11.setText(djVar.f82873i);
        View view6 = this.f99725b;
        if (view6 == null) {
            l.a("mHotDot");
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "following_red_dot_reverse", false)) {
            if (view6 != null) {
                view6.setBackgroundResource(R.drawable.a_t);
            }
        } else if (view6 != null) {
            view6.setBackgroundResource(R.drawable.a_q);
        }
        TuxTextView tuxTextView12 = this.f99724a;
        if (tuxTextView12 == null) {
            l.a("mTextView");
            MethodCollector.o(5354);
            return;
        }
        tuxTextView12.setShadowLayer(com.bytedance.common.utility.n.b(d.a(), 2.0f), 0.0f, com.bytedance.common.utility.n.b(d.a(), 2.0f), Color.parseColor("#26000000"));
        MethodCollector.o(5354);
    }
}
