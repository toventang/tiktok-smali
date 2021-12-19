package com.bytedance.android.live.liveinteract.match.ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleScoreAnimationTimeThresholdSetting;
import com.bytedance.android.livesdk.model.message.b.q;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public final class BattleHealthBar extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    public static final b f10844h = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    float f10845a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f10846b;

    /* renamed from: c  reason: collision with root package name */
    public a f10847c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.api.a.b f10848d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10849e;

    /* renamed from: f  reason: collision with root package name */
    public DataChannel f10850f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10851g;

    /* renamed from: i  reason: collision with root package name */
    private ValueAnimator f10852i;

    /* renamed from: j  reason: collision with root package name */
    private ValueAnimator f10853j;

    /* renamed from: k  reason: collision with root package name */
    private float f10854k;

    /* renamed from: l  reason: collision with root package name */
    private int f10855l;

    /* renamed from: m  reason: collision with root package name */
    private int f10856m;
    private boolean n;
    private HashMap o;

    public enum a {
        MIDDLE,
        WEAK,
        STRONG,
        EMOJI;

        static {
            Covode.recordClassIndex(5801);
        }
    }

    static {
        Covode.recordClassIndex(5798);
    }

    public BattleHealthBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        View view = (View) this.o.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.o.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(5802);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final DataChannel getDataChannel() {
        return this.f10850f;
    }

    public final com.bytedance.android.live.liveinteract.api.a.b getDataHolder() {
        return this.f10848d;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        HSImageView hSImageView = (HSImageView) a(R.id.d55);
        ViewGroup.LayoutParams layoutParams = hSImageView != null ? hSImageView.getLayoutParams() : null;
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        float width = (f2 * (((float) getWidth()) - (((PKProgressBar) a(R.id.fjb)).getStartSpacing() * 2.0f))) + ((PKProgressBar) a(R.id.fjb)).getStartSpacing();
        layoutParams2.gravity = 83;
        layoutParams2.leftMargin = (int) (width - ((float) (y.a(this.f10854k) / 2)));
        HSImageView hSImageView2 = (HSImageView) a(R.id.d55);
        if (hSImageView2 != null) {
            hSImageView2.setLayoutParams(layoutParams2);
        }
        FrameLayout frameLayout = (FrameLayout) a(R.id.dmx);
        if (frameLayout != null) {
            b.a(frameLayout, (int) (width - ((float) (y.a(this.f10854k) / 2))));
        }
        a(layoutParams2);
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BattleHealthBar f10860a;

        static {
            Covode.recordClassIndex(5808);
        }

        h(BattleHealthBar battleHealthBar) {
            this.f10860a = battleHealthBar;
        }

        public final void run() {
            this.f10860a.c();
        }
    }

    private final int getAbsDiffScore() {
        return Math.abs(this.f10855l - this.f10856m);
    }

    public final View getLeftTextView() {
        LiveTextView liveTextView = (LiveTextView) a(R.id.c_1);
        l.b(liveTextView, "");
        return liveTextView;
    }

    public final View getRightTextView() {
        LiveTextView liveTextView = (LiveTextView) a(R.id.dno);
        l.b(liveTextView, "");
        return liveTextView;
    }

    public final int getLeftValue() {
        PKProgressBar pKProgressBar = (PKProgressBar) a(R.id.fjb);
        if (pKProgressBar != null) {
            return pKProgressBar.getLeftValue();
        }
        return 0;
    }

    public final int getRightValue() {
        PKProgressBar pKProgressBar = (PKProgressBar) a(R.id.fjb);
        if (pKProgressBar != null) {
            return pKProgressBar.getRightValue();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BattleHealthBar f10863a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f10864b;

        static {
            Covode.recordClassIndex(5810);
        }

        j(BattleHealthBar battleHealthBar, FrameLayout.LayoutParams layoutParams) {
            this.f10863a = battleHealthBar;
            this.f10864b = layoutParams;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            LiveTextView liveTextView = (LiveTextView) this.f10863a.a(R.id.am0);
            if (liveTextView != null) {
                layoutParams = liveTextView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = this.f10864b.leftMargin + this.f10864b.width + y.a(8.0f);
            LiveTextView liveTextView2 = (LiveTextView) this.f10863a.a(R.id.am0);
            l.b(liveTextView2, "");
            liveTextView2.setLayoutParams(layoutParams2);
        }
    }

    private final void f() {
        k.a((HSImageView) a(R.id.d55), "tiktok_live_interaction_resource", "live_battle_score_weak_animation.webp");
        a(50.0f, 33.0f, 0.0f, 4.0f);
        b(50.0f);
        this.f10847c = a.WEAK;
    }

    private final void g() {
        k.a((HSImageView) a(R.id.d55), "tiktok_live_interaction_resource", "live_battle_score_strong_animation.webp");
        a(50.0f, 28.0f, 3.0f, 0.0f);
        b(50.0f);
        this.f10847c = a.STRONG;
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BattleHealthBar f10861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f10862b;

        static {
            Covode.recordClassIndex(5809);
        }

        i(BattleHealthBar battleHealthBar, FrameLayout.LayoutParams layoutParams) {
            this.f10861a = battleHealthBar;
            this.f10862b = layoutParams;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            LiveTextView liveTextView = (LiveTextView) this.f10861a.a(R.id.alz);
            if (liveTextView != null) {
                layoutParams = liveTextView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int a2 = this.f10862b.leftMargin - y.a(8.0f);
            LiveTextView liveTextView2 = (LiveTextView) this.f10861a.a(R.id.alz);
            l.b(liveTextView2, "");
            layoutParams2.leftMargin = a2 - liveTextView2.getWidth();
            LiveTextView liveTextView3 = (LiveTextView) this.f10861a.a(R.id.alz);
            l.b(liveTextView3, "");
            liveTextView3.setLayoutParams(layoutParams2);
        }
    }

    private final boolean d() {
        com.bytedance.android.livesdk.model.message.b.a aVar;
        int i2;
        q qVar;
        boolean z;
        if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.r == null || (aVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.r) == null || (i2 = aVar.f19252a) <= 0) {
            return false;
        }
        com.bytedance.android.livesdk.model.message.b.a aVar2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.r;
        if (aVar2 != null && (qVar = aVar2.f19255d) != null) {
            if (!qVar.f19295a || !this.f10849e) {
                z = false;
            } else {
                z = true;
            }
            if ((this.f10855l >= i2 || this.f10856m >= i2) && !z && !com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.s) {
                return true;
            }
            return false;
        } else if (this.f10855l >= i2 || this.f10856m >= i2) {
            return true;
        } else {
            return false;
        }
    }

    public final void b() {
        float f2 = this.f10845a;
        String str = "live_battle_score_strive_animation.webp";
        if (f2 < 0.25f) {
            str = "live_battle_score_cry_animation.webp";
        } else if (f2 >= 0.5f && f2 != 0.5f) {
            str = f2 < 0.75f ? "live_battle_score_clap_animation.webp" : "live_battle_score_tongue_animation.webp";
        }
        k.a((HSImageView) a(R.id.d55), "tiktok_live_interaction_resource", str);
        a(28.0f, 28.0f, 0.0f, 0.0f);
        b(28.0f);
        this.f10847c = a.EMOJI;
        a(this.f10845a);
        HSImageView hSImageView = (HSImageView) a(R.id.d55);
        l.b(hSImageView, "");
        hSImageView.setScaleX(1.0f);
        HSImageView hSImageView2 = (HSImageView) a(R.id.d55);
        l.b(hSImageView2, "");
        hSImageView2.setVisibility(0);
        HSImageView hSImageView3 = (HSImageView) a(R.id.cma);
        l.b(hSImageView3, "");
        hSImageView3.setVisibility(8);
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        this.f10846b = new AnimatorSet();
        FrameLayout frameLayout = (FrameLayout) a(R.id.dmx);
        l.b(frameLayout, "");
        int childCount = frameLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = ((FrameLayout) a(R.id.dmx)).getChildAt(i2);
            PKProgressBar pKProgressBar = (PKProgressBar) a(R.id.fjb);
            l.b(pKProgressBar, "");
            PKProgressBar pKProgressBar2 = (PKProgressBar) a(R.id.fjb);
            l.b(pKProgressBar2, "");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationX", ((float) pKProgressBar.getWidth()) * -1.0f, ((float) pKProgressBar2.getWidth()) * 1.0f);
            l.b(ofFloat, "");
            ofFloat.setStartDelay(((long) i2) * 500);
            ofFloat.setDuration(3500L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            arrayList.add(ofFloat);
        }
        AnimatorSet animatorSet = this.f10846b;
        if (animatorSet != null) {
            animatorSet.playTogether(arrayList);
        }
        AnimatorSet animatorSet2 = this.f10846b;
        if (animatorSet2 != null) {
            animatorSet2.setDuration(4000L);
        }
        AnimatorSet animatorSet3 = this.f10846b;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    private final void e() {
        int i2;
        String str;
        if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.r != null) {
            if (!d()) {
                LiveTextView liveTextView = (LiveTextView) a(R.id.am0);
                l.b(liveTextView, "");
                liveTextView.setVisibility(8);
                LiveTextView liveTextView2 = (LiveTextView) a(R.id.alz);
                l.b(liveTextView2, "");
                liveTextView2.setVisibility(8);
                LiveTextView liveTextView3 = (LiveTextView) a(R.id.c_1);
                l.b(liveTextView3, "");
                liveTextView3.setVisibility(0);
                LiveTextView liveTextView4 = (LiveTextView) a(R.id.dno);
                l.b(liveTextView4, "");
                liveTextView4.setVisibility(0);
            } else if (this.f10855l == this.f10856m) {
                LiveTextView liveTextView5 = (LiveTextView) a(R.id.am0);
                l.b(liveTextView5, "");
                liveTextView5.setVisibility(8);
                LiveTextView liveTextView6 = (LiveTextView) a(R.id.alz);
                l.b(liveTextView6, "");
                liveTextView6.setVisibility(8);
                LiveTextView liveTextView7 = (LiveTextView) a(R.id.c_1);
                l.b(liveTextView7, "");
                liveTextView7.setVisibility(8);
                LiveTextView liveTextView8 = (LiveTextView) a(R.id.dno);
                l.b(liveTextView8, "");
                liveTextView8.setVisibility(8);
            } else {
                com.bytedance.android.livesdk.model.message.b.a aVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.r;
                if (aVar != null) {
                    i2 = aVar.f19253b;
                } else {
                    i2 = 0;
                }
                com.bytedance.android.livesdk.model.message.b.a aVar2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.r;
                if (aVar2 == null || (str = aVar2.f19254c) == null) {
                    str = "";
                }
                int i3 = this.f10855l;
                int i4 = this.f10856m;
                if (i3 < i4) {
                    LiveTextView liveTextView9 = (LiveTextView) a(R.id.am0);
                    l.b(liveTextView9, "");
                    liveTextView9.setVisibility(0);
                    if (getAbsDiffScore() >= i2) {
                        LiveTextView liveTextView10 = (LiveTextView) a(R.id.am0);
                        l.b(liveTextView10, "");
                        liveTextView10.setText(y.a((int) R.string.eff, str));
                    } else {
                        LiveTextView liveTextView11 = (LiveTextView) a(R.id.am0);
                        l.b(liveTextView11, "");
                        liveTextView11.setText(y.a((int) R.string.eff, String.valueOf(getAbsDiffScore())));
                    }
                    LiveTextView liveTextView12 = (LiveTextView) a(R.id.alz);
                    l.b(liveTextView12, "");
                    liveTextView12.setVisibility(8);
                } else if (i3 > i4) {
                    LiveTextView liveTextView13 = (LiveTextView) a(R.id.am0);
                    l.b(liveTextView13, "");
                    liveTextView13.setVisibility(8);
                    LiveTextView liveTextView14 = (LiveTextView) a(R.id.alz);
                    l.b(liveTextView14, "");
                    liveTextView14.setVisibility(0);
                    if (getAbsDiffScore() >= i2) {
                        LiveTextView liveTextView15 = (LiveTextView) a(R.id.alz);
                        l.b(liveTextView15, "");
                        liveTextView15.setText(y.a((int) R.string.efe, str));
                    } else {
                        LiveTextView liveTextView16 = (LiveTextView) a(R.id.alz);
                        l.b(liveTextView16, "");
                        liveTextView16.setText(y.a((int) R.string.efe, String.valueOf(getAbsDiffScore())));
                    }
                } else {
                    return;
                }
                LiveTextView liveTextView17 = (LiveTextView) a(R.id.c_1);
                l.b(liveTextView17, "");
                liveTextView17.setVisibility(8);
                LiveTextView liveTextView18 = (LiveTextView) a(R.id.dno);
                l.b(liveTextView18, "");
                liveTextView18.setVisibility(8);
            }
        }
    }

    public final void a() {
        HSImageView hSImageView = (HSImageView) a(R.id.cma);
        l.b(hSImageView, "");
        hSImageView.setVisibility(0);
        HSImageView hSImageView2 = (HSImageView) a(R.id.d55);
        l.b(hSImageView2, "");
        hSImageView2.setVisibility(8);
        LiveTextView liveTextView = (LiveTextView) a(R.id.alz);
        l.b(liveTextView, "");
        liveTextView.setVisibility(8);
        LiveTextView liveTextView2 = (LiveTextView) a(R.id.am0);
        l.b(liveTextView2, "");
        liveTextView2.setVisibility(8);
        this.n = true;
        this.f10847c = a.MIDDLE;
        LiveTextView liveTextView3 = (LiveTextView) a(R.id.c_1);
        l.b(liveTextView3, "");
        liveTextView3.setText("0");
        LiveTextView liveTextView4 = (LiveTextView) a(R.id.dno);
        l.b(liveTextView4, "");
        liveTextView4.setText("0");
        this.f10855l = 0;
        this.f10856m = 0;
        this.f10845a = 0.5f;
        b(50.0f);
        PKProgressBar pKProgressBar = (PKProgressBar) a(R.id.fjb);
        if (pKProgressBar != null) {
            pKProgressBar.a();
        }
        PKProgressBar pKProgressBar2 = (PKProgressBar) a(R.id.fjb);
        if (pKProgressBar2 != null) {
            pKProgressBar2.a();
        }
    }

    public final void setAnchor(boolean z) {
        this.f10849e = z;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.f10850f = dataChannel;
    }

    public final void setDataHolder(com.bytedance.android.live.liveinteract.api.a.b bVar) {
        this.f10848d = bVar;
    }

    private final void b(float f2) {
        this.f10854k = f2;
        ((PKProgressBar) a(R.id.fjb)).setCoverWidth(f2);
    }

    public static final class d extends m implements h.f.a.b<com.bytedance.android.live.liveinteract.match.b.b.c, z> {
        final /* synthetic */ BattleHealthBar this$0;

        static {
            Covode.recordClassIndex(5804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(BattleHealthBar battleHealthBar) {
            super(1);
            this.this$0 = battleHealthBar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.liveinteract.match.b.b.c cVar) {
            l.d(cVar, "");
            if (cVar == com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH && this.this$0.f10847c != a.EMOJI) {
                this.this$0.b();
                this.this$0.f10847c = a.EMOJI;
            }
            return z.f158842a;
        }
    }

    public static final class c extends m implements h.f.a.b<Long, z> {
        final /* synthetic */ BattleHealthBar this$0;

        static {
            Covode.recordClassIndex(5803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(BattleHealthBar battleHealthBar) {
            super(1);
            this.this$0 = battleHealthBar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Long l2) {
            if (l2.longValue() <= LiveBattleScoreAnimationTimeThresholdSetting.INSTANCE.getValue() && this.this$0.f10847c != a.EMOJI) {
                this.this$0.b();
                this.this$0.f10847c = a.EMOJI;
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BattleHealthBar f10858a;

        static {
            Covode.recordClassIndex(5806);
        }

        f(BattleHealthBar battleHealthBar) {
            this.f10858a = battleHealthBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            ((LiveTextView) this.f10858a.a(R.id.c_1)).setTextSize(1, ((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BattleHealthBar f10859a;

        static {
            Covode.recordClassIndex(5807);
        }

        g(BattleHealthBar battleHealthBar) {
            this.f10859a = battleHealthBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            ((LiveTextView) this.f10859a.a(R.id.dno)).setTextSize(1, ((Float) animatedValue).floatValue());
        }
    }

    public final void setLeftValue(int i2) {
        if (!d()) {
            LiveTextView liveTextView = (LiveTextView) a(R.id.c_1);
            l.b(liveTextView, "");
            liveTextView.setVisibility(0);
        } else {
            LiveTextView liveTextView2 = (LiveTextView) a(R.id.c_1);
            l.b(liveTextView2, "");
            liveTextView2.setVisibility(8);
        }
        a(i2, ((PKProgressBar) a(R.id.fjb)).getRightValue());
        a(true, i2);
        PKProgressBar pKProgressBar = (PKProgressBar) a(R.id.fjb);
        if (pKProgressBar != null) {
            pKProgressBar.setLeftValue(i2);
        }
    }

    public final void setRightValue(int i2) {
        if (!d()) {
            LiveTextView liveTextView = (LiveTextView) a(R.id.dno);
            l.b(liveTextView, "");
            liveTextView.setVisibility(0);
        } else {
            LiveTextView liveTextView2 = (LiveTextView) a(R.id.dno);
            l.b(liveTextView2, "");
            liveTextView2.setVisibility(8);
        }
        a(((PKProgressBar) a(R.id.fjb)).getLeftValue(), i2);
        a(false, i2);
        PKProgressBar pKProgressBar = (PKProgressBar) a(R.id.fjb);
        if (pKProgressBar != null) {
            pKProgressBar.setRightValue(i2);
        }
    }

    public static final class e extends m implements h.f.a.b<com.bytedance.android.live.liveinteract.match.b.b.d, z> {
        final /* synthetic */ BattleHealthBar this$0;

        static {
            Covode.recordClassIndex(5805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(BattleHealthBar battleHealthBar) {
            super(1);
            this.this$0 = battleHealthBar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.liveinteract.match.b.b.d dVar) {
            MethodCollector.i(6988);
            l.d(dVar, "");
            Boolean bool = null;
            int i2 = 0;
            if (dVar == com.bytedance.android.live.liveinteract.match.b.b.d.BONUS_IN_PROCESS) {
                BattleHealthBar battleHealthBar = this.this$0;
                if (battleHealthBar.a(R.id.fjb) != null && !battleHealthBar.f10851g) {
                    FrameLayout frameLayout = (FrameLayout) battleHealthBar.a(R.id.dmx);
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                    battleHealthBar.f10851g = true;
                    FrameLayout frameLayout2 = (FrameLayout) battleHealthBar.a(R.id.dmx);
                    if (frameLayout2 != null && frameLayout2.getChildCount() > 0) {
                        ((FrameLayout) battleHealthBar.a(R.id.dmx)).removeAllViews();
                    }
                    do {
                        View inflate = LayoutInflater.from(battleHealthBar.getContext()).inflate(R.layout.bev, (ViewGroup) null);
                        FrameLayout frameLayout3 = (FrameLayout) battleHealthBar.a(R.id.dmx);
                        if (frameLayout3 != null) {
                            frameLayout3.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
                        }
                        i2++;
                    } while (i2 < 3);
                    PKProgressBar pKProgressBar = (PKProgressBar) battleHealthBar.a(R.id.fjb);
                    l.b(pKProgressBar, "");
                    if (pKProgressBar.getMeasuredWidth() == 0) {
                        ((PKProgressBar) battleHealthBar.a(R.id.fjb)).post(new h(battleHealthBar));
                    } else {
                        battleHealthBar.c();
                    }
                }
            } else {
                this.this$0.f10851g = false;
                FrameLayout frameLayout4 = (FrameLayout) this.this$0.a(R.id.dmx);
                l.b(frameLayout4, "");
                frameLayout4.setVisibility(8);
                AnimatorSet animatorSet = this.this$0.f10846b;
                if (animatorSet != null) {
                    bool = Boolean.valueOf(animatorSet.isRunning());
                }
                if (p.a(bool)) {
                    AnimatorSet animatorSet2 = this.this$0.f10846b;
                    if (animatorSet2 != null) {
                        animatorSet2.end();
                    }
                    FrameLayout frameLayout5 = (FrameLayout) this.this$0.a(R.id.dmx);
                    if (frameLayout5 != null) {
                        frameLayout5.removeAllViews();
                    }
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(6988);
            return zVar;
        }
    }

    private final void a(FrameLayout.LayoutParams layoutParams) {
        LiveTextView liveTextView = (LiveTextView) a(R.id.alz);
        l.b(liveTextView, "");
        if (liveTextView.getVisibility() == 0) {
            ((LiveTextView) a(R.id.alz)).post(new i(this, layoutParams));
            return;
        }
        LiveTextView liveTextView2 = (LiveTextView) a(R.id.am0);
        l.b(liveTextView2, "");
        if (liveTextView2.getVisibility() == 0) {
            ((LiveTextView) a(R.id.am0)).post(new j(this, layoutParams));
        }
    }

    private final void a(int i2, int i3) {
        if (i2 != 0 || i3 != 0) {
            HSImageView hSImageView = (HSImageView) a(R.id.cma);
            l.b(hSImageView, "");
            hSImageView.setVisibility(8);
            HSImageView hSImageView2 = (HSImageView) a(R.id.d55);
            l.b(hSImageView2, "");
            hSImageView2.setVisibility(0);
            if (this.f10847c != a.EMOJI) {
                int i4 = this.f10855l;
                int i5 = i2 - i4;
                if (i5 >= 1000) {
                    if (this.f10847c != a.STRONG) {
                        g();
                    }
                } else if (i5 > 0) {
                    if (this.f10847c != a.WEAK) {
                        f();
                    }
                } else if (i4 == 0 && this.f10856m == 0 && this.f10847c != a.WEAK) {
                    f();
                }
                this.f10855l = i2;
                this.f10856m = i3;
                this.n = true;
                PKProgressBar pKProgressBar = (PKProgressBar) a(R.id.fjb);
                if (pKProgressBar != null) {
                    pKProgressBar.setMIsAnimationToRight(this.n);
                }
                e();
            }
        }
    }

    private final void a(boolean z, int i2) {
        String valueOf = String.valueOf(i2);
        if (z) {
            LiveTextView liveTextView = (LiveTextView) a(R.id.c_1);
            l.b(liveTextView, "");
            liveTextView.setText(valueOf);
            ValueAnimator valueAnimator = this.f10852i;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                LiveTextView liveTextView2 = (LiveTextView) a(R.id.c_1);
                l.b(liveTextView2, "");
                if (liveTextView2.getVisibility() != 8) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(15.0f, 23.0f);
                    this.f10852i = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.setDuration(300L);
                    }
                    ValueAnimator valueAnimator2 = this.f10852i;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setRepeatCount(1);
                    }
                    ValueAnimator valueAnimator3 = this.f10852i;
                    if (valueAnimator3 != null) {
                        valueAnimator3.setRepeatMode(2);
                    }
                    ValueAnimator valueAnimator4 = this.f10852i;
                    if (valueAnimator4 != null) {
                        valueAnimator4.addUpdateListener(new f(this));
                    }
                    ValueAnimator valueAnimator5 = this.f10852i;
                    if (valueAnimator5 != null) {
                        valueAnimator5.start();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LiveTextView liveTextView3 = (LiveTextView) a(R.id.dno);
        l.b(liveTextView3, "");
        liveTextView3.setText(valueOf);
        ValueAnimator valueAnimator6 = this.f10853j;
        if (valueAnimator6 == null || !valueAnimator6.isRunning()) {
            LiveTextView liveTextView4 = (LiveTextView) a(R.id.dno);
            l.b(liveTextView4, "");
            if (liveTextView4.getVisibility() != 8) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(15.0f, 23.0f);
                this.f10853j = ofFloat2;
                if (ofFloat2 != null) {
                    ofFloat2.setDuration(300L);
                }
                ValueAnimator valueAnimator7 = this.f10853j;
                if (valueAnimator7 != null) {
                    valueAnimator7.setRepeatCount(1);
                }
                ValueAnimator valueAnimator8 = this.f10853j;
                if (valueAnimator8 != null) {
                    valueAnimator8.setRepeatMode(2);
                }
                ValueAnimator valueAnimator9 = this.f10853j;
                if (valueAnimator9 != null) {
                    valueAnimator9.addUpdateListener(new g(this));
                }
                ValueAnimator valueAnimator10 = this.f10853j;
                if (valueAnimator10 != null) {
                    valueAnimator10.start();
                }
            }
        }
    }

    private /* synthetic */ BattleHealthBar(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BattleHealthBar(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(7866);
        this.f10845a = 0.5f;
        this.f10854k = 50.0f;
        this.n = true;
        this.f10847c = a.MIDDLE;
        LayoutInflater.from(context).inflate(R.layout.bda, this);
        k.a((HSImageView) a(R.id.cma), "tiktok_live_interaction_resource", "live_battle_score_initial_animation.webp");
        PKProgressBar pKProgressBar = (PKProgressBar) a(R.id.fjb);
        AnonymousClass1 r1 = new h.f.a.b<Float, z>(this) {
            /* class com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar.AnonymousClass1 */
            final /* synthetic */ BattleHealthBar this$0;

            static {
                Covode.recordClassIndex(5799);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Float f2) {
                float floatValue = f2.floatValue();
                BattleHealthBar battleHealthBar = this.this$0;
                battleHealthBar.f10845a = floatValue;
                if (battleHealthBar.f10847c == a.EMOJI) {
                    battleHealthBar.b();
                }
                return z.f158842a;
            }
        };
        AnonymousClass2 r0 = new h.f.a.b<Float, z>(this) {
            /* class com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar.AnonymousClass2 */
            final /* synthetic */ BattleHealthBar this$0;

            static {
                Covode.recordClassIndex(5800);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Float f2) {
                this.this$0.a(f2.floatValue());
                return z.f158842a;
            }
        };
        pKProgressBar.f10952b = r1;
        pKProgressBar.f10953c = r0;
        b(50.0f);
        MethodCollector.o(7866);
    }

    private final void a(float f2, float f3, float f4, float f5) {
        ViewGroup.LayoutParams layoutParams;
        HSImageView hSImageView = (HSImageView) a(R.id.d55);
        if (hSImageView != null) {
            layoutParams = hSImageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        layoutParams2.bottomMargin = y.a(f4);
        layoutParams2.topMargin = y.a(f5);
        layoutParams2.width = y.a(f2);
        layoutParams2.height = y.a(f3);
        HSImageView hSImageView2 = (HSImageView) a(R.id.d55);
        if (hSImageView2 != null) {
            hSImageView2.setLayoutParams(layoutParams2);
        }
    }
}
