package com.ss.android.ugc.aweme.sticker.panel.guide.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.sticker.panel.guide.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public Effect f135132a;

    /* renamed from: b  reason: collision with root package name */
    public View f135133b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f135134c;

    /* renamed from: d  reason: collision with root package name */
    private SimpleDraweeView f135135d;

    /* renamed from: e  reason: collision with root package name */
    private View f135136e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f135137f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f135138g;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f135139h = new Runnable() {
        /* class com.ss.android.ugc.aweme.sticker.panel.guide.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(88338);
        }

        public final void run() {
            Animation a2 = com.ss.android.ugc.aweme.sticker.p.a.a(1.0f, 0.0f, 300);
            a2.setAnimationListener(new Animation.AnimationListener() {
                /* class com.ss.android.ugc.aweme.sticker.panel.guide.a.a.AnonymousClass1.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88339);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    a.this.a();
                }
            });
            a.this.f135133b.startAnimation(a2);
        }
    };

    static {
        Covode.recordClassIndex(88337);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final boolean b() {
        return this.f135138g;
    }

    public a() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a() {
        View view;
        MethodCollector.i(9792);
        if (this.f135132a == null || (view = this.f135133b) == null || this.f135137f == null) {
            MethodCollector.o(9792);
            return;
        }
        view.removeCallbacks(this.f135139h);
        this.f135137f.removeView(this.f135136e);
        this.f135138g = false;
        MethodCollector.o(9792);
    }

    public a(Effect effect) {
        this.f135132a = effect;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a(FrameLayout frameLayout) {
        boolean z;
        MethodCollector.i(9620);
        this.f135137f = frameLayout;
        if (this.f135132a == null) {
            MethodCollector.o(9620);
            return;
        }
        int i2 = 0;
        View a2 = com.a.a(LayoutInflater.from(frameLayout.getContext()), R.layout.ai5, frameLayout, false);
        this.f135136e = a2;
        this.f135137f.addView(a2, 0);
        this.f135133b = this.f135136e.findViewById(R.id.b4b);
        this.f135134c = (TextView) this.f135136e.findViewById(R.id.ebc);
        if (this.f135132a.getHint() != null) {
            this.f135134c.setText(this.f135132a.getHint());
        }
        this.f135135d = (SimpleDraweeView) this.f135136e.findViewById(R.id.ebd);
        if (this.f135132a.getHintIcon() == null || k.a(this.f135132a.getHintIcon().getUrlList())) {
            z = false;
        } else {
            z = true;
        }
        SimpleDraweeView simpleDraweeView = this.f135135d;
        if (!z) {
            i2 = 8;
        }
        eu.a(simpleDraweeView, i2);
        if (z) {
            com.ss.android.ugc.tools.c.a.a(this.f135135d, com.ss.android.ugc.aweme.effectplatform.a.a(this.f135132a.getHintIcon()), -1, -1);
        }
        this.f135133b.startAnimation(com.ss.android.ugc.aweme.sticker.p.a.a(0.0f, 1.0f, 300));
        this.f135133b.postDelayed(this.f135139h, 5000);
        this.f135138g = true;
        MethodCollector.o(9620);
    }
}
