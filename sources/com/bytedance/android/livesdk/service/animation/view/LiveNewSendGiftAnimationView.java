package com.bytedance.android.livesdk.service.animation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.c;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class LiveNewSendGiftAnimationView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f21226a;

    /* renamed from: b  reason: collision with root package name */
    public int f21227b;

    /* renamed from: c  reason: collision with root package name */
    public ComboEffectAnimationView f21228c;

    /* renamed from: d  reason: collision with root package name */
    private Context f21229d;

    /* renamed from: e  reason: collision with root package name */
    private View f21230e;

    /* renamed from: f  reason: collision with root package name */
    private LiveTextView f21231f;

    /* renamed from: g  reason: collision with root package name */
    private AnimatorSet f21232g;

    /* renamed from: h  reason: collision with root package name */
    private a f21233h;

    /* renamed from: i  reason: collision with root package name */
    private b f21234i;

    /* renamed from: j  reason: collision with root package name */
    private RoundWaveAnimationView f21235j;

    /* renamed from: k  reason: collision with root package name */
    private ComboProgressAnimationView f21236k;

    static {
        Covode.recordClassIndex(12526);
    }

    public int getComboCount() {
        return this.f21227b;
    }

    private boolean c() {
        b bVar = this.f21234i;
        if (bVar == null || !(bVar.f17864b instanceof Prop) || ((Prop) this.f21234i.f17864b).count >= this.f21227b) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21243a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 12530(0x30f2, float:1.7558E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView$a[] r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.AnonymousClass4.f21243a = r2
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView$a r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.a.Fast     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.AnonymousClass4.f21243a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView$a r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.a.Special     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.AnonymousClass4.<clinit>():void");
        }
    }

    public enum a {
        Normal,
        Special,
        Fast;

        static {
            Covode.recordClassIndex(12531);
        }
    }

    private void b() {
        AnimatorSet animatorSet = this.f21232g;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f21232g.removeAllListeners();
            this.f21232g.cancel();
        }
        this.f21232g = null;
        View view = this.f21230e;
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void a() {
        this.f21227b = 0;
        b();
        setScaleX(1.0f);
        setScaleY(1.0f);
        View view = this.f21230e;
        if (view != null) {
            view.setRotation(0.0f);
        }
        RoundWaveAnimationView roundWaveAnimationView = this.f21235j;
        if (roundWaveAnimationView != null) {
            roundWaveAnimationView.b();
        }
        ComboEffectAnimationView comboEffectAnimationView = this.f21228c;
        if (comboEffectAnimationView != null) {
            comboEffectAnimationView.a();
        }
        ComboProgressAnimationView comboProgressAnimationView = this.f21236k;
        if (comboProgressAnimationView != null) {
            comboProgressAnimationView.d();
        }
    }

    public void setPanel(b bVar) {
        this.f21234i = bVar;
    }

    public void setAnimationType(a aVar) {
        this.f21233h = aVar;
        if (AnonymousClass4.f21243a[aVar.ordinal()] == 1) {
            this.f21236k.setVisibility(4);
        }
    }

    public final void a(Runnable runnable) {
        if (c()) {
            this.f21227b++;
            if (this.f21226a == 0) {
                c(runnable);
            } else {
                this.f21226a = 1;
                d(new b(this, runnable));
            }
            RoundWaveAnimationView roundWaveAnimationView = this.f21235j;
            if (roundWaveAnimationView != null) {
                roundWaveAnimationView.a();
            }
            ComboEffectAnimationView comboEffectAnimationView = this.f21228c;
            if (comboEffectAnimationView != null) {
                comboEffectAnimationView.a(this.f21227b);
            }
            ComboProgressAnimationView comboProgressAnimationView = this.f21236k;
            if (comboProgressAnimationView != null) {
                comboProgressAnimationView.a();
            }
        }
    }

    public final void b(final Runnable runnable) {
        b();
        this.f21232g = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21230e, "rotation", 0.0f, 360.0f);
        this.f21232g.playTogether(ofFloat);
        this.f21232g.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        this.f21232g.addListener(new com.bytedance.android.livesdk.service.animation.b.a() {
            /* class com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(12528);
            }

            @Override // com.bytedance.android.livesdk.service.animation.b.a
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                LiveNewSendGiftAnimationView.this.f21226a = 0;
                LiveNewSendGiftAnimationView.this.f21227b = 0;
                if (LiveNewSendGiftAnimationView.this.f21228c != null) {
                    LiveNewSendGiftAnimationView.this.f21228c.a(LiveNewSendGiftAnimationView.this.f21227b);
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.f21232g.start();
    }

    private void c(final Runnable runnable) {
        b();
        this.f21232g = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21230e, "scaleX", 1.0f, 1.1f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f21230e, "scaleY", 1.0f, 1.1f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f21231f, "scaleX", 1.0f, 1.1f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f21231f, "scaleY", 1.0f, 1.1f, 1.0f);
        this.f21232g.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        this.f21232g.setDuration(300L);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f21232g.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        }
        this.f21232g.addListener(new com.bytedance.android.livesdk.service.animation.b.a() {
            /* class com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(12527);
            }

            @Override // com.bytedance.android.livesdk.service.animation.b.a
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                LiveNewSendGiftAnimationView.this.f21226a = 2;
                LiveNewSendGiftAnimationView.this.b(runnable);
            }
        });
        this.f21232g.start();
    }

    private void d(final Runnable runnable) {
        b();
        this.f21232g = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21230e, "scaleX", 1.0f, 0.95f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f21230e, "scaleY", 1.0f, 0.95f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f21231f, "scaleX", 1.0f, 0.95f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f21231f, "scaleY", 1.0f, 0.95f, 1.0f);
        this.f21232g.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        this.f21232g.setDuration(200L);
        this.f21232g.addListener(new com.bytedance.android.livesdk.service.animation.b.a() {
            /* class com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.AnonymousClass3 */

            static {
                Covode.recordClassIndex(12529);
            }

            @Override // com.bytedance.android.livesdk.service.animation.b.a
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        ViewPropertyAnimator duration = this.f21230e.animate().rotation(0.0f).setDuration(150);
        if (Build.VERSION.SDK_INT >= 21) {
            PathInterpolator pathInterpolator = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
            duration.setInterpolator(pathInterpolator);
            this.f21232g.setInterpolator(pathInterpolator);
        }
        duration.start();
        this.f21232g.start();
    }

    public LiveNewSendGiftAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveNewSendGiftAnimationView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9890);
        this.f21233h = a.Normal;
        this.f21229d = context;
        View.inflate(context, R.layout.b5d, this);
        this.f21230e = findViewById(R.id.a97);
        this.f21231f = (LiveTextView) findViewById(R.id.a9l);
        this.f21235j = (RoundWaveAnimationView) findViewById(R.id.a9k);
        this.f21228c = (ComboEffectAnimationView) findViewById(R.id.a9d);
        this.f21236k = (ComboProgressAnimationView) findViewById(R.id.a9g);
        c.a(this.f21231f, 700);
        this.f21231f.getPaint().setTextSkewX(-0.25f);
        MethodCollector.o(9890);
    }
}
