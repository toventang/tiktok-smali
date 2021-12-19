package com.ss.android.ugc.aweme.translation.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.f.c;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

public class TranslationStatusView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f141020a;

    /* renamed from: b  reason: collision with root package name */
    public b f141021b;

    /* renamed from: c  reason: collision with root package name */
    public ObjectAnimator f141022c;

    /* renamed from: d  reason: collision with root package name */
    private TuxTextView f141023d;

    /* renamed from: e  reason: collision with root package name */
    private TuxTextView f141024e;

    /* renamed from: f  reason: collision with root package name */
    private a f141025f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f141026g;

    /* renamed from: h  reason: collision with root package name */
    private TuxTextView f141027h;

    /* renamed from: i  reason: collision with root package name */
    private int f141028i;

    public interface a {
        static {
            Covode.recordClassIndex(92067);
        }

        void a(int i2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(92068);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(92063);
    }

    public int getStatus() {
        return this.f141028i;
    }

    public a getmUploadMobListener() {
        return this.f141025f;
    }

    private static FrameLayout.LayoutParams c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f141022c.cancel();
    }

    private TuxTextView b() {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.a9));
        return tuxTextView;
    }

    public final void a() {
        this.f141028i = 0;
        this.f141023d.setAlpha(1.0f);
        this.f141023d.setVisibility(0);
        this.f141020a.setVisibility(8);
        this.f141024e.setVisibility(8);
    }

    public void setOnTranslationViewClickListener(b bVar) {
        this.f141021b = bVar;
    }

    public void setmUploadMobListener(a aVar) {
        this.f141025f = aVar;
    }

    public TranslationStatusView(Context context) {
        this(context, null);
    }

    public void setLoadingDrawable(int i2) {
        this.f141026g.setImageResource(i2);
    }

    private View a(int i2) {
        TuxTextView tuxTextView = this.f141023d;
        if (i2 == 0) {
            return tuxTextView;
        }
        if (i2 == 1) {
            return this.f141020a;
        }
        if (i2 != 2) {
            return tuxTextView;
        }
        return this.f141024e;
    }

    public void setStatusWithoutAnim(int i2) {
        int i3 = this.f141028i;
        if (i3 != i2) {
            View a2 = a(i3);
            View a3 = a(i2);
            a2.setVisibility(8);
            a3.setVisibility(0);
            a3.setAlpha(1.0f);
            this.f141028i = i2;
            a aVar = this.f141025f;
            if (aVar != null) {
                aVar.a(i2);
            }
        }
    }

    public void setTextColor(int i2) {
        this.f141027h.setTextColor(getContext().getResources().getColor(i2));
        this.f141023d.setTextColor(getContext().getResources().getColor(i2));
        this.f141024e.setTextColor(getContext().getResources().getColor(i2));
    }

    public void setStatus(int i2) {
        a aVar = this.f141025f;
        if (aVar != null) {
            aVar.a(i2);
        }
        int i3 = this.f141028i;
        if (i3 != i2) {
            final View a2 = a(i3);
            final View a3 = a(i2);
            ObjectAnimator duration = ObjectAnimator.ofFloat(a2, "alpha", 0.0f).setDuration(150L);
            duration.setInterpolator(new LinearInterpolator());
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(a3, "alpha", 0.0f, 1.0f).setDuration(150L);
            duration2.setInterpolator(new LinearInterpolator());
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.translation.ui.TranslationStatusView.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(92066);
                }

                public final void onAnimationEnd(Animator animator) {
                    a2.setVisibility(8);
                    a3.setVisibility(0);
                    if (a2 == TranslationStatusView.this.f141020a) {
                        TranslationStatusView.this.f141022c.cancel();
                    }
                    if (a3 == TranslationStatusView.this.f141020a) {
                        TranslationStatusView.this.f141022c.start();
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(duration, duration2);
            animatorSet.start();
            this.f141028i = i2;
        }
    }

    public TranslationStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private TranslationStatusView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(5919);
        TuxTextView b3 = b();
        this.f141023d = b3;
        b3.setText(R.string.fjz);
        this.f141023d.setLayoutParams(c());
        this.f141023d.setGravity(16);
        c.a(this.f141023d, 0.5f);
        this.f141023d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.translation.ui.TranslationStatusView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(92064);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                TranslationStatusView.this.setStatus(1);
                if (TranslationStatusView.this.f141021b != null) {
                    TranslationStatusView.this.f141021b.a();
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f141020a = linearLayout;
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.f141020a.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        this.f141026g = imageView;
        imageView.setImageResource(2131231555);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f141026g, "rotation", 0.0f, 360.0f).setDuration(800L);
        this.f141022c = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.f141022c.setRepeatCount(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.f141026g.setLayoutParams(layoutParams);
        this.f141020a.addView(this.f141026g);
        TuxTextView b4 = b();
        this.f141027h = b4;
        b4.setText(R.string.xx);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) n.b(getContext(), 6.0f);
        layoutParams2.gravity = 16;
        this.f141027h.setLayoutParams(layoutParams2);
        this.f141020a.addView(this.f141027h);
        TuxTextView b5 = b();
        this.f141024e = b5;
        b5.setText(R.string.fjy);
        this.f141024e.setLayoutParams(c());
        this.f141024e.setGravity(16);
        c.a(this.f141024e, 0.5f);
        this.f141024e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.translation.ui.TranslationStatusView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(92065);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                TranslationStatusView.this.setStatus(0);
                if (TranslationStatusView.this.f141021b != null) {
                    TranslationStatusView.this.f141021b.b();
                }
            }
        });
        a();
        addView(this.f141024e);
        addView(this.f141020a);
        addView(this.f141023d);
        MethodCollector.o(5919);
    }
}
