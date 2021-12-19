package com.bytedance.android.livesdk.service.animation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.c;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class LiveNewSendGiftAnimationForWishListView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public View f21207a;

    /* renamed from: b  reason: collision with root package name */
    public LiveTextView f21208b;

    /* renamed from: c  reason: collision with root package name */
    public AnimatorSet f21209c;

    /* renamed from: d  reason: collision with root package name */
    public int f21210d;

    /* renamed from: e  reason: collision with root package name */
    public int f21211e;

    /* renamed from: f  reason: collision with root package name */
    public b f21212f;

    /* renamed from: g  reason: collision with root package name */
    public RoundWaveAnimationView f21213g;

    /* renamed from: h  reason: collision with root package name */
    public ComboEffectAnimationView f21214h;

    /* renamed from: i  reason: collision with root package name */
    public ComboProgressAnimationForWishListView f21215i;

    /* renamed from: j  reason: collision with root package name */
    private Context f21216j;

    /* renamed from: k  reason: collision with root package name */
    private a f21217k;

    static {
        Covode.recordClassIndex(12520);
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21224a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 12524(0x30ec, float:1.755E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$a[] r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.AnonymousClass4.f21224a = r2
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$a r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.a.Fast     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.AnonymousClass4.f21224a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$a r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.a.Special     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.AnonymousClass4.<clinit>():void");
        }
    }

    public enum a {
        Normal,
        Special,
        Fast;

        static {
            Covode.recordClassIndex(12525);
        }
    }

    public final void a() {
        AnimatorSet animatorSet = this.f21209c;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f21209c.removeAllListeners();
            this.f21209c.cancel();
        }
        this.f21209c = null;
        View view = this.f21207a;
        if (view != null) {
            view.animate().cancel();
        }
    }

    public void setPanel(b bVar) {
        this.f21212f = bVar;
    }

    public void setAnimationType(a aVar) {
        this.f21217k = aVar;
        if (AnonymousClass4.f21224a[aVar.ordinal()] == 1) {
            this.f21215i.setVisibility(4);
        }
    }

    public final void a(final Runnable runnable) {
        a();
        this.f21209c = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21207a, "rotation", 0.0f, 360.0f);
        this.f21209c.playTogether(ofFloat);
        this.f21209c.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        this.f21209c.addListener(new com.bytedance.android.livesdk.service.animation.b.a() {
            /* class com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(12522);
            }

            @Override // com.bytedance.android.livesdk.service.animation.b.a
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                LiveNewSendGiftAnimationForWishListView.this.f21210d = 0;
                LiveNewSendGiftAnimationForWishListView.this.f21211e = 0;
                if (LiveNewSendGiftAnimationForWishListView.this.f21214h != null) {
                    LiveNewSendGiftAnimationForWishListView.this.f21214h.a(LiveNewSendGiftAnimationForWishListView.this.f21211e);
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.f21209c.start();
    }

    public LiveNewSendGiftAnimationForWishListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveNewSendGiftAnimationForWishListView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9130);
        this.f21217k = a.Normal;
        this.f21216j = context;
        View.inflate(context, R.layout.b5c, this);
        this.f21207a = findViewById(R.id.a97);
        this.f21208b = (LiveTextView) findViewById(R.id.a9l);
        this.f21213g = (RoundWaveAnimationView) findViewById(R.id.a9k);
        this.f21214h = (ComboEffectAnimationView) findViewById(R.id.a9d);
        this.f21215i = (ComboProgressAnimationForWishListView) findViewById(R.id.a9g);
        c.a(this.f21208b, 700);
        this.f21208b.getPaint().setTextSkewX(-0.25f);
        MethodCollector.o(9130);
    }
}
