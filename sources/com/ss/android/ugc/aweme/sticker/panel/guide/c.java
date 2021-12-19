package com.ss.android.ugc.aweme.sticker.panel.guide;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.sticker.p.a;
import com.ss.android.ugc.aweme.sticker.panel.guide.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f135148a;

    /* renamed from: b  reason: collision with root package name */
    public final ExtraParams f135149b;

    /* renamed from: c  reason: collision with root package name */
    public View f135150c;

    /* renamed from: d  reason: collision with root package name */
    public ConstraintLayout f135151d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f135152e;

    /* renamed from: f  reason: collision with root package name */
    public h f135153f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f135154g;

    /* renamed from: h  reason: collision with root package name */
    public Runnable f135155h = new Runnable() {
        /* class com.ss.android.ugc.aweme.sticker.panel.guide.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(88347);
        }

        public final void run() {
            Animation a2 = a.a(0.0f, 1.0f, 200);
            a2.setAnimationListener(new Animation.AnimationListener() {
                /* class com.ss.android.ugc.aweme.sticker.panel.guide.c.AnonymousClass1.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88348);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    c.this.f135154g = true;
                    c.this.f135151d.postDelayed(c.this.f135155h, 3000);
                }
            });
            c.this.f135152e.startAnimation(a2);
        }
    };

    /* renamed from: i  reason: collision with root package name */
    public Runnable f135156i = new Runnable() {
        /* class com.ss.android.ugc.aweme.sticker.panel.guide.c.AnonymousClass2 */

        static {
            Covode.recordClassIndex(88349);
        }

        public final void run() {
            Animation a2 = a.a(1.0f, 0.0f, 300);
            a2.setAnimationListener(new Animation.AnimationListener() {
                /* class com.ss.android.ugc.aweme.sticker.panel.guide.c.AnonymousClass2.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88350);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    c.this.a();
                }

                public final void onAnimationStart(Animation animation) {
                    c.this.f135154g = false;
                }
            });
            c.this.f135151d.startAnimation(a2);
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private FrameLayout f135157j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f135158k;

    static {
        Covode.recordClassIndex(88346);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final boolean b() {
        return this.f135158k;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a() {
        MethodCollector.i(10981);
        Effect effect = this.f135148a;
        if (effect == null || TextUtils.isEmpty(effect.getExtra())) {
            MethodCollector.o(10981);
            return;
        }
        this.f135152e.clearAnimation();
        this.f135151d.removeCallbacks(this.f135156i);
        this.f135151d.removeCallbacks(this.f135155h);
        this.f135157j.removeView(this.f135150c);
        this.f135158k = false;
        MethodCollector.o(10981);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a(FrameLayout frameLayout) {
        MethodCollector.i(10979);
        Effect effect = this.f135148a;
        if (effect == null || TextUtils.isEmpty(effect.getExtra())) {
            MethodCollector.o(10979);
            return;
        }
        ExtraParams extraParams = this.f135149b;
        if (extraParams == null || !extraParams.isGifValid()) {
            MethodCollector.o(10979);
            return;
        }
        this.f135157j = frameLayout;
        View a2 = com.a.a(LayoutInflater.from(frameLayout.getContext()), R.layout.ai3, frameLayout, false);
        this.f135150c = a2;
        this.f135157j.addView(a2, 0);
        this.f135152e = (TextView) this.f135150c.findViewById(R.id.ebc);
        String hint = this.f135148a.getHint();
        if (TextUtils.isEmpty(hint)) {
            this.f135152e.setVisibility(8);
        } else {
            this.f135152e.setVisibility(0);
            this.f135152e.setText(hint);
        }
        final FrameLayout frameLayout2 = (FrameLayout) this.f135150c.findViewById(R.id.eax);
        this.f135151d = (ConstraintLayout) this.f135150c.findViewById(R.id.b4b);
        if (2 == this.f135149b.gifType) {
            b bVar = new b();
            bVar.a(this.f135151d);
            bVar.b(R.id.eax, (int) r.a(frameLayout.getContext(), 192.0f));
            bVar.a(R.id.eax, "3:4");
            bVar.b(this.f135151d);
        }
        this.f135157j.findViewById(R.id.eae);
        int a3 = (int) r.a(frameLayout.getContext(), 264.0f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f135151d.getLayoutParams();
        layoutParams.height = (dh.e(frameLayout.getContext()) - a3) - ((int) r.a(frameLayout.getContext(), 112.0f));
        this.f135151d.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f135150c.getLayoutParams();
        layoutParams2.height = dh.e(frameLayout.getContext()) - a3;
        this.f135150c.setLayoutParams(layoutParams2);
        this.f135151d.post(this.f135155h);
        this.f135158k = true;
        if (this.f135148a.getHintIcon() == null || this.f135148a.getHintIcon().getUrlList() == null || this.f135148a.getHintIcon().getUrlList().size() == 0) {
            this.f135151d.postDelayed(this.f135156i, 5000);
            MethodCollector.o(10979);
            return;
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) this.f135150c.findViewById(R.id.ebd);
        UrlModel a4 = com.ss.android.ugc.aweme.effectplatform.a.a(this.f135148a.getHintIcon());
        AnonymousClass3 r3 = new com.facebook.drawee.c.c<f>() {
            /* class com.ss.android.ugc.aweme.sticker.panel.guide.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(88351);
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onFailure(String str, Throwable th) {
                if (c.this.f135153f != null) {
                    c.this.f135153f.a(false, c.this.f135148a, h.a.GIF);
                }
                if (c.this.f135154g) {
                    c.this.f135151d.postDelayed(c.this.f135156i, 5000);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                frameLayout2.setBackgroundResource(R.drawable.u3);
                c cVar = c.this;
                ExtraParams extraParams = cVar.f135149b;
                View findViewById = cVar.f135150c.findViewById(R.id.eay);
                if (1 == extraParams.manualClose) {
                    findViewById.setVisibility(0);
                    findViewById.setOnClickListener(new d(cVar));
                } else {
                    findViewById.setVisibility(8);
                }
                if (animatable instanceof com.facebook.fresco.animation.c.a) {
                    com.facebook.fresco.animation.c.a aVar = (com.facebook.fresco.animation.c.a) animatable;
                    aVar.f47562a = 2;
                    aVar.f47563b = true;
                    animatable.start();
                    long b2 = aVar.b();
                    if (b2 > 0 && c.this.f135150c != null) {
                        c.this.f135150c.postDelayed(new e(this, animatable), b2 * 2);
                    }
                }
                if (c.this.f135153f != null) {
                    c.this.f135153f.a(true, c.this.f135148a, h.a.GIF);
                }
            }
        };
        if (simpleDraweeView == null || a4.getUrlList() == null || a4.getUrlList().size() == 0) {
            MethodCollector.o(10979);
            return;
        }
        if (simpleDraweeView.getContext() != null) {
            simpleDraweeView.getContext().getApplicationContext();
        }
        com.facebook.imagepipeline.o.b[] a5 = com.ss.android.ugc.tools.c.a.a(a4, (d) null, (com.facebook.imagepipeline.o.d) null);
        if (a5 == null || a5.length == 0) {
            MethodCollector.o(10979);
            return;
        }
        e b2 = com.facebook.drawee.a.a.c.b();
        b2.f47325m = simpleDraweeView.getController();
        e eVar = (e) b2.a(a5);
        eVar.f47322j = false;
        eVar.f47319g = r3;
        simpleDraweeView.setController(eVar.e());
        MethodCollector.o(10979);
    }

    public c(Effect effect, ExtraParams extraParams, h hVar) {
        this.f135148a = effect;
        this.f135149b = extraParams;
        this.f135153f = hVar;
    }
}
