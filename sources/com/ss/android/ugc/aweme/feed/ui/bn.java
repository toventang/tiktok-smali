package com.ss.android.ugc.aweme.feed.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class bn extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public a f94390a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f94391b = new c(this);

    public interface a {
        static {
            Covode.recordClassIndex(59954);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(59953);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f94393a;

        static {
            Covode.recordClassIndex(59956);
        }

        c(bn bnVar) {
            this.f94393a = bnVar;
        }

        public final void run() {
            this.f94393a.a();
        }
    }

    public final void a() {
        try {
            dismiss();
        } catch (Exception unused) {
        }
        a aVar = this.f94390a;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bn f94392a;

        static {
            Covode.recordClassIndex(59955);
        }

        b(bn bnVar) {
            this.f94392a = bnVar;
        }

        public final void run() {
            if (Build.VERSION.SDK_INT >= 21) {
                View contentView = this.f94392a.getContentView();
                l.b(contentView, "");
                LinearLayout linearLayout = (LinearLayout) contentView.findViewById(R.id.t3);
                l.b(linearLayout, "");
                Drawable background = linearLayout.getBackground();
                Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                View contentView2 = this.f94392a.getContentView();
                l.b(contentView2, "");
                LinearLayout linearLayout2 = (LinearLayout) contentView2.findViewById(R.id.t3);
                l.b(linearLayout2, "");
                ObjectAnimator duration = ObjectAnimator.ofArgb(background, com.bytedance.ies.xelement.pickview.b.b.f37372a, 0, linearLayout2.getResources().getColor(R.color.bj)).setDuration(300L);
                l.b(duration, "");
                View contentView3 = this.f94392a.getContentView();
                l.b(contentView3, "");
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(contentView3.findViewById(R.id.bi7), "alpha", 0.0f, 1.0f).setDuration(300L);
                l.b(duration2, "");
                View contentView4 = this.f94392a.getContentView();
                l.b(contentView4, "");
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(contentView4.findViewById(R.id.ak7), "alpha", 0.0f, 1.0f).setDuration(300L);
                l.b(duration3, "");
                duration3.setStartDelay(150);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(duration, duration2, duration3);
                animatorSet.start();
            }
        }
    }

    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        getContentView().removeCallbacks(this.f94391b);
    }

    public bn(Context context) {
        l.d(context, "");
        MethodCollector.i(7213);
        setContentView(LayoutInflater.from(context).inflate(R.layout.tc, (ViewGroup) null));
        setWidth((int) n.b(context, 180.0f));
        setHeight(-2);
        setAnimationStyle(R.style.w1);
        MethodCollector.o(7213);
    }

    public final void showAtLocation(View view, int i2, int i3, int i4) {
        super.showAtLocation(view, i2, i3, i4);
        getContentView().post(new b(this));
        getContentView().removeCallbacks(this.f94391b);
        getContentView().postDelayed(this.f94391b, 3000);
    }
}
