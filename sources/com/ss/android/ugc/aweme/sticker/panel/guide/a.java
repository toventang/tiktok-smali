package com.ss.android.ugc.aweme.sticker.panel.guide;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.af.b;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.view.widget.d;
import com.zhiliaoapp.musically.R;
import java.io.File;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public View f135121a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f135122b;

    /* renamed from: c  reason: collision with root package name */
    private SimpleDraweeView f135123c;

    /* renamed from: d  reason: collision with root package name */
    private View f135124d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f135125e;

    /* renamed from: f  reason: collision with root package name */
    private Effect f135126f;

    /* renamed from: g  reason: collision with root package name */
    private final ShortVideoContext f135127g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f135128h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f135129i = new Runnable() {
        /* class com.ss.android.ugc.aweme.sticker.panel.guide.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(88335);
        }

        public final void run() {
            Animation a2 = com.ss.android.ugc.aweme.sticker.p.a.a(1.0f, 0.0f, 300);
            a2.setAnimationListener(new Animation.AnimationListener() {
                /* class com.ss.android.ugc.aweme.sticker.panel.guide.a.AnonymousClass1.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88336);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    a.this.a();
                }
            });
            a.this.f135121a.startAnimation(a2);
        }
    };

    static {
        Covode.recordClassIndex(88334);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final boolean b() {
        return this.f135128h;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a() {
        MethodCollector.i(9502);
        Effect effect = this.f135126f;
        if (effect == null || TextUtils.isEmpty(effect.getHint())) {
            MethodCollector.o(9502);
            return;
        }
        this.f135122b.removeCallbacks(this.f135129i);
        this.f135125e.removeView(this.f135124d);
        this.f135128h = false;
        MethodCollector.o(9502);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a(FrameLayout frameLayout) {
        boolean z;
        MethodCollector.i(9321);
        this.f135125e = frameLayout;
        Effect effect = this.f135126f;
        if (effect == null || TextUtils.isEmpty(effect.getHint())) {
            MethodCollector.o(9321);
            return;
        }
        int i2 = 0;
        View a2 = com.a.a(LayoutInflater.from(frameLayout.getContext()), R.layout.ai5, frameLayout, false);
        this.f135124d = a2;
        this.f135125e.addView(a2);
        this.f135121a = this.f135124d.findViewById(R.id.b4b);
        this.f135122b = (TextView) this.f135124d.findViewById(R.id.ebc);
        String hint = this.f135126f.getHint();
        if (this.f135127g.f124757b.b() || this.f135127g.f124757b.c() || this.f135127g.c()) {
            MethodCollector.o(9321);
        } else if (this.f135127g.f124757b.f124713h.c() == null || b.a(this.f135127g.f124757b.f124713h.c())) {
            File file = null;
            if (this.f135127g.f124757b.f124713h.c() != null) {
                file = new File(this.f135127g.f124757b.f124713h.c());
            }
            String a3 = g.a().s().a(this.f135127g.f124757b.y);
            c cVar = cr.a().f125295a;
            if (cVar != null && cVar.getStrongBeatUrl() != null && !TextUtils.isEmpty(a3) && !new File(a3).exists()) {
                d.b(frameLayout.getContext(), R.string.yu).b();
                MethodCollector.o(9321);
            } else if (file != null) {
                MethodCollector.o(9321);
            } else {
                this.f135122b.setText(hint);
                this.f135123c = (SimpleDraweeView) this.f135124d.findViewById(R.id.ebd);
                if (this.f135126f.getHintIcon() == null || k.a(this.f135126f.getHintIcon().getUrlList())) {
                    z = false;
                } else {
                    z = true;
                }
                SimpleDraweeView simpleDraweeView = this.f135123c;
                if (!z) {
                    i2 = 8;
                }
                eu.a(simpleDraweeView, i2);
                if (z) {
                    com.ss.android.ugc.tools.c.a.a(this.f135123c, com.ss.android.ugc.aweme.effectplatform.a.a(this.f135126f.getHintIcon()), -1, -1);
                }
                this.f135121a.startAnimation(com.ss.android.ugc.aweme.sticker.p.a.a(0.0f, 1.0f, 300));
                this.f135121a.postDelayed(this.f135129i, 5000);
                this.f135128h = true;
                MethodCollector.o(9321);
            }
        } else {
            d.a(frameLayout.getContext(), frameLayout.getContext().getString(R.string.yv)).b();
            MethodCollector.o(9321);
        }
    }

    public a(Effect effect, ShortVideoContext shortVideoContext) {
        this.f135126f = effect;
        this.f135127g = shortVideoContext;
    }
}
